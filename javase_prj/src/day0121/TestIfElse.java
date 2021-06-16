package day0121;

/**
 * 	if~else<br>
 *	둘 중 하나의 코드를 실행해야할 때 사용.<br>
 * 	문법)<br> 
 * 	if(조건식){<br>
 * 		조건에 맞을 때 수행할 문장들,,<br>
 *	 }esle{<br>
 * 		조건에 맞 않을 때 수행할 문장들 ,,,<br>
 *	}
 * @author user
 *
 */
public class TestIfElse {

	public static void main(String[] args) {
		//수를 입력받아 입력받은 수를 출력한 후 홀수인지 짝수인지를 출력.	
		int num = Integer.parseInt(args[0]);//값을 입력받아 수로 변환
		System.out.print(num+"은(는)");
		
		if(num % 2 == 0) {
			System.out.print("짝수");
		}else {
			System.out.print("홀수");
		}//end else
		
		System.out.println();
		
		//수가 양수인지 음수인지를 출력하느 코드.
		System.out.print(num+"은(는)");
		if(num > -1) {
			System.out.println("양수");
		}else {
			System.out.println("음수");
		}//end else
	
		
		//args[1]의 값을 받아서 int형의 score변수에 저장하고 점수가 0~100사이라면 "유효점수"를 출력하고
		//그렇지 않다면 "무효점수"를 출력하세요.
		int score = Integer.parseInt(args[1]); //경곗값 테스트
		System.out.println(score+"점");
		
		//if(score >=0 && score <= 100) {
		if(score > -1 && score < 101) {
			System.out.println("유효점수");
		}else {
			System.out.println("무효점수");
		}//end else
		
	
		
	}//main

}//class
