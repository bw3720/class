package day0219;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
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
 * 일요일 : 7, 14, 21, 28.<br>
 * @author user
 *
 */
public class Work0218 {
	
	/**
	 * 입력은 한국, 미국, 일본, 중국의 문자열이 입력되고, 그 외에는 한국으로 처리한다.<br>
	 * 
	 * @param nation 국가
	 * @return 날짜 형식
	 */
	public String dateFormat(String nation) {
		String tempDate = "";
		Locale tempLoc = Locale.KOREA;
		
		switch(nation) {
		case "미국": tempLoc=Locale.US; break;
		case "일본": tempLoc=Locale.JAPAN;break;
		case "중국": tempLoc=Locale.CHINA;break;
		}//end switch
		
		tempDate = new SimpleDateFormat("MM-dd-yyyy EEEE a HH:mm",tempLoc).format(new Date());
		
		return tempDate;
	}//dateFormat

	/**
	 * 날짜를 받아 출력하는 일.
	 * @param Date date출력할 날짜.
	 */
	public void printDate(String date) {
		System.out.println(date);
	}//printDate
	
	/////////////////////////////////////////////////////////////////////////
	
	/**
	 * 입력한 월에 일요일을 구하는 일.<br>
	 * 입력월이 1~12월이 아니라면 1월로 설정.<br>
	 * @param month 일요일을 알고싶은 달
	 * @return	일요일의 일자
	 */
	public List<Integer> sundayList(int month){
		List<Integer> list = new ArrayList<Integer>();
		
		int tempMonth = 0;
		if(month> 0 && month<13) {
			//자바는 사람이 생각하는 월보다 1 적음.
			tempMonth = month-1;
		}//end if
			
		Calendar cal = Calendar.getInstance();//2021-02-19
		cal.set(Calendar.MONTH, tempMonth);//입력한 달로 설정.
		
		//월의 마지막날 구하기. cal.getActualMaximum(Calendar.DATE);
		int lastDay = cal.getActualMaximum(Calendar.DATE)+1;//밑에서 for의 범위에서  lastDay에 +1을 하면  CPU가 더 사용되기에 위로 옮김
		
		for(int tempDay =1; tempDay < lastDay; tempDay++) {
			//임시일자를 Calendar 객체에 설정
			cal.set(Calendar.DAY_OF_MONTH, tempDay);
			//설정된 일자가 일요일인지 판단.
			switch(cal.get(Calendar.DAY_OF_WEEK)) {
			case Calendar.SUNDAY:
				//리스트에 일요일을 추가.
//				list.add(tempDay);//auto boxing
				list.add(Integer.valueOf(tempDay));//auto boxing이 아닌 경우
			}//end switch
		}//end for
		
		return list;
	}//sundayList 
	
	/**
	 * 입력된 리스트를 출력하는 일
	 */
	public void printSunday(int month,List<Integer>list) {
		System.out.println(month + "월의 일요일 : ");
		for(int temp : list) {
			System.out.printf("%-4d",temp);
		}//end for
	}//printSunday
	
	public static void main(String[] args) {
		Work0218 work = new Work0218();

		work.printDate(work.dateFormat("중국"));
		System.out.println("------------------------------------");
		
		int month = 3;
		work.printSunday(month,work.sundayList(month));
	}//main

}//class
