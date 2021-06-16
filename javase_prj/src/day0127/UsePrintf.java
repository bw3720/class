package day0127;

/**
 * Variable Arguments를 사용한  출력 method. 
 * @author user
 */
public class UsePrintf {

	public static void main(String[] args) {
//		System.out.format("%d\n",10);
//		System.out.printf("%d",10);
		
		System.out.printf("정수출력 %d\n",1);
		System.out.printf("문자출력 %c\n",'A');
		System.out.printf("실수출력 %f\n",0.023);
		System.out.printf("문자열출력 %s\n","오늘은 수요일 입니다.");
	
		//출력 자릿수 설정, %자릿수 문자 => 오른쪽에서부터 정렬
		System.out.printf("[%6d][%3d][%4d]\n",2021,1,27);
		System.out.printf("[%6c][%3c][%4c]\n",'A','B','C');
		
		//출력 자릿수 음수로 설정, %-자릿수 문자 => 왼쪽부터 정렬
		System.out.printf("[%-6d][%-3d][%-4d]\n",2021,1,27);
		System.out.printf("[%-6c][%-3c][%-4c]\n",'A','B','C');
		
		// .2f 는  전체 자릿수느 설정하지않고 소수점 이하 두자리만 출력.
		System.out.printf("[%-7.1f][%.2f]\n", 12.345, 2021.0127);
		System.out.printf("[%6s][%-5s]\n","자바","HTML");
		
		System.out.printf("%d %c %4d %s\n",12,'a',46,"오늘은 추워요");

		
		//오늘은 2021년 1월 27일 입니다.
		int year =2021,month =1, day=27;
		
		System.out.println("오늘은 "+year+"년 "+month+"월 "+day+"일 입니다.");
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.",year,month,day);
		
	}//main
 
}//class
