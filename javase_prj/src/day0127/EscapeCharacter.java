package day0127;

/**
 *특수문자 : 문자열안에 정의하며 \로 시작하는 기능을 가진 문자. 
 * @author user
 */
public class EscapeCharacter {

	public static void main(String[] args) {
		//줄변경 \n : windows는 \r, \n이 사용된다.
		System.out.println("java\nOracle");
		//tab key : \t
		System.out.println("java\tOracle");
		System.out.println("오늘은\t수요일");
		System.out.println("쌍용교육\t4강\t수업");
		// " " 붙여서 출력 : \"
		System.out.println("오늘은\"수요일\"입니다");
		// ' ' 붙여서 출력 : \'  -- 사실 잘 안씀 문자열과 충돌 X
		System.out.println("오늘은'수요일'입니다");
		// \를 출력할때 : \\
		System.out.println("c:\\new\\test\\temp.txt");
		// backspasce : \b
		System.out.println("안녕\b");
		System.out.println("안녕\f");
	}//main

}//class
