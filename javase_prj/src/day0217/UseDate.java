package day0217;

import java.util.Date;

/**
 * ��¥ ���.
 * 
 * @author user
 */
public class UseDate {
	public UseDate() {
		Date date = new Date();
		System.out.println(date); //java.lang.ObjectŬ������ toString()�� Override�ؼ�.
		
	}//UseDate
	
	public static void main(String[] args) {
		new UseDate();
		
		
//		System.out.println(System.currentTimeMillis());
//		long st=System.currentTimeMillis();
//		int sum = 0;
//		for(int i =0; i<5000; i++) {
//			sum+=i;
//		}
//		System.out.println(sum);
//		long et=System.currentTimeMillis();
//		System.out.println(et-st+"ms");
	}//main

}//class
