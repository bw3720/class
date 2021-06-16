<%@page import="kr.co.sist.vo.CarVO"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
	<!-- 인덱스를 사용하는 forEach -->
	<select>
		<option>---점수선택---</option>
		<c:forEach var="i" begin="0" end="100" step="1">
			<option value="${i}"><c:out value="${i}"/></option>
		</c:forEach>
	</select>
	
	<!-- 배열을 사용하는 forEach -->
	<%
	String[] subjects = {"JavaSE", "Oracle DBMS", "JDBC", "HTML", "CSS", "JavaScript", "Servlet", "JSP"};
	//변수를 EL에서 사용할 수 없으므로 scope객체에 넣는다.
	request.setAttribute("data", subjects);
	%>
	<ul>
		<c:forEach var="subject" items="${data}">
			<c:set var="i" value="${i+1}"/><!-- 인덱스를 보여주기 위한 변수. 초기화가 된다. -->
			<li><c:out value="${i}"/>번 <c:out value="${subject}"/></li>
		</c:forEach>
	</ul>
	<%
		List<String> list = new ArrayList();
		list.add("img1.png");
		list.add("img2.png");
		list.add("img3.png");
		list.add("gosling.PNG");
		request.setAttribute("imgList", list);
	%>
		<div>
			<div class="row">
			
			<c:forEach var="img" items="${imgList}">
			  <div class="col-xs-6 col-md-3">
			    <a href="#" class="thumbnail">
			      <img src="../common/images/${img}" alt="error" style="width: 242px; height: 200px;"/>
			    </a>
			  </div>
			</c:forEach>
			
			</div>
		</div>
		
	<%
		Set<String> set = new HashSet();
		set.add("img1.png");
		set.add("img2.png");
		set.add("img3.png");
		set.add("gosling.PNG");
		request.setAttribute("imgSet", set);
	%>
		<div>
			<div class="row">
			
			<c:forEach var="img" items="${imgSet}">
			  <div class="col-xs-6 col-md-3">
			    <a href="#" class="thumbnail">
			      <img src="../common/images/${img}" alt="error" style="width: 242px; height: 200px;"/>
			    </a>
			  </div>
			</c:forEach>
			
			</div>
		</div>
		
		<div>
		<%
		List<CarVO> listCar = new ArrayList<CarVO>();
		listCar.add(new CarVO("그랜저","ABS,TCS,파노라마선루프","2021","01.jpg",4500,3000));
		listCar.add(new CarVO("M5","ABS,TCS,파노라마선루프,파워스티어링","2020","02.jpg",9500,3300));
		listCar.add(new CarVO("소나타","ABS,TCS,파노라마선루프","2019","03.jpg",4200,2900));
		listCar.add(new CarVO("그랜저","ABS,TCS,파노라마선루프","2021","318i.jpg",4500,3100));
		
		request.setAttribute("carData", listCar);
		%>
		<table>
			<tr>
				<th style="width: 40px;">번호</th>
				<th style="width: 100px;">이미지</th>
				<th style="width: 120px;">모델명</th>
				<th style="width: 330px;">옵션</th>
				<th style="width: 80px;">연식</th>
				<th style="width: 80px;">가격</th>
				<th style="width: 60px">배기량</th>
			</tr>
			<c:remove var="i"/>
			<c:forEach var="carVO" items="${carData }">
			<c:set var="i" value="${i+1 }"/>
			<tr>
				<td style="text-align: center;"><c:out value="${i}"/></td>
				<td><img src="http://localhost/jsp_prj/car_img/${carVO.car_img }" style="width : 95px;"/></td>
				<td style="text-align: center;"><c:out value="${carVO.model}"/></td>
				<td style="text-align: center;"><c:out value="${carVO.car_option}"/></td>
				<td style="text-align: center;"><c:out value="${carVO.car_year}"/></td>
				<td style="text-align: center;"><c:out value="${carVO.price}"/></td>
				<td style="text-align: center;"><c:out value="${carVO.cc}"/></td>
			</tr>
			</c:forEach>
		</table>
		</div>
		
		
	</div>
</body>
</html>