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
		<c:forEach var="i" begin="0" end="${cnt}" step="1"> <!-- jstl�� el �Բ� �� �� �ִ�! -->
		<tr>
		<c:choose>
			<c:when test="${i mod 2 eq 0}">
			<td>${i}</td>
			<td>¦����</td>
			<td>������</td>
			<td>����</td>
			<td>�ϴ�</td>
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
		
		<!-- jstl Ȱ���Ͽ� ������ �ۼ� -->
		<c:forEach var="i" begin="1" end="9" step="1">
		<br> ${cnt}*${i}=${cnt*i}
		</c:forEach>
		
		<p>
		
		<!--jstl�� el Ȱ���Ͽ� ����ڰ� �Է��� ���ڸ�ŭ �������� ���̺��� tr ���� -->
		<table border="1">
		<c:forEach var="i" begin="1" end="${param.rowcnt}" step="1">
		<tr>
			<td>${i}</td>
			<td>inha</td>
			<td>��츰</td>
			<td>������</td>
			<td>Y</td>
		</tr>
		</c:forEach>
		</table>
					
	
</html>