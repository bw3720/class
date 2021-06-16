package day0215;

/**
 * 구현하는 인터페이스가 상속관계를 가지고 있을 때, 구현 클래스에서는 모든 abstract method를 Override해야한다.
 * @author user
 */
public class SubClassD implements SuperInterC{
	@Override
	public void methodA() {// SuperInterA의 abstract method
	}//methodA
	
	@Override
	public void methodB() {// SuperInterB의 abstract method
	}//methodB
	
	@Override
	public void methodB1() {// SuperInterB1의 abstract method
	}//methodB1

	@Override
	public void methodC() {// SuperInterC의 abstract method
	}//methodC
}//class
