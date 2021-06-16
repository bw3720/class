package day0414;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class SQLInjection extends JFrame implements ActionListener {

	private JTextField jtfId;
	private JPasswordField jpfPass;
	private JLabel jlOutput;
	
	public SQLInjection() {
		super("SQLInjection 연습");
		jtfId=new JTextField();
		jpfPass=new JPasswordField();
		jlOutput=new JLabel("결과 출력");
		
		jtfId.setBorder(new TitledBorder("아이디"));
		jpfPass.setBorder(new TitledBorder("비밀번호"));
		jlOutput.setBorder(new TitledBorder("출력"));
		
		setLayout(new GridLayout(3,1));
		
		add( jtfId );
		add( jpfPass );
		add( jlOutput );
		
		jtfId.addActionListener(this);
		jpfPass.addActionListener(this);
		
		setBounds(100, 100, 300, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//SQLInjection
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == jtfId) {
			chkNull();
		}//end if
		
		if(ae.getSource() == jpfPass) {
			chkNull();
		}
		
	}//actionPerformed 
	
	private void chkNull() {
		String id = jtfId.getText();//.replaceAll(" ", "");
		String pass = new String(jpfPass.getPassword());//.replaceAll(" ", "");
		
		if("".equals(id)) {
			JOptionPane.showMessageDialog(this, "아이디는 필수 입력사항.");
			jtfId.requestFocus();
			return;
		}//end if
		
		if("".equals(pass)) {
			JOptionPane.showMessageDialog(this, "비밀번호는 필수 입력사항.");
			jpfPass.requestFocus();
			return;
		}//end if
		login(id,pass);
		
	}//chkNull 
	
	
	private void login(String id, String pass) {
		InjectionDAO iDAO = new InjectionDAO();
		
		try {
//			String name = iDAO.statementLogin(id, pass);//DAO에 두가지 함수 존재 그중하나
			String name = iDAO.preparedStatementLogin(id, pass);//DAO에 두가지 함수 존재 그중하나
			
			if("".equals(name)) {
				jlOutput.setText("아이디 혹은 비밀번호를 확인하세요.");
			}else {
				jlOutput.setText(name+"님이 로그인하셨습니다.");
				
			}//end else
		} catch (SQLException e) {
			e.printStackTrace();
		}//end catch
		
		
	}//login
	
	
	public static void main(String[] args) {
		new  SQLInjection();
	}//main

}//class
