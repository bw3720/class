package day0125;
/**
 *���� for(��ø for)�� ��� <br>
 *����)<br>
 *for(�ʱⰪ;���ǽ�;��.���ҽ�){<br>
 *	for(�ʱⰪ;���ǽ�;��.���ҽ�)<br>
 *		�ݺ����๮��� <br>
 *	}<br>
 *}<br>
 * @author user
 */
public class TestFor2 {

	public static void main(String[] args) {
		//������ ���� ���.
		//�������� 2~9�ܱ��� ����
		for(int i =2;i<10;i++) { // �ܼ�
			System.out.println(i+"�� ����");
			for(int j =1; j<10;j++) {
				System.out.println(i+"X"+j+"="+i*j);
			}//end for2
			System.out.println("------");
		}//end for1
		
		
		///////////////////////////////////////////////
		/*
		 *  0001020304
		 *  11121314
		 *  222324
		 *  3334
		 *  44
		 * 
		 */
		for(int i=0 ; i<5 ; i++) {
			for(int j=i ; j<5 ; j++) {
				System.out.print(i+""+j+"");
			}//end for2
			System.out.println();
		}//end for 1
		
		////////////////////
		/*
		 *  00
		 *  1011
		 *  202122
		 *  30313233
		 *  4041424444
		 */
		
		
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<=i ; j++) {
				System.out.print(i+""+j+"");
			}//end for2
			System.out.println();
		}//end for 1
		
		//////������ ������ ���///////// �������� ���� 1���� �Դϴ�.
		for(int i =1 ; i<10 ; i++) { //�������� ��
			for(int j =2 ; j<10 ; j++) { //�ܼ�
				System.out.print(j+"X"+i+"="+ j*i +" ");
			}//end for2
			System.out.println();
		}//end for1
		
	}//main

}//class
