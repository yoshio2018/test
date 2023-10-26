<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録内容変更ページ</title>
</head>

<body>
<!-- ヘッダー始まり -->
<header>
<p>登録内容変更ページ</p>
</header>
<!-- ヘッダー終わり -->

<main>
<div>
<table>
<tr>
<td>商品名</td>
<td>
<input type="text" name="goodsname">
</td>

</tr>
<tr>
<td>カテゴリ</td>
<td>
<select name="cotegoryselect" size="1" >
<option value="サンプル1">家電・インテリア</option>
<option value="サンプル2">日用品</option>
<option value="サンプル3">服・シューズ・バッグ</option>
<option value="サンプル1">ハンドメイド・趣味</option>
<option value="サンプル1">その他</option>
</select>
</td>
</tr>

<tr>
<td>値段</td>
<td>
<input type="text" name="goodsprice">
</td>
</tr>

<tr>
<td>説明</td>
<td>
<input type="text" name="goodsexplanation">
</td>
</tr>

<tr>
<td>在庫数</td>
<td>
<input type="text" name="goodsstock">
</td>
</tr>

<tr>
<td>画像</td>
<td>
<input type="file" name="goodsimage">
</td>
</tr>

<tr>
<td>
<input type="submit" value="変更登録">
</td>
</tr>
</div>

</table>
</div>
</main>

<!-- フッター始まり -->
<footer>
</footer>
<!-- フッター終わり -->
</body>
</html>