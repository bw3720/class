package day0122;
/**
 * 
 * 
 * 
 * 
 * 
 * @author user
 */
public class TestSwitchCase {
	
	public static void main(String[] args) {
//		int i = 2; //byte,short,int,char  (long�� ����Ҽ� ����.)
//		switch(i) { //������ ������ ������ ��� �� �� �ֵ�.
//		case 0: System.out.println("ZERO");
//		case 1: System.out.println("ONE");
//		case 2: System.out.println("TWO");
//		default : System.out.println("��ġ�ϴ� �������");
//		}//end switch
		
		
		////////////////case�� ����� �ԷµǴ� ���������� ���������� ����� �� �ִ�.
//		int i=0;
//		switch(i) { //������ ������ ������ ��� �� �� �ֵ�.
//		case 2147483647 :System.out.println("ZERO");
//		case 1 :System.out.println("ONE");
//		case 2 :System.out.println("TWO");
//		default :System.out.println("ZERO");
//		}//end switch
		
		//////////char��///////////////
//		char i='0'; //char�� �ԷµǴ� ���ڿ� �����ϴ� Unicode������ ����. (A : 65, 0 : 48, C : 67)
//		switch(i) { //������ ������ ������ ��� �� �� �ֵ�.
//		case 48 :System.out.println("ZERO");
//		case 'B' :System.out.println("ONE");
//		case 'C' :System.out.println("TWO");
//		default :System.out.println("��ġ�ϴ� ��� ����.");
//		}//end switch
		
		//////////String��///////////////
		String i="HTML"; //JavaSE 7(JDK1.7���� ����)
		switch(i) { //������ ������ ������ ��� �� �� �ֵ�.
		case "Java" :System.out.println("�Ϻ��� OOP���");
		case "Oracle" :System.out.println("��뷮 �����ͺ��̽�");
		case "HTML" :System.out.println("��ũ�� ���.");
		default :System.out.println("��ġ�ϴ� ��� ����.");
		}//end switch
		
		
		
	}//main

}//class
