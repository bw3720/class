package day0302;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class SelectMenu {
	private List<DataVO1> dataList = new ArrayList<DataVO1>();
	private boolean whileflag = true;
	
	
	public SelectMenu() {
		menu();
	}
	
	
	public void menu() {
		while( whileflag ) {
		String menu = JOptionPane.showInputDialog(null, "�޴� 1.�Է�, 2.���, 3.����");
			
		if(menu == null) {
			whileflag=false;
		}else {
			if(menu.equals("1")) {
				inputData();
			}else if(menu.equals("2")) {
				printData();
			}else if(menu.equals("3")) {
				closeApp();
			}//end if
			}//end else
		}//end while
		
	}//menu
	
	public void inputData() {
		String inputData = JOptionPane.showInputDialog(null, "�̸��� ���̸� �Է�\n��) ȫ�浿,23");
		if(inputData==null) {
			whileflag=false;
		}else {
			
			dataList.add(new DataVO1());
		}
		
	}//inputData
	
	public void printData() {
		for(int i= 0; i<dataList.size();i++) {
			System.out.println(dataList.get(i));
			
		}
		
	}//printData
	
	public void closeApp() {
		int close = JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�?", "����", JOptionPane.INFORMATION_MESSAGE);
		
		switch (close) {
		case JOptionPane.OK_OPTION : 
			System.exit(0);;
		case JOptionPane.CANCEL_OPTION:
			menu();
			break;
		case JOptionPane.CLOSED_OPTION:
			menu();
			break;
		}
		
	}//closeApp
	
}//class
