package model;

import java.util.List;

import dao.GoodsDAO;

public class GoodsManagementLogic {
	
	public List<Goods> getGoodsInfo() {
		GoodsDAO dao  = new GoodsDAO(); 
		List<Goods> myGoodsList = dao.myGoodsFind();
		return myGoodsList;
	}
	
	public void registGoodsInfo(RegistGoods newGoods) {
		GoodsDAO dao = new GoodsDAO();
		dao.registNewGoods(newGoods);
	}
	
	public void changeGoodsInfo(Goods changeGoods) {
		GoodsDAO dao = new GoodsDAO();
		dao.changeGoodsInfo(changeGoods);
	}
	
	public void deleteGoodsInfo() {
		
	}
}
