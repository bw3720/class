package kr.co.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.sist.service.MainService;

@Controller
@RequestMapping("/day0611_sub") //����� ���� ��μ���
public class MoveController {

	
	//�����ΰ� ����� ���
	@RequestMapping(value = "/redirect.do", method = RequestMethod.GET )
	public String useRedirect() {
		//return "day0611/call"; // ViewResolver�� ����� forward ��� ������ �̵�.
		return "redirect:http://localhost/spring_mvc/day0611/call.jsp"; //viewResolver�� ��ġ���ʰ� �������� ��û�ϹǷ� ������ Ȯ���ڸ� ������ ��θ� �����ؾ��Ѵ�.
	}//useRedirect
	
	@RequestMapping(value = "/do_call_a.do", method = RequestMethod.GET )
	public String callA() {
		return "redirect:do_call_b.do"; 
		//viewResolver�� ��ġ���ʰ� �������� ��û�ϹǷ� ������ Ȯ���ڸ� ������ ��θ� �����ؾ��Ѵ�.
	}//useRedirect
	
	
	@RequestMapping(value = "/do_call_b.do", method = RequestMethod.GET )
	public String callB() {
		return "day0611/call_b_result"; 
		//viewResolver�� ��ġ���ʰ� �������� ��û�ϹǷ� ������ Ȯ���ڸ� ������ ��θ� �����ؾ��Ѵ�.
	}//useRedirect
	
	@RequestMapping(value = "/model.do", method = RequestMethod.GET)
	public String useModel(Model model) {
		
		String returnPage = "day0611/use_model";
		
		
		//���������� ������ Ŭ������ ���
		MainService ms = new MainService();
		//mode��ü�� �Էµ� �����͸� forward�� �̵��� ���������� �����͸� ����� �� �ִ�.
		model.addAttribute("imgList",ms.mainImgList());
		model.addAttribute("noticeList",ms.noticeList());
		
		return returnPage;
	}
}
