package day0302;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

@SuppressWarnings("serial")
public class UseJOptionPane extends JFrame implements ActionListener {

	private JButton jbtnInput,jbtnMessage,jbtnConfirm;
	
	public UseJOptionPane() {
		super("JOptionPane의 사용.");
		
		jbtnInput = new JButton("입력다이얼로그");
		jbtnMessage = new JButton("메시지 다이얼로그");
		jbtnConfirm = new JButton("컨펌 다이얼로그");
		
		JPanel panel = new JPanel();
		panel.add(jbtnInput);
		panel.add(jbtnMessage);
		panel.add(jbtnConfirm);
		
		add(panel);
		
		jbtnInput.addActionListener(this);
		jbtnMessage.addActionListener(this);
		jbtnConfirm.addActionListener(this);
		
		
		setBounds(500, 100, 500, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
	}//UseJOptionPane
	
	public void useInput() {
		String name = JOptionPane.showInputDialog(this,"이름을 입력해주세요.\n예) 한상민");//코드 브레이크가 되어 아래로 흘러가지 않아 타이틀바가 변하지않느다.
		
		setTitle("JOptionPane의 사용. -입력이름 : "+name);

	}//useInput
	
	public void useMessage() {
		//JOptionPane.showMessageDialog(this, "오늘은 화요일 입니다.");

		//정보제공용 아이콘을 변경.(JOptinPane의 Constant사용)
		//ERROR_MESSAGE, INFORMATION_MESSAGE, PLAIN_MESSAGE, QUESTION_MESSAGE

//		JOptionPane.showMessageDialog(this, "에러메세지 제공","에러",JOptionPane.ERROR_MESSAGE);
//		JOptionPane.showMessageDialog(this, "정보메세지 제공","에러",JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(this, "질문메세지 제공","에러",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(this, "아이콘이 없는 메세지 제공","에러",JOptionPane.PLAIN_MESSAGE);
	
	}//useMessage
	
	public void useConfirm() {
//		int flag = JOptionPane.showConfirmDialog(this, "계속 진행 하시겠습니까?"); // 예,아니오, 취소 제공
//		int flag = JOptionPane.showConfirmDialog(this, "에러가 발생했습니다. \n계속 진행 하시겠습니까?","에러",JOptionPane.ERROR_MESSAGE); //예,아니오 제공
//		int flag = JOptionPane.showConfirmDialog(this, "에러가 발생했습니다. \n계속 진행 하시겠습니까?","에러",JOptionPane.PLAIN_MESSAGE); //예 제공
		int flag = JOptionPane.showConfirmDialog(this, "에러가 발생했습니다. \n계속 진행 하시겠습니까?","에러",JOptionPane.INFORMATION_MESSAGE); // 예, 아니오, 취고 제공
		
		switch(flag) {
		case JOptionPane.OK_OPTION : System.out.println("\"예\"를 누른 경우 처리");break;
		case JOptionPane.NO_OPTION : System.out.println("\"아니오\"를 누른 경우 처리");break;
		case JOptionPane.CANCEL_OPTION : System.out.println("\"취소\"를 누른 경우 처리");break;
		}
		
	}//useConfirm
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == jbtnInput) {
			useInput();
		}//end if
		
		if(ae.getSource() == jbtnMessage) {
			useMessage();
		}//end if
		
		if(ae.getSource() == jbtnConfirm) {
			useConfirm();
		}//end if
		
		
	}//actionPerformed

	public static void main(String[] args) {
		new UseJOptionPane();
	}//main

}//class
