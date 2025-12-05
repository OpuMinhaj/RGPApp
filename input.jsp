<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>ユーザー登録</title>
</head>
<body>
    <h1>ユーザー登録</h1>
    <form method="post" action="./registtest">
        ユーザー名<input type="text" name="name"><br>
        パスワード<input type="text" name="pass"><br>
        趣味<input type="text" name="hobby"><br>
        <input type="submit" value="登録" />
    </form>
</body>
</html>