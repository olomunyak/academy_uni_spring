<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<script type="text/javascript">
	function login() {
		var memId = document.getElementById("memId");
		var memPw = document.getElementById("memPw");
		
		if(memId.value == "") {
			alert("아이디를 입력해 주세요");
		}
		else if(memPw.value == "") {
			alert("비밀번호를 입력해 주세요");
		}
		else {
			document.getElementById("loginForm").submit();
		}
	}
</script>
</head>
<body>
Login Page..
<form id="loginForm" action="loginCheck" method="post">
<input type="text" id="memId" name="memId"/><br/>
<input type="password" id="memPw" name="memPw"/>
<input type="button" value="button" onclick="login();"/>
</form>
</body>
</html>