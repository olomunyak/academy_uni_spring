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
		location.href = "hello2";
	}
</script>
</head>
<body>
<form action="hello2" id="goForm" method="get">
	<input type="text" id="sendTxt" name="sendTxt"/>
	<input type="button" value="move" onclick="this.form.submit();"/>
</form>
</body>
</html>