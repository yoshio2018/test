package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Category;
import model.Goods;
import model.GoodsDisplayLogic;
import model.GoodsManagementLogic;


@WebServlet("/managementServlet")
public class managementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		GoodsDisplayLogic goodsDisplayLogic = new GoodsDisplayLogic();
		List<Category> categoryList = goodsDisplayLogic.getCategory();
		request.setAttribute("categoryList", categoryList);
		
		GoodsManagementLogic goodsManagementLogic = new GoodsManagementLogic();
		List<Goods> myGoodsList = goodsManagementLogic.getGoodsInfo();
		request.setAttribute("myGoodsList", myGoodsList);

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/management.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//RegistGoods = (RegistGoods)sesstion.getAttribute()

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/management.jsp");
		dispatcher.forward(request, response);
	}

}
