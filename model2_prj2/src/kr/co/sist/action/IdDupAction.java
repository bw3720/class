package kr.co.sist.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.sist.dao.UserDAO;
import kr.co.sist.service.UserService;

public class IdDupAction implements Action {
	
	private String url;
	private boolean forwardFlag;
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id =request.getParameter("id");//파라메터를 받고
		
			UserService us= new UserService();//업무로직을 처리하는 클래스를 생성.
			boolean flag=us.idDupCheck(id);
			request.setAttribute("idFlag", flag);//View에서 사용할 값
			forwardFlag=true;//이동 방식 설정
				
			url="member/id_dup.jsp";//이동할 페이지를 설정
			
	}//execute

	@Override
	public boolean isForward() {
		return forwardFlag;
	}

	@Override
	public String moveURL() {
		return url;
	}

}
