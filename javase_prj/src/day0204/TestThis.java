package day0204;

/**
 * thisī���� ������ ���.
 * @author user
 */
public class TestThis {
	private int i;
	
	public void useInstance(TestThis tt) {
		//�ּҸ� ��� �ҷ��� �ּҸ� ���� �޾ƾ� �Ѵ�.
		System.out.println("method�� ȣ���� ��ü�� �ּ� :"+ tt);
		
	}//useInstance

	/**
	 * stack�� ������� heap�� �������� ���ٸ� stack�� �ִ� ������ ����Ѵ�.<br>
	 * ���� �̸��� heap ������ ����ҷ��� heap�� �ּҸ� �޾ƾ��Ѵ�. heap memory address => instance => ��ü .<br>
	 * @param i
	 */
	public void useInstanceVariable(int i,TestThis tt) {
		tt.i=i; // heap�� �����ϴ� i������ stack�� �����ϴ� i�������� �Ҵ�.
		System.out.println(i);
	}//useInstanceVariable
	
	/**
	 * parameter��� instance�������� ���� ������ instance������ parameter�� �ĺ��ϱ�����
	 * �ν��Ͻ��� �ּҸ� �־���ϴµ� �ν��Ͻ� �ּҸ� �����ʰ� this�� ����ϸ� method��
	 * ȣ���ϴ� ��ü�� �ּҷ� ����ȴ�
	 * @param i
	 */
	public void useInstanceVariable(int i) {
		this.i=i; // heap�� �����ϴ� i������ stack�� �����ϴ� i�������� �Ҵ�.
		System.out.println(i);
		System.out.println(this);
	}//useInstanceVariable
	
	
	public static void main(String[] args) {
		TestThis tt1=new TestThis();
		TestThis tt2=new TestThis();
		
		System.out.println("tt1 instance�� �ּ� : "+tt1);
		System.out.println("tt2 instance�� �ּ� : "+tt2);
		System.out.println("--------------------��ü�ּ�-----------------------------");
		tt1.useInstance(tt1);
		tt2.useInstance(tt2);
		System.out.println("--------------------��,��ü�ּ�-----------------------------");
		
		tt1.useInstanceVariable(100,tt1);
		tt2.useInstanceVariable(200,tt2);
		System.out.println(tt1.i);
		System.out.println("--------------------this�� ���-----------------------------");
		tt1.useInstanceVariable(1000);
		
//		System.out.println(this); //static���������� ȣ���ϴ� ��ü�� ������ �������� �ʱ� ������
		//this�� ����� �� ����.
		
		
		
	}//main

}//class
