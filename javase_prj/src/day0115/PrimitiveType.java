package day0115;
/**
기본형 데이터형의 사용.
기본형데이터형을 사용하여 선언한 변수는 상수 값을 저장
*/
class PrimitiveType {
	public static void main(String[] args) {
		////////////////////////정수형////////////////////////////////////
		byte a = 10;
		short b = 20;
		int c = 30;
		long d = 40; 
		long e = 300000000000000000l;
		// 대문자나 소문자나 상관없음 L or l ------ 정수 literal의 크기는 4byte이므로 int의 범위를 초과하는 상수 값을 기술할수 없다.
		System.out.println("byte : "+a+", short : "+b+", int : "+c+", long : "+d+", long : "+e);

		////////////////////////문자형/////////////////////////////////////
		char f = 65; //코드값 입력
		char g = 48;
		char h = '가';
		//char를 출력하면 코드값에 대한 문자를 출력
		System.out.println("char : "+f+","+g+","+h);


		////////////////////////실수형/////////////////////////////////////
		float i = 3.14f; // float는 4byte, 3.14(소수)는 8byte이다. 고로 둘을 맞추기 위해 뒤에 반드시 F or f를 붙인다.
		double j = 3.14; // 생략 가능 
		double k = 3.14D;
		
		System.out.println("float : "+i+", double : "+j+","+k);

		////////////////////////불린형/////////////////////////////////////
		boolean l = true;
		boolean m = false;
		System.out.println("boolean : "+l+","+m);


 	}//main
}//class
