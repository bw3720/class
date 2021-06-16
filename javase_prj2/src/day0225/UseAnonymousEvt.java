package day0225;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * Adapter  클래스를 사용 하여 이벤트 처리. ==> anonymous
 * @author SIST
 */
@SuppressWarnings("serial")
public class UseAnonymousEvt extends JFrame {
	
	public UseAnonymousEvt() {
		super("anonymous inner class");
		
		//Adapter 클래스를 사용한 종료 처리.
		addWindowListener(new WindowAdapter() {
			//WindowAdapter 는  추상 메소트가 하나도 없어 원하는 메소드만 오버라이드 하면됨.
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}//windowClosing
		});
		
		setBounds(100, 100, 400, 400);
		setVisible(true);
		
	}//UseAnonymousEvt
	
	
	public static void main(String[] args) {
		new UseAnonymousEvt();
		
	}//main
	
}//class
