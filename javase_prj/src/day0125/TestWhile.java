package day0125;
/**
 * 
 *
 * @author user
 */
public class TestWhile {

	public static void main(String[] args) {
		int i = 0;
		while(i < 10){
			System.out.println("�ȳ��ϼ���?  i = "+i);
			i++;
		}//end while
		
		/////////���� �Է¹޾� ���� 2�ܿ��� 9�� ������ ������ �Է¹��� ������ �������� ���///////// 
		 
		int j =Integer.parseInt(args[0]); // �ܼ�
		
		if(j>1 && j<10) {
			i=1;
			while(i < 10) { // 1�� 10���� �׻� �۽��ϴ�.
				System.out.println(j+"X"+i+"="+i*j);
				i++;
			}//end while
				
		}//end if
		
		///////////while�� ���� loop////////////
		while(true) {
			System.out.println("���ѷ���");
			break;//break�� �����Ǹ� ���� �� �ݺ����� ����������.
		}//end while
		System.out.println("==========");
		
		
		
		
	}//main

}//class
