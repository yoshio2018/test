<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>販売管理</title>
</head>
<body>
<p>
<form action="managementServlet" method="post">
商品名:<input type="text" name="goodsName">
カテゴリ:<select name="categoryId">
<c:forEach var="category" items="${categoryList}">
<option value="<c:out value="${category.categoryId}"/>"><c:out value="${category.categoryName}"/></option>
</c:forEach>
</select>
価格:<input type="text" name="price">
説明:<input type="text" name="text">
在庫数:<input type="text" name="stock">
画像:<input type="file" name="image">
<input type="submit" value="登録">
</form>

<c:forEach var="myGoods" items="${myGoodsList}">
商品名:<c:out value="${myGoods.goodsName}"/>
カテゴリ:<c:out value="${myGoods.categoryName}"/>
価格:<c:out value="${myGoods.price}"/>
説明:<c:out value="${myGoods.text}"/>
在庫数:<c:out value="${myGoods.stock}"/>
画像:<image src="Mywork/IMAGE/<c:out value="${myGoods.imagePath}"/>" width="50">
変更
削除
<br>
</c:forEach>
</p>
</body>
</html>