package day0125;
/**
 * 
 *
 * @author user
 */
public class TestWhile {

	public static void main(String[] args) {
		int i = 0;
		while(i < 10){
			System.out.println("안녕하세요?  i = "+i);
			i++;
		}//end while
		
		/////////단을 입력받아 단이 2단에서 9단 사이일 때에만 입력받은 단으로 구구단을 출력///////// 
		 
		int j =Integer.parseInt(args[0]); // 단수
		
		if(j>1 && j<10) {
			i=1;
			while(i < 10) { // 1은 10보다 항상 작습니다.
				System.out.println(j+"X"+i+"="+i*j);
				i++;
			}//end while
				
		}//end if
		
		///////////while의 무한 loop////////////
		while(true) {
			System.out.println("무한루프");
			break;//break가 설정되면 실행 후 반복문을 빠져나간다.
		}//end while
		System.out.println("==========");
		
		
		
		
	}//main

}//class
