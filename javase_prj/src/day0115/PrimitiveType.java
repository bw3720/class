package day0115;
/**
�⺻�� ���������� ���.
�⺻������������ ����Ͽ� ������ ������ ��� ���� ����
*/
class PrimitiveType {
	public static void main(String[] args) {
		////////////////////////������////////////////////////////////////
		byte a = 10;
		short b = 20;
		int c = 30;
		long d = 40; 
		long e = 300000000000000000l;
		// �빮�ڳ� �ҹ��ڳ� ������� L or l ------ ���� literal�� ũ��� 4byte�̹Ƿ� int�� ������ �ʰ��ϴ� ��� ���� ����Ҽ� ����.
		System.out.println("byte : "+a+", short : "+b+", int : "+c+", long : "+d+", long : "+e);

		////////////////////////������/////////////////////////////////////
		char f = 65; //�ڵ尪 �Է�
		char g = 48;
		char h = '��';
		//char�� ����ϸ� �ڵ尪�� ���� ���ڸ� ���
		System.out.println("char : "+f+","+g+","+h);


		////////////////////////�Ǽ���/////////////////////////////////////
		float i = 3.14f; // float�� 4byte, 3.14(�Ҽ�)�� 8byte�̴�. ��� ���� ���߱� ���� �ڿ� �ݵ�� F or f�� ���δ�.
		double j = 3.14; // ���� ���� 
		double k = 3.14D;
		
		System.out.println("float : "+i+", double : "+j+","+k);

		////////////////////////�Ҹ���/////////////////////////////////////
		boolean l = true;
		boolean m = false;
		System.out.println("boolean : "+l+","+m);


 	}//main
}//class
