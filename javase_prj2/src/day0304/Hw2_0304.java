package day0304;

import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;




@SuppressWarnings("serial")
public class Hw2_0304 extends JFrame implements ActionListener {
	private JButton jbtn;
	private JTextArea jtaTxt;
	private String path;
	private String fileName;
	private File file;
	
	public Hw2_0304() {
		jbtn = new JButton("Click");
		jtaTxt = new JTextArea(20,60);
		JScrollPane jsp = new JScrollPane();
		jsp.add(jtaTxt);
		
		
		jbtn.addActionListener(this);
		
		add(jbtn);
		add(jtaTxt);
		
		setLayout(new FlowLayout());
		setBounds(100, 100, 700, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//Hw2_0304
	
	public void printTxt() throws FileNotFoundException,IOException{
		boolean whileFlag = true;
		
		
		FileDialog open = new FileDialog(this,"file open",FileDialog.LOAD);
			open.setVisible(true);
		
		
				path = open.getDirectory();//������ ���� �ּ�
				fileName = open.getFile();//������ �̸� 
				
				if(fileName.contains(".txt")) {//������ ������ txt �������� ����.
					file = new File(path+fileName);
					
					BufferedReader br = null;
					try {
						br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
						//BufferedReader�� ����ϸ� �б� �ӵ��� ����. BufferedWriter���� ����������.
						
						String lineData = "";
																   /////////////////////////////////////////////////
						while((lineData = br.readLine()) != null) {//������ �������� �𸣴� while���� ����Ѵ�.           //
																   //readLine() �ٴ����� �о� ���̴µ� \n������ �о���δ�.//
																   /////////////////////////////////////////////////
							System.out.println(lineData);
							jtaTxt.append(lineData+"\n");//�ٹٲ��� ������ ���ڵ��� �پ ����!!!
						}//end while
						
					}finally {
						if(br != null) {br.close();}//�޸� ���°� ����!! �߿�!!
					}//end finally
				}else {
					JOptionPane.showMessageDialog(null, "�ؽ�Ʈ ������ �ƴմϴ�.");
				}//end else
				
			
	}//end printTxt

	
	
	public static void main(String[] args) {
			new Hw2_0304();
	}//main


	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == jbtn) {
			try {
				printTxt();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//end if
		
	}//actionPerformed

}//class
