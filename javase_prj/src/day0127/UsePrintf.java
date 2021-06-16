package day0127;

/**
 * Variable Arguments�� �����  ��� method. 
 * @author user
 */
public class UsePrintf {

	public static void main(String[] args) {
//		System.out.format("%d\n",10);
//		System.out.printf("%d",10);
		
		System.out.printf("������� %d\n",1);
		System.out.printf("������� %c\n",'A');
		System.out.printf("�Ǽ���� %f\n",0.023);
		System.out.printf("���ڿ���� %s\n","������ ������ �Դϴ�.");
	
		//��� �ڸ��� ����, %�ڸ��� ���� => �����ʿ������� ����
		System.out.printf("[%6d][%3d][%4d]\n",2021,1,27);
		System.out.printf("[%6c][%3c][%4c]\n",'A','B','C');
		
		//��� �ڸ��� ������ ����, %-�ڸ��� ���� => ���ʺ��� ����
		System.out.printf("[%-6d][%-3d][%-4d]\n",2021,1,27);
		System.out.printf("[%-6c][%-3c][%-4c]\n",'A','B','C');
		
		// .2f ��  ��ü �ڸ����� ���������ʰ� �Ҽ��� ���� ���ڸ��� ���.
		System.out.printf("[%-7.1f][%.2f]\n", 12.345, 2021.0127);
		System.out.printf("[%6s][%-5s]\n","�ڹ�","HTML");
		
		System.out.printf("%d %c %4d %s\n",12,'a',46,"������ �߿���");

		
		//������ 2021�� 1�� 27�� �Դϴ�.
		int year =2021,month =1, day=27;
		
		System.out.println("������ "+year+"�� "+month+"�� "+day+"�� �Դϴ�.");
		System.out.printf("������ %d�� %d�� %d�� �Դϴ�.",year,month,day);
		
	}//main
 
}//class
