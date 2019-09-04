<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Grade Program</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<div>
<h1>화면</h1>

<form id="grade" action="<%=request.getContextPath()%>/grade.do">
	이름 : <input type="text" name = "name" /> <br />
	주민번호 : <input type="text" name = "ssn"/> <br />
	국어 : <input type="text" name = "kor"/> <br />
	영어 : <input type="text" name = "eng"/> <br />
	수학 : <input type="text" name = "math"/> <br />
	사회 : <input type="text" name = "soc"/> <br />
	<input type="hidden" name="action" value="register"/>
	<input type="hidden" name="dest" value="login"/>
	<input type="submit" value="데이타 전송"/> <br />
</form>
</div>
<script>
$('#grade').submit(function(){
		alert('회원가입 완료');

});
</script>
</body>
</html>