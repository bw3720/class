package day0222;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Window Application작성.
 * @author SIST
 */
//1. Window Component상속
@SuppressWarnings("serial")
public class HelloSwing extends JFrame{

	//2.생성자에서 사용할 컴포넌트를 생성.
	public HelloSwing() {
		super("스윙 연습");//부모클래스의 생성자 호출.
		
		JButton jbtn = new JButton("Hello Swing");
		
		//3.생성된 컴포넌트를 배치
		add(jbtn);
		
		//4.윈도우 컴포넌트의 크기 설정
		setSize(400,300);
		
		//5.사용자에게 보여주기
		setVisible(true);
		
		//6.윈도우 종료이벤트 처리 : (interface가 매개변수인 경우 anonymous inner class로 생성
		//하면 별도의 클래스를 만들지 않고도 이름없는 객체가 생성되어 값이 추가된다.)
		
		//addWindowListener method는 java.awt.Window 클래스에 존재하는 method로 
		//Window, JWindow, JFrame, Frame 클래스에서 모두 사용할 수 있다.(코드의 재 사용성)
//		addWindowListener(new WindowAdapter() {
//
//			@Override
//			public void windowClosing(WindowEvent e) {
//				dispose();//특정 윈도우를 종료처리하고, JVM을 종료한다.
//			}//windowClosing
//		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//HelloSwing
	
	public static void main(String[] args) {
		new HelloSwing();
		
		
		
	}//main

}//class
