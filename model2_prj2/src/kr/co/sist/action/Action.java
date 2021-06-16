package kr.co.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 모든 Action클래스들이 해야할 일들의 목록을 정의.
 * 파라메터 처리, 뷰페이지로 데이터 전송, 뷰페이지명 설정, 관계유지의 사용, 페이지 이동 방식 설정.
 * @author user
 */
public interface Action {
	
	/**
	 * 파라메터의 처리, 유효성 검증 , 관계유지 객체의 사용
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void execute(HttpServletRequest request, HttpServletResponse response)
		throws ServletException,IOException;
	
	/**
	 * 이동방식의 설정
	 * @return
	 */
	public boolean isForward();
	
	/**
	 * 이동할 페이지 URL
	 * @return
	 */
	public String moveURL();
	
	
}


