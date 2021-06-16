<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>
    <!-- bootstrap -->
    <link href="http://localhost/jsp_prj/common/bootstrap-3.3.2/css/bootstrap.min.css" rel="stylesheet">
    
    <!-- JQuery CDN(Contents Delivery Network) -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
	<!-- bootstrap -->
    <script src="http://localhost/jsp_prj/common/bootstrap-3.3.2/js/bootstrap.min.js"></script>
    
<style type="text/css">
	
</style>
<script type="text/javascript">
	
</script>
</head>
<body>
	<div>
	<c:choose>
		<c:when test="${addMemberFlag }">
		회원가입 성공<br/>
		<c:out value="${param.name }"/>님의 회원가입을 축하드립니다.
		</c:when>
		<c:otherwise>
		<c:out value="${param.name }"/>님의 회원 가입이 정상적으로 이러지지 않았습니다.<br/>
		죄송합니다.
		</c:otherwise>
	
	
	</c:choose>

	</div>
</body>
</html>