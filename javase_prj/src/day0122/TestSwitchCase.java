package day0122;
/**
 * 
 * 
 * 
 * 
 * 
 * @author user
 */
public class TestSwitchCase {
	
	public static void main(String[] args) {
//		int i = 2; //byte,short,int,char  (long은 사용할수 없다.)
//		switch(i) { //정수를 저장한 변수만 사용 할 수 있따.
//		case 0: System.out.println("ZERO");
//		case 1: System.out.println("ONE");
//		case 2: System.out.println("TWO");
//		default : System.out.println("일치하는 상수없음");
//		}//end switch
		
		
		////////////////case의 상수는 입력되는 데이터형의 범위까지만 사용할 숭 있당.
//		int i=0;
//		switch(i) { //정수를 저장한 변수만 사용 할 수 있따.
//		case 2147483647 :System.out.println("ZERO");
//		case 1 :System.out.println("ONE");
//		case 2 :System.out.println("TWO");
//		default :System.out.println("ZERO");
//		}//end switch
		
		//////////char형///////////////
//		char i='0'; //char는 입력되는 문자에 대응하는 Unicode값을을 저장. (A : 65, 0 : 48, C : 67)
//		switch(i) { //정수를 저장한 변수만 사용 할 수 있따.
//		case 48 :System.out.println("ZERO");
//		case 'B' :System.out.println("ONE");
//		case 'C' :System.out.println("TWO");
//		default :System.out.println("일치하는 상수 없음.");
//		}//end switch
		
		//////////String형///////////////
		String i="HTML"; //JavaSE 7(JDK1.7부터 지원)
		switch(i) { //정수를 저장한 변수만 사용 할 수 있따.
		case "Java" :System.out.println("완벽한 OOP언어");
		case "Oracle" :System.out.println("대용량 데이터베이스");
		case "HTML" :System.out.println("마크업 언어.");
		default :System.out.println("일치하는 상수 없음.");
		}//end switch
		
		
		
	}//main

}//class
