<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
</head>
<body>
	<table>
		<tr>
			<td>번호</td>
			<td>${list.boardNum}</td>
		</tr>
		<tr>
			<td>작성자</td>
			<td>${list.writer}</td>
		</tr>
		<tr>
			<td>제목</td>
			<td>${list.title}</td>
		</tr>
		<tr>
			<td>내용</td>
			<td>${list.content}</td>
		</tr>
		<tr>
			<td colspan="2"><a href="list">목록으로</a></td>
		</tr>
	</table>
</body>
</html>
