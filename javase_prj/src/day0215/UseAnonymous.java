package day0215;

/**
 * �͸�Ŭ������ ���.
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
		//��üȭ
		UseAnonymous ua = new UseAnonymous();
		//anonymous inner class�� ����Ͽ� methodȣ��.
		ua.useSuperInterA(new SuperInterA() {
			@Override
			public void methodA() {
				System.out.println("methodA");
				test();
			}//methodA
			//Ŭ������ �̸��� �����Ƿ� �����ڸ� ������ �� ����.
			
			//���ǵ� method�� anonymous inner class �ȿ����� ȣ��� �� �ִ�.
			public void test() {
				System.out.println("anonymous inner class���� ������ method");
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
