<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-3.2.0.min.js"></script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
<script>
	$(function() {
		$('#writeCheck').click(function() {
			$.ajax({
				type : "POST",
				url : "write",
				data : {
					"writer" : $('#writer').val(),
					"title" : $('#title').val(),
					"content" : $('#content').val()
				},
				success : function(data) {
					if ($.trim(data) == "yes" || $.trim(data).equl) {
						alert("yes");
						$(location).attr('href', 'list');
					} else if ($.trim(data) == "no") {
						alert("no");
						alert('빈칸을 채워주세요.');
					}
				}
			})
		})
	})
</script>
</head>
<body>
	<table>
		<tr>
			<td>작성자</td>
			<td><input type="text" name="mWrite" size="40" id="writer"></td>
		</tr>
		<tr>
			<td>제목</td>
			<td><input type="text" name="mContent" size="40" id="title"></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea cols="50" rows="30" id="content"></textarea></td>
		</tr>
		<tr>
			<td colspan="2"><input type="button" value="입력" id="writeCheck"></td>
		</tr>
	</table>
	<a href="list">목록보기</a>
</body>
</html>
