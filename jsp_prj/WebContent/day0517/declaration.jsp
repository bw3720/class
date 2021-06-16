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

<%!
	int i;			//instance 변수
	static int j;	//static 변수
	public static final int MAX=100;	//constant 변수
	
	public String msg(){
		return "오늘은 비오는 월요일.";
	}//msg
%>


instance변수 i의 값: <%=i %><br/>
static변수 j의 값: <%=j %><br/>
constant변수 MAX의 값: <%=MAX %><br/>
method 호출: <%=msg() %>

</body>
</html>

















    