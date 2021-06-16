package day0121;
/**
 * 이클래스는 외부 입력값인 Arguments를 사용하기위한 클래스입니다. 
 * arguments의 입력은 "java 패키지명.클래스명 값 값 값 값" 입력한다.
 * @author 한상민
 * */
public class UseArguments {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		//문자열은 연산이 되지 않는다.
		System.out.println(  args[0] + args[1] );
		
		//문자열을 정수로 변환한 후
		int num1= Integer.parseInt(args[0]);
		int num2= Integer.parseInt(args[1]);
		//연산을 수행할 수 있다.
		System.out.println( num1 + num2 );
	}//main

}//class
