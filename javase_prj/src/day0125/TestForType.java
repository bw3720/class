package day0125;
/**
 * for�� �پ��� ����.<>
 * @author user
 */
public class TestForType {

	public static void main(String[] args) {
		//�������� �ε����� �ѹ��� ����� ��.(�ʱⰪ�� �������� ������ ����)
		//�����Ǵ� ���ҽ��� for���� �������� �� �ִ� ������ ���� �������� �����ص� �ȴ�.
		for(int i=0,j=10,k=50 ; i<10 ; i++,j--,k+=5) {
			System.out.println("i="+i+" j="+j+" k= "+k);
		}//end for
		
		//���ѷ���
		//���� �� �ʿ䰡 ���� ��.
//		for(;;) {
//			System.out.println("���ѷ���");
//			break;
//		}//end for

		//���� �� �ʿ䰡 ���� ��.
		for(int i=0;;i++) {
			System.out.println("���ѷ��� : "+i);
			if(i ==10) {
				break;				
			}
		}//end for
		
		
//		System.out.print("Test");
		
		
		
		
		
	}//main

}//class
