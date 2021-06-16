package day0127;

/**
 *Ŭ�������� ���� �̸��� method�� ������ ����� �ִ� overload�� ���.<br>
 *��Ģ) ���������ڿ� ��ȯ���� �޶� �ǰ�<br>
 *		method���� ���ƾ��ϰ�<br>
 *		�Ű������� �ݵ�� �޶�� �Ѵ�.<br>
 * @author user
 */
public class TestOverload {
	
	/**
	 * �� �Ѱ��� ����ϴ���.
	 */
	public void printStar() {
		System.out.println("��");
	}//printStar
	
	/**
	 * �Է¹��� ����� ���� ����ϴ� ��.
	 * method Overload(Overloading)
	 */
	public void printStar(int count) {
		for(int i=0; i<count;i++) {
			System.out.print("��");
		}
	}//printStar
	
	
	
	public static void main(String[] args) {
		TestOverload to = new TestOverload();
		to.printStar();//������.(��ȯ�� ����, �Ű����� ���� ��)
		to.printStar(2);//���� ��.(��ȯ�� ����, �Ű����� �ִ� ��)
		
		/*
		 * Overload�� printStar method�� ����Ͽ� �Ʒ��� ���� ���·� ���
		 *  ��
		 *  ����
		 *  ������
		 *  ��������
		 * */
		for(int i=0;i<5;i++) {
			to.printStar(i);
			System.out.println();
		}//end for
		
		
	}//main

}//class
