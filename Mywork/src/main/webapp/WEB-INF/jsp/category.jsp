<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>カテゴリー</title>
</head>
<body>

<header><%-- LiberteMarchand ログイン,会員登録<br>ようこそゲストさんへ カート --%>

        <div>
            <a href="index.jsp"><img src="" alt="LiberteMarchand"></a>
        </div>
        <div>
        	<input type="checkbox">
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
<h1>家電・インテリア</h1><%-- 入荷順で表示 --%>
<div>

</div>
</main>



<footer><%-- お問い合わせ &copy;LiberteMarchand マイページ,ランキング,ログイン --%>
<div><a href="index.jsp"><img src="" alt="LiberteMarchand"></a></div>
</footer>

</body>
</html>