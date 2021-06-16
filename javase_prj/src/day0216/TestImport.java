package day0216;

import java.util.Calendar;
import java.util.Date;

//import java.util.*;//java.util 패키지에 존재하는 모든 클래스를 사용. : 속도가 느림 권장하지 않음.
//import java.util.Date;//특정 클래스 하나만 사용하는 import
//import java.sql.Date; //패키지가 다르고 클래스명이 같다면 둘중 하나만 import받을 수 있다.

//import java.util.Calendar;//특정 클래스 하나만 사용하는 import


/**
 * 외부패키지(현재클래스가 존재하는 패키지가 아닌 패키지 또는 java.lang패키지가 아닌 패키지)에 존재하는 클래스의 사용.
 * @author user
 */
public class TestImport {

	public static void main(String[] args) {
		//같은 이름의 클래스를 사용할 때에는 들 중 하나는 impoert로 사용하고 나머지는 full path를 사용한다.
			
		//1. import 사용
		Date d = null; //java.util.Date로 사용
			
		//2. full path 사용
		java.sql.Date d2 = null;//java.sql.Date로 사용
	
		Calendar c = null;
	
	
	
	}//main

}//class
