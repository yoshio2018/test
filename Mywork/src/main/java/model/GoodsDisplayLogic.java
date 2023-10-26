package model;

import java.util.List;

import dao.GoodsDAO;

public class GoodsDisplayLogic {
	
	public List<Category> getCategory(){
		GoodsDAO dao  = new GoodsDAO(); 
		List<Category> categoryList = dao.getCategoryList();
		return categoryList;
	}
}
