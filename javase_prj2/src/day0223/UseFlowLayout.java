package day0223;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * 컴포넌트가 한 줄로 배치되고 윈도우의 크기에 따라 위치가 변경되는 Layout
 * @author SIST
 */

@SuppressWarnings("serial")
//1.윈도우 컴포넌트를 상속
public class UseFlowLayout extends JFrame {
	
	//2.컴포넌트를 생성.
	public UseFlowLayout() {
		super("FlowLayout의 연습");
		
		JButton jbtn = new JButton("버튼");
		JCheckBox jcbLang1 = new JCheckBox("Java");
		JCheckBox jcbLang2 = new JCheckBox("C/C++");
		JCheckBox jcbLang3 = new JCheckBox("Python");
		JCheckBox jcbLang4 = new JCheckBox("VB");
		
		Font font = new Font("궁서체",Font.PLAIN,20);
		jcbLang1.setFont(font);
		jcbLang2.setFont(font);
		jcbLang3.setFont(font);
		jcbLang4.setFont(font);
		
		
		//버튼 그룹으로 묶이지 않은 라디오버튼은 여러개가 선택된다.
		//버튼 그룹을 생성.
		JRadioButton jrbgender1 = new JRadioButton("남자",true);
		JRadioButton jrbgender2 = new JRadioButton("여자");
		
		ButtonGroup bg = new  ButtonGroup();
		bg.add(jrbgender1);
		bg.add(jrbgender2);
		
		JTextField jtf =new JTextField(10);// 기본 생성자느 사이즈가 0 => 10
		//JTextField에 Font설정
		jtf.setFont(new Font("휴먼편지체",Font.ITALIC | Font.BOLD,25));
		
		//3. 배치관리자 설정 (BorderLayout -> FlowLayout)
		
		setLayout(new FlowLayout());
		
		//4.컴포넌트 배치
		
		add(jbtn);
		
		add(jcbLang1);
		add(jcbLang2);
		add(jcbLang3);
		add(jcbLang4);
		
		add(jrbgender1);
		add(jrbgender2);
		
		add(jtf);
		
		//5.윈도우 크기 설정
		setSize(500,250);
		//6.사용자에게 보이기
		setVisible(true);
		
		//7.프로세스 종료하기
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}//UseFlowLayout
	public static void main(String[] args) {
		new UseFlowLayout();
	}//main

}//class
