package day0222;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Window Application�ۼ�.
 * @author SIST
 */
//1. Window Component���
@SuppressWarnings("serial")
public class HelloSwing extends JFrame{

	//2.�����ڿ��� ����� ������Ʈ�� ����.
	public HelloSwing() {
		super("���� ����");//�θ�Ŭ������ ������ ȣ��.
		
		JButton jbtn = new JButton("Hello Swing");
		
		//3.������ ������Ʈ�� ��ġ
		add(jbtn);
		
		//4.������ ������Ʈ�� ũ�� ����
		setSize(400,300);
		
		//5.����ڿ��� �����ֱ�
		setVisible(true);
		
		//6.������ �����̺�Ʈ ó�� : (interface�� �Ű������� ��� anonymous inner class�� ����
		//�ϸ� ������ Ŭ������ ������ �ʰ� �̸����� ��ü�� �����Ǿ� ���� �߰��ȴ�.)
		
		//addWindowListener method�� java.awt.Window Ŭ������ �����ϴ� method�� 
		//Window, JWindow, JFrame, Frame Ŭ�������� ��� ����� �� �ִ�.(�ڵ��� �� ��뼺)
//		addWindowListener(new WindowAdapter() {
//
//			@Override
//			public void windowClosing(WindowEvent e) {
//				dispose();//Ư�� �����츦 ����ó���ϰ�, JVM�� �����Ѵ�.
//			}//windowClosing
//		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//HelloSwing
	
	public static void main(String[] args) {
		new HelloSwing();
		
		
		
	}//main

}//class
