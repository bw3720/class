<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<ul>
	<li><strong>입력값</strong></li>
	<li>닉네임 : <c:out value= "${param.nick }"/></li>
	<li>나이 : <c:out value= "${param.age }"/></li> 
	<li>
	<!-- 선택한 값이 없음을 보여주는 코드는 forEach전에 사용 -->
		<c:if test="${empty movie }">
			선택한 영화없음
		</c:if>
		<c:forEach items="${movie }" var = "movie">
			<c:out value = "${movie }"/>
		</c:forEach>
	</li>
</ul>
<a href ="http://localhost/spring_mvc/index.html"> 메인화면 </a>
</div>
</body>
</html>