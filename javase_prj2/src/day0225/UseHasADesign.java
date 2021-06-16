package day0225;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * Adapter  클래스를 사용 하여 이벤트 처리. ==> has a 관계
 * @author SIST
 */
@SuppressWarnings("serial")
public class UseHasADesign extends JFrame {
	
	public UseHasADesign() {
		super("has a");
		
		//has a관계를 사용한 종료 처리.
		UseHasAEvt uhae = new UseHasAEvt(this);
		addWindowListener(uhae);
		
		setBounds(100, 100, 400, 400);
		setVisible(true);
		
		
		
	}//UseAnonymousEvt
	
	
	public static void main(String[] args) {
		new UseHasADesign();
		
	}//main
	
}//class
