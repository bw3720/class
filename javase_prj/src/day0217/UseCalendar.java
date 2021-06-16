package day0217;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * �������� ��¥ ������ ���� �� ����ϴ� Calendar.
 * 
 * @author user
 */
public class UseCalendar {
	
	public UseCalendar() {
		//1. ����
		//Calendar cal = new Calendar(); // �߻�Ŭ���� �̹Ƿ� ��üȭ�� ���� �ʴ´�.
		//is a ������ ��üȭ.    �θ�Ŭ������ ��ü�� = new �ڽ�Ŭ����������();
		Calendar cal = new GregorianCalendar();
		
		//instance�� ��� method ���.
		Calendar cal1 = Calendar.getInstance();

		System.out.println(cal);
		System.out.println(cal1);
		
		//����� �����ϴ� ���� �ڹٿ��� ������ ���� 1�� ���̰� �ִ�. �׷��� ���ϱ� 1�� �ؾߵ�
		//������ �Ͽ��� ���� 1�� �����Ͽ� ���´�.
		
		int week = cal1.get(Calendar.DAY_OF_WEEK);
		int am = cal1.get(Calendar.AM_PM);
		
		String[] weekTitle= {"��","��","ȭ","��","��","��","��"};
		String[] amTitle= {"����","����"};
		
			
		String output=cal1.get(Calendar.YEAR)+"-"+(cal1.get(Calendar.MONTH)+1)+"-"
				+cal1.get(Calendar.DAY_OF_MONTH)+"-"
				+weekTitle[week-1]+" "+cal1.get(Calendar.DAY_OF_WEEK)+"  " + amTitle[am]+" "+
				cal1.get(Calendar.HOUR)+ " "+cal1.get(Calendar.HOUR_OF_DAY) +":"+cal1.get(Calendar.MINUTE)+":"+cal1.get(Calendar.SECOND);
		
		
		
		System.out.println(output);
		
		System.out.println("------------------------��¥��������------------------------");
		System.out.println(cal);//���糯¥ ����.
		
		//�� ����.
		cal.set(Calendar.YEAR, 2020);
		//�� ����. (������ ��¥  ���� 1)
		cal.set(Calendar.MONTH, 11);
		//�� ����.
		cal.set(Calendar.DAY_OF_MONTH, 30);
		
		
		
		System.out.printf("%d-%d-%d %s",cal.get(Calendar.YEAR),cal.get(Calendar.MONTH)+1
				,cal.get(Calendar.DAY_OF_MONTH),weekTitle[cal.get(Calendar.DAY_OF_WEEK)-1]);
		
	}//UseCalendar
	
	public static void main(String[] args) {
		
		new UseCalendar();
		
	}//main

}//class
