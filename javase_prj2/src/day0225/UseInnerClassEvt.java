package day0225;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * Adapter  클래스를 사용 하여 이벤트 처리. ==> inner class
 * @author SIST
 */
@SuppressWarnings("serial")
public class UseInnerClassEvt extends JFrame {
	
	public UseInnerClassEvt() {
		super("anonymous inner class");
		
		//Adapter 클래스를 사용한 종료 처리.
		addWindowListener(new WindowEvt());
		
		setBounds(100, 100, 400, 400);
		setVisible(true);
		
	}//UseAnonymousEvt
	
	///////////////////윈도우 종료 이벤트 처리inner class Start////////////////
	public class WindowEvt extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent we) {
			dispose();//Window에 존재하는 method.inner class에서는 바깥 클래스의 자원을 사용할 수 있다.
		}//windowClosing
		
	}//class
	///////////////////윈도우 종료 이벤트 처리inner class Finish////////////////
	
	public static void main(String[] args) {
		new UseInnerClassEvt();
		
	}//main
	
}//class
