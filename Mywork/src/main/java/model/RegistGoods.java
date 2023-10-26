package model;

public class RegistGoods {
	private int categoryId;
	private int userId;
	private String goodsName;
	private int price;
	private String imagePath;
	private String text;
	private int stock;
	
	public RegistGoods() {}
	public RegistGoods(int categoryId, int userId, String goodsName, int price, String imagePath, String text,
			int stock) {
		super();
		this.categoryId = categoryId;
		this.userId = userId;
		this.goodsName = goodsName;
		this.price = price;
		this.imagePath = imagePath;
		this.text = text;
		this.stock = stock;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
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
	public int getUserId() {
		return userId;
	}
	
	
}
