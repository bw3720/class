package day0224;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 이미지가 들어간 버튼.
 * @author SIST
 */
@SuppressWarnings("serial")
//1.윈도우 컴포넌트를 상속
public class BtnImage extends JFrame {

	//2.생성자에서 컴포넌트를 생성
	public BtnImage() {
		super("이미지를 사용한 버튼");
		//이미지 객체 생성
		ImageIcon ii1 = new ImageIcon("C:/dev/workspace/javase_prj2/src/day0224/images/img1.png");
		ImageIcon ii2 = new ImageIcon("C:/dev/workspace/javase_prj2/src/day0224/images/img2.png");
		ImageIcon ii3 = new ImageIcon("C:/dev/workspace/javase_prj2/src/day0224/images/img3.png");
		ImageIcon ii4 = new ImageIcon("C:/dev/workspace/javase_prj2/src/day0224/images/img4.png");
		
		//생성된 이미지 객체를 적용한 컴포넌트를 생성.
		JButton jbtn1 = new JButton("라이언",ii1);
		JButton jbtn2 = new JButton("무지",ii2);
		JButton jbtn3 = new JButton("어피치",ii3);
		
		//풍선도움말 설정.
		jbtn1.setToolTipText("라이언-사자");
		jbtn2.setToolTipText("무지-단무지");
		jbtn3.setToolTipText("어피치-복숭아");
		
		//마우스가 올라갔을 때, 이미지를 변경.
		jbtn3.setRolloverIcon(ii4);
		
		//버튼 텍스트의 수직위치를 변경. TOP, CENTER, BOTTOM
		jbtn1.setVerticalTextPosition(JButton.BOTTOM);
		
		//버튼 텍스트의 수평위치를 변경. LEFT, CENTER, RIGHT
		jbtn2.setHorizontalTextPosition(JButton.LEFT);
		
		//위의 두가지를 조합하여 9가지의 위치를 잡을 수 있다.
		
		jbtn3.setVerticalTextPosition(JButton.BOTTOM);
		jbtn3.setHorizontalTextPosition(JButton.LEFT);
		
		
		//3.배치관리자 설정.
		setLayout(new GridLayout(1,3));
		//4.배치
		
		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
		
		
		
		
		//5.윈도의 크기 설정
		setBounds(100, 100, 800, 300);
		//6.가시화
		setVisible(true);
		//7.종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//BtnImage
	
	public static void main(String[] args) {
		new BtnImage();
	}//main

}//class
