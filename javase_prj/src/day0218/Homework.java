package day0218;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * 문제 1번<br>
 * method를 호출하여 매개변수를 넣으면 해당 국가의 날짜 표현 형식으로 반환하여<br>
 * 출력하는 method를 작성.<br>
 * 입력은 한국, 미국, 일본, 중국의 문자열이 입력되고, 그 외에는 한국으로 처리한다.<br>
 * <br>
 * 반환 날짜 형식은 '월-일-년 요일 24시간:분'의 형식으로 반환 되어야한다.<br>
 *  
 * 문제 2번<br>
 * Calendar객체를 사용하여 2월달중 일요일을 아래와 같이 출력해보세요.<br>
 * for, Calendar.set, Calendar.get<br>
 * 일요일 : 7, 14, 21, 28
 * @author user
 *
 */
public class Homework {
	
	public String worldDate(String country) {
		String temp="";
		Date date = new Date();
		if(country.equals("미국")) {
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy EEEE a HH:mm",Locale.US);
			temp= sdf.format(date);
		}else if(country.equals("일본")) {
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy EEEE a HH:mm",Locale.JAPAN);
			temp= sdf.format(date);
		}else if(country.equals("중국")) {
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy EEEE a HH:mm",Locale.CHINA);
			temp= sdf.format(date);
		}else {
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy EEEE a HH:mm",Locale.KOREA);
			temp= sdf.format(date);
		}
		return temp;
	}//worldDate
		
	////프린트 메소드 만들기
	public void printWorldDate(String temp) {
		System.out.println(temp);
	}//printWorldDate	
	///////////////////////////////////////////////////////////////////////////////////////////////
	
	public void sunday() {
		//calendar를 사용해봤지만 모르겠습니다.
		
	}//
	
	
	public static void main(String[] args) {
		Homework hw = new Homework();
		hw.printWorldDate(hw.worldDate("중국"));
		hw.sunday();
		
	}//main

}//class
