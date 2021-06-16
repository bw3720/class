package day0209;

/**
 * �߻�Ŭ������ �ڽ�Ŭ����.
 * �ݵ�� �θ�Ŭ������ abstract method�� ��� �����ؾ��Ѵ�.
 * @author user
 */
public class AbstractSub extends AbstractSuper{

	public AbstractSub() {
		System.out.println("�ڽ�Ŭ������ ������");
	}//AbstractSub
	
	//abstract method ���� (override)
	@Override
	public void typeA() {
		System.out.println("���� �� : ��ȯ�� �ְ� �Ű����� �ִ� ��.");
	}//typeA
	
	@Override
	public void typeB(String msg) {
		//instanceMethod();//�θ�Ŭ������ �Ϲ� method
		typeA();// �߻� method�� ���� ȣ���� �� ����.
		System.out.println("���� �� : ��ȯ�� ����, �Ű����� �ִ� ��.");
	}//typeB
	
	@Override
	public int typeC() {//���� �� : ��ȯ�� �ְ�, �Ű����� ���� ��.
		return 0;
	}//typeC

	@Override
	public int typeD(String m) {//���� �� : ��ȯ�� �ְ�, �Ű����� �ִ� ��.
		return m.length();
	}//typeD
	
	
	
	
	public static void main(String[] args) {
//		new AbstractSuper(); // ���� ��üȭ �� �� ����.
		//�ڽ�Ŭ������ ��üȭ ���� ������ ��ü�� �����ȴ�.
		AbstractSub as = new AbstractSub(); // �ڽ��� �����ϸ� �߻�Ŭ������ �θ�Ŭ������ �����ȴ�.
		as.typeB("���� ��");
	
	}//main

}//class
