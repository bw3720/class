package day0127;

/**
 *Ư������ : ���ڿ��ȿ� �����ϸ� \�� �����ϴ� ����� ���� ����. 
 * @author user
 */
public class EscapeCharacter {

	public static void main(String[] args) {
		//�ٺ��� \n : windows�� \r, \n�� ���ȴ�.
		System.out.println("java\nOracle");
		//tab key : \t
		System.out.println("java\tOracle");
		System.out.println("������\t������");
		System.out.println("�ֿ뱳��\t4��\t����");
		// " " �ٿ��� ��� : \"
		System.out.println("������\"������\"�Դϴ�");
		// ' ' �ٿ��� ��� : \'  -- ��� �� �Ⱦ� ���ڿ��� �浹 X
		System.out.println("������'������'�Դϴ�");
		// \�� ����Ҷ� : \\
		System.out.println("c:\\new\\test\\temp.txt");
		// backspasce : \b
		System.out.println("�ȳ�\b");
		System.out.println("�ȳ�\f");
	}//main

}//class
