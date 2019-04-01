<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>${boardDto.no mod 3}</td> <!-- mod=%의 el표현 -->
			<td>${boardDto.id}</td>
			<td>${boardDto.name}</td>
			<td>${boardDto.description}</td>
			<td>${boardDto.regUser}</td>
		</tr>
		</table>
	
		<br>no 값이 10보다 작거나 같은가? ${boardDto.no le 10}
		
		<br>no 값이 3~10 사이인가? ${boardDto.no ge 10 and boardDto.no le 3}

</body>
</html>