package day0304;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Hw0304 {
	
	private List<String> folderList;
	
	public Hw0304() {
		boolean whileFlag = true;
		String folderName="";
		folderList = new ArrayList<String>();
		JTextArea jtaFolderList= new JTextArea(10,60);
		
			do {
				folderName = JOptionPane.showInputDialog("������ �Է�\nc:/dev");
				try {
				File file = new File(folderName);
				
				
				if(folderName == null) {
					whileFlag = false;//���� ��ư
				} else {
				
					if(file.isDirectory()) {
						File[] name = file.listFiles();
						
						for(int i=0;i<name.length;i++ ) {
							File temp = name[i];
						}//end for
						
						JOptionPane.showMessageDialog(null, name.toString());
						
					} else if(file.isFile()) {
						JOptionPane.showMessageDialog(null, "������ ó���� �� �����ϴ�.");
					}//end if
					
				}//end else
				}catch(NullPointerException npe) {
					System.exit(0);
				}
			}while(!whileFlag);
		
	}//end Hw0304

	public static void main(String[] args) {
		new Hw0304();
	}//main

}//class
