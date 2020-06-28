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
			<li class="tab-link current" data-tab="tab-1">테이블1</li>
			<li class="tab-link" data-tab="tab-2">테이블2</li>
			<li class="tab-link" data-tab="tab-3">테이블3</li>
		</ul>
		<button style="float: right">탭추가</button>
		<div id="tab-1" class="tab-content current">
			<table border="1">
				<tr>
					<th>글번호</th>
					<th>내용</th>
					<th>작성자</th>
				</tr>
				<c:forEach items="${list}" var="list">
					<tr>
						<td>${list.boardNum}</td>
						<td>${list.writer}</td>
						<td><a href="selectOne?boardNum=${list.boardNum}">${list.title}</a></td>
					</tr>
				</c:forEach>
			</table>
			<div class=pageContorl>
				<c:forEach varStatus="vs" begin="1" end="${paging}">
					<c:if test="${page eq vs.current}">
						<B>${vs.current}</B>
					</c:if>
					<c:if test="${page ne vs.current}">
						<a
							href="${pageContext.request.contextPath}/listAll?page=${vs.current}">
							${vs.current} </a>
					</c:if>

				</c:forEach>
			</div>
			<div class="searchBar">
				<select name="searchCode">
					<option value="">선택</option>
					<option value="title">제목</option>
					<option value="writer">작성자</option>
				</select> <input id="searchTxt" type="text" size="20"> <input
					id="searchBtn" type="button" value="검색">
			</div>
			<a href="writeForm">글작성</a>
		</div>
		<div id="tab-2" class="tab-content">테이블2</div>
		<div id="tab-3" class="tab-content">테이블3</div>
	</div>
	<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>
