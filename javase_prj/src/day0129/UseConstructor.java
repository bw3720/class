package day0129;

/**
 * �������� ���.<br>
 * �����ڰ� �����ڸ� �ϳ��� �������� ������ compiler�� �⺻ �����ڸ� �������ش�.
 * @author user
 */
public class UseConstructor {
	
	public UseConstructor() {
		System.out.println("�⺻������");
		test();//���� �������� methodȣ��
		//UseConstructor(10); //�����ڴ� methodȣ���ϴ� �������� ȣ�� �� �� ����.
	}//UseConstructor
	
	public UseConstructor(int i) {
		System.out.println("�Ű������ִ� ������.");
	}//UseConstructor

	public void test() {
//		UseConstructor();
		System.out.println("method!!");
	}//test
	
	
	public static void main(String[] args) {
		//�����ڴ� ��üȭ�Ͽ� ȣ�� ����.
		new UseConstructor();
//		UseConstructor uc =new UseConstructor();
//		uc.test(); // ������ �ٸ��� ��ü�� ����� ��ü�� ���ؼ� method�� ȣ��.
		
	}//main

}//class
