package day0217;

/**
 * Math class<br>
 *  생성자가 존재하지않아(존재하지만 보이지않아...) 객체 생성을 하지 않고 사용하는 클래스.
 * @author user
 */
public class UseMath {
	
	public UseMath() {
		//Math m = new Math(); //생성자가 없으므로 객체 생성할 수 없다.
		int i = -2021;
		double d = -2021.02;
		
		System.out.println(i+"의 절대값 : "+Math.abs(i));
		System.out.println(d+"의 절대값 : "+Math.abs(d));
		
		d=10.1;
		System.out.println(d+"올림"+Math.ceil(d));
		d=10.001;
		System.out.println(d+"올림"+Math.ceil(d));
		d=10.0;
		System.out.println(d+"올림"+Math.ceil(d));
		
		d=10.9;
		System.out.println(d+"반올림"+Math.round(d));
		d=10.45;
		System.out.println(d+"반올림"+Math.round(d));

		d=10.9;
		System.out.println(d+"내림"+Math.floor(d));
		
		//절삭. casting으로 처리
		System.out.println(d+"절사 : "+(int)d);
		
		System.out.println(Math.random());
		
		double ran = Math.random();
		System.out.println("발생한 난수 : "+ran);
		System.out.println("발생한 난수 : "+ran*10);// 0~9까지의 10개의 수중 하나 얻기 (실수 발생)
		System.out.println("범위의 난수 : "+(int)(ran*10)); 
		
		//1~10까지의 수중 난수.
		System.out.println("난수 : "+((int)(ran*10)+1));
	
		//A~Z까지 아무 문자나 얻기.
		//A =65, Z=90
		System.out.println("랜덤 댜문자 문자 : "+(char)((int)(ran*26)+65));
		//a~z까지 아무 문자 얻기.
		System.out.println("랜덤 소문자 문자 : "+(char)((int)(ran*26)+97));
		//0~9까지 아무 문자
		System.out.println("랜덤 숫자 문자 : "+(char)((int)(ran*10)+48));
	}//UseMath
	

	public static void main(String[] args) {
		new UseMath();
	}//main

}//class
