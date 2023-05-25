<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
 %>
 
 <%
 	request.setCharacterEncoding("utf-8");
 %>
 
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
	<html>
	<head>
		<meta charset="utf-8">
		<title>학점변환기</title>
	</head>
	
	<body>
		<!-- param.score를 score 변수에 할당해서 사용 -->
		<c:set var="score" value="${param.score}"/>
		<h1>시험점수 <c:out value="${score}"/></h1><br>
		<c:choose>
			<c:when test="${score>=90 && score<=100}">
				<h1>A학점입니다.</h1>
			</c:when>
			<c:when test="${score>=80 && score<90}">
				<h1>B학점입니다.</h1>
			</c:when>
			<c:when test="${score>=70 && score<80}">
				<h1>C학점입니다.</h1>
			</c:when>
			<c:when test="${score>=60 && score<70}">
				<h1>D학점입니다.</h1>
			</c:when>
			<c:when test="${score<60}">
				<h1>F학점입니다.</h1>
			</c:when>
			<c:otherwise>
				<h1>잘못된 점수입니다.</h1>
			</c:otherwise>
		</c:choose>
		
	</body>
</html>