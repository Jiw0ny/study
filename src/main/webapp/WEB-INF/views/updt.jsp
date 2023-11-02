<%--
  Created by IntelliJ IDEA.
  User: PIC
  Date: 2023-11-01
  Time: 오전 1:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>회원 수정</title>
</head>
<body>
<form action="/user/updt/${user.userId}" method="post">
    <label for="userPw">비밀번호:</label>
    <input type="password" id="userPw" name="userPw" value="${user.userPw}" required><br>

    <label for="userName">이름:</label>
    <input type="text" id="userName" name="userName" value="${user.userName}" required><br>

    <label for="userEmail">이메일:</label>
    <input type="email" id="userEmail" name="userEmail" value="${user.userEmail}" required><br>

    <input type="submit" value="수정">
</form>
</body>
</html>
