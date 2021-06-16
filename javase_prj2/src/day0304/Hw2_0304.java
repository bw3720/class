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
		
		
				path = open.getDirectory();//파일의 폴더 주소
				fileName = open.getFile();//파일의 이름 
				
				if(fileName.contains(".txt")) {//선택한 파일이 txt 파일인지 검증.
					file = new File(path+fileName);
					
					BufferedReader br = null;
					try {
						br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
						//BufferedReader를 사용하면 읽기 속도가 향상됨. BufferedWriter또한 마찬가지다.
						
						String lineData = "";
																   /////////////////////////////////////////////////
						while((lineData = br.readLine()) != null) {//파일이 몇줄인지 모르니 while문을 사용한다.           //
																   //readLine() 줄단위로 읽어 들이는데 \n전까지 읽어들인다.//
																   /////////////////////////////////////////////////
							System.out.println(lineData);
							jtaTxt.append(lineData+"\n");//줄바꿈이 없으면 따닥따닥 붙어서 나옴!!!
						}//end while
						
					}finally {
						if(br != null) {br.close();}//메모리 새는거 막기!! 중요!!
					}//end finally
				}else {
					JOptionPane.showMessageDialog(null, "텍스트 파일이 아닙니다.");
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
