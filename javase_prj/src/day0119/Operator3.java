package day0119;
/**
����Ʈ ������
<<, >>, >>>
*/
class Operator3{
	public static void main(String[] args) {
		int i = 6; // ������ ���� �˾ƾ� �и����ִ� ĭ�� �˼�����
	
		System.out.println(i + "<<3 = "+ (i<<3));// 48
		
		i = 39;
		System.out.println(i + ">>2 = "+ (i>>2));// 9
		
		i = 45;
		System.out.println(i + ">>>3 = "+ (i>>>3));// 5

		i = 1;
		System.out.println(i + "�� <<32 = "+ (i<<31));// 

		i = -1; // ��ĭ�� �о -1 ��ȣ��Ʈ�� ���� 1�� ä������ ������
		System.out.println(i + "�� >>100 = "+ (i>>100));
		System.out.println(i + "�� >>1 = "+ (i>>>1));

		System.out.println("Hello World!");
	
	
	}//main
}//class