package day0217;

/**
 * Math class<br>
 *  �����ڰ� ���������ʾ�(���������� �������ʾ�...) ��ü ������ ���� �ʰ� ����ϴ� Ŭ����.
 * @author user
 */
public class UseMath {
	
	public UseMath() {
		//Math m = new Math(); //�����ڰ� �����Ƿ� ��ü ������ �� ����.
		int i = -2021;
		double d = -2021.02;
		
		System.out.println(i+"�� ���밪 : "+Math.abs(i));
		System.out.println(d+"�� ���밪 : "+Math.abs(d));
		
		d=10.1;
		System.out.println(d+"�ø�"+Math.ceil(d));
		d=10.001;
		System.out.println(d+"�ø�"+Math.ceil(d));
		d=10.0;
		System.out.println(d+"�ø�"+Math.ceil(d));
		
		d=10.9;
		System.out.println(d+"�ݿø�"+Math.round(d));
		d=10.45;
		System.out.println(d+"�ݿø�"+Math.round(d));

		d=10.9;
		System.out.println(d+"����"+Math.floor(d));
		
		//����. casting���� ó��
		System.out.println(d+"���� : "+(int)d);
		
		System.out.println(Math.random());
		
		double ran = Math.random();
		System.out.println("�߻��� ���� : "+ran);
		System.out.println("�߻��� ���� : "+ran*10);// 0~9������ 10���� ���� �ϳ� ��� (�Ǽ� �߻�)
		System.out.println("������ ���� : "+(int)(ran*10)); 
		
		//1~10������ ���� ����.
		System.out.println("���� : "+((int)(ran*10)+1));
	
		//A~Z���� �ƹ� ���ڳ� ���.
		//A =65, Z=90
		System.out.println("���� ������ ���� : "+(char)((int)(ran*26)+65));
		//a~z���� �ƹ� ���� ���.
		System.out.println("���� �ҹ��� ���� : "+(char)((int)(ran*26)+97));
		//0~9���� �ƹ� ����
		System.out.println("���� ���� ���� : "+(char)((int)(ran*10)+48));
	}//UseMath
	

	public static void main(String[] args) {
		new UseMath();
	}//main

}//class
