package day0303;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * ����ڿ��� �޴��� �����ϰ�, �޴��� ó���ϴ� �ڵ�����.
 * @author SIST
 */
public class SelectMenu {

	private List<DataVO> dataList;//����ڰ� �Է��� �����͸� ������ ������ JCF(Java Collection Framework).
	
	public SelectMenu() {
		//����ڰ� �Է��� �����͸� ������ ������ List ����.
		dataList = new ArrayList<DataVO>();
	}//SelectMenu
	
	/**
	 * ����ڰ� �׸��Ѷ����� ������ �޴�.
	 * 1.������ �Է�, 2.������ ���, 3.����
	 */
	public void Menu() {
		
		boolean exitFlag = false;//�޴��� ���������� ���� ����
		String inputMenu = "";
		
		do {
			inputMenu = JOptionPane.showInputDialog("���� ���α׷�.\n�޴��� ��ȣ�� �Է����ּ���.\n�޴�) 1.�Է� 2.��� 3.����");
			
			try {
				if(inputMenu.equals("1")||inputMenu.equals("2")||inputMenu.equals("3")) {
					if(inputMenu.equals("1")) {
						inputData();
					}
					if(inputMenu.equals("2")) {
						printData();
					}
					if(inputMenu.equals("3")) {
						exitFlag=closeApp();
					}
				}else {
					JOptionPane.showMessageDialog(null, "�޴��� 1,2,3�� �ϳ��� �Է����ּ���.");
				}//end else
			} catch (NullPointerException npe) {
				exitFlag=closeApp();
			}//end try~catch
				
				
			
		}while(!exitFlag);
		

	}//menu
	
	/**
	 * �̸��� ���̸� CSV������ �����ͷ� �Է¹޾�, List�� �߰�
	 */
	public void inputData() {
		String csvData = JOptionPane.showInputDialog("������ �Է�\n�Է� ��) ȫ�浿,24");
		
		try {
			String[] tempData = csvData.split(",");//X�� cancel�� ������ NullPointerException �߻�
			if(tempData.length==2) {//�Է°��� ����üũ, ���� ���� �ʰ� "OK"�� ������ ""�� �Է�
			
				String name = tempData[0];
				int age = Integer.parseInt(tempData[1]);//NumberFormatException		
				
				//�Էµ����͸� VO�� �ְ�, VO�� List�� �߰�
				dataList.add(new DataVO(name, age));
				
				
				
			}else {
				JOptionPane.showMessageDialog(null, "�Է������� �̸�,������ �����̾���մϴ�.");
			}//end else
			
		}catch(NullPointerException npe) {
			JOptionPane.showMessageDialog(null, "�Է��� ���� �߰����ּ���.");
		}catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "���̴� ���� �����̾�� �մϴ�.");
			
		}//end catch
		
		
	}//inputData
	
	/**
	 * �Էµ� �̸��� ���̸� List���� �޾ƿͼ� JTextArea�� ���.
	 * ��ȣ(for index), �̸�(VO), ����(VO), �¾��(��¥ ��ü�� ���̸� ����)
	 */
	public void printData() {
		StringBuilder sbOutputData = new StringBuilder();//��µ����͸� ������ ����
		sbOutputData.append("��ȣ\t�̸�\t����\t�¾��\n");
		sbOutputData.append("----------------------------------------------------------------------------\n");
		if(dataList.isEmpty()) {//�����Ͱ� �������� �ʴ°��.
			sbOutputData.append("�Էµ� �����Ͱ� �������� �ʽ��ϴ�.");
		}//end if
		
		DataVO dv = null;
		int nowYear = Calendar.getInstance().get(Calendar.YEAR);
		
		for(int idx=0;idx<dataList.size();idx++) {
			dv=dataList.get(idx);
			//method chain
			sbOutputData.append(idx+1).append("\t").append(dv.getName())
			.append("\t").append(dv.getAge()).append("\t").append(nowYear-dv.getAge()+1).append("\n");
		}//end for
		
		JTextArea jtaDataDisplay = new JTextArea(10,60);
		jtaDataDisplay.setText(sbOutputData.toString());//������ ��� �����͸� �߰�
		jtaDataDisplay.setEditable(false);//�����Ұ�.
		
		JScrollPane jspDataDisplay = new JScrollPane(jtaDataDisplay);
		
		//messageDialog�� ���
		JOptionPane.showMessageDialog(null, jspDataDisplay);
	
	}//printData
	
	/**
	 * ����ó��
	 */
	public boolean closeApp() {
		boolean flag=false;
		
		int selectExitBtn = JOptionPane.showConfirmDialog(null, "����?");
		switch (selectExitBtn) {
		case JOptionPane.OK_OPTION : flag = true;
		}//end switch
		
		
		return flag;
	}//closeApp
	
	
	
	
}//class
