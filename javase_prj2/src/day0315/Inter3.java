package day0315;

/**
 * 인터페이스 안에는 상수와 추상메소드가 존재한다.<br>
 * FunctionalInterface annotation을 정의하면 abstract method 하나만 정의 할 수 있다.
 * @author SIST
 */
@FunctionalInterface //FunctionalInterface를 사용하면 추상메소드는 하나만 가질수있다.
public interface Inter3 {
	//반환형 있고, 매개변수 없는 형
	public String test();//abstract method
	
}//interface
