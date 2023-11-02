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
    <title>회원 정보</title>
</head>
<body>
<h2>회원 정보</h2>
<p>아이디: ${userList.userId}</p>
<p>이름: ${userList.userName}</p>
<p>이메일: ${userList.userEmail}</p>
<a href="/user/updtUser/${userList.userId}">수정</a>
<a href="/user/delUser/${userList.userId}">삭제</a>
</body>
</html>
