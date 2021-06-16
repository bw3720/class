package day0224;

import java.awt.Choice;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("serial")
public class Homework0224 extends JFrame {
	private JLabel jlView ;
	
	private JTextField jtfF,jtfY,jtfS;

	
	

	private DefaultListModel<String> dlmF = new DefaultListModel<String>();
	private DefaultListModel<String>dlmY = new DefaultListModel<String>();
	private DefaultListModel<String>dlmS = new DefaultListModel<String>();
	
	private JList<String>jlF;
	private JList<String>jlY;
	private JList<String>jlS;
	
	

	
	
	public Homework0224() {
		super("글꼴");
		
		JLabel jlFont = new JLabel("글꼴(f):");
		JLabel jlFontType = new JLabel("글꼴 스타일(Y):");
		JLabel jlSize = new JLabel("크기(S):");
		
		jlView = new JLabel("가나다라AaBbYyZz");

		Font font=new Font("맑은고딕", Font.BOLD, 25);//////////////////////////////
		jlView.setFont(font);
		
		JLabel jlScript = new JLabel("스크립트(R):");

		jtfF = new JTextField();
		jtfY = new JTextField();
		jtfS = new JTextField();
		
		JButton jbtnOk = new JButton("확인");
		JButton jbtnCancel = new JButton("취소");
		
		jlView.setBorder(new TitledBorder("보기"));
		///////
		dlmF = new DefaultListModel<String>();
		
		dlmF.addElement("Dialog");
		dlmF.addElement("DialogInput");
		dlmF.addElement("Monospaced");
		dlmF.addElement("Serif");
		dlmF.addElement("SansSerif");
		dlmF.addElement("맑은 고딕");
		dlmF.addElement("궁서체");
		jlF = new JList<String>(dlmF);
		
		JScrollPane jspF = new JScrollPane(jlF);
		///////
		dlmY = new DefaultListModel<String>();
		
		dlmY.addElement("보통");
		dlmY.addElement("굵게");
		dlmY.addElement("기울임꼴");
		dlmY.addElement("굵은 기울임꼴");
		jlY = new JList<String>(dlmY);
		
		JScrollPane jspY = new JScrollPane(jlY);
		
		///////
		dlmS = new DefaultListModel<String>();

		dlmS.addElement("7");
		dlmS.addElement("8");
		dlmS.addElement("9");
		dlmS.addElement("10");
			for(int i = 12; i<81;i+=2) {
				dlmS.addElement(Integer.toString(i));
			}
		jlS = new JList<String>(dlmS);
		
		JScrollPane jspS = new JScrollPane(jlS);

		//////////////////////////////////////////
		Choice cho = new Choice();
		cho.add("한글");
		cho.add("영어");
		//////////////////////////////////////////
		setLayout(null);
		//
		jlFont.setBounds(10, 30, 40, 20);
		jtfF.setBounds(10,50,160,20);
		jspF.setBounds(10, 70, 160, 120);
		
		jlFontType.setBounds(180, 30, 130, 20);
		jtfY.setBounds(180, 50, 140, 20);
		jspY.setBounds(180, 70, 140, 120);
		
		jlView.setBounds(180, 200, 220, 70);
		
		jlScript.setBounds(180, 280, 130, 20);
		cho.setBounds(180, 300, 220, 20);
		
		jlSize.setBounds(330, 30, 45, 20);
		jtfS.setBounds(330, 50, 70, 20);
		jspS.setBounds(330, 70, 70, 120);
		
		jbtnOk.setBounds(230, 380, 80, 20);
		jbtnCancel.setBounds(320, 380, 80, 20);
		//
		add(jlFont);
		add(jtfF);
		add(jspF);
		
		add(jlFontType);
		add(jtfY);
		add(jspY);
		
		add(jlView);
		
		add(jlScript);
		add(cho);
		
		add(jlSize);
		add(jtfS);
		add(jspS);
		
		add(jbtnOk);
		add(jbtnCancel);
		//
		
		//
		setSize(430, 500);
		//
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//Homework0224
	
	


	public static void main(String[] args) {
		new Homework0224();
	}//main

}//class
