package kr.co.sist.javamemo.evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.swing.JButton;

import kr.co.sist.javamemo.MemoHelp;


public class MemoHelpEvt extends WindowAdapter  implements ActionListener{
	
	private MemoHelp mh;
	
	public MemoHelpEvt(MemoHelp mh) {
		this.mh = mh;
	}//MemoHelpEvt
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == mh.getJbtnClose()) {
			mh.dispose();
		}//end if 
		
		
	}//actionPerformed

}//main
