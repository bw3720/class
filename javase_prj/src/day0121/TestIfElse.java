package day0121;

/**
 * 	if~else<br>
 *	�� �� �ϳ��� �ڵ带 �����ؾ��� �� ���.<br>
 * 	����)<br> 
 * 	if(���ǽ�){<br>
 * 		���ǿ� ���� �� ������ �����,,<br>
 *	 }esle{<br>
 * 		���ǿ� �� ���� �� ������ ����� ,,,<br>
 *	}
 * @author user
 *
 */
public class TestIfElse {

	public static void main(String[] args) {
		//���� �Է¹޾� �Է¹��� ���� ����� �� Ȧ������ ¦�������� ���.	
		int num = Integer.parseInt(args[0]);//���� �Է¹޾� ���� ��ȯ
		System.out.print(num+"��(��)");
		
		if(num % 2 == 0) {
			System.out.print("¦��");
		}else {
			System.out.print("Ȧ��");
		}//end else
		
		System.out.println();
		
		//���� ������� ���������� ����ϴ� �ڵ�.
		System.out.print(num+"��(��)");
		if(num > -1) {
			System.out.println("���");
		}else {
			System.out.println("����");
		}//end else
	
		
		//args[1]�� ���� �޾Ƽ� int���� score������ �����ϰ� ������ 0~100���̶�� "��ȿ����"�� ����ϰ�
		//�׷��� �ʴٸ� "��ȿ����"�� ����ϼ���.
		int score = Integer.parseInt(args[1]); //��찪 �׽�Ʈ
		System.out.println(score+"��");
		
		//if(score >=0 && score <= 100) {
		if(score > -1 && score < 101) {
			System.out.println("��ȿ����");
		}else {
			System.out.println("��ȿ����");
		}//end else
		
	
		
	}//main

}//class
