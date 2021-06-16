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
		super(jm, "메모장 정보",true);
		this.jm = jm;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(jm.getX()+150, jm.getY()+200, 500, 400);
		setLayout(null);
		
		ImageIcon chanIcon = new ImageIcon("C:\\dev\\workspace\\javase_prj2\\src\\day0224\\images\\james-gosling.png");
		
		jlbInfo = new JTextArea("자바 메모장 정보\n"
						   	  + "Version 1,0\n"
						   	  + "\n제작자 : 한상민\n"
						   	  + "\n이 메모장은 java SE14를 사용하여 개발한\n"
						   	  + "버전이고, License는 HPL입니다.\n"
						   	  + "\n아무나 자유롭게 사용해 주세요.\n"
						   	  + "향후 버전의 업그레이드는 계획되어 있지 않습니다.");

		MemoHelpEvt mhe = new MemoHelpEvt(this); 
		
		jbtnClose = new JButton("닫기");
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
