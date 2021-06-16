package day0512;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@SuppressWarnings("serial")
//1. �������� Ŭ������ �� ���񽺰� �Ǿ�� �ϱ� ������ HttpServlet�� ��� �޴´�.
public class Hello extends HttpServlet {
	//2.Ŭ���̾�Ʈ�� ��û�ϴ� ����� ó���� �� �ִ� method�� Override�Ѵ�.
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3. �����ڿ��� �������� ������ ������ �� �ֵ��� �����Ѵ�.(MIME-Type�� ����)
		response.setContentType("text/html;charset=UTF-8");//�̸��� ���� ������ Charset�� ������ �� �ִ�.
		//4. �������� ������ �����ڿ��� ���� �� �ֵ��� ���ӿ��� ����� �� �ִ� ��Ʈ���� ��´�.
		PrintWriter out=response.getWriter();
		//5.�����ڿ��� ������ ������ ��Ʈ���� �ۼ�.
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>�ȳ� Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<strong>�ȳ��ϼ���?</strong><br/>");
		out.println("������ 2021-05-12 ������ �Դϴ�.<br/>");
		out.println("</body>");
		out.println("</html>");
	
	
	}//doGet
	

}//class
