package day0217;

import java.text.DecimalFormat;

/**
 * 숫자포멧.
 * 
 * @author user
 */
public class UseDecimalFormat {
	
	public UseDecimalFormat() {
		int i = 1_000_000;//JDK 1.7에서 부터 지원되는 기능. _ 로정수 상수 의 자릿수를 구분할 수 있다.
		//_는 출력 되지 않는다.
		System.out.println(i);
		
		DecimalFormat df =new DecimalFormat("0,000,000"); //자릿수를 맞춰 출력할 때.
		DecimalFormat df1 =new DecimalFormat("#,###,###"); //테이터가 존재하는 것까지만 출력할 때.
		
		System.out.println(df.format(2021));
		System.out.println(df1.format(2021));
		
		//자릿수를 초과하는 숫자가 들어오면 3자리마다 ,를 자동으로 넣어준다.
		DecimalFormat df2 =new DecimalFormat("#,###");
		System.out.println(df2.format(202122222));
		
		//실수의 자릿수도 설정가능
		DecimalFormat df3 =new DecimalFormat("#,###.00");
		System.out.println(df3.format(2021.2021));
		
	}//UseDecimalFormat
	
	
	public static void main(String[] args) {
		
		new UseDecimalFormat();
		
	}//main

}//class
