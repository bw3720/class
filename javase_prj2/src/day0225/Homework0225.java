package day0225;

import java.awt.Choice;
import java.awt.Font;

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
public class Homework0225 extends JFrame implements ListSelectionListener{
	private JLabel jlView ;
	
	private JTextField jtfF,jtfY,jtfS;
	//////////////////수정된 부분////////////////////
	private String fName="맑은고딕";
	private int fStyle=Font.PLAIN;
	private int fSize=12;
	private Font font=new Font(fName,fStyle, fSize);
	//////////////////////////////////////////////
	

	private DefaultListModel<String> dlmF = new DefaultListModel<String>();
	private DefaultListModel<String>dlmY = new DefaultListModel<String>();
	private DefaultListModel<String>dlmS = new DefaultListModel<String>();
	
	private JList<String>jlF;
	private JList<String>jlY;
	private JList<String>jlS;
	
	public Homework0225() {
		super("글꼴");
		
		JLabel jlFont = new JLabel("글꼴(f):");
		JLabel jlFontType = new JLabel("글꼴 스타일(Y):");
		JLabel jlSize = new JLabel("크기(S):");
		
		jlView = new JLabel("가나다라AaBbYyZz");

		jlView.setFont(font);
		
		JLabel jlScript = new JLabel("스크립트(R):");

		jtfF = new JTextField();
		jtfY = new JTextField();
		jtfS = new JTextField();
		
		//////////////////수정된 부분///////////////////
		jtfF.setText(fName);
		jtfY.setText("보통");
		jtfS.setText(String.valueOf(fSize));
		//////////////////////////////////////////////
		
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
		
		//////////////////수정된 부분////////////////////
		 jlF.setSelectedIndex(5);//기본으로 선택되는 리스트 설정
	     jlY.setSelectedIndex(0);      
	     jlS.setSelectedIndex(4);
		//////////////////////////////////////////////

		////////////////////
		Choice cho = new Choice();
		cho.add("한글");
		cho.add("영어");
		////////////////////
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
		////버튼 이벤트 설정
		jlF.addListSelectionListener(this);
		jlY.addListSelectionListener(this);
		jlS.addListSelectionListener(this);
		//
		setSize(430, 500);
		//s
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//Homework0224
	
	///////////////////////////너무 어려웠던 부분////////////////////////////////
	@Override
	public void valueChanged(ListSelectionEvent lse) {
		
		if(lse.getValueIsAdjusting()) {
			if(lse.getSource()==jlF) {
				fName = dlmF.getElementAt(jlF.getSelectedIndex());
				jtfF.setText(fName);
			}//end if
			
			if(lse.getSource()==jlY) {
				String selY = dlmY.getElementAt(jlY.getSelectedIndex());
				
				switch(selY) {
				case "보통":
					fStyle = Font.PLAIN;
					break;
				case "굵게":
					fStyle = Font.BOLD;
					break;
				case "기울임꼴":
					fStyle = Font.ITALIC;
					break;
				case "굵은 기울임꼴":
					fStyle = Font.BOLD|Font.ITALIC;
					break;
				}//end switch
				jtfY.setText(selY);
			}//end if
			
			if(lse.getSource()==jlS) {
				jtfS.setText(dlmS.getElementAt(jlS.getSelectedIndex()));
				String selS = dlmS.getElementAt(jlS.getSelectedIndex()); 
		        jtfS.setText(selS);
		        fSize = Integer.parseInt(selS);
			}//end if
			font = new Font(fName,fStyle,fSize);
	        jlView.setFont(font);
		}//end if
		
	}//valueChanged
	//////////////////////////////////////////////////////////////////


	public static void main(String[] args) {
		new Homework0225();
	}//main

}//class
