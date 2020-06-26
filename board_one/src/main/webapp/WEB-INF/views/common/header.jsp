<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
</head>
<style>
.headerMain {
	width: 100%;
	height: 20%;
	background-color: red;
}

.mainLogo {
	background-color: navy;
	width: 15%;
	height: 100%;
	float: left;
}

.headerCenter {
	float: left;
	width: 85%;
	height: 100%;
}

.pageName{
width:80%;
height:50%;
background-color:white;
text-align: center;
float: left
}

.memeber{
float:left;
height:50%;
width:20%;
background-color:white;
}

.member a{
float:left;
width:100%;
height:100%;
margin-right:5%;
}
</style>
<script>
function login(){
	window.open("login");
}
</script>
<body>
	<div class="headerMain">
		<div class="mainLogo"></div>
		<div class="headerCenter">
			<div class="pageName">사이트</div>
			<div class="memeber">
			<a href="#none" onclick="window.open('login', '로그인','width=600, height=700'); return false">로그인</a>
			<a href="#"onclick="window.open('addMember', '회원가입','width=600, height=700'); return false">회원가입</a>
			<a href="">아이디/패스워드 찾기</a>
			</div>
		</div>
	</div>
</body>
</html>
