package day0121;

/**
 * else if, ���� if<br>
 * ������ ���� ������ ���� �� ���<br>
 * ����)<	br>
 * if(���ǽ�)<br>
 * 	���ǿ� ���� �� ������ �����,,<br>
 * }else if(���ǽ�){<br>
 * 	���ǿ� ���� �� ������ �����,,<br>
 * }else{<br>
 * 	��� ���ǿ� ���� ���� �� ������ �����,,<br>
 * }
 * @author user
 */
public class TestElseIf {

	public static void main(String[] args) {
		int score =Integer.parseInt(args[0]);
		
		System.out.println("�Է� ����["+score+"]�� �Դϴ�.");
		
		if(score <0) {
			System.out.println("0���� �۾Ƽ� ����!");
		}else if(score > 101){
			System.out.println("�Է� ����.");	
		}else{
			System.out.println("100���� Ŀ�� ����!");
		}//end if
		
		
		
		
		System.out.println("-------------------------");
		///////������ �Է¹޾� ������ ����.///////
			//0~39�������� - ����
			//40~59�������� - �ٸ����� Ȯ��
			//60~100�������� - �հ�
		
		System.out.println("�Է� ����["+score+"]�� �Դϴ�.");
		
		if(score>-1 && score <40) {
			System.out.println("�����Դϴ�.");
		}else if( score < 60) {             // = }else if(score >39 && score < 60)
			System.out.println("�ٸ� ���� Ȯ��.");
		}else if( score < 101){
			System.out.println("�հ��Դϴ�.");
		}//end if
		
		//args[1]���� �̸��� �����µ� �ԷµǴ� �̸��� ����ȣ,���й�,������,�ڱ��,
		//�ǿ���, ������ �� �ϳ��� �Էµɼ��ִ�.
		
		//�Է� �̸��� ����ȣ�� ���й� �̶�� "A������ �л�",������,�ڱ�� �̶�� "B������ �л�"
		//�ǿ���, �����ƶ�� "C������ �л�" �׷��� �ʴٸ� "D������ �л�"�� ���.
		
		//���ڿ� �񱳸� ���ؼ��� args[].equals("���ڿ�")
		System.out.println(args[1]);
		
		if (args[1].equals ("����ȣ") || args[1].equals ("���й�")) {
			System.out.println("A������ �л�");
		}else if(args[1].equals ("������") || args[1].equals ("�ڱ��")){
			System.out.println("B������ �л�");
		}else if(args[1].equals ("�ǿ���") || args[1].equals ("������")){
			System.out.println("C������ �л�");
		}else {
			System.out.println("D������ �л�");
		}//end else if
		
		
	}//main

}//class
