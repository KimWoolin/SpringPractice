<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<c:forEach var="i" begin="0" end="${cnt}" step="1"> <!-- jstl과 el 함께 쓸 수 있다! -->
		<tr>
		<c:choose>
			<c:when test="${i mod 2 eq 0}">
			<td>${i}</td>
			<td>짝수는</td>
			<td>데이터</td>
			<td>없습</td>
			<td>니다</td>
			<td>.</td>
			</c:when>
			<c:otherwise>
			<td>${i}</td>
			<td>${boardDto.no}</td> 
			<td>${boardDto.id}</td>
			<td>${boardDto.name}</td>
			<td>${boardDto.description}</td>
			<td>${boardDto.regUser}</td>
			</c:otherwise>
			</c:choose>
		</tr>
		</c:forEach>
		</table>
		
		<!-- jstl 활용하여 구구단 작성 -->
		<c:forEach var="i" begin="1" end="9" step="1">
		<br> ${cnt}*${i}=${cnt*i}
		</c:forEach>
		
		<p>
		
		<!--jstl과 el 활용하여 사용자가 입력한 숫자만큼 동적으로 테이블의 tr 생성 -->
		<table border="1">
		<c:forEach var="i" begin="1" end="${param.rowcnt}" step="1">
		<tr>
			<td>${i}</td>
			<td>inha</td>
			<td>김우린</td>
			<td>스프링</td>
			<td>Y</td>
		</tr>
		</c:forEach>
		</table>
					
	
</html>