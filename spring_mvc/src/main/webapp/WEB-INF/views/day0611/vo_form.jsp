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
	
	<form action = "vo_process.do" method = "get">
		<input type = "text" name = "nick" placeholder="닉네임"><br/>	
		<input type = "text" name = "age" placeholder="나이"><br/>	
		<input type = "checkbox" name = "movie" value="캐시트럭">캐시트럭<br/>	
		<input type = "checkbox" name = "movie" value="크루엘라">크루엘라<br/>	
		<input type = "checkbox" name = "movie" value="컨저링3">컨저링3<br/>	
		<input type = "checkbox" name = "movie" value="분노의질주">분노의질주<br/>	
		<input type = "checkbox" name = "movie" value="아야와마녀">아야와마녀<br/>	
		<input type = "submit" value = "요청"><br/>	
	</form>
</div>
</body>
</html>