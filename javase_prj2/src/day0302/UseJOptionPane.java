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
		super("JOptionPane�� ���.");
		
		jbtnInput = new JButton("�Է´��̾�α�");
		jbtnMessage = new JButton("�޽��� ���̾�α�");
		jbtnConfirm = new JButton("���� ���̾�α�");
		
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
		String name = JOptionPane.showInputDialog(this,"�̸��� �Է����ּ���.\n��) �ѻ��");//�ڵ� �극��ũ�� �Ǿ� �Ʒ��� �귯���� �ʾ� Ÿ��Ʋ�ٰ� �������ʴ���.
		
		setTitle("JOptionPane�� ���. -�Է��̸� : "+name);

	}//useInput
	
	public void useMessage() {
		//JOptionPane.showMessageDialog(this, "������ ȭ���� �Դϴ�.");

		//���������� �������� ����.(JOptinPane�� Constant���)
		//ERROR_MESSAGE, INFORMATION_MESSAGE, PLAIN_MESSAGE, QUESTION_MESSAGE

//		JOptionPane.showMessageDialog(this, "�����޼��� ����","����",JOptionPane.ERROR_MESSAGE);
//		JOptionPane.showMessageDialog(this, "�����޼��� ����","����",JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(this, "�����޼��� ����","����",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(this, "�������� ���� �޼��� ����","����",JOptionPane.PLAIN_MESSAGE);
	
	}//useMessage
	
	public void useConfirm() {
//		int flag = JOptionPane.showConfirmDialog(this, "��� ���� �Ͻðڽ��ϱ�?"); // ��,�ƴϿ�, ��� ����
//		int flag = JOptionPane.showConfirmDialog(this, "������ �߻��߽��ϴ�. \n��� ���� �Ͻðڽ��ϱ�?","����",JOptionPane.ERROR_MESSAGE); //��,�ƴϿ� ����
//		int flag = JOptionPane.showConfirmDialog(this, "������ �߻��߽��ϴ�. \n��� ���� �Ͻðڽ��ϱ�?","����",JOptionPane.PLAIN_MESSAGE); //�� ����
		int flag = JOptionPane.showConfirmDialog(this, "������ �߻��߽��ϴ�. \n��� ���� �Ͻðڽ��ϱ�?","����",JOptionPane.INFORMATION_MESSAGE); // ��, �ƴϿ�, ��� ����
		
		switch(flag) {
		case JOptionPane.OK_OPTION : System.out.println("\"��\"�� ���� ��� ó��");break;
		case JOptionPane.NO_OPTION : System.out.println("\"�ƴϿ�\"�� ���� ��� ó��");break;
		case JOptionPane.CANCEL_OPTION : System.out.println("\"���\"�� ���� ��� ó��");break;
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
