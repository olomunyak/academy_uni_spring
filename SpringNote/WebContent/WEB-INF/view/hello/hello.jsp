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
${msg}
<br/>
${msg eq 'HelloWorld!!'}
<br/>
<c:forEach var="i" begin="1" end="10" step="1">
${i}<br/>
</c:forEach>
<br/>
<c:choose>
	<c:when test="${msg eq 'Hello World!!'}">
	it is same~~
	</c:when>
	<c:otherwise>
	it is different
	</c:otherwise>
</c:choose>
<br/>
<c:forEach var="listItem" items="${list}">
${listItem}<br/>
</c:forEach>
<br/>
<input type="button" value="button" onclick="go()" />
</body>
</html>