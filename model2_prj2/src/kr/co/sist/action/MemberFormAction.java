package kr.co.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberFormAction implements Action {
	
	private String url;
	private boolean forwardFlag;
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		url="member/member_info.jsp";//이동할 페이지 설정
		forwardFlag = true;//이동 방식 설정
	}

	@Override
	public boolean isForward() {
		return forwardFlag;
	}

	@Override
	public String moveURL() {
		return url;
	}

}
