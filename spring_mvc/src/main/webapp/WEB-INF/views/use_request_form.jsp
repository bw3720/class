<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 위 3개의 메타 태그는 *반드시* head 태그의 처음에 와야합니다; 어떤 다른 콘텐츠들은 반드시 이 태그들 *다음에* 와야 합니다 -->
    <title></title>

    <!-- 부트스트랩 -->
    <link href="http://localhost/spring_mvc/common/bootstrap-3.3.2/css/bootstrap.min.css" rel="stylesheet">
    <!--  jQuery CDN(contents Delivery Network) -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
	<!--  bootstrap  -->
 <script src="http://localhost/spring_mvc/common/bootstrap-3.3.2/js/bootstrap.min.js"></script>
 <style type = "text/css">
 
 </style>
<script type="text/javascript">


</script>
</head>
<body>
<div>	
	<form action ="request_process.do" method = "get" >
		<label>이름</label>
		<input type="text" name = "name" /> <br/>
		<label>나이</label>
		<input type="text" name = "age" /> <br/>
		<label>사용가능 기술</label>
		<input type = "checkbox" name = "lang" value = "Java SE"> 자바
		<input type = "checkbox" name = "lang" value = "HTML"> HTML
		<input type = "checkbox" name = "lang" value = "CSS"> CSS
		<input type = "checkbox" name = "lang" value = "JavaScript"> 자바스크립트
		<input type = "checkbox" name = "lang" value = "JavaEE"> Servlet/JSP <br/>
		<input type="submit" value = "전송"/> <br/>
	</form>
</div>

	


</body>
</html>