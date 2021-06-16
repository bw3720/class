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
   <!-- coin-slider -->
   <script type="text/javascript" src="http://localhost/html_prj/common/coin/coin-slider.min.js"></script>
   <link rel="stylesheet" href="http://localhost/html_prj/common/coin/coin-slider-styles.css" type="text/css" />
   <link href="https://fonts.googleapis.com/css2?family=Chela+One&family=Josefin+Sans:wght@500&family=Reggae+One&display=swap" rel="stylesheet">

<style type="text/css">

body {
        margin: 0;
        display: flex;
        flex-direction: column;
        justify-content: center;
        flex-wrap: nowrap;
        overflow-x: hidden;
      }

#header{
		display: flex;
        flex-direction: column;
        flex-wrap: nowrap;
        justify-content: center;}
        
#headertxt{ font-size: 50px ; text-align: center ; color : #D9534F; font-family: 'Chela One', cursive; 
		display: flex;
        flex-direction: row;
        justify-content: center;}
#subheadertxt{ font-size: 15px ; margin-left :1200px; margin-top:20px;
		display: flex;
        flex-direction: row;
        justify-content: center;}
        
#wrap{ width: 1200px; height:330px; margin: 10px auto; } 
#body_head{  font-size: 30px ;   }
#navibar{ width: 100% ; height:50px ;background-color: white;   margin: 0 auto; text-align: center; border-bottom : 1px solid #C8C8C8 ;}
a{color:black ;background-color: transparent !important;  }
li:hover{border-bottom : 1px solid #E89795 } 

#change_infor{  margin-top: 100px; width:100%; height:300px;  background-color : #EBEDED ; PADDING-TOP:50PX}
table{height : 120px; width : 400px; margin: 0px auto;text-align: center }
td{height : 30px; width:600px; font-size: 20px;   }
#btn{width : 120px ;margin :25px;height}

#footer{ border: 1px solid #333; height: 150px;   background-color: #333 ; margin-top :350px}
#footertxt{ color: #A2A2A2; margin-left :340px; margin-top: 40px}

</style>

<script type="text/javascript">
</script>

</head>

<div id ="header">
   <div  id ="subheadertxt">
      <br/>
      <a href="http://211.63.89.143/sec_project/change_infor1.jsp"> 로그인</a> ㅣ<a href="#"> 회원가입</a> 
   </div>
   <div id ="headertxt">
      <img src="http://211.63.89.143/sec_project/common/dragon.png"> D.D.Cinema
   </div>
</div>

<body>
      <div id="wrap">
         <div id="body_head">My page > 정보 수정</div>
         <div id="navibar">
            <ul class="nav nav-pills" style="display: table; margin: auto;">
               <li role="presentation"><a
                  href="http://211.63.89.141/jsp_prj/prj_2/mypage_res.jsp">예매내역</a></li>
               <li role="presentation"><a
                  href="http://211.63.89.143/sec_project/change_infor1.jsp">정보
                     수정</a></li>
               <li role="presentation"><a
                  href="http://211.63.89.143/sec_project/change_pass1.jsp">비밀번호
                     변경</a></li>
            </ul>
         </div>    
        <div id="change_infor">
         <table>
            <tr>
               <td>정보수정을 위해 비밀번호를 입력해주세요.</td>
            <tr />
            <tr>
               <td><br/><img src="http://211.63.89.143/sec_project/common/icon.jpg" /> <input
                  type="password" placeholder="비밀번호" /></td>
            </tr>
            <tr>
               <td><input type="button" value="정보 수정"
                  class="btn btn-danger btn-lg"   id="btn" /> 
                  <input type="button" value="홈 " class="btn btn-default  btn-lg"   id="btn" /></td>
            </tr>
         </table>
         </div>
      </div>
</body>
<div  id="footer">

<div id="footertxt">

Double Dragon Cinema<br/>
서울특별시 강남구 테헤란로 132 한독약품빌딩 8층 쌍용교육센터 고객센터 1544<br/>
조장  한상민 사업자등록번호 000-00-000000 개인정보 보호 최고 책임자 한상민<br/>
COPYRIGHT©Double Dragon Cinema.
</div>

</div>

</html>