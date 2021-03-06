package day0609;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UseInitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//DD에서 설정된 값 받기
		//HttpServlet의 부모인 GenericServlet에서 ServletConfig받기
		ServletConfig sc = getServletConfig();
		//값 얻기
		String name = sc.getInitParameter("name");
		String age = sc.getInitParameter("age");
		System.out.println("이름 : "+name+", 나이 : "+age);
		
		//ServletContext얻기
		ServletContext sc1 = getServletContext();
		String common_css = sc1.getInitParameter("common_css");
		String common_js = sc1.getInitParameter("common_js");
		System.out.println("공통 CSS경로 : "+common_css);
		System.out.println("공통 JS경로 : "+common_js);
		
		
		
		
	}//doGet


}
