<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<div>
	<h2>회원가입</h2>
	<form action="">
		아이디 <input type="text" /> <br>
		비밀번호 <input type="text"/> <br>
		<input type="submit" id="test" value="전송">
	</form>
</div>
<script>
$('#test').click(function(){
	alert('로그인 완료!!')
});
</script>
</body>
</html>