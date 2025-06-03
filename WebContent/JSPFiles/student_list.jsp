
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>得点管理システム</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <header>
        <h1>得点管理システム</h1>
        <div class="auth-links">
            <a href="example.jsp">ユーザー登録</a>
            <a href="example.jsp">ログイン</a>
        </div>
    </header>

    <div id="menu">
        <h2>学生管理</h2>
        <form id="filter-form" name="filter-form" action="example.jsp" method="get">
            <label for="academic-year">学年:</label>
            <select id="academic-year" name="academic-year">
                <option value="2021">2021</option>
                <option value="2022">2022</option>
                <option value="2023">2023</option>
            </select>

            <label for="class">クラス:</label>
            <select id="class" name="class">
                <option value="101">101</option>
                <option value="102">102</option>
                <option value="201">201</option>
            </select>

            <button type="submit">検索</button>
            <button type="button" onclick="location.href='example.jsp'">新規登録</button>
        </form>

        <table id="student-table" name="student-table">
            <thead>
                <tr>
                    <th>No.</th>
                    <th>学年</th>
                    <th>学籍番号</th>
                    <th>氏名</th>
                    <th>クラス</th>
                    <th>操作</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>2021</td>
                    <td>123456</td>
                    <td>山田太郎</td>
                    <td>101</td>
                    <td>
                        <a href="example.jsp">編集</a>
                        <a href="example.jsp">削除</a>
                    </td>
                </tr>
                <!-- Additional rows can be added here -->
            </tbody>
        </table>
    </div>

    <footer>&copy; 2019 PC</footer>
</body>
</html>
