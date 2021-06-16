package day0209;

/**
 * 부모클래스 -> 모든자식클래스가 사용할 공통 특징 정의.
 * @author user
 */
public class Parent {
	String name;
	int age;
	
	//final 접근지정자가 사용되면 자식클래스에서  override 할 수 없다.
	public void printName() {
		System.out.println("이름 : "+name);
	}//name
	
	public void printAge() {
		System.out.println("나이 : "+age);
	}//age
	
	
}//class
