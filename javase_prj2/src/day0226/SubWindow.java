package day0226;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * �ΰ����� ����� �����ϴ� �ڽ�â(Dialog)
 * @author SIST
 */
@SuppressWarnings("serial")
public class SubWindow extends JDialog implements ActionListener{

	public SubWindow( MainWindow mv) {
			
			//���̾�α� ����
				//1.���̾�α� ���� : has a => �����ϴٴ� ����!
				super(mv,"���� ���̾�α�",true);
				//2.������Ʈ ��ġ (��ư ���̱�)
				JTextArea jta = new JTextArea("�̰��� �ؽ�Ʈ ����� \n ������ ��밡��");
				JButton btn = new JButton("�ݱ�");
				
				JPanel jpbtn = new JPanel();
				jpbtn.add(btn);
				
				add("Center",jta);  
				add("South",jpbtn);
				
				//��ư�� �̺�Ʈ ó��
				btn.addActionListener(this); 
				
				
				//���̾�α��� �̺�Ʈ�� setVisible���� ó���ؾ��Ѵ�.
				addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						System.out.println("���̾�α� ����");
						dispose();//JDialog�� dispose
					}//windowClosing
				});
				
				//�ڽ�â�� �θ�â �������� �����.
				//�θ�â�� x��ǥ��, y��ǥ�� ���.
				//getX(),getY()
				
				setBounds(mv.getX()+100, mv.getY()+80, 400, 400);
				setVisible(true);

		
	}//SubWindow
	
	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
	}//actionPerformed

}//class
