package day0219;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

/**
 * ���� 1��<br>
 * method�� ȣ���Ͽ� �Ű������� ������ �ش� ������ ��¥ ǥ�� �������� ��ȯ�Ͽ�<br>
 * ����ϴ� method�� �ۼ�.<br>
 * �Է��� �ѱ�, �̱�, �Ϻ�, �߱��� ���ڿ��� �Էµǰ�, �� �ܿ��� �ѱ����� ó���Ѵ�.<br>
 * <br>
 * ��ȯ ��¥ ������ '��-��-�� ���� 24�ð�:��'�� �������� ��ȯ �Ǿ���Ѵ�.<br>
 *  
 * ���� 2��<br>
 * Calendar��ü�� ����Ͽ� 2������ �Ͽ����� �Ʒ��� ���� ����غ�����.<br>
 * for, Calendar.set, Calendar.get<br>
 * �Ͽ��� : 7, 14, 21, 28.<br>
 * @author user
 *
 */
public class Work0218 {
	
	/**
	 * �Է��� �ѱ�, �̱�, �Ϻ�, �߱��� ���ڿ��� �Էµǰ�, �� �ܿ��� �ѱ����� ó���Ѵ�.<br>
	 * 
	 * @param nation ����
	 * @return ��¥ ����
	 */
	public String dateFormat(String nation) {
		String tempDate = "";
		Locale tempLoc = Locale.KOREA;
		
		switch(nation) {
		case "�̱�": tempLoc=Locale.US; break;
		case "�Ϻ�": tempLoc=Locale.JAPAN;break;
		case "�߱�": tempLoc=Locale.CHINA;break;
		}//end switch
		
		tempDate = new SimpleDateFormat("MM-dd-yyyy EEEE a HH:mm",tempLoc).format(new Date());
		
		return tempDate;
	}//dateFormat

	/**
	 * ��¥�� �޾� ����ϴ� ��.
	 * @param Date date����� ��¥.
	 */
	public void printDate(String date) {
		System.out.println(date);
	}//printDate
	
	/////////////////////////////////////////////////////////////////////////
	
	/**
	 * �Է��� ���� �Ͽ����� ���ϴ� ��.<br>
	 * �Է¿��� 1~12���� �ƴ϶�� 1���� ����.<br>
	 * @param month �Ͽ����� �˰���� ��
	 * @return	�Ͽ����� ����
	 */
	public List<Integer> sundayList(int month){
		List<Integer> list = new ArrayList<Integer>();
		
		int tempMonth = 0;
		if(month> 0 && month<13) {
			//�ڹٴ� ����� �����ϴ� ������ 1 ����.
			tempMonth = month-1;
		}//end if
			
		Calendar cal = Calendar.getInstance();//2021-02-19
		cal.set(Calendar.MONTH, tempMonth);//�Է��� �޷� ����.
		
		//���� �������� ���ϱ�. cal.getActualMaximum(Calendar.DATE);
		int lastDay = cal.getActualMaximum(Calendar.DATE)+1;//�ؿ��� for�� ��������  lastDay�� +1�� �ϸ�  CPU�� �� ���Ǳ⿡ ���� �ű�
		
		for(int tempDay =1; tempDay < lastDay; tempDay++) {
			//�ӽ����ڸ� Calendar ��ü�� ����
			cal.set(Calendar.DAY_OF_MONTH, tempDay);
			//������ ���ڰ� �Ͽ������� �Ǵ�.
			switch(cal.get(Calendar.DAY_OF_WEEK)) {
			case Calendar.SUNDAY:
				//����Ʈ�� �Ͽ����� �߰�.
//				list.add(tempDay);//auto boxing
				list.add(Integer.valueOf(tempDay));//auto boxing�� �ƴ� ���
			}//end switch
		}//end for
		
		return list;
	}//sundayList 
	
	/**
	 * �Էµ� ����Ʈ�� ����ϴ� ��
	 */
	public void printSunday(int month,List<Integer>list) {
		System.out.println(month + "���� �Ͽ��� : ");
		for(int temp : list) {
			System.out.printf("%-4d",temp);
		}//end for
	}//printSunday
	
	public static void main(String[] args) {
		Work0218 work = new Work0218();

		work.printDate(work.dateFormat("�߱�"));
		System.out.println("------------------------------------");
		
		int month = 3;
		work.printSunday(month,work.sundayList(month));
	}//main

}//class
