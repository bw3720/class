package day0225;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * ������ ������ �и��� �̺�Ʈ ó�� Ŭ����. has a ����
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
