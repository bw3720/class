<%@page import="kr.co.sist.dao.InterestVO"%>
<%@page import="kr.co.sist.dao.SummerNoteDAO"%>
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
String num=request.getParameter("num");
if(num==null){//글 번호 없음.
%>
<a href="read_summernote.jsp?num=1">처음글</a><br/>
<a href="read_summernote.jsp?num=2">두번째글</a><br/>
<a href="read_summernote.jsp?num=3">세번째글</a>
<a href="read_summernote.jsp?num=25">25번째글</a>
<%	
	
}else{//글 번호 있음.
	int intNum=Integer.parseInt(num);//글 번호를 정수로 변환하고
	//DB글 조회
	SummerNoteDAO snDAO=new SummerNoteDAO();
	InterestVO iVO=snDAO.selectFile(intNum);
	%>
	조회결과 <br/>
	작성자: <strong><%=iVO.getName() %></strong><br/>
	관심사: <%=iVO.getInterest() %>
	<%
}//end else
%>
</div>

</body>
</html>

















    