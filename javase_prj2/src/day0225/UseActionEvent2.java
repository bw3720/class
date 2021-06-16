package day0225;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * �̸��� �Է��ϸ� ��ư�� Ŭ���ϸ� �Էµ� �̸��� TextArea���߰��Ǵ� ��. 
 * @author SIST
 */
@SuppressWarnings("serial")
//1.������ ������Ʈ ���, �߻��̺�Ʈ�� ó���� �� �ִ� Listener�� ����.
public class UseActionEvent2 extends JFrame implements ActionListener{
	//2. �̺�Ʈ�� �߻������� ����� ������Ʈ�� ����.
	private JTextField jtfName;
	private JTextArea jtaOutput;
	
	public UseActionEvent2() {
		super("Container Component ���.");
		//3.�����͵� ����
		//������Ʈ ���� + �ϴ���
		JLabel jlblName = new JLabel("�̸� : ");
		jtfName = new JTextField(12);
		JButton jbtnInput = new JButton("�Է�");
		jtaOutput = new JTextArea();
		
		//4. ��ġ������ ����
		//�������� ������Ʈ�� �ѹ��� ��ġ�ϱ����� container component ==> JPanel
		JPanel jpNorth = new JPanel();
		jpNorth.add(jlblName);
		jpNorth.add(jtfName);
		jpNorth.add(jbtnInput);
		//��ũ�ѹٰ� �ʿ��� ��ü�� ��ũ�ѹٸ� ��ġ�ϱ����� container component ==> JScrollPane
		JScrollPane jspCenter = new JScrollPane(jtaOutput);
		
		//5.��ġ
		add("North",jpNorth);
		add("Center",jspCenter); 
		
		////��ư���� �߻��� �̺�Ʈ�� ó���� �� �ֵ���, �̺�Ʈ�� ���.
		jbtnInput.addActionListener(this);//��ư Ŭ��!!
		jtfName.addActionListener(this);//�ؽ�Ʈ�ʵ� ����!!
		
		//6.ũ�� ����
		setSize(500, 400);
		setLocation(100 , 200);
		
		//7.����ȭ
		setVisible(true);
		
		//8.����
		setDefaultCloseOperation(  JFrame.EXIT_ON_CLOSE);
		
	
	}//UseContainerComponent
	
	//2.�̺�Ʈ ó���� �� �� �ִ� method Override
	@Override
	public void actionPerformed(ActionEvent ae) {
		//JTextField�� �Է°��� �����ͼ�
		String name = jtfName.getText();
		//JTextField�� �߰��Ѵ�.
		jtaOutput.append(name+"\n");//T.A�� �����ϴ� �� �ڿ� ����.
//		jtaOutput.setText(name+"\n");//T.A�� �����ϴ� ���� �ʱ�ȭ�� �� �Է°��� ���.
		
		//JTextField�� ���� �ʱ�ȭ �Ѵ�.
		jtfName.setText("");
		//JTextField�� Ŀ���� ���� ���´�.
		jtfName.requestFocus();
		//JTextField
		
	}//actionPerformed
	
	
	public static void main(String[] args) {
		new UseActionEvent2();
	}//main

}//class
