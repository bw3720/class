package day0203;

/**
 * this Ű���� method�������� ���.<br> 
 * this(��,,,,)<br>
 * �������� ù��° �ٿ����� ��� ����.<br>
 * Ŭ�������� �ٸ� ������ ȣ�� ��.
 * @author user
 */
public class UseThis {
	
	public UseThis() {
		//this(100);
		System.out.println("�⺻������(Default Constructor)");
	}//UseThis
		
	public UseThis(int i) {
		this();//
		System.out.println("OverLoad�� ������");
	}//UseThis

	
	
	
	
	public static void main(String[] args) {
		//new UseThis();
		new UseThis(2021);//
		
		
	}//main

}//class
