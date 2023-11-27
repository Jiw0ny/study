<%--
  Created by IntelliJ IDEA.
  User: PIC
  Date: 2023-11-01
  Time: 오전 1:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>회원가입</title>
</head>
<body>

<h1>회원가입</h1>

<div>
    <form id="joinForm" name="joinForm">
        <label for="userId">아이디:</label>
        <input type="text" id="userId" name="userId" placeholder="아이디"><br/>

        <label for="userPw">비밀번호:</label>
        <input type="password" id="userPw" name="userPw" placeholder="비밀번호"><br/>

        <label for="userName">이름:</label>
        <input type="text" id="userName" name="userName" placeholder="이름"><br/>

        <label for="userEmail">이메일:</label>
        <input type="text" id="userEmail" name="userEmail" placeholder="이메일"><br/>

        <button id="joinBtn" type="button">가입</button>
    </form>
</div>
</body>
</html>
<script>
    // 회원 가입
    $("#joinBtn").on("click", function () {
        $.ajax({
            type: "post",
            url: "/user/insUser.do",
            data: $("#joinForm").serialize(),
            dataType: "json",
            success: function (data) {
                if (data.result) {
                    confirm("회원가입이 완료되었습니다.", function (res) {
                        if (res) {
                            location.href = "/";
                        }
                    });
                }
            },
            error: function (request) {
                alert("회원가입이 실패하였습니다.");
            }
        });
    });
</script>