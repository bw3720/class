package day0129;

/**
 * ���ڿ�(String)�� �ּҸ� �����ϰ� ����� �� �ִ� java.lang.String Ŭ������ ���.<br>
 * ���ڿ� ����ҿ� ���� ���ڿ��� �ϳ��� �����ǰ� ����Ѵ�.
 * @author user
 */
public class UseString {

	public static void main(String[] args) {
		//�⺻�� ���� (new�� ��������ʰ� java.lang.StringŬ������ ���)
		String str ="Abcdef";
		System.out.println(str);
		System.out.println("�⺻�� ���� ==�� "+(str =="Abcdef")); // �⺻�� ������ ����� == �� ����
		System.out.println("�⺻�� ���� equals�� "+str.equals("Abcdef")); // �⺻�� ������ ����� == �� ����
		
		//������ ���� (new�� ����Ͽ� java.lang.StringŬ������ ���)
		String str1=new String("Abcdef");
		System.out.println(str1);
		System.out.println("������ ���� ==�� "+(str1 =="Abcdef")); // ������ ������ ����� ==�� �Ұ���
		System.out.println("������ ���� equals�� "+str1.equals("Abcdef")); // ������ ������ ����� ==�� �Ұ���
		
		
	}//main

}//class
