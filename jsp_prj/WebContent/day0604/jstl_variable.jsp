<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<%String addr= "서울특별시 강남구"; %>
	<!-- 변수 선언 : EL에서 사용가능. -->
	<c:set var="name" value="곽범수"/>
	<c:set var="age" value="25"/>
	<c:set var="addr" value="<%=addr %>"/>
	
	EL 사용 : ${name},${age },${addr }<br/>
	<!-- 변수삭제 -->
	<c:remove var="age"/>
	<!-- 출력 -->
	이름 : <c:out value="${name}"/><br/>
	나이 : <c:out value="${age }"/>
	주소 : <c:out value="${addr }"/>
	

	</div>
</body>
</html>