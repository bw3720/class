package day0125;

/**
 * continue �ݺ����� ������ �ǳ� �پ���� ��.<br>
 * @author user
 */
public class UseContinue {

	public static void main(String[] args) {
		//1���� 100������ ���߿� ¦���� ���
		for(int i=1; i<101; i++) {
			if(i%2 == 1) {
				continue; // ���� ���������ʰ� ���������� ������ġ�� ����
			}//end if
			
			System.out.println(i); //Ȧ���� ������ �ǳ� �پ���� �ڵ�
		}//end for

		for(int i=1;i<101;i++) {
//			if(i % 3 ==0) {
//				System.out.print("¦ ");
//			}else {
//				System.out.print(i+" ");
//			}//end else
			if(i%3==0) {
				System.out.println("¦");
				continue;
			}//end if
			System.out.println(i+"");
		}//end for
	
		
	}//main

}//class
