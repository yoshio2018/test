package model;

import java.util.Date;

public class Goods {
	private int goodsId;
	private int categoryId;
	private String categoryName;
	private int userId;
	private String userName;
	private String goodsName;
	private int price;
	private String imagePath;
	private String text;
	private int stock;
	private	int soldNum;
	private Date registDate;
	private int deleteFlag;
	
	public Goods() {}
	public Goods(int goodsId, int categoryId, String categoryName, int userId, String userName, String goodsName,
			int price, String imagePath, String text, int stock, int soldNum, Date registDate, int deleteFlag) {
		super();
		this.goodsId = goodsId;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.userId = userId;
		this.userName = userName;
		this.goodsName = goodsName;
		this.price = price;
		this.imagePath = imagePath;
		this.text = text;
		this.stock = stock;
		this.soldNum = soldNum;
		this.registDate = registDate;
		this.deleteFlag = deleteFlag;
	}
	
	public int getGoodsId() {
		return goodsId;
	}

	public int getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	
	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getSoldNum() {
		return soldNum;
	}
	public void setSoldNum(int soldNum) {
		this.soldNum = soldNum;
	}
	public Date getRegistDate() {
		return registDate;
	}
	public int getDeleteFlag() {
		return deleteFlag;
	}
	
}
