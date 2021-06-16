package day0118;
/**
	다른 클래스에 존재하는 상수를 사용.
*/

class UseConstant {
	public static void main(String[] args) {
	
		//System.out.println(MAX_SCORE);
		//외부 클래스에서 상수를 사용할 때에는 "클래스명.상수명"의 형식으로만 사용가능.
		System.out.println(Constant.MAX_SCORE+"점 입니다.");
		
		
		//Java.lang package에서 제공하는 Wrapper class의 상수를 사용.
		System.out.println("Byte의 최소값 : "+ Byte.MIN_VALUE+", 최대값 : "+ Byte.MAX_VALUE);

		byte b1 = 10;
		byte b2 = 20;
		int result = b1 + b2; // 연산의 결과가 4byte로 발생 Error 
		
		System.out.println(b1 + "+" + b2 + "=" + result);
	
	}//main
}//class
