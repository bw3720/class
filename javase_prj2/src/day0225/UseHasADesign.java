package day0225;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * Adapter  Ŭ������ ��� �Ͽ� �̺�Ʈ ó��. ==> has a ����
 * @author SIST
 */
@SuppressWarnings("serial")
public class UseHasADesign extends JFrame {
	
	public UseHasADesign() {
		super("has a");
		
		//has a���踦 ����� ���� ó��.
		UseHasAEvt uhae = new UseHasAEvt(this);
		addWindowListener(uhae);
		
		setBounds(100, 100, 400, 400);
		setVisible(true);
		
		
		
	}//UseAnonymousEvt
	
	
	public static void main(String[] args) {
		new UseHasADesign();
		
	}//main
	
}//class
