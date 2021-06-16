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
		super("�� ����");
		
		JTextField jtf = new JTextField(20);
		JTextArea jta = new JTextArea();
		
		JLabel jlb = new JLabel("��ȭ��ȣ"); // ������ �����Ǿ�����!! �׷��� ���ΰ��� �ٴڻ��� �״�� ������ �ȴ�.
		jlb.setBorder(new TitledBorder("�޴���"));
		jtf.setBorder(new TitledBorder("010���Է�"));
		jta.setBorder(new TitledBorder("�޴��� ����Ʈ"));
		
		jlb.setForeground(Color.red);
		//������ �����ϰ� 
		jlb.setOpaque(true);
		//�ٴڻ��� ����
		jlb.setBackground(Color.yellow);
		JPanel jp = new JPanel();
		
		jp.setBorder(new TitledBorder("�Է�"));
		jp.add(jlb);
		jp.add(jtf);
		
		//jtf�� jta�� �۲��� �ü�ü,���ϰ�,25�ȼ��� ����
		//tips. �ü��� �ü�ü�� ���� : ~ü�� ������ ��� ������ ���̰� ����.
		Font font = new Font("�ü�ü",Font.BOLD,25);
		jtf.setFont(font);
		jta.setFont(font);
		
		//������ �� ����
		jtf.setBackground(Color.CYAN);
		jtf.setForeground(Color.GRAY);
		
		//�����ڸ� ����ؼ� �� ����
		jta.setBackground(new Color(0xD4F4FA));//16�����̴�.
		jta.setForeground(new Color(0x325258));
		
		add("North",jp);
		//add("North",jtf);
		add("Center",jta);
		
		
		//������ ũ�� ����
		setBounds(100,100,600, 500);
		//����ȭ
		setVisible(true);
		//����ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}//UseColor
	
	public static void main(String[] args) {
		new UseColor();
	}//main

}//class
