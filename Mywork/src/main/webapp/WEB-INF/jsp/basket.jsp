<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../css/style.css">
<title>カート</title>
</head>
<body>

<header><%-- LiberteMarchand ログイン,会員登録<br>ようこそゲストさんへ カート --%>

        <div>
            <a href="index.jsp"><img src="" alt="LiberteMarchand"></a>
        </div>
        <form>
        <input type="text" placeholder="なにをお探しですか？">
        </form>
        <div><%--右詰め横並び --%>
			<a href="login.jsp">ログイン</a>
            <p>ようこそゲストさん</p>
        </div>
         <div>
        	<a href="regist.jsp">会員登録</a>
        </div>
        <div>
        	<a href="basket.jsp">カート</a>
        	<a href="basket.jsp"><img></a>
        </div>
</header>



<main><%-- カテゴリ別ランキング 個別商品 --%>
<div>
	<select>
	<option value="カテゴリ１">家電・インテリア</option>
	<option value="カテゴリ２">日用品</option>
	<option value="カテゴリ３">服・シューズ・バック</option>
	<option value="カテゴリ４">ハンドメイド・趣味</option>
	<option value="カテゴリ５">その他</option>
	</select>
</div>
<h2>ショッピングカート</h2>
<div><%-- 画像　商品名　値段　数量指定　削除 --%>
<img src="../images/echo.jpg">
<p>商品名１</p>
<p>\10,000</p>
<div>
<select><%-- 在庫数for文多分いる --%>
<option value="1">1</option>
</select>
</div>
<form action="" method="">
<input type="submit" value="削除">
</form>
</div>
<br>
<div><%-- メイン画面に戻る　合計額　レジへ進む　買い物を続ける --%>
<p>合計(税込)  : \10,000</p>
<form action="" method="">
<input type="submit" value="レジへ進む">
</form>
<a href="index.jsp">買い物を続ける</a>
</div>
</main>



<footer><%-- お問い合わせ &copy;LiberteMarchand マイページ,ランキング,ログイン --%>
<div><a href="index.jsp"><img src="" alt="LiberteMarchand"></a></div>
</footer>

</body>
</html>