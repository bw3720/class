package day0217;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Fomatter class
 * @author user
 *
 */
public class UseSimpleDateFormat {
	
	public UseSimpleDateFormat() {
		//1. ���� 
		//M 1~9���� 1�ڸ��� ���. MM 1~9������ 0�� �پ� ��µȴ�.
		//d 1~9���� 1�ڸ��� ���, dd 1~9�ϱ��� 0�� �پ� ��µȴ�
		//h,K(12�ð�) 1~9���� 1�ڸ��� ���, hh,KK 1~9�ϱ��� 0�� �پ� ��µȴ�.
		//H,k(24�ð�) 1~9���� 1�ڸ��� ���, HH,kk 1~9�ϱ��� 0�� �پ� ��µȴ�.
		//m �� mm���ڸ�, s�� ss���ڸ�
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh,KK,HH,kk:mm:ss E����");
		//2. ��. 
		System.out.println(sdf.format(date));
		//��-��-���� �������� ���
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy");
		//2. ��. 
		System.out.println(sdf1.format(date));
		
		//LocaleŬ������ ���� ���Ǹ� �ٸ� ������ ��¥ �������� ����� ����.
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a hh,KK,HH,kk:mm:ss EEEE",Locale.KOREA);
		//2. ��. 
		System.out.println(sdf2.format(date));
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		new UseSimpleDateFormat();
	
	
	}//main

}//class
