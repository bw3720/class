package day0122;

/**
 *switch~case에 break 사용<br>
 *break를 만나면 switch블럭을 빠져 나간다.
 * @author user
 */
public class TestSwitchCase2 {

	public static void main(String[] args) {

		int i=2;
		switch(i) {
			case 0 : System.out.println("영"); break;
			case 1 : System.out.println("일"); 
			case 2 : System.out.println("이"); break;
			case 3 : System.out.println("삼"); break;
			default : System.out.println("없음"); //break;
		}//end switch
		
		//break; => break는 switch~case, while, do~while안에서만 사용할 수 있다.	
		
		System.out.println("------------------------------------------");
		int year = 1995;
		
		switch (year % 12) {//띠를 구하려면 태어난해를 12로 나눈 나머지 사용 .0~11까지의 수 발생.
		case 0 : System.out.println(year+"년생 원숭이띠"); break;
		case 1 : System.out.println(year+"년생 닭띠"); break;
		case 2 : System.out.println(year+"년생 개띠"); break;
		case 3 : System.out.println(year+"년생 돼지띠"); break;
		case 4 : System.out.println(year+"년생 쥐띠"); break;
		case 5 : System.out.println(year+"년생 소띠"); break;
		case 6 : System.out.println(year+"년생 호랑이띠"); break;
		case 7 : System.out.println(year+"년생 토끼띠"); break;
		case 8 : System.out.println(year+"년생 용띠"); break;
		case 9 : System.out.println(year+"년생 뱀띠"); break;
		case 10 : System.out.println(year+"년생 말띠"); break;
		default : System.out.println(year+"년생 양띠"); break;
		}
		
		
		
	}//main

}//class
