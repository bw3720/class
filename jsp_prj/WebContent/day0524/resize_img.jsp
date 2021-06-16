<%@page import="day0524.ImageCreate"%>
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
<%
	String flag=request.getParameter("flag");//최초요청에는 flag가 존재하지 않습니다.	
	boolean jobFlag="create".equals(flag);	
	if(!jobFlag){
%>
	<a href="resize_img.jsp?flag=create">이미지생성</a>
<%}else{
	ImageCreate ic=new ImageCreate();
	String fileName="img1.png";
	ic.createImg("fileName");
	StringBuilder sb=new StringBuilder(fileName);
	sb.insert(0,"rs_");
%>	
	<a href="use_thumbnail.jsp?thumb=<%=sb%>">썸네일보기</a>
<%}//end else %>
</div>

</body>
</html>

















    