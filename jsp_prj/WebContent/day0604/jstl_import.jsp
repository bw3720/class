<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
	<c:import url="../day0602/include_b.jsp"/><!-- 공통디자인을 가지고 있는 페이지를 호출하여 처리. -->
	<%-- <%=name %> HTML 생성단계에서 페이지가 결합되므로 변수나 method가 공유되지 않는다. --%>
	</div>
</body>
</html>