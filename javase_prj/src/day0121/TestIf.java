package day0121;
/**
 * ���� if ��� <br>
 * ���ǿ� ���� ��쿡�� �ڵ带 ������ �� ���.
 * ����)<br>
 * 	if(���ǽ�){<br>
 * 		���ǿ� ���� �� ������ �����....<br>
 *	}
 *
 * @author user
 */

public class TestIf {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		
		if (num <0) {
			num = -num;//���밪���� ��ȯ�ϴ� �ڵ�, ��Ȳ�� �´� ��쿡�� ����Ǿ���Ѵ�.
		}//end if
		
		System.out.println(args[0] + "�� ���밪�� " + num);
		

		////args[0]�� "Ȧ��"�� ��쿡�� 1�� ������ ¦���� ����� ���. (¦���� ������� �ʴ´�.)////
		if (num %2 == 1) {
			num++;
			System.out.println(num);
		}//end if
		
		//args[1]�� ����� �� arg[1]�� "�Ѹ�"�� ��쿡�� "����, ����� �����"�� ���.
		System.out.println(args[1]);
		if(args[1].equals("�Ѹ�")) {
			System.out.println("����� �����");
		}//end if
	}//main

}//class
