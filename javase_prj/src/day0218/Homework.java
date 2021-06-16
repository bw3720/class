package day0218;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
 * �Ͽ��� : 7, 14, 21, 28
 * @author user
 *
 */
public class Homework {
	
	public String worldDate(String country) {
		String temp="";
		Date date = new Date();
		if(country.equals("�̱�")) {
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy EEEE a HH:mm",Locale.US);
			temp= sdf.format(date);
		}else if(country.equals("�Ϻ�")) {
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy EEEE a HH:mm",Locale.JAPAN);
			temp= sdf.format(date);
		}else if(country.equals("�߱�")) {
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy EEEE a HH:mm",Locale.CHINA);
			temp= sdf.format(date);
		}else {
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy EEEE a HH:mm",Locale.KOREA);
			temp= sdf.format(date);
		}
		return temp;
	}//worldDate
		
	////����Ʈ �޼ҵ� �����
	public void printWorldDate(String temp) {
		System.out.println(temp);
	}//printWorldDate	
	///////////////////////////////////////////////////////////////////////////////////////////////
	
	public void sunday() {
		//calendar�� ����غ����� �𸣰ڽ��ϴ�.
		
	}//
	
	
	public static void main(String[] args) {
		Homework hw = new Homework();
		hw.printWorldDate(hw.worldDate("�߱�"));
		hw.sunday();
		
	}//main

}//class
