package day0118;
/**
	Constant ���(������ ���ó�� ����ϱ�)<br>
	���� (class field���� ���� ����.)
	public static final �������� ����� = ��;<br>
	���) <br>
	 �����<br>
	 Ŭ������.�����
*/ 
class  Constant{
	//class field
	public static final int MAX_SCORE = 100; // ���α׷� �ȿ��� ���Ǵ� ���ذ��� ������ ��.
	public static final int MIN_SCORE = 0;

	public static void main(String[] args) {
		System.out.println("�ְ��� : "+MAX_SCORE); // �����
		System.out.println("������ : "+Constant.MIN_SCORE); //Ŭ������.�����
		
		int myScore = 88;

		System.out.println("ȹ������ : "+myScore); // �̸������ε� ������� �������� �а� ����!!
		
		myScore = 90;
		//MAX_SCORE = 99; ����� ������ ������ġ �̿ܿ��� ���� �ٲ� �� ����.

		System.out.println("�� ������ "+myScore+"�� �̰�, �ְ� ������ "+Constant.MAX_SCORE+
			"�� �Դϴ�. �ְ������� ���������� ���̴� "+ (MAX_SCORE-myScore)+"�� �Դϴ�.");
		
	} //main
} //class



