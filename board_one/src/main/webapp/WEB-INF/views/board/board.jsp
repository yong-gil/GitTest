<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
<jsp:include page="../common/header.jsp"></jsp:include>
</head>
<script src="${pageContext.request.contextPath}/resources/js/board.js"></script>
<body>
	<div class="mainBody">
		<ul class="tabs">
			<li class="tab-link current" data-tab="tab-1">인사관리</li>
			<li class="tab-link" data-tab="tab-2">생산관리</li>
			<li class="tab-link" data-tab="tab-3">납품관리</li>
		</ul>
		<button style="float: right">탭추가</button>
		<div id="tab-1" class="tab-content current">
			<table border="1">
				<tr>
					<th>글번호</th>
					<th>내용</th>
					<th>작성자</th>
					<th>내용</th>
				</tr>
				<c:forEach items="${list}" var="list">
					<tr onclick="">
						<td>${list.boardNum}</td>
						<td>${list.writer}</td>
						<td><a href="listOne?num=${list.boardNum}">${list.title}</a></td>
						<td>${list.content}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<div id="tab-2" class="tab-content">생산관리 테이블</div>
		<div id="tab-3" class="tab-content">납품관리 테이블</div>
		<a href="writeForm">글작성</a>
	</div>
	<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>
