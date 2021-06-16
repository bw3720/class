<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="View"%>
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
	<table class="table table-striped">
		<thead>
			<tr>
				<th style="width: 60px;">번호</th>
				<th style="width: 120px;">이름</th>
				<th style="width: 150px;">이메일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="ldVO" items="${data}">
			<c:set var="i" value="${i+1}"/>
			<tr>
				<td><c:out value="${i }"/></td>
				<td><c:out value="${ldVO.name }"/></td>
				<td><c:out value="${ldVO.email }"/></td>
			</tr>
			
			</c:forEach>
		</tbody>
	</table>

	</div>
	<div>
		<a href="move.do">요청 A</a>
		<a href="a.do">요청 B</a>
		<a href="b.do">요청 C</a>
		<a href="yana.do">요청 D</a>
	</div>
</body>
</html>