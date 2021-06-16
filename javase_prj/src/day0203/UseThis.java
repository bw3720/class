package day0203;

/**
 * this 키워드 method형식으로 사용.<br> 
 * this(값,,,,)<br>
 * 생성자의 첫번째 줄에서만 사용 가능.<br>
 * 클래스안의 다른 생성자 호출 용.
 * @author user
 */
public class UseThis {
	
	public UseThis() {
		//this(100);
		System.out.println("기본생성자(Default Constructor)");
	}//UseThis
		
	public UseThis(int i) {
		this();//
		System.out.println("OverLoad된 생성자");
	}//UseThis

	
	
	
	
	public static void main(String[] args) {
		//new UseThis();
		new UseThis(2021);//
		
		
	}//main

}//class
