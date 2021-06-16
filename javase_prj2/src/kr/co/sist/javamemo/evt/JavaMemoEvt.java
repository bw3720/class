package kr.co.sist.javamemo.evt;

import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import kr.co.sist.javamemo.JavaMemo;
import kr.co.sist.javamemo.MemoFont;
import kr.co.sist.javamemo.MemoHelp;

/**
 * JavaMemo�������� �̺�Ʈó�� Ŭ����
 * @author user
 */
public class JavaMemoEvt extends WindowAdapter implements ActionListener {

	private JavaMemo jm; //has a
	private String flagNote;//����(����,����)�� �񱳸� �ϱ����� ���ڿ� ��.
	private String path;//���⳪ ���� �۾� ������ ������ ��θ� ����.
	private String fileName;//���⳪ ���� �۾� ������ ���ϸ��� ����.

	private Font jtaFont;
	
	public JavaMemoEvt( JavaMemo jm ) {
		this.jm=jm;
		flagNote = "";//null�� JTextArea�� �ʱⰪ�� ��ġ��Ű�� ���� �ʱ�ȭ ��.
		path="";
		fileName="";
	}//JavaMemoEvt
	
	@Override
	public void windowClosing(WindowEvent we) {
		jm.dispose();
	}//windowClosing

	
	
	@Override
	public void windowClosed(WindowEvent e) {
		try {
			saveFontInfo();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}//windowClosed

	/**
	 * ���α׷��� ����Ǹ� JTextArea�� Font������ ���� ������ ����ϱ����� ���Ͽ� �����Ѵ�.
	 * @throws IOException
	 */
	private void saveFontInfo() throws IOException{
		
		//���������� ������ ������ �������� ���� �� �ִ�. ==> ���� �����
		File dir = new File("c:/dev/memo");
		if(!dir.exists()) {//������ ������ �������� ������
			dir.mkdirs();//������ �����ϰ�
		}//end if
		
		ObjectOutputStream oos = null;
		try {
			//������ ��ο� ���� ��Ʈ���� ����.
			oos = new ObjectOutputStream(new FileOutputStream(dir.getAbsolutePath()+"/memo.dat"));
			Font font = jm.getJtaNote().getFont();//JTextArea
			//Font��ü�� ��Ʈ���� ���
			oos.writeObject(font);
			//��Ʈ���� ��ϵ� ������ �������� ����.
			oos.flush();
			
		} finally {
			if(oos != null) {oos.close();}//end if
		}//end finally
		
		
		
	}//saveFontInfo

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == jm.getJmiFont()) {//�۲ÿ��� �̺�Ʈ�� �߻�.
			memoFont();
		}//end if
		
		if(ae.getSource() == jm.getJmiNew()) {//���ۿ��� �̺�Ʈ�� �߻�.
			newMemo();
		}//end if
		
		if(ae.getSource() == jm.getJmiOpen()) {//���⿡�� �̺�Ʈ�� �߻�.
			try {
				openMemo();
			} catch (IOException ie) {
				JOptionPane.showMessageDialog(jm, "������ ���� ���� ������ �߻��߽��ϴ�.");
				ie.printStackTrace();
			}//end catch
		}//end if
		
		if(ae.getSource() == jm.getJmiNewSave()) {//���� �ȿ� ����־����ϴ�.
			newSaveMemo();
		}//end if
		
		if(ae.getSource() == jm.getJmiSave()) {
			saveMemo();
		}//end if
		
		if(ae.getSource() == jm.getJmiEnd()) {
			endMemo();
		}//end if

