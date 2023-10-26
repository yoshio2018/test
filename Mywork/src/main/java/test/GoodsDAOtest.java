package test;

import java.util.List;

import dao.GoodsDAO;
import model.Category;
import model.Goods;
import model.RegistGoods;

public class GoodsDAOtest {
	public static void main(String[] args) {
		//testMyGoodsFind();
		//testRegistNewGoods();
		//testChangeGoodsInfo();
		//testDeleteGoods();
		testGetCategoryList();
	}
	
	public static void testMyGoodsFind(){
		GoodsDAO dao  = new GoodsDAO(); 
		List<Goods> myGoodsList = dao.myGoodsFind();
		for(Goods my : myGoodsList) {
		System.out.println(my.getGoodsId());
		System.out.println(my.getUserId());
		System.out.println(my.getCategoryId());
		System.out.println(my.getUserName());
		System.out.println(my.getCategoryName());
		System.out.println(my.getPrice());
		System.out.println(my.getStock());
		System.out.println(my.getText());
		System.out.println(my.getImagePath());
		System.out.println(my.getSoldNum());
		System.out.println(my.getRegistDate());
		System.out.println(my.getDeleteFlag());

		}
		System.out.println("テスト成功です");
	}
	public static void testRegistNewGoods() {
		GoodsDAO dao = new GoodsDAO();
		RegistGoods newGoods = new RegistGoods();
		newGoods.setCategoryId(1);
		newGoods.setGoodsName("歯");
		newGoods.setImagePath("仮");
		newGoods.setPrice(100000);
		newGoods.setStock(100);
		newGoods.setText("私の子供の抜けた歯です。");
		boolean result = dao.registNewGoods(newGoods);
		if(result) {
			System.out.println("テスト成功です");
		}else {
			System.out.println("テスト失敗です");
		}
	}
	
	public static void testChangeGoodsInfo() {
		GoodsDAO dao = new GoodsDAO();
		Goods changeGoods = new Goods();
		changeGoods.setCategoryId(2);
		changeGoods.setGoodsName("耳");
		changeGoods.setImagePath("仮仮");
		changeGoods.setPrice(100000000);
		changeGoods.setStock(100000);
		changeGoods.setText("耳です。");
		boolean result = dao.changeGoodsInfo(changeGoods);
		if(result) {
			System.out.println("テスト成功です");
		}else {
			System.out.println("テスト失敗です");
		}
	}
	
	public static void testDeleteGoods() {
		GoodsDAO dao = new GoodsDAO();
		Goods deleteGoods = new Goods();
		boolean result = dao.deleteGoods(deleteGoods);
		if(result) {
			System.out.println("テスト成功です");
		}else {
			System.out.println("テスト失敗です");
		}
	}
	
	public static void testGetCategoryList(){
		GoodsDAO dao  = new GoodsDAO(); 
		List<Category> categoryList = dao.getCategoryList();
		for(Category cl : categoryList) {
		System.out.println(cl.getCategoryId());
		System.out.println(cl.getCategoryName());
		}
		System.out.println("テスト成功です");
	}
	
}
