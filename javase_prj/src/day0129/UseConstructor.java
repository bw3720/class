package day0129;

/**
 * 생성자의 사용.<br>
 * 개발자가 생성자를 하나도 정의하지 않으면 compiler가 기본 생성자를 정의해준다.
 * @author user
 */
public class UseConstructor {
	
	public UseConstructor() {
		System.out.println("기본생성자");
		test();//같은 영ㅇ역의 method호출
		//UseConstructor(10); //생성자는 method호출하는 문법으로 호출 할 수 없다.
	}//UseConstructor
	
	public UseConstructor(int i) {
		System.out.println("매개변수있는 생성자.");
	}//UseConstructor

	public void test() {
//		UseConstructor();
		System.out.println("method!!");
	}//test
	
	
	public static void main(String[] args) {
		//생성자는 객체화하여 호출 가능.
		new UseConstructor();
//		UseConstructor uc =new UseConstructor();
//		uc.test(); // 영역이 다르면 객체를 만들고 객체를 통해서 method를 호출.
		
	}//main

}//class
