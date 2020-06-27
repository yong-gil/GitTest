<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link type=text/css rel=stylesheet
	href="${pageContext.request.contextPath}/resources/css/main.css" />
<title></title>
</head>
<script>
function login(){
	window.open("login");
}
</script>
<body>
	<div class="headerMain">
		<div class="mainLogo"></div>
		<div class="headerCenter">
			<div class="pageName"><a href="/test">사이트</a></div>
			<div class="memeber">
			<a href="#none" onclick="window.open('login', '로그인','width=600, height=700'); return false">로그인</a>
			<a href="#"onclick="window.open('addMember', '회원가입','width=600, height=700'); return false">회원가입</a>
			<a href="">아이디/패스워드 찾기</a>
			</div>
			<div class="menu">
			<a href = "listAll">게시판</a>
			</div>
		</div>
	</div>
</body>
</html>
