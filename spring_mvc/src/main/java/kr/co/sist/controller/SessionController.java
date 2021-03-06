package kr.co.sist.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"name","age"})//세션에 할당할 값이 n개인 경우 배열을 사용.
public class SessionController {
	
	@RequestMapping(value = "/day0614/use_session_a.do", method = RequestMethod.GET)
	public String useSession(Model model) {
		
		model.addAttribute("name","한상민");//request,session => 모든 페이지에서 사용 가능.
		model.addAttribute("nick","thumb");//request => 값을 forward이동한 다음 페이지에서만 사용 가능. 
		model.addAttribute("age",20);//request,session => 모든 페이지에서 사용 가능.
		
		return "day0614/use_session_a";
	}//useSession
	
	@RequestMapping(value = "/day0614/use_session_b.do", method = RequestMethod.GET)
	public String useSessionB(HttpSession session) {
		//컨트롤러에서 세션의 값을 받을 때에는 매개변수로 httpSession을 선언
		System.out.println("name : "+session.getAttribute("name")+" / "+"age : "+session.getAttribute("age"));
		return "day0614/use_session_b";
	}//useSession
	
	@RequestMapping(value = "/day0614/use_session_c.do", method = RequestMethod.GET)
	public String useSessionC(SessionStatus ss) {
		//세션사용이 완료되었다면(로그아웃된 상황)
		ss.setComplete();
		System.out.println("세션 사용이 종료되었는가? : "+ss.isComplete());
		
		
		return "day0614/use_session_c";
	}//useSession
	
	
	
	
	
}//class
