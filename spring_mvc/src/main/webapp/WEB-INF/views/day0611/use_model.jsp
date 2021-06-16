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
	<c:forEach var = "img" items = "${imgList }">
		<div>
			<img src = "../common/images/${img}" />
		</div>
	</c:forEach>
	<div style = "position:absolute; top : 200px; left : 400px">
		<ul>
			<c:if test="${empty noticeList }">
				<li>공지사항이 없다</li>
			</c:if>
			<c:forEach var ="notice" items = "${noticeList }">
				<li><c:out value= "${notice }" /></li>
			</c:forEach>
		</ul>		
	</div>
</div>
</body>
</html>