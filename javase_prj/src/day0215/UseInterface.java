package day0215;

/**
 * 인터페이스를 사용하기 위한 클래스.
 * 인터페이스는 클래스가 구현(implements)하여 사용할 수 있다.(객체다형성)
 * @author user
 */
public class UseInterface implements TestInter{
	
	//구현 인터페이스의 추상 method를 반드시 override해야한다.
	@Override
	public void methodA() {
		System.out.println("methodA");
	}//methodA

	@Override
	public void methodB() {
		System.out.println("(광의의 접근지정자로)접근지정자는 달라도 됨 반환형, method명, 매개변수는 같게 만든다.");
	}//methodB
	
	//@Override
	//public void methodC(int i) {
	//	System.out.println("default method의 Override : "+i);
	//}//methodC Override
	public static void main(String[] args) {
		//인터페이스는 직접 객체화를 할 수 없다.
//		TestInter ti =new TestInter();
		//구현 클래스의 주소를 저장할 수 있다.(객체다형성)
		
		TestInter ti =new UseInterface(); //주소는 받을 수 있다.
		
		System.out.println(ti);
		ti.methodA();//구현클래스의 method가 호출 된다.(인터페이스의 추상 method가 호출되는것이 아니다.)
		ti.methodB();//구현클래스의 method가 호출 된다.(인터페이스의 추상 method가 호출되는것이 아니다.)
		ti.methodC(2021);//default method의 호출
		
		
		
		
		
		
	
	
	
	
	
	}//main


}//class
