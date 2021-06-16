package day0126;

/**
 * method 작성기준. <br>
 * - method를 만들 때 instance variable를 사용하여 일처리를 하는 경우.
 *	=>instance method를 작성<br>
 *
 * - method를 만들 때 instance variable를 사용하지않고 일처리를 하는 경우.
 *	=>static method를 작성<br>
 * @author user
 */
public class UseMethod {
	int i; //instance variable
	
	/**
	 * instance method
	 */
	public void instanceMethod() {
		System.out.println("instance method : i를 사용 "+i);
	}//instanceMethod
	
	/**
	 * static method
	 */
	public static void staticMethod() {
		System.out.println("static method : i를 사용불가 ");
	}//static Method
	
	
	public static void main(String[] args) {
		//<instance method의 호출.>//
//		instanceMethod();//직접 호출 불가. 쓰여지는 영역이 다름
		//1.객체화 : 클래스명 객체명=new 클래스명();
		UseMethod um = new UseMethod();
		//2.instance method 호출
		um.instanceMethod();
	
		
		
//		um.staticMethod(); //static method는 특정객체에 속한 method가 아니므로 
		//객체명.method의 형식으로 사용하지 않는다.
		
		//<static method의 호출 : 객체화 없이 클래스명.method명으로 호출
		UseMethod.staticMethod();
		
		
		
		
		
	}//main

}//class
