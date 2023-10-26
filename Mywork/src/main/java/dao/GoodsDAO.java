package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Category;
import model.Goods;
import model.RegistGoods;

public class GoodsDAO {
	//データベース情報
	private final String JDBC_URL = "jdbc:mysql://localhost:3306/amusant?charaxterEncoding=UTF-8&serverTimezone=JST";
	private final String DB_USER = "root";
	private final String DB_PASS = "";
	
	//カテゴリを取得
	public List<Category> getCategoryList(){
		List<Category> categoryList = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバを読み込めませんでした。");
		}
		
		try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){
			String sql = "SELECT * FROM CATEGORY";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()) {
				int categoryId = rs.getInt("CATEGORYID");
				String categoryName = rs.getString("CATEGORYNAME");

				Category category = new Category(categoryId,categoryName); 
				categoryList.add(category);
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return categoryList;
	}
	//管理者ページより自分の登録した商品リストを所得する関数
	public List<Goods> myGoodsFind(){
		List<Goods> myGoodsList = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバを読み込めませんでした。");
		}
		
		try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){
			
			//SQL文 DELETEFLAGが1のものは持ってこないようにしている
			String sql = "SELECT * FROM GOODS JOIN ACCOUNTS ON GOODS.ACCOUNTID = ACCOUNTS.ACCOUNTID JOIN CATEGORY ON GOODS.CATEGORYID = CATEGORY.CATEGORYID WHERE GOODS.ACCOUNTID = ? AND DELETEFLAG = 0 ORDER BY GOODS.REGISTDATE DESC";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			//cookieからuserIdを所得 変更予定
			pStmt.setInt(1,4);
			
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()) {
				int goodsId = rs.getInt("GOODSID");
				int userId = rs.getInt("ACCOUNTID");
				String userName = rs.getString("NAME");
				String goodsName = rs.getString("GOODSNAME");
				int categoryId = rs.getInt("CATEGORYID");
				String categoryName = rs.getString("CATEGORYNAME");
				int price = rs.getInt("PRICE");
				String text = rs.getString("TEXT");
				int stock = rs.getInt("STOCK");
				String imagePath = rs.getString("IMAGE");
				int soldNum = rs.getInt("SOLDNUM");
				Timestamp ts = rs.getTimestamp("REGISTDATE");
				Date registDate = new Date(ts.getTime());
				int deleteFlag = rs.getInt("DELETEFLAG");
				Goods myGoods = new Goods(goodsId,categoryId,categoryName,userId,userName,goodsName,price,imagePath,text,stock,soldNum,registDate,deleteFlag);
				myGoodsList.add(myGoods);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return myGoodsList;
	}
	
	public boolean registNewGoods(RegistGoods newGoods) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバを読み込めませんでした。");
		}
		
		try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){
			//登録用INSERT文
			String sql = "INSERT INTO GOODS(CATEGORYID,ACCOUNTID,GOODSNAME,PRICE,IMAGE,TEXT,STOCK) VALUES(?,?,?,?,?,?,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			
			//プレースホルダ
			pStmt.setInt(1, newGoods.getCategoryId());
			//クッキーより取得　変更予定
			//pStmt.setInt(2, cookie.getValue());
			pStmt.setInt(2, 4);//4はテストアカウントのuserId
			pStmt.setString(3, newGoods.getGoodsName());
			pStmt.setInt(4, newGoods.getPrice());
			pStmt.setString(5, newGoods.getImagePath());
			pStmt.setString(6, newGoods.getText());
			pStmt.setInt(7, newGoods.getStock());
			
			int result = pStmt.executeUpdate();
			if(result != 1) {
				return false;
			}
		} catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean changeGoodsInfo(Goods changeGoods) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバを読み込めませんでした。");
		}
		
		try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){
			//SQL文
			String sql = "UPDATE GOODS SET GOODSNAME =?,CATEGORYID =?,PRICE =?, TEXT =?,STOCK =?,IMAGE =? WHERE GOODSID =?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			
			//プレースホルダ
			pStmt.setString(1, changeGoods.getGoodsName());
			pStmt.setInt(2, changeGoods.getCategoryId());
			pStmt.setInt(3, changeGoods.getPrice());
			pStmt.setString(4, changeGoods.getText());
			pStmt.setInt(5, changeGoods.getStock());
			pStmt.setString(6, changeGoods.getImagePath());
			pStmt.setInt(7, changeGoods.getGoodsId());
			
			int result = pStmt.executeUpdate();
			if(result != 1) {
				return false;
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean deleteGoods(Goods deleteGoods) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバを読み込めませんでした。");
		}
		
		try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){
			//SQL文
			String sql = "UPDATE GOODS SET DELETEFLAG = 1 WHERE GOODSID =?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			
			//プレースホルダ
			pStmt.setInt(1, deleteGoods.getGoodsId());
			
			int result = pStmt.executeUpdate();
			if(result != 1) {
				return false;
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	/* コピペ用
	public List<Mutter> findAll() {
		List<Mutter> mutterList = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバを読み込めませんでした。");
		}
		
		try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){
			
			String sql = "SELECT ID,NAME,TEXT FROM MUTTERS ORDER BY ID DESC";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			
			ResultSet rs = pStmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt("ID");
				String name = rs.getString("NAME");
				String text = rs.getString("TEXT");
				Mutter mutter = new Mutter(id,name,text);
				mutterList.add(mutter);
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return mutterList;
	}
	*/
}
