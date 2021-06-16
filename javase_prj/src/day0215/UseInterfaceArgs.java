package day0215;

/**
 * 
 * @author user
 *
 */
public class UseInterfaceArgs {

	public void UseFly(Fly fly) {//interface�� �Ű������� ����
		System.out.println(fly.drivingForce());
		System.out.println(fly.upwardForce());
	}//UseFly
	
	public static void main(String[] args) {
		//useFly method�� ȣ��.(interface�� ��ü�� ���� => ����Ŭ������ ����.)
		//1.�������̽��� ������ Ŭ������ �����Ѵ�. (FlyImpl����)
		FlyImpl fly = new FlyImpl();
		
		//2.�ν��Ͻ� method�� ȣ���ϱ� ���� ��ü�� ����
		UseInterfaceArgs uia =new UseInterfaceArgs();
		
		//3.method�� ȣ���ϰ�, Fly�� ���� ��ü�� arguments�� �Ҵ�.
		uia.UseFly(fly);
	}//main

}//class
