package day0128;

/**
 * �����ü�� �����ϰ� ����ϴ� Ŭ����.
 * @author user
 */
public class UsePerson {

	public static void main(String[] args) {
		// 1. ��üȭ
		Person sangmin = new Person();
		// 2. �� �ֱ�
		sangmin.setEye(2);
		sangmin.setNose(1);
		sangmin.setMouth(1);
		sangmin.setName("�ѻ��");
		
		// 3. ȣ��
		System.out.printf("%s�� �󱼿��� �� %d��, �� %d��, �� %d���� �ִ�.\n"
							,sangmin.getName(),sangmin.getEye(),sangmin.getNose(),sangmin.getMouth());
		
		System.out.println(sangmin.eat());
		System.out.println(sangmin.eat("�ʹ�", 18000));
		
		System.out.println("------------------------------------");
		
		Person jinban = new Person();
		
		jinban.setEye(3);
		jinban.setNose(1);
		jinban.setMouth(1);
		jinban.setName("õ����");
		
		System.out.printf("�̸� %s, �� %d, �� %d, �� %d\n"
				,jinban.getName(),jinban.getEye(),jinban.getNose(),jinban.getMouth());
		
		System.out.println(jinban.eat());
		System.out.println(jinban.eat("����", 100000));
		System.out.println("------------------------------------");
		
	}//main

}//class
