<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%!
   public String createRadio( int btnCnt, int checkedNum, String btnName ){
      StringBuilder radio = new StringBuilder();
      
      for(int j = 0; j < btnCnt+1; j ++){
         radio.append("\t\t<label class=\"checkbox-inline\">")
         .append("<input type =\"radio\" name =\"").append(btnName). append("\"");
         if( j == checkedNum){
            radio.append(" checked=\"checked\"");
         }//end if
         radio.append(" value = \"").append( j ).append("\"/>").append(j).append("점")
         .append("</label>\n");
      }//end for 
      
      return radio.toString();
   }//createRadio
   
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title></title>

<!-- bootstrap -->
<link href="http://localhost/jsp_prj/common/bootstrap-3.3.2/css/bootstrap.min.css" rel="stylesheet">

<!-- CDN -->
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

   <%
      String[] names = {"강인섭","이학민","곽범수","진재혁","한상민"};
   %>
   
   <table class="table">
   <thead>
      <tr>
         <th>이름</th>
         <th>점수</th>
         
      </tr>
   </thead>
      <%for(int i = 0; i < names.length; i++){ %>
         <tbody>
         <tr>
            <td><strong><%=names[i] %></strong>
               <%
                  if( names[i].equals("진재혁")){
               %>
                  <label class ="btn btn-primary"> 조장</label>
               <%
                  }
               %>
            
            </td>
            <td>
               <%= createRadio(10, 0, "s_"+i) %>
            </td>
         </tr>
         </tbody>
      <%}//end for %>
   </table>
</div>
</body>
</html>