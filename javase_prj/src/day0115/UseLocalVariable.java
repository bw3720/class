package day0115;
/**
method�ȿ��� �����ϴ� �̿������� Ư¡.
*/

class  UseLocalVariable{
	public static void main(String[] args) {
		//1. ���� : �������� ������;
		int i; //�ʱ�ȭ���� ���� ����
		int j=0; //�ʱ�ȭ�� �� ����( ���� )
		//���� �̸��� ������ �����ϸ� Error
		//int i => Error
		int k=0; //���������� �ڵ� �ʱ�ȭ�� ���� �ʱ� ������, �ʱ�ȭ ���� �ʴ� ������ ����ϰ� �Ǹ� ������ �߻��Ѵ�.

		//2. �� �Ҵ� : ������ = ��;
		i = 15;
		j = 1;
		
		//3. �� ��� : ���, ����, ���Ҵ�
		System.out.println(i); //i = 15
		System.out.println(j);
		i = 2021;
		
		//�� �Ҵ� ���� ���� ������ ����ϸ� Error
		System.out.println(k);
		System.out.println(i); //i = 2021    ----------- �� �Ҵ�, �ʱ�ȭ�� �������̴�.

		int ������ =0; // �ѱ� �������� ���������ϳ� ������� �ʴ´�.
		������=27;
		System.out.println(������);
		
		int year = 2021;
		System.out.println("���ش� " + year +"�� �Դϴ�.");
	}//main
}//class
