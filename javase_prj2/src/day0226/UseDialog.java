package day0226;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class UseDialog extends JFrame implements ActionListener {
	////////////////////////////////////////////////////////////////////////////
	public UseDialog() {
		super("���̾�α� ����");
		JButton jbtn = new JButton("���̾�α� ����");
		
		JPanel panel = new JPanel();
		panel.add(jbtn);
		
		jbtn.addActionListener(this);
		
		add("Center",panel);
		
		setBounds(100, 100, 500, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	
	
	}//UseDialog
	
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		//��ư�� �ϳ��̹Ƿ� if�� ������ �ʿ䰡 ����.
		
		//���̾�α� ����
			//1.���̾�α� ���� : has a => �����ϴٴ� ����!
			JDialog jd = new JDialog(this,"���� ���̾�α�",true);
			//2.������Ʈ ��ġ (��ư ���̱�)
			JTextArea jta = new JTextArea("�̰��� �ؽ�Ʈ ����� \n ������ ��밡��");
			JButton btn = new JButton("�ݱ�");
			
			JPanel jpbtn = new JPanel();
			jpbtn.add(btn);
			
			jd.add("Center",jta); //add�� JFrame�� method��. 
			jd.add("South",jpbtn);
			
			//��ư�� �̺�Ʈ ó��
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					jd.dispose(); // Ư�� ������ ������Ʈ�� ���� ��ų �� �ִ�.
				}//actionPerformed
			});//�͸�Ŭ���� ����
			
			//���̾�α��� �̺�Ʈ�� setVisible���� ó���ؾ��Ѵ�.
			jd.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.out.println("���̾�α� ����");
					jd.dispose();
				}//windowClosing
			});
			
			jd.setBounds(150, 150, 400, 400);
			jd.setVisible(true);

			//jd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			
	
	}//actionPerformed

	
	/////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		new UseDialog();
	}//main

}//class
