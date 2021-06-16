package kr.co.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//1. HandlerMapper가 내가만든 클래스를 component-scan하기 위해
//@Controller annotation을 정의한다.
@Controller
public class HelloController {

	//2. URL을 처리할 수 있는 method를 정의하고 return view 할 페이지명을 설정한다.
	@RequestMapping(value = "/hello.do", method= RequestMethod.GET )
	public String hello() {
		
		return "hello_mvc";
	}//hello
}//class
