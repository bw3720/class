package kr.co.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ��� ActionŬ�������� �ؾ��� �ϵ��� ����� ����.
 * �Ķ���� ó��, ���������� ������ ����, ���������� ����, ���������� ���, ������ �̵� ��� ����.
 * @author user
 */
public interface Action {
	
	/**
	 * �Ķ������ ó��, ��ȿ�� ���� , �������� ��ü�� ���
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void execute(HttpServletRequest request, HttpServletResponse response)
		throws ServletException,IOException;
	
	/**
	 * �̵������ ����
	 * @return
	 */
	public boolean isForward();
	
	/**
	 * �̵��� ������ URL
	 * @return
	 */
	public String moveURL();
	
	
}


