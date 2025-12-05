<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>好きな趣味</title>
</head>
<body>
<h1>好きな趣味</h1>

<form method="post" action="/namehobby">
    ユーザー名 <input type="text" name="name"><br>
    趣味       <input type="text" name="hobby"><br>
    <input type="submit" value="送信">
</form>

</body>
</html>
