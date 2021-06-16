package day0303;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * 사용자에게 메뉴를 제공하고, 메뉴를 처리하는 코드정의.
 * @author SIST
 */
public class SelectMenu {

	private List<DataVO> dataList;//사용자가 입력한 데이터를 저장할 목적의 JCF(Java Collection Framework).
	
	public SelectMenu() {
		//사용자가 입력한 데이터를 저장할 목적의 List 생성.
		dataList = new ArrayList<DataVO>();
	}//SelectMenu
	
	/**
	 * 사용자가 그만둘때까지 제공할 메뉴.
	 * 1.데이터 입력, 2.데이터 출력, 3.종료
	 */
	public void Menu() {
		
		boolean exitFlag = false;//메뉴를 빠져나가기 위한 변수
		String inputMenu = "";
		
		do {
			inputMenu = JOptionPane.showInputDialog("관리 프로그램.\n메뉴의 번호를 입력해주세요.\n메뉴) 1.입력 2.출력 3.종료");
			
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
					JOptionPane.showMessageDialog(null, "메뉴는 1,2,3중 하나만 입력해주세요.");
				}//end else
			} catch (NullPointerException npe) {
				exitFlag=closeApp();
			}//end try~catch
				
				
			
		}while(!exitFlag);
		

	}//menu
	
	/**
	 * 이름과 나이를 CSV형식의 데이터로 입력받아, List에 추가
	 */
	public void inputData() {
		String csvData = JOptionPane.showInputDialog("데이터 입력\n입력 예) 홍길동,24");
		
		try {
			String[] tempData = csvData.split(",");//X와 cancel을 누르면 NullPointerException 발생
			if(tempData.length==2) {//입력값의 형식체크, 값을 넣지 않고 "OK"를 누르면 ""가 입력
			
				String name = tempData[0];
				int age = Integer.parseInt(tempData[1]);//NumberFormatException		
				
				//입력데이터를 VO에 넣고, VO를 List에 추가
				dataList.add(new DataVO(name, age));
				
				
				
			}else {
				JOptionPane.showMessageDialog(null, "입력형식은 이름,나이의 형식이어야합니다.");
			}//end else
			
		}catch(NullPointerException npe) {
			JOptionPane.showMessageDialog(null, "입력할 값을 추가해주세요.");
		}catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "나이는 숫자 형식이어야 합니다.");
			
		}//end catch
		
		
	}//inputData
	
	/**
	 * 입력된 이름과 나이를 List에서 받아와서 JTextArea에 출력.
	 * 번호(for index), 이름(VO), 나이(VO), 태어난해(날짜 객체와 나이를 연산)
	 */
	public void printData() {
		StringBuilder sbOutputData = new StringBuilder();//출력데이터를 저장할 변수
		sbOutputData.append("번호\t이름\t나이\t태어난해\n");
		sbOutputData.append("----------------------------------------------------------------------------\n");
		if(dataList.isEmpty()) {//데이터가 존재하지 않는경우.
			sbOutputData.append("입력된 데이터가 존재하지 않습니다.");
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
		jtaDataDisplay.setText(sbOutputData.toString());//생선된 출력 데이터를 추가
		jtaDataDisplay.setEditable(false);//편집불가.
		
		JScrollPane jspDataDisplay = new JScrollPane(jtaDataDisplay);
		
		//messageDialog에 출력
		JOptionPane.showMessageDialog(null, jspDataDisplay);
	
	}//printData
	
	/**
	 * 종료처리
	 */
	public boolean closeApp() {
		boolean flag=false;
		
		int selectExitBtn = JOptionPane.showConfirmDialog(null, "종료?");
		switch (selectExitBtn) {
		case JOptionPane.OK_OPTION : flag = true;
		}//end switch
		
		
		return flag;
	}//closeApp
	
	
	
	
}//class
