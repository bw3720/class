package day0122;

/**
 *switch~case�� break ���<br>
 *break�� ������ switch���� ���� ������.
 * @author user
 */
public class TestSwitchCase2 {

	public static void main(String[] args) {

		int i=2;
		switch(i) {
			case 0 : System.out.println("��"); break;
			case 1 : System.out.println("��"); 
			case 2 : System.out.println("��"); break;
			case 3 : System.out.println("��"); break;
			default : System.out.println("����"); //break;
		}//end switch
		
		//break; => break�� switch~case, while, do~while�ȿ����� ����� �� �ִ�.	
		
		System.out.println("------------------------------------------");
		int year = 1995;
		
		switch (year % 12) {//�츦 ���Ϸ��� �¾�ظ� 12�� ���� ������ ��� .0~11������ �� �߻�.
		case 0 : System.out.println(year+"��� �����̶�"); break;
		case 1 : System.out.println(year+"��� �߶�"); break;
		case 2 : System.out.println(year+"��� ����"); break;
		case 3 : System.out.println(year+"��� ������"); break;
		case 4 : System.out.println(year+"��� ���"); break;
		case 5 : System.out.println(year+"��� �Ҷ�"); break;
		case 6 : System.out.println(year+"��� ȣ���̶�"); break;
		case 7 : System.out.println(year+"��� �䳢��"); break;
		case 8 : System.out.println(year+"��� ���"); break;
		case 9 : System.out.println(year+"��� ���"); break;
		case 10 : System.out.println(year+"��� ����"); break;
		default : System.out.println(year+"��� ���"); break;
		}
		
		
		
	}//main

}//class
