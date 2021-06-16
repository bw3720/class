package day0412;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class UseRecord0412 extends JFrame {
	private JLabel jlNum, jlName, jlAge, jlAddr;
	private JTextField jtfNum, jtfName, jtfAge, jtfAddr;
	private JList<String> list;
	private DefaultListModel<String> dlm;
	private JButton jbInsert, jbDelete, jbUpdate, jbClose;
	
	public UseRecord0412() {
		super("program");
		
		setLayout(null);
		jlNum = new JLabel("번 호");
		jlName = new JLabel("이 름");
		jlAge = new JLabel("나 이");
		jlAddr = new JLabel("주 소");
		
		jtfNum = new JTextField();
		jtfName = new JTextField();
		jtfAge = new JTextField();
		jtfAddr = new JTextField();
		
		dlm = new DefaultListModel<String>();
		list = new JList<String>(dlm);
		
		JScrollPane jsp = new JScrollPane(list);
		
		jbInsert = new JButton("추 가"); 
		jbDelete = new JButton("삭 제");
		jbUpdate = new JButton("변 경"); 
		jbClose = new JButton("닫 기");
		
		
		
		add(jlNum);
		add(jlName);
		add(jlAge);
		add(jlAddr);
		
		add(jtfNum);
		add(jtfName);
		add(jtfAge);
		add(jtfAddr);
		
		add(jsp);
		
		add(jbInsert);
		add(jbDelete);
		add(jbUpdate);
		add(jbClose);
		
		Record0412_evt rce = new Record0412_evt(this);
		
		jbInsert.addActionListener(rce); 
		jbDelete.addActionListener(rce); 
		jbUpdate.addActionListener(rce);
		jbClose.addActionListener(rce);
		
		jlNum.setBounds(30, 30, 30, 30);
		jlName.setBounds(30, 70, 30, 30);
		jlAge.setBounds(30, 110, 30, 30);
		jlAddr.setBounds(30, 150, 30, 30);
		
		jtfNum.setBounds(70, 30, 80, 30);
		jtfName.setBounds(70, 70, 80, 30);
		jtfAge.setBounds(70, 110, 80, 30);
		jtfAddr.setBounds(70, 150, 80, 30);
		
		jsp.setBounds(170, 30, 310, 150);
		
		jbInsert.setBounds(100, 230, 70, 30); 
		jbDelete.setBounds(190, 230, 70, 30); 
		jbUpdate.setBounds(280, 230, 70, 30); 
		jbClose.setBounds(370, 230, 70, 30);
		
		setBounds(800,200,530,330);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//Hw0412
	
	
	public DefaultListModel<String> getDlm() {
		return dlm;
	}

	public JLabel getJlNum() {
		return jlNum;
	}


	public JLabel getJlName() {
		return jlName;
	}


	public JLabel getJlAge() {
		return jlAge;
	}


	public JLabel getJlAddr() {
		return jlAddr;
	}


	public JTextField getJtfNum() {
		return jtfNum;
	}


	public JTextField getJtfName() {
		return jtfName;
	}


	public JTextField getJtfAge() {
		return jtfAge;
	}


	public JTextField getJtfAddr() {
		return jtfAddr;
	}


	public JList<String> getList() {
		return list;
	}


	public JButton getJbInsert() {
		return jbInsert;
	}


	public JButton getJbDelete() {
		return jbDelete;
	}


	public JButton getJbUpdate() {
		return jbUpdate;
	}


	public JButton getJbClose() {
		return jbClose;
	}


	public static void main(String[] args) {
			new UseRecord0412();
	}
	
}//class 
