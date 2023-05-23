<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    isELIgnored="false"  %>
<%
   request.setCharacterEncoding("UTF-8");

	// session에 address 속성 이름으로 바인딩
	// forward4.jsp에서 request로 바인딩시켜서 우선순위가 높은 request에 저장한 주소가 출력됨
	session.setAttribute("address", "부산시 사상구");
%>   
<html>
	<head>
		<meta charset=”UTF-8">
		<title>회원 정보 출력창</title>
	</head>
	<body>
		<table border="1"  align="center" >
		    <tr align="center" bgcolor="#99ccff">
		      <td width="7%"><b>아이디</b></td>
		      <td width="7%"><b>비밀번호</b></td>
		      <td width="5%"><b>이름</b></td>
		      <td width="5%"><b>이메일</b></td>
		      <td width="5%"><b>주소</b></td>
		   </tr>
		   
		   <tr align=center>
		   <!-- 바인딩된 속성 이름으로 회원 정보 출력 -->
		      <td>${id} </td>
		      <td>${pwd} </td>
		      <td>${name} </td>
		      <td>${email} </td>
		      <td>${address} </td>
		   </tr>
		</table>
	</body>
</html>