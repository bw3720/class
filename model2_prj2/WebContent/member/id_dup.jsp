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
	$(function() {
		$("#btn").click(function () {
			chkNull();
		});//click
		
		$("#id").keydown(function (evt) {
			if(evt.which==13){
				chkNull();
			};
		});
		
	});//ready
	
	function chkNull() {
			if($("#id").val()==""){
				alert("아이디는 필수 입력!!");
				$("#id").focus();
				return;
			}//end if
			$("#frm").submit();
		
	}
	
	
	function useId(id) {
		opener.window.document.frm.member_id.value=id;
		self.close();
	}//useId
</script>
</head>
<body>
	<div>
	<form action="id_dup.do" id="frm">
	<input type="hidden" name="cmd" value="D001"/>
	<!-- web browser에서 <input type="text | password"가 하나만 존재한면 
		엔터를 쳣을 때 submit이 된다.
		엔터문제를 해결할려면 HTML Form Control을 두개 만들되 하나를 보여주지 않는다.
	 -->
	아이디 <input type="text" name="id" id="id"/><input type="button" value="중복확인" id="btn"/> 
	<input type="text" style="display: none"/>
	<div>
	<c:if test="${not empty param.id}">
		<c:choose>
			<c:when test="${requestScope.idFlag }">
				<span style="color: #2A5893; font-weight: bold;">
					<c:out value="${param.id }"/>는 사용 가능합니다
				</span>
				<a href="#void" onclick="useId('${param.id}')">사용</a>
			</c:when>
			<c:otherwise>
				<c:out value="${param.id }"/>는 이미 사용중입니다.
			</c:otherwise>
		</c:choose>
	</c:if>
	</div>
	
	
	
	</form>
	
	
	
	
	
	

	</div>
</body>
</html>