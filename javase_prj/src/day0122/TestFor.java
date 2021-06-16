package day0122;

/**
 * 반복문 : 특정코드를 여러번 실행시키는 문장.<br>
 * for : 시작과 끝을 알 때 사용하는 반복문.<br>
 * 문법)<br>
 * 		for(초기값;조선식;증감식){<br>
 * 			반복수행문장들;<br>
 * 		}		
 * @author user
 */
public class TestFor {

	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			System.out.println("안녕하세요?" + i);
		}//end for
		
		//1~100까지 1씩 증가하는 수를 옆으로 출력
		for (int i=1; i<101; i++) {
			System.out.print(i + " ");
		}//end for
		
		System.out.println();
		
		//100~1까지 1씩 감소하는 수를 옆으로 출력
		for (int i=100; i>0; i--) {
			System.out.print(i + " ");
		}//end for
		
		System.out.println();
		//1~100까지 홀수만 출력 옆으로 출력
		int count=0; 
		for (int i=1; i<101; i+=2) {
			count++;
			System.out.print(i+" ");
		}//end for
		System.out.println();
		System.out.print("반복횟수 :"+count);
		System.out.println();
		System.out.println();
		
		
		//1~9까지 1씩 증가하는 for
		for(int i=1; i<10; i++ ) {
			System.out.println("2 * "+i+" = "+(2*i));
		}//end for
		System.out.println();

	
		//대문자 A~Z까지 출력.
		for(char i=65; i<='Z'; i++ ) {
			System.out.print(i+" ");
		}//end for
		System.out.println();
		
		//1~65535 사이의 숫자, 영문자 대문자, 영문자 소문자를 출력
		for(int i = 1; i < 65536; i++) {
			if((i>47 && i<58) || (i >64 && i<91) || (i>96 && i < 123)) {
				System.out.print((char)i+" ");
			}//end if
		}//end for
		System.out.println();
		
		//1~100까지의 합 출력. 1+2+3+....+100 = 5050 
		int sum = 0; //누적합
		for(int i=1; i<101 ;i++) {
			sum=+i;
		}
		System.out.println("1~100까지의 합 : "+sum);
		System.out.println();
		
			
	}//main

}//class
