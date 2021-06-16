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
	입력값 : <br/>
	이름 : <c:out value ="${ param.name}" /><br/>
	나이 : <c:out value ="${ param.age}" /><br/>
	선택언어 : 
	 <c:forEach var = "lang" items="${ lang}" >
	 	<c:out value ="${lang }" />
	 </c:forEach>
	 <br/>
	 
	 <a href = "index.html" > 메인으로</a>
	 <a href = "#void" onclick="history.back();"> 다시입력</a>
</div>

	


</body>
</html>