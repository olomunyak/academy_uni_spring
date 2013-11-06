<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hello</title>
<script type="text/javascript">
	function go() {
		var txt = document.getElementById("sendTxt");
		
		if(txt.value != "") {
			if(isNaN(txt.value)) {
				alert("숫자좀 넣어라!");
			} else {
				document.getElementById("goForm").submit();
			}
			
		} else {
			alert("내용을 넣어라!");
		}
	}
</script>
</head>
<body>
<form action="hello2" id="goForm" method="post">
	<input type="text" id="sendTxt" name="sendTxt"/>
	<input type="button" value="move" onclick="go();"/>
</form>
</body>
</html>