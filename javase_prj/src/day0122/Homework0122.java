package day0122;

public class Homework0122 {
	public static final int BUS_COST =1200;
	public static final int METRO_COST =1300;
	public static final int TAXI_COST =3800;
	
	public static void main(String[] args) {
	//���� 1��
		int oneway = 0;//���� �ʱ�ȭ
		int addCost = 0;//���� �ʱ�ȭ
		
		int distance = 20;//�̵��Ÿ�
		if(args[0].equals("����")) {
			oneway = BUS_COST;
		}else if(args[0].equals("����ö")) {
			oneway = METRO_COST;;
		}else if(args[0].equals("�ý�")) {
			oneway = TAXI_COST;
		}else {
			System.out.println("�Է��Ͻ� ��������� ���߱����� �ƴմϴ�.");
		}
		
		if(distance > 10) {
			addCost = (distance-10)/5*100;
		}else {
			
		}
		System.out.println("�Է� ��������� "+args[0]+"�̰�, �⺻����� " + oneway+"�� �Դϴ�."
				+"�̵��Ÿ��� "+(distance)+"km �̰�, �� ����� "+(oneway+addCost)+"�� �Դϴ�.");
	
	
		//���� 2��
		
		for(int i=1;i<101;i++) {
			if(i % 3 ==0) {
				System.out.print("¦ ");
			}else {
				System.out.print(i+" ");
			}//end if
		}//end for
	
	
	
	
	
	
	
	
	}//main

}//class
