<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>ログイン画面</title>
</head>
<body>
  <form action="/scoremanager/LoginExecuteAction.java" method="post">
    <p>
      <label for="login">ログイン名</label>
      <input type="text" id="login" name="login" required>
    </p>
    <p>
      <label for="password">パスワード</label>
      <input type="password" id="password" name="password" required>
    </p>
    <p>
      <input type="submit" value="ログイン">
    </p>
  </form>
</body>
</html>
