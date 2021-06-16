<%@page import="javax.crypto.BadPaddingException"%>
<%@page import="kr.co.sist.util.cipher.DataDecrypt"%>
<%@page import="kr.co.sist.util.cipher.DataEncrypt"%>
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
		String password1="1234";
		//gdyb21LQTcIANtvYMT7QVQ==
	
		/* String password2="1234567890"; */
		String email="test@test.com";
		//암호화 키는 16자 이상으로 처리
		DataEncrypt de=new DataEncrypt("0123456789abcdefg");
		String cipherText=de.encryption(email);
		
		DataDecrypt dd=new DataDecrypt("0123456789abcdefg");//키가 다르다면 에러가 난다.
		String plainText="";
		try{			
		 	plainText=dd.decryption(cipherText);//암호문으로 변경된 문자열을 동일키를 넣어 평문으로 변경한다. 
		}catch(BadPaddingException bpe){
			bpe.printStackTrace();
		}
		
	%>
	1234 SHA MD5로 변환: <%=DataEncrypt.messageDigest("MD5",password1) %><br/>
	cipherText: <%=cipherText%><br/>
	plainText: <%=plainText%><br/>
	<%-- 1234567890 SHA MD5로 변환: <%=DataEncrypt.messageDigest("MD5",password2) %><br/>
	1234 SHA-512로 변환: <%=DataEncrypt.messageDigest("SHA-512",password1) %> --%>
</div>
</body>
</html>

















    