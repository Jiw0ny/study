<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>회원 목록</title>
</head>
<body>
<div>
    <table class="table">
        <thead>
        <tr>
            <th>ID</th>
            <th>이름</th>
            <th>이메일</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:choose>
            <c:when test="${userList}">
                <c:forEach items="${userList}" var="user">
                    <tr>
                        <td>${user.userId}</td>
                        <td>${user.userName}</td>
                        <td>${user.userEmail}</td>
                        <td>
                            <button type="button" data-id="${userList.userId}" data-dismiss="modal">
                                수정
                            </button>
                            <button type="button" data-id="${userList.userId}">
                                삭제
                            </button>
                        </td>
                    </tr>
                </c:forEach>
            </c:when>
        </c:choose>
        <c:otherwise>
            <tr>
                <td>조회된 멤버가 없습니다.</td>
            </tr>
        </c:otherwise>
        </tbody>
    </table>
</div>
</body>
</html>
<script>
    // 회원 정보 조회
    $(".updtBtn").on("click", function () {
        let id = $(this).data("id");
        $.ajax({
            type: "get",
            url: "/selMemberById.do",
            data: { id: id },
            dataType: "json",
            success: function (data) {
                $("#updt_id").val(data.id);
                $("#updt_name").val(data.name);
                $("#updt_age").val(data.age);

                $("#updtMemberModal").show();

            },
            error: function (request) {
                alert("삭제 실패!");
            }
        });
    });

    // 회원 수정
    $("#updtMemBtn").on("click", function () {
        $.ajax({
            type: "patch",
            url: "/updtMember.do",
            data: {
                id : $("#updt_id").val(),
                name: $("#updt_name").val(),
                age: $("#updt_age").val()
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
                alert("수정 실패!");
            }
        });
    });
    // 회원 삭제
    $(".delBtn").on("click", function () {
        let userId = $(this).data("userId");
        $.ajax({
            type: "delete",
            url: "/delUser.do",
            data: { userId: userId },
            dataType: "json",
            success: function (data) {
                if (data.result) {
                    confirm("회원삭제 성공", function (res) {
                        if (res) {
                            location.reload();
                        }
                    });
                }
            },
            error: function (request) {
                alert("회원삭제 실패");
            }
        });
    });

</script>
