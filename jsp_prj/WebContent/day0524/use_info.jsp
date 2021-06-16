<%@page import="kr.co.sist.vo.LoginDataVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>
    <!-- botstrap -->
    <link href="http://localhost/jsp_prj/common/bootstrap-3.3.2/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>    
    <!-- botstrap -->
    <script src="http://localhost/jsp_prj/common/bootstrap-3.3.2/js/bootstrap.min.js"></script>
    
<style type="text/css">

</style>

<script type="text/javascript">

</script>
</head>
<body>

<div>
이전 페이지에서 사용한 값들을 또 사용하고 싶다.
<!-- 이전페이지에서 사용한 값들을 querystring으로 만들어서 parameter로 받을 수 있다. -->
<%= session%>
<div>
<%
//페이지가 달라져도 한번 세션에 저장된 값은 얻어 낼 수 있다.
String id=(String)session.getAttribute("id");
LoginDataVO ldVO=(LoginDataVO)session.getAttribute("userData");
if(id==null){ //세션에서 꺼내온 값이 없다면
	response.sendRedirect("http://localhost/jsp_prj/day0524/login_form.jsp");
	return;
}//end if
%>
<strong><%=ldVO.getName() %></strong>(<%=id %>,<%=ldVO.getEmail() %>)<br/>
</div>
<a href="../day0525/use_session_value.jsp">데헷</a>
</div>

</body>
</html>

















    