		if(ae.getSource() == jm.getJmiHelp()) {
			helpMemo();
		}//end if
		
	}//actionPerformed

	/**
	 * �۲� ����
	 */
	public void memoFont() {
		new MemoFont( jm ); //�۲ü��� JDialog ����.
	}//memoFont
	
	/**
	 * ����
	 */
	public void newMemo() {
		JTextArea jtaMemo = jm.getJtaNote();
		
		boolean newMemoFlag= false;
		
		if( !jtaMemo.getText().equals("") && !flagNote.equals(jtaMemo.getText())) {//jtaMemo�� ������ �����ϸ� ���忩�θ� �����.
			//���� �۾����� ����� �޶�.
			switch (JOptionPane.showConfirmDialog(jm, "�����Ͻðڽ��ϱ�?")) {
			case JOptionPane.OK_OPTION : saveMemo(); newMemoFlag=false; break;//���� �� ����
			case JOptionPane.NO_OPTION: newMemoFlag=false; break;//������ϰ� ����
			case JOptionPane.CANCEL_OPTION: newMemoFlag=true;//�׳� ���(������ ����)
				
			}//end switch
		}//end if
		
		if(!newMemoFlag) {//����� ������ �ϰ� �Ʒ������� ���ุ �Ѵ�.
			jtaMemo.setText("");
			jm.setTitle("�޸��� - ����");
			//������ �����ߴ� ���ϸ� �Ǵ� �����ߴ� ��ο� ���ϸ��� �ʱ�ȭ �Ѵ�.
			path="";
			fileName="";
		}//end if
		
	}//newMemo
	
	/**
	 * ����
	 */
	public void openMemo() throws IOException{
		boolean openFlag = false;
		//�����ߴ� ����� ���� JTextArea�� ������ ���ٸ� ���⸦ ������ �ٸ��ٸ� ���忩�θ� ���� ���⸦ ����
		if(!flagNote.equals(jm.getJtaNote().getText())) {
			switch(JOptionPane.showConfirmDialog(jm, "�����Ͻðڽ��ϱ�?")) {
			case JOptionPane.OK_OPTION: openFlag = false; saveMemo();break;
			case JOptionPane.NO_OPTION: openFlag = false; ;break;
			case JOptionPane.CANCEL_OPTION: openFlag = true; ;break;
			}//end switch
		}//end if
		
			if(!openFlag) {
			FileDialog fdOpen = new FileDialog(jm,"���� - �ڹٸ޸���",FileDialog.LOAD);
			fdOpen.setVisible(true);
			
			String path = fdOpen.getDirectory();
			String fileName = fdOpen.getFile();
			if(path != null) {//����ڰ� ������ �����ϰ� ���⸦ ���� ��
				
				BufferedReader br = null;//������ �б����� ��Ʈ�� ����
				try {
					//������ ������ ������ �о� ���̱� ���� ���Ͽ� ��Ʈ�� ����
					br = new BufferedReader(new FileReader(path+fileName));
					String lineData = "";
					StringBuilder sbReadData = new StringBuilder();
					
					while((lineData = br.readLine()) != null) {//���� �о�鿩
						sbReadData.append(lineData).append("\n");//������ �����ϰ�
					}//end while
					
					jm.getJtaNote().setText(sbReadData.toString());//JTextArea�� �߰�
					flagNote = jm.getJtaNote().getText();//�������� ����� ������ ���� ���� ����.
					
					this.path = path;//������ ���ϰ�θ� ����ϱ� ���� ����.
					this.fileName = fileName;//������ ���ϸ��� ����ϱ� ���� ����
					
					jm.setTitle("�޸��� - ���� ["+fileName+"]");
					
				} finally {
					if(br != null) {br.close();}
				}//end finally
				
			}//end if
		}//end if
		
		
	}//openMemo
	
	/**
	 * ����
	 */
	public void saveMemo() {
		//������ �������� ���ų�, ������ ���� ���Ŀ��� ������ ���ϸ��� �����Ƿ� ���ϴ��̾�α׸� 
		//�����ϰ� ����, ������ ���Ȱų� ������ �Ǿ��ٸ� ������ ��ο� ���ϸ��� ����Ͽ� ����.
		try {
			if(path.equals("")) {
				newSaveMemo();
			}else{
				saveFile(path, fileName);
			}//end if else
			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(jm, "�����۾� �� ���� �߻�.");
			e.printStackTrace();
		}//end catch
		
		
		
		
	}//saveMemo
	
	/**
	 * ���̸� ����
	 */
	public void newSaveMemo() {
		FileDialog fdSave = new FileDialog(jm,"���� - �ڹٸ޸���",FileDialog.SAVE);
		fdSave.setVisible(true);
		
		String path = fdSave.getDirectory();//���
		String fileName = fdSave.getFile();//���ϸ�
		
		if(path != null) {
			try {
				saveFile(path,fileName);
			} catch (IOException e) {
				JOptionPane.showMessageDialog(jm, "���̸����� �����ϴ� �� ������ �߻��߽��ϴ�.");
				e.printStackTrace();
			}
		}//end if
	}//newSaveMemo
	
	/**
	 * ��½�Ʈ���� ����Ͽ� ���Ͽ� ����.
	 * @param path
	 */
	private void saveFile(String path,String fileName) throws IOException{
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(path+fileName));
			//�ؽ�Ʈ �����̷��� ������ ���Ͽ� ����.
			String text = jm.getJtaNote().getText();
			bw.write(text);//��Ʈ���� ���� ���.
			
			bw.flush();//��Ʈ���� ��ϵ� ������ �������� ����
			
			this.path = path;//������ ���ϰ�θ� ����ϱ� ���� ����.
			this.fileName = fileName;//������ ���ϸ��� ����ϱ� ���� ����
			
			jm.setTitle("�޸��� - ���� ["+fileName+"]");
			
		} finally {
			if(bw != null) {bw.close();}//end if
		}//end finally
	}//saveFile
	
	/**
	 * �޴����� �ݱ⸦ ������ �� ����
	 */
	public void endMemo() {
	
///////////////////////////////////������ �������////////////////////////////////////
			//////////////////////	   ����		//////////////////////
		
		try {
				saveFontInfo();
			} catch (IOException e1) {
				e1.printStackTrace();
			}//end catch
			
		
		
		
	}//endMemo
	
	/**
	 * ����
	 */
	public void helpMemo() {
		//MemoHelp();
	}//helpMemo

	
	
}//class
