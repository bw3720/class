package day0122;

/**
 * �ݺ��� : Ư���ڵ带 ������ �����Ű�� ����.<br>
 * for : ���۰� ���� �� �� ����ϴ� �ݺ���.<br>
 * ����)<br>
 * 		for(�ʱⰪ;������;������){<br>
 * 			�ݺ����๮���;<br>
 * 		}		
 * @author user
 */
public class TestFor {

	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			System.out.println("�ȳ��ϼ���?" + i);
		}//end for
		
		//1~100���� 1�� �����ϴ� ���� ������ ���
		for (int i=1; i<101; i++) {
			System.out.print(i + " ");
		}//end for
		
		System.out.println();
		
		//100~1���� 1�� �����ϴ� ���� ������ ���
		for (int i=100; i>0; i--) {
			System.out.print(i + " ");
		}//end for
		
		System.out.println();
		//1~100���� Ȧ���� ��� ������ ���
		int count=0; 
		for (int i=1; i<101; i+=2) {
			count++;
			System.out.print(i+" ");
		}//end for
		System.out.println();
		System.out.print("�ݺ�Ƚ�� :"+count);
		System.out.println();
		System.out.println();
		
		
		//1~9���� 1�� �����ϴ� for
		for(int i=1; i<10; i++ ) {
			System.out.println("2 * "+i+" = "+(2*i));
		}//end for
		System.out.println();

	
		//�빮�� A~Z���� ���.
		for(char i=65; i<='Z'; i++ ) {
			System.out.print(i+" ");
		}//end for
		System.out.println();
		
		//1~65535 ������ ����, ������ �빮��, ������ �ҹ��ڸ� ���
		for(int i = 1; i < 65536; i++) {
			if((i>47 && i<58) || (i >64 && i<91) || (i>96 && i < 123)) {
				System.out.print((char)i+" ");
			}//end if
		}//end for
		System.out.println();
		
		//1~100������ �� ���. 1+2+3+....+100 = 5050 
		int sum = 0; //������
		for(int i=1; i<101 ;i++) {
			sum=+i;
		}
		System.out.println("1~100������ �� : "+sum);
		System.out.println();
		
			
	}//main

}//class
