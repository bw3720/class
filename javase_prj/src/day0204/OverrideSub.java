package day0204;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Method Override(Overriding) ����.
 * Override : �θ�Ŭ������ method�� �ڽ�Ŭ������ ��Ȳ�� �����ʴ´ٸ�, �ڽ�Ŭ�������� �θ�Ŭ������
 * 			  method�� ������ method�� �����Ͽ� ����ϴ� ��.
 * @author user
 */
public class OverrideSub extends OverrideSuper{
	@Override
	public String toString() {//�θ𿡼� �����ϴ� ����� �ڽİ� ���� �ʴ´ٸ� �ڽ�Ŭ�������� method�� ������.
		return "�ּҰ� �Ⱦ��!";
	}//toString
	
//	public void superMethod() { //��ȯ���� �ٸ��� Override ��Ģ�� ����ǹǷ� �����߻�
//		System.out.println("�ڽ�Ŭ�������� �������̵�~~!!!");
//		return "";
//	}//superMethod
	
//	@Override
//	public void superMethod(int i) { //�Ű������� �����ϸ� methodȣ���� �ٸ��� �Ǳ� ������ Override��
//		//�������� �ʴ´�.
//		System.out.println("�ڽ�Ŭ�������� �������̵�~~!!!");
//	}//superMethod

	@Override
	public void superMethod1() {//Override�� method���� ���������ڴ� ������ ���� �����ڷ� 
		//���氡��. �θ� : protected -> �ڽ� : public ���� = (X)
		System.out.println("�ڽ� Ŭ�������� ��ȯ!!");
	}//protected void superMethod1	
	
	/**
	 * ����õ method 
	 */
	@Deprecated
	public void test() {
		System.out.println("HDD");//Hard Disk Drive -> �Ĵ���
	}//test
		
//	@SuppressWarnings("unused") //method�� ��ü ����.
//	@SuppressWarnings({ "rawtypes", "unused" })
	@SuppressWarnings({ "unused" , "rawtypes" })
	public void temp() {
		
//		@SuppressWarnings("unused") //�ٷ� �Ʒ����� �ڵ常 ����.
		int i=0;
		int j=0;
		
		List list = new ArrayList();
		
	}//temp
	
	
	
	public static void main(String[] args) {
		OverrideSub os = new OverrideSub();
		System.out.println("------------Object class�� toString() Override------------");
		System.out.println(os.toString());//ObjectŬ�������� �����ϴ� toString()�� ȣ�� => �ּ�
		//System.out.println()�� instance�� �־� ����ϸ� �׾ȿ��� toString()�� ȣ��Ǿ� �ּҰ� ��µȴ�.
		System.out.println(os);
		
		os.superMethod();
		os.superMethod1();
		System.out.println("---------------------------------------------------------");
		
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getYear());
		
		os.test();
		
		
		
		
		
		
	}//main

}//class
