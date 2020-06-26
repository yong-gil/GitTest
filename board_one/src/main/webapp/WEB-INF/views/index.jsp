<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>메인페이지</title>
<jsp:include page="common/header.jsp"></jsp:include>
</head>
<style>
.mainBody {
	width: 100%;
	background-color: yellow;
	height: 70%;
	float: left
}

</style>
<body>
	<div class="mainBody"></div>
</body>
</html>
<jsp:include page="common/footer.jsp"></jsp:include>
