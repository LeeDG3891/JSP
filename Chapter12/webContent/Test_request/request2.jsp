<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// getAttribute()로 바인딩 값 가져옴
	String name = (String)session.getAttribute("name");
	String address = (String)application.getAttribute("address");
%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>두 번째 JSP</title>
	</head>
	
	<body>
		<h1>이름은 <%= name %>입니다.</h1>
		<h1>주소는 <%= address %>입니다.</h1>
	</body>
</html>