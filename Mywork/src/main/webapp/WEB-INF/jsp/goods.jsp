<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../css/style.css">
<title>商品</title><%--if(goods==null){titleそのまま}else{商品名}めんどくてもそのまま --%>
</head>
<body>
<header><%-- LiberteMarchand ログイン,会員登録<br>ようこそゲストさんへ カート --%>

        <div class="left">
            <a href="index.jsp"><img src="" alt="LiberteMarchand"></a>
        </div>
        <form class="left">
        <input type="text" placeholder="なにをお探しですか？" style="height:24px; width:300px;">
        </form>
        
        <div class="right">
        	<a href="basket.jsp">カート</a>
        	<a href="basket.jsp"><img></a>
        </div>
        <div class="right headblock1"></div>
        <div class="right">
        	<a href="contact.html">会員登録</a>
        </div>
        <div class="right" ><%--右詰め横並び --%>
			<a href="access.html">ログイン</a>
            <p class="headp">ようこそゲストさん</p>
        </div>
<div class="headblack"></div>
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
<div class="left" style="width:300px; height:200px; background-color:#FEF6B7;">商品画像</div>
<div class="left">
<h2>商品名</h2>
<p>\50,000 税込</p>
<form>
<input type="submit" value="カートに入れる">
</form>
<p>商品説明欄。長文入れます。何マスになるか指定する必要がある気がします。いい感じにレビューを配置したいのですが実力不足です。</p>
<br>
<div>レビュー 評価:☆☆☆☆☆<br>名無しさん</div>
<p>レビュー文章。何マスになるか指定する必要があると思います。こっちは小さい方がきれい？</p>
</div>
<div>評価:☆☆☆☆☆</div>
</main>
<footer><%-- お問い合わせ &copy;LiberteMarchand マイページ,ランキング,ログイン --%>
<div style="text-align:center;"><a href="index.jsp"><img src="" alt="LiberteMarchand"></a></div>
</footer>
</body>
</html>