package day0120;

public class Homework0120 {

	public static void main(String[] args) {
		//���� 1��
		boolean flag1 = true, flag2 = true, flag3 = true;
		
		flag3 = (flag1 = 3>2) || (flag2 = 5>6); // true false true�� ���;� �ϴµ� flag1���� ����� ����ǹǷ� ���� true�� ����
		System.out.println("flag1 : " + flag1+", flag2 : " + flag2+", flag3 : " + flag3);
	
		//���� 2��
		int i = -1818181;
		System.out.println( i>-1 ? i : -(i) );
	}

}
