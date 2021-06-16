package day0122;
/**
 * 입력된 점수에 해당하는 학점구하기.
 * 90~100 : A
 * 80~89 : B
 * 70~79 : C
 * 60~69 : D
 * 0~59 : F
 * @author user
 */
public class TestSwitchCase3 {

	public static final int GRADE_A_PLUS = 10;
	public static final int GRADE_A = 9;
	public static final int GRADE_B = 8;
	public static final int GRADE_C = 7;
	public static final int GRADE_D = 6;
	
	public static void main(String[] args) {
//		int score = 89;
//		char grade = ' '; // \u0000 = 공백
//		//나누기를 사용하여 범위를 만들 수 있다. 99/10 = 9, 98/10=9
//		
//		switch(score/10) {
//			case GRADE_A_PLUS :  
//			case GRADE_A : grade = 'A';break;  
//			case GRADE_B : grade = 'B';break; 
//			case GRADE_C : grade = 'C';break; 
//			case GRADE_D : grade = 'D';break; 
//			default : grade = 'F';
//		}//end switch
//		System.out.println(score+"점은 "+grade+"학점");
	
		int score = 104;
		char grade = 64; 
		if(score>-1 && score <101) {
			switch(score/10) {
				case GRADE_D : grade++; 
				case GRADE_C : grade++; 
				case GRADE_B : grade++; 
				case GRADE_A :   
				case GRADE_A_PLUS : grade++;break;  
				default : grade+= 6;
			}//end switch
			System.out.println(score+"점은 "+grade+"학점");
		}else {
			System.out.println("잘못된 범위 입니다.");

		}//end if
		

	
	
	
	
	
	
	}//main

}//class
