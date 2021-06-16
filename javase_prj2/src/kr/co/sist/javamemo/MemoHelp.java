package kr.co.sist.javamemo;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import kr.co.sist.javamemo.evt.MemoHelpEvt;

@SuppressWarnings("serial")
public class MemoHelp extends JDialog{
	
	private JavaMemo jm;
	private JButton jbtnClose;
	private JTextArea jlbInfo;
	private JLabel jlPic;
	
	public MemoHelp(JavaMemo jm) {
		super(jm, "�޸��� ����",true);
		this.jm = jm;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(jm.getX()+150, jm.getY()+200, 500, 400);
		setLayout(null);
		
		ImageIcon chanIcon = new ImageIcon("C:\\dev\\workspace\\javase_prj2\\src\\day0224\\images\\james-gosling.png");
		
		jlbInfo = new JTextArea("�ڹ� �޸��� ����\n"
						   	  + "Version 1,0\n"
						   	  + "\n������ : �ѻ��\n"
						   	  + "\n�� �޸����� java SE14�� ����Ͽ� ������\n"
						   	  + "�����̰�, License�� HPL�Դϴ�.\n"
						   	  + "\n�ƹ��� �����Ӱ� ����� �ּ���.\n"
						   	  + "���� ������ ���׷��̵�� ��ȹ�Ǿ� ���� �ʽ��ϴ�.");

		MemoHelpEvt mhe = new MemoHelpEvt(this); 
		
		jbtnClose = new JButton("�ݱ�");
		jlPic = new JLabel(chanIcon);
		
		jlPic.setBounds(40, 50, 120, 190);
		jlbInfo.setBounds(180, 50, 280, 190);
		jbtnClose.setBounds(190, 250, 80, 20);
		
		add(jbtnClose);
		add(jlbInfo);
		add(jlPic);
		
		jbtnClose.addActionListener(mhe);
		
		setVisible(true);
	}//MemoHelp
	
	//////////////getter///////////////////
	public JavaMemo getJm() {
		return jm;
	}

	public JButton getJbtnClose() { 
		return jbtnClose;
	}

	
	public JLabel getJlPic() {
		return jlPic;
	}

	public JTextArea getJlbInfo() {
		return jlbInfo;
	}

	
}//class
