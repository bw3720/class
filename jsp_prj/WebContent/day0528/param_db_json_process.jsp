<%@page import="org.json.simple.JSONArray"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.SQLException"%>
<%@page import="kr.co.sist.vo.CarVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.sist.dao.UserDAO"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
    <%
    //선택된 제조사에 해당 차량 정보를 조회
    String maker=request.getParameter("maker");
    
    UserDAO uDAO=new UserDAO();
    JSONObject jsonObject= new JSONObject();
    jsonObject.put("pubDate",new SimpleDateFormat("yyyy-mm-dd").format(new Date()));
    try{
	    List<CarVO> list=uDAO.selectModel(maker);//입력받은 Maker에 대한 차량 정보를 조회
	    jsonObject.put("resultFlag",true);
	    	
	    JSONArray jaCar=new JSONArray();//차량정보 JSON객체를 저장하기위한 JSONArray를 생성
	    JSONObject jsonTemp=null;//차량 정보 조회결과를 JSONArray에 추가하기위한 JSONObject선언
	    
	    for(CarVO cVO: list){
	    	jsonTemp=new JSONObject();//조회결과를 JSONObject추가
	    	jsonTemp.put("model",cVO.getModel());
	    	jsonTemp.put("car_option",cVO.getCar_option());
	    	jsonTemp.put("car_year",cVO.getCar_year());
	    	jsonTemp.put("car_img",cVO.getCar_img());
	    	jsonTemp.put("price",cVO.getPrice());
	    	jsonTemp.put("cc",cVO.getCc());
	    	
	    	//레코드하나를 JSONObject에 저장 > JSONObject을 JSONArray
	    	jaCar.add(jsonTemp);
	    }//end for
	    //조회된 모든 값을 가진 JSONArray를 JSONObject 추가
	    jsonObject.put("data",jaCar);
	    jsonObject.put("dataCmt",jaCar.size());
	    
    }catch(SQLException se){
    	se.printStackTrace();
   		jsonObject.put("resultFlag",false);
   		jsonObject.put("dataCnt",0);	
    }//end catch
    
    out.print(jsonObject.toJSONString());   
    %>

    