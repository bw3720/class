package day0201;

public class UseHomework0201 {

	public static void main(String[] args) {
		Homework0201 hw = new Homework0201();//�����ڿ� �ֹι�ȣ�� �Է��Ͻô� �ſ���.
		hw.setPersonalId("951211-1064028");
		
		System.out.println(hw.getPersonalId());
		
		System.out.println(hw.method1()); //������ ���� method���� method�ȿ��� �����ϴ� Ư¡�� �� ã�Ƴ��� �ο��� ������. method1�� � ���� �ϴ� method���� �˼� �����ϴ�.
		System.out.println(hw.method2());
		System.out.println(hw.method3());
		System.out.println(hw.method4());
		System.out.println(hw.method5());
		System.out.println(hw.method6());
		
		System.out.println("--------------------------------------");
		
		if(hw.method1() == true) {
			if(hw.method2() == true) {
				
				System.out.println("�Է��ֹι�ȣ : "+hw.getPersonalId());
				System.out.println(hw.method3());
				System.out.println(hw.method4());
				System.out.println(hw.method5());
				System.out.println(hw.method6());
			}else {
				System.out.println("-�� �������� ��ġ�� �����ϴ�.");
			}
		}else {
			System.out.println("�ֹι�ȣ�� ���ڼ��� ���� �ʽ��ϴ�.");
		}//end else
		
	}//main

}//class
