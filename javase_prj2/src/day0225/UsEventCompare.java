package day0225;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * 동일한 이벤트를 다른 커포넌트에서 발생 시킬 때, 이벤트를 발생시킨 객체의 비교.
 * @author SIST
 */
//1. 이벤트를 처리할 수 있는 Listener를 구현
@SuppressWarnings("serial")
public class UsEventCompare extends JFrame implements ActionListener{
	//2. 이벤트처리에 관련된 컴포넌트를 선언.ㅓ
	private JButton jbtn1,jbtn2;
	private JLabel jlblOutput;
	
	
	public UsEventCompare() {
		super("이벤트 비교");
		
		jbtn1 = new JButton("열기");
		jbtn2 = new JButton("저장");
		
		jlblOutput = new JLabel("경로 : ");
		jlblOutput.setBorder(new TitledBorder("선택경로"));
		
		JPanel jp = new JPanel();
		jp.add(jbtn1); //버튼이 고유크기를 가지고 컨테이너 컴포넌트에 배치
		jp.add(jbtn2); //버튼이 고유크기를 가지고 컨테이너 컴포넌트에 배치
		
		//컴포넌트에서 사용자의 동작이 있을 떄 JVM에서 청취할 수 있도록 리쓰너에 등록한다.
		jbtn1.addActionListener(this);
		jbtn2.addActionListener(this);
		
		
		add("Center",jp);//컨테이너 컴포넌트를 윈도우 컴포넌트에 배치
		add("South",jlblOutput);
		
		setBounds(100, 100, 400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseActionEvent
	
	//2.Listener에서 제공하는 abstract method의 Override
	public void actionPerformed(ActionEvent ae) {
		//사용자의 동작이 있엇을 때 JVM에서 호출.(등록된 컴포넌트에서만 호출가능)
		if(ae.getSource()== jbtn1) {
			System.out.println("열기");
			//열기모드로 파일 다이얼 로그를 생성.
			FileDialog fdOpen = new FileDialog(this, "파일열기", FileDialog.LOAD);
			
			//사용자에게 보여주기
			fdOpen.setVisible(true);
			
			//directory와 filename 얻기
			String path = fdOpen.getDirectory();
			String fileName = fdOpen.getFile();
			
			if(path != null) {
				jlblOutput.setText("경로 : "+path+fileName);
				//파일경로, 파일명 얻기
				setTitle("파일명 : "+fileName);
			}//end if
			
		}//end if
		
		if(ae.getSource()== jbtn2) {
			System.out.println("저장");
			//저장모드로 파일 다이얼 로그를 생성.
			FileDialog fdSave = new FileDialog(this, "파일저장", FileDialog.SAVE);
			
			//사용자에게 보여주기
			fdSave.setVisible(true);
			
			String path = fdSave.getDirectory();
			String fileName = fdSave.getFile();
			if(path != null) {
				//파일경로, 파일명 얻기
				jlblOutput.setText("경로 : "+path+fileName);
				setTitle("저장 - " +fileName);
			}//end if
			
		}//end if
		
	
	
	}//actionPerformed
	
	
	public static void main(String[] args) {
		new UsEventCompare();
	}//main

}//class
