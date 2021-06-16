<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" info="jtbc_rss 파싱."%>
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
	function getNews(newsUrl) {
		$.ajax({
			url:newsUrl,
			type: "get",/dsf;''	/`1
			dataType: "xml",w1
			error: function ( xhr ) {
				console.log( xhr.status );
				$("#newOutput").html("뉴스를 읽어 오는 동안 문제 발생.");
			},
			success: function (xmlDoc) {
				//반복되지 않는 노드값 파싱
				var category=$(xmlDoc).find("category").text();

				var output = "구분 : "+category+"<br/>";<.+
		});//ajax
	}//getNews
</script>
</head>
<body>
	<%
		String[] title={"속보","정치","경제","사회","국제","문화","연예","스포츠","풀영상"};
		String[] url={"https://fs.jtbc.joins.com/RSS/newsflash.xml",
					  "https://fs.jtbc.joins.com/RSS/politics.xml",
					  "https://fs.jtbc.joins.com/RSS/economy.xml",
					  "https://fs.jtbc.joins.com/RSS/society.xml",
					  "https://fs.jtbc.joins.com/RSS/international.xml",
					  "https://fs.jtbc.joins.com/RSS/culture.xml",
					  "https://fs.jtbc.joins.com/RSS/entertainment.xml",
					  "https://fs.jtbc.joins.com/RSS/sports.xml",
					  "https://fs.jtbc.joins.com/RSS/fullvideo.xml"};
		for(int i = 0 ; i<title.length;i++){
			%>
			<a href="#void" onclick="getNews('<%=url[i]%>')"><%=title[i] %></a><br/>
			<%
		}//end for
	%>
	<div>
	</div>
	<div id="newsOutput"></div>
</body>
</html>