package day0223;

import java.awt.Font;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Homework0223 extends JFrame {
	public Homework0223() {
		super("2�� 23�� ����");
		Font font = new Font("����", Font.BOLD, 20);
		Font font1 = new Font("����", Font.BOLD, 16);
		
		Vector<String> vec = new Vector<String>();
		vec.add("daum.net");
		vec.add("naver.com");
		vec.add("google.com");
		vec.add("nate.com");
		vec.add("hotmail.com");
		JComboBox<String> jcb = new JComboBox<String>(vec);
		
		JLabel jlbName = new JLabel("�̸�");
		JLabel jlbAge = new JLabel("����");
		JLabel jlbAddress = new JLabel("�ּ�");
		JLabel jlbEmail = new JLabel("�̸���");
		JLabel jlbGoalbang = new JLabel("@");
		
		jlbName.setFont(font);
		jlbAge.setFont(font);
		jlbAddress.setFont(font);
		jlbEmail.setFont(font);
		jlbGoalbang.setFont(font);
		
		JTextField jtfName = new JTextField();
		JTextField jtfAge = new JTextField();
		JTextField jtfAddress = new JTextField();
		JTextField jtfEmail = new JTextField();
		
		
		
		JPanel jp = new JPanel();
		JButton jbtInput = new JButton("�Է�");
		JButton jbtEdit = new JButton("����");
		JButton jbtDel = new JButton("����");
		JButton jbtQuit = new JButton("����");
		
		jbtInput.setFont(font1);
		jbtEdit.setFont(font1);
		jbtDel.setFont(font1);
		jbtQuit.setFont(font1);
		
		jp.add(jbtInput);
		jp.add(jbtEdit);
		jp.add(jbtDel);
		jp.add(jbtQuit);
		
		JTextArea jta = new JTextArea();
		
		///////////////////////////////////////////////////////////////////////////
		setLayout(null);
		///////////////////////////////////////////////////////////////////////////
		jlbName.setBounds(15, 10, 80, 30);
		jlbAge.setBounds(15, 45, 80, 30);
		jlbAddress.setBounds(15, 80, 80, 30);
		jlbEmail.setBounds(15, 115, 80, 30);
		
		jlbGoalbang.setBounds(180,115,30,30);
		
		jtfName.setBounds(100,10,200,30);
		jtfAge.setBounds(100,45,200,30);
		jtfAddress.setBounds(100,80,200,30);
		jtfEmail.setBounds(100,115,80,30);
		
		jcb.setBounds(210, 115, 90, 30);
		
		jta.setBounds(330, 10, 250, 135);
		
		jbtInput.setBounds(140, 150, 80, 30);
		
		jp.setBounds(100, 150,400,200);
		
		///////////////////////////////////////////////////////////////////////////
		add(jlbName);
		add(jlbAge);
		add(jlbAddress);
		add(jlbEmail);
		
		add(jlbGoalbang);
		
		add(jtfName);
		add(jtfAge);
		add(jtfAddress);
		add(jtfEmail);
		
		add(jcb);
		
		add(jta);
		
		add(jp);
		///////////////////////////////////////////////////////////////////////////
		setSize(630, 300);
		///////////////////////////////////////////////////////////////////////////
		setVisible(true);
		///////////////////////////////////////////////////////////////////////////
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//Homework0223
	public static void main(String[] args) {
		new Homework0223();
	}//main

}//class
