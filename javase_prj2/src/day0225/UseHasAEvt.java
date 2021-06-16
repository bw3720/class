package day0225;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * 다자인 업무와 분리된 이벤트 처리 클래스. has a 관계
 * @author SIST
 *
 */
public class UseHasAEvt extends WindowAdapter {
	private UseHasADesign uhad;
	
	public UseHasAEvt(UseHasADesign uhad) {
		this.uhad = uhad;
	}//UseHasAEvt
	
	@Override
	public void windowClosing(WindowEvent we) {
		uhad.dispose();
	}//windowClosing

	
	
}//class
