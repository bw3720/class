<%@page import="kr.co.sist.vo.LoginDataVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//로그인 한 이후의 아이디,이름,이메일등의 데이터를 필요한 페이지에서 사용하기 위한 공통 JSP 
String id=(String)session.getAttribute("id");
LoginDataVO ldVO=(LoginDataVO)session.getAttribute("userData");
if(id==null){ //세션에서 꺼내온 값이 없다면
	response.sendRedirect("http://localhost/jsp_prj/day0524/login_form.jsp");
	return;
}//end if
%>






    