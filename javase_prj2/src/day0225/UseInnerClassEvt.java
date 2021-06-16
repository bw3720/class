package day0225;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * Adapter  Ŭ������ ��� �Ͽ� �̺�Ʈ ó��. ==> inner class
 * @author SIST
 */
@SuppressWarnings("serial")
public class UseInnerClassEvt extends JFrame {
	
	public UseInnerClassEvt() {
		super("anonymous inner class");
		
		//Adapter Ŭ������ ����� ���� ó��.
		addWindowListener(new WindowEvt());
		
		setBounds(100, 100, 400, 400);
		setVisible(true);
		
	}//UseAnonymousEvt
	
	///////////////////������ ���� �̺�Ʈ ó��inner class Start////////////////
	public class WindowEvt extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent we) {
			dispose();//Window�� �����ϴ� method.inner class������ �ٱ� Ŭ������ �ڿ��� ����� �� �ִ�.
		}//windowClosing
		
	}//class
	///////////////////������ ���� �̺�Ʈ ó��inner class Finish////////////////
	
	public static void main(String[] args) {
		new UseInnerClassEvt();
		
	}//main
	
}//class
