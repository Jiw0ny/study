<%--
  Created by IntelliJ IDEA.
  User: PIC
  Date: 2023-11-27
  Time: 오후 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원 수정</title>
</head>
<body>
<div>
    <form id="updtMemberForm">
        <div class="form-group">
            <label for="user_id">아이디:</label>
            <input type="text" class="form-control" id="user_id" name="user_id" readonly>
        </div>
        <div class="form-group">
            <label for="user_name">이름:</label>
            <input type="text" class="form-control" id="user_name" name="user_name" required>
        </div>
        <div class="form-group">
            <label for="user_email">이메일:</label>
            <input type="number" class="form-control" id="user_email" name="user_email" required>
        </div>
        <button type="button" class="btn btn-primary" id="updtBtn">수정</button>
    </form>
</div>
</body>
</html>
<script>
    // 회원 수정
    $("#updtBtn").on("click", function () {
        $.ajax({
            type: "patch",
            url: "/updtUser.do",
            data: {
                userId : $("#user_id").val(),
                userName: $("#user_name").val(),
                userEmail: $("#user_email").val()
            },
            dataType: "json",
            success: function (data) {
                if (data.result) {
                    confirm("수정 성공", function (res) {
                        if (res) {
                            location.reload();
                        }
                    });
                }
            },
            error: function (request) {
                alert("수정 실패");
            }
        });
    });

</script>
