<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>ログイン画面</title>
</head>
<body>
  <form action="scoremanager/LoginExecute.action" method="post">
    <p>
      <label for="id">ログイン名</label>
      <input type="text" id="id" name="id" required>
    </p>
    <p>
      <label for="pass">パスワード</label>
      <input type="password" id="pass" name="pass" required>
    </p>
    <p>
      <input type="submit" value="ログイン">
    </p>
  </form>
</body>
</html>
