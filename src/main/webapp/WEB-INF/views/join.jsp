<%--
  Created by IntelliJ IDEA.
  User: PIC
  Date: 2023-11-01
  Time: 오전 1:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>회원 등록</title>
</head>
<body>
<form action="/user/insUser.do" method="post">
    <label for="userId">아이디:</label>
    <input type="text" id="userId" name="userId" required><br>

    <label for="userPw">비밀번호:</label>
    <input type="password" id="userPw" name="userPw" required><br>

    <label for="userName">이름:</label>
    <input type="text" id="userName" name="userName" required><br>

    <label for="userEmail">이메일:</label>
    <input type="email" id="userEmail" name="userEmail" required><br>

    <input type="submit" value="등록">
</form>
</body>
</html>
