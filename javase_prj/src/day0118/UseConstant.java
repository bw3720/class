package day0118;
/**
	�ٸ� Ŭ������ �����ϴ� ����� ���.
*/

class UseConstant {
	public static void main(String[] args) {
	
		//System.out.println(MAX_SCORE);
		//�ܺ� Ŭ�������� ����� ����� ������ "Ŭ������.�����"�� �������θ� ��밡��.
		System.out.println(Constant.MAX_SCORE+"�� �Դϴ�.");
		
		
		//Java.lang package���� �����ϴ� Wrapper class�� ����� ���.
		System.out.println("Byte�� �ּҰ� : "+ Byte.MIN_VALUE+", �ִ밪 : "+ Byte.MAX_VALUE);

		byte b1 = 10;
		byte b2 = 20;
		int result = b1 + b2; // ������ ����� 4byte�� �߻� Error 
		
		System.out.println(b1 + "+" + b2 + "=" + result);
	
	}//main
}//class
