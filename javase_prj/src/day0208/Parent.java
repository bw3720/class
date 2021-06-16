package day0208;

/**
 * 부모 클래스
 * @author user
 */
public class Parent {
	public Parent() {
		this(100);
		System.out.println("부모의 기본생성자");
	}//Parent
	
	public Parent(int i ) {
		super();
		System.out.println("부모의 인자 생성자"+i);
	}//Parent
	
	
}//class
