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
 * ������ �̺�Ʈ�� �ٸ� Ŀ����Ʈ���� �߻� ��ų ��, �̺�Ʈ�� �߻���Ų ��ü�� ��.
 * @author SIST
 */
//1. �̺�Ʈ�� ó���� �� �ִ� Listener�� ����
@SuppressWarnings("serial")
public class UsEventCompare extends JFrame implements ActionListener{
	//2. �̺�Ʈó���� ���õ� ������Ʈ�� ����.��
	private JButton jbtn1,jbtn2;
	private JLabel jlblOutput;
	
	
	public UsEventCompare() {
		super("�̺�Ʈ ��");
		
		jbtn1 = new JButton("����");
		jbtn2 = new JButton("����");
		
		jlblOutput = new JLabel("��� : ");
		jlblOutput.setBorder(new TitledBorder("���ð��"));
		
		JPanel jp = new JPanel();
		jp.add(jbtn1); //��ư�� ����ũ�⸦ ������ �����̳� ������Ʈ�� ��ġ
		jp.add(jbtn2); //��ư�� ����ũ�⸦ ������ �����̳� ������Ʈ�� ��ġ
		
		//������Ʈ���� ������� ������ ���� �� JVM���� û���� �� �ֵ��� �����ʿ� ����Ѵ�.
		jbtn1.addActionListener(this);
		jbtn2.addActionListener(this);
		
		
		add("Center",jp);//�����̳� ������Ʈ�� ������ ������Ʈ�� ��ġ
		add("South",jlblOutput);
		
		setBounds(100, 100, 400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseActionEvent
	
	//2.Listener���� �����ϴ� abstract method�� Override
	public void actionPerformed(ActionEvent ae) {
		//������� ������ �־��� �� JVM���� ȣ��.(��ϵ� ������Ʈ������ ȣ�Ⱑ��)
		if(ae.getSource()== jbtn1) {
			System.out.println("����");
			//������� ���� ���̾� �α׸� ����.
			FileDialog fdOpen = new FileDialog(this, "���Ͽ���", FileDialog.LOAD);
			
			//����ڿ��� �����ֱ�
			fdOpen.setVisible(true);
			
			//directory�� filename ���
			String path = fdOpen.getDirectory();
			String fileName = fdOpen.getFile();
			
			if(path != null) {
				jlblOutput.setText("��� : "+path+fileName);
				//���ϰ��, ���ϸ� ���
				setTitle("���ϸ� : "+fileName);
			}//end if
			
		}//end if
		
		if(ae.getSource()== jbtn2) {
			System.out.println("����");
			//������� ���� ���̾� �α׸� ����.
			FileDialog fdSave = new FileDialog(this, "��������", FileDialog.SAVE);
			
			//����ڿ��� �����ֱ�
			fdSave.setVisible(true);
			
			String path = fdSave.getDirectory();
			String fileName = fdSave.getFile();
			if(path != null) {
				//���ϰ��, ���ϸ� ���
				jlblOutput.setText("��� : "+path+fileName);
				setTitle("���� - " +fileName);
			}//end if
			
		}//end if
		
	
	
	}//actionPerformed
	
	
	public static void main(String[] args) {
		new UsEventCompare();
	}//main

}//class
