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
<table border="1">
	<tr>
		<th>번호</th>
		<th>이름</th>
		<th>휴대번호</th>
	</tr>
	<c:forEach var="listItem" items="${list}">
		<tr>
			<td>${listItem.num}</td>
			<td>${listItem.name}</td>
			<td>${listItem.phone}</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>