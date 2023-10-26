<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録確認画面</title>
</head>

<body>
<!-- ヘッダー -->
<header>
<p>ユーザー登録確認</p>
</header>
<!-- ヘッダーここまで -->

<main>
<p>以下の内容で登録します。<br>
よろしかったでしょうか？</p>
<p>
名前<br>
<input type="text" name="name"><br>
メールアドレス<br>
<input type="text" name="address"><br>
パスワード<br>
<input type="text" name="password">
<input type="submit" value="登録" method="login">
<a href="regist.jsp">戻る</a>
</p>
</main>

<!-- フッターはじまりー -->
<footer>
</footer>
<!-- フッター終わり -->
</body>
</html>