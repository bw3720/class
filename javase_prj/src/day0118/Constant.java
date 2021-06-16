package day0118;
/**
	Constant 사용(변수를 상수처럼 사용하기)<br>
	선언 (class field에만 선언 가능.)
	public static final 데이터형 상수명 = 값;<br>
	사용) <br>
	 상수명<br>
	 클래스명.상수명
*/ 
class  Constant{
	//class field
	public static final int MAX_SCORE = 100; // 프로그램 안에서 사용되는 기준값을 설정할 떄.
	public static final int MIN_SCORE = 0;

	public static void main(String[] args) {
		System.out.println("최고점 : "+MAX_SCORE); // 상수명
		System.out.println("최하점 : "+Constant.MIN_SCORE); //클래스명.상수명
		
		int myScore = 88;

		System.out.println("획득점수 : "+myScore); // 이름만으로도 상수인지 변수인지 분간 가능!!
		
		myScore = 90;
		//MAX_SCORE = 99; 상수는 선언한 문장위치 이외에는 절대 바꿀 수 없다.

		System.out.println("내 점수는 "+myScore+"점 이고, 최고 점수는 "+Constant.MAX_SCORE+
			"점 입니다. 최고점수와 내점수간의 차이는 "+ (MAX_SCORE-myScore)+"점 입니다.");
		
	} //main
} //class



