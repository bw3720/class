<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <!-- botstrap -->
    <link href="http://localhost/jsp_prj/common/bootstrap-3.3.2/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
    <!-- botstrap -->
    <script src="http://localhost/jsp_prj/common/bootstrap-3.3.2/js/bootstrap.min.js"></script>
    
	<!-- coin-slider -->
	<script type="text/javascript" src="http://localhost/html_prj/common/coin/coin-slider.min.js"></script>
	<link rel="stylesheet" href="http://localhost/html_prj/common/coin/coin-slider-styles.css" type="text/css" />
 
	
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.5.1/css/swiper.min.css">
	<script src="https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.5.1/js/swiper.min.js"></script>
    
<style type="text/css">
#wrap{ border: 1px solid #333; width: 1920px; margin: 0 auto;  }
#header{  width: 1200px; height: 150px; position: absolute; left: 360px; color: #ffffff; z-index:2}
#mainPoster{  width: 1920px; height: 774px; margin: 0 auto ; z-index:1 }
/* #containerMain{ border: 1px solid #333; width: 900px; height: 700px; margin: 0 auto} */
#containerPoster{ height: 250px; margin: 0 auto; background-color: black; box-shadow: inset 30px 30px 50px black }
#footer{  height: 150px; margin: 0 auto; background-color: #333}
/* border: 1px solid #333; */

.swiper-container {
	height:420px;
	border:5px solid silver;
	border-radius:7px;
	box-shadow:0 0 20px #ccc inset;
}
.swiper-slide {
	text-align:center;
	display:flex; /* 내용을 중앙정렬 하기위해 flex 사용 */
	align-items:center; /* 위아래 기준 중앙정렬 */
	justify-content:center; /* 좌우 기준 중앙정렬 */
}
.swiper-slide img {
	box-shadow:0 0 5px #555;
	witdh: 150px;
	height: 250px;
	/* max-width:100%; /* 이미지 최대너비를 제한, 슬라이드에 이미지가 여러개가 보여질때 필요 */
	/* 이 예제에서 필요해서 설정했습니다. 상황에따라 다를 수 있습니다. */ */
}

</style>

<script type="text/javascript">
/* 코인슬라이더 */
$(document).ready(function() {
    $('#mainPoster').coinslider({ width: 1920, navigation: false, delay: 1000, height: 774, effect: 'straight'});
});
</script>



</head>
<body>

<div id="wrap">

	<table id="header">
	<tr>
		<td style="font-size:20px; text-align: right;" colspan="2">로그인 | 회원가입</td>
	</tr>
	<tr>
		<td style="font-size:50px; text-align: center" colspan="2">Double Dragon</td>
	</tr>
	<tr>
		<td style="font-size:25px; text-align: center; border-top: 1px solid #ffffff" colspan="2">예매 현재상영 개봉예정</td>
	</tr>
	</table>

<div id="mainPoster" >
    <a href="" target="_blank" >
        <img src='http://localhost/jsp_prj/common/images/Line_1920774.jpg' >
    </a>
    <a href="" target="_blank">
        <img src='http://localhost/jsp_prj/common/images/Spiral_1920774.jpg' >
    </a>
    <a href="" target="_blank">
        <img src='http://localhost/jsp_prj/common/images/TheFast_1920774.jpg' >
    </a>
    <a href="" target="_blank">
        <img src='http://localhost/jsp_prj/common/images/Voyagers_1920774.jpg' >
    </a>
    	
</div>


<div class="swiper-container">
	<div class="swiper-wrapper">
		<div class="swiper-slide"><img src="http://oldmidi.cdn3.cafe24.com/p/0279.jpg"></div>
		<div class="swiper-slide"><img src="https://ktsmemo.cafe24.com/p/0528.jpg"></div>
		<div class="swiper-slide"><img src="http://ktsmemo.cdn3.cafe24.com/p/0133.jpg"></div>
		<div class="swiper-slide"><img src="http://oldmidi.cdn3.cafe24.com/p/0575.jpg"></div>
		<div class="swiper-slide"><img src="http://ktsmemo.cdn3.cafe24.com/p/0675.jpg"></div>
		<div class="swiper-slide"><img src="http://oldmidi.cdn3.cafe24.com/p/0228.jpg"></div>
		<div class="swiper-slide"><img src="http://oldmidi.cdn3.cafe24.com/p/0009.jpg"></div>
		<div class="swiper-slide"><img src="http://ktsmemo.cdn3.cafe24.com/p/0548.jpg"></div>
		<div class="swiper-slide"><img src="http://oldmidi.cdn3.cafe24.com/p/0043.jpg"></div>
		<div class="swiper-slide"><img src="https://ktsmemo.cafe24.com/p/0653.jpg"></div>
		<div class="swiper-slide"><img src="https://ktsmemo.cafe24.com/p/0588.jpg"></div>
		<div class="swiper-slide"><img src="https://ktsmemo.cafe24.com/p/0439.jpg"></div>
		<div class="swiper-slide"><img src="http://ktsmemo.cdn3.cafe24.com/p/0700.jpg"></div>
		<div class="swiper-slide"><img src="http://ktsmemo.cdn3.cafe24.com/p/0010.jpg"></div>
		<div class="swiper-slide"><img src="https://ktsmemo.cafe24.com/p/0435.jpg"></div>
	</div>

	<!-- 네비게이션 -->
	<div class="swiper-button-next"></div><!-- 다음 버튼 (오른쪽에 있는 버튼) -->
	<div class="swiper-button-prev"></div><!-- 이전 버튼 -->

	<!-- 페이징 -->
	<div class="swiper-pagination"></div>
</div>

<script>

new Swiper('.swiper-container', {

	slidesPerView : 3, // 동시에 보여줄 슬라이드 갯수
	spaceBetween : 30, // 슬라이드간 간격
	slidesPerGroup : 3, // 그룹으로 묶을 수, slidesPerView 와 같은 값을 지정하는게 좋음

	// 그룹수가 맞지 않을 경우 빈칸으로 메우기
	// 3개가 나와야 되는데 1개만 있다면 2개는 빈칸으로 채워서 3개를 만듬
	loopFillGroupWithBlank : true,

	loop : true, // 무한 반복

	pagination : { // 페이징
		el : '.swiper-pagination',
		clickable : true, // 페이징을 클릭하면 해당 영역으로 이동, 필요시 지정해 줘야 기능 작동
	},
	navigation : { // 네비게이션
		nextEl : '.swiper-button-next', // 다음 버튼 클래스명
		prevEl : '.swiper-button-prev', // 이번 버튼 클래스명
	},
});

</script>


<div id="footer">
footer
</div>

	
</div>

</body>
</html>

















    