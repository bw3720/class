package day0224;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseColor extends JFrame {
	
	public UseColor() {
		super("색 설정");
		
		JTextField jtf = new JTextField(20);
		JTextArea jta = new JTextArea();
		
		JLabel jlb = new JLabel("전화번호"); // 투명도가 설정되어있으!! 그래서 어디로가도 바닥색이 그대로 배경색이 된다.
		jlb.setBorder(new TitledBorder("휴대폰"));
		jtf.setBorder(new TitledBorder("010만입력"));
		jta.setBorder(new TitledBorder("휴대폰 리스트"));
		
		jlb.setForeground(Color.red);
		//투명도를 해제하고 
		jlb.setOpaque(true);
		//바닥색을 설정
		jlb.setBackground(Color.yellow);
		JPanel jp = new JPanel();
		
		jp.setBorder(new TitledBorder("입력"));
		jp.add(jlb);
		jp.add(jtf);
		
		//jtf와 jta의 글꼴을 궁서체,진하게,25픽셀로 설정
		//tips. 궁서와 궁세체의 차이 : ~체가 붙으면 모든 글자의 넓이가 같다.
		Font font = new Font("궁서체",Font.BOLD,25);
		jtf.setFont(font);
		jta.setFont(font);
		
		//상수사용 색 변경
		jtf.setBackground(Color.CYAN);
		jtf.setForeground(Color.GRAY);
		
		//생성자를 사용해서 색 변경
		jta.setBackground(new Color(0xD4F4FA));//16진수이다.
		jta.setForeground(new Color(0x325258));
		
		add("North",jp);
		//add("North",jtf);
		add("Center",jta);
		
		
		//윈도우 크기 설정
		setBounds(100,100,600, 500);
		//가시화
		setVisible(true);
		//종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}//UseColor
	
	public static void main(String[] args) {
		new UseColor();
	}//main

}//class
