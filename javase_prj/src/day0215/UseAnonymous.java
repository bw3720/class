package day0215;

/**
 * 익명클래스의 사용.
 * 
 * @author user
 */
public class UseAnonymous {

	public void useSuperInterA(SuperInterA sia) {
		sia.methodA();
	}//useSuperInterA
	
	public void useSuperInterB(SuperInterB sib) {
		sib.methodA();
		sib.methodB();
	}//useSuperInterB
	
	
	public static void main(String[] args) {
		//객체화
		UseAnonymous ua = new UseAnonymous();
		//anonymous inner class를 사용하여 method호출.
		ua.useSuperInterA(new SuperInterA() {
			@Override
			public void methodA() {
				System.out.println("methodA");
				test();
			}//methodA
			//클래스가 이름이 없으므로 생성자를 정의할 수 없다.
			
			//정의된 method는 anonymous inner class 안에서만 호출될 수 있다.
			public void test() {
				System.out.println("anonymous inner class에서 정의한 method");
			}//test
		});
	
		ua.useSuperInterB(new SuperInterB() {
			@Override
			public void methodA() {
				System.out.println("methodA");
			}//methodA
			
			@Override
			public void methodB() {
				System.out.println("methodB");
			}//methodB

		});
	
		
	
	}//main

}//class
