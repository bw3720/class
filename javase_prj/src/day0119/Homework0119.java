package day0119;
class Homework0119{
	public static void main(String[] args) {
		// 1�� ����
		int i =20;
		System.out.println(~i+1);

		// 2�� ����
		//int temp1 =10, temp2 =20; ������ ����� �Ʒ��� ���� �ڵ带
		//�ۼ����� �� �ּ��� �Ẹ����
		int temp1 =10, temp2 =20;
		System.out.println(++temp1 + temp2--);
		System.out.println("temp1 = " + temp1 + " / temp2 = " + temp2);
		//++temp1�� ������ ���� ��Ű��� 11�� �ǰ� temp2--�� ���� ���ʺ��� -1�Ǿ� ������ 20�� �����̴�.
		//���� ó���� ����� 31�̴�.
		//�ι�° ��¿����� temp1�� �ٽ� 10���� ���ǰ� temp2�� �տ����� ���� ���궧���� 19�� �Ǿ� 
		//�ι�° ��°��� "temp1 = 10 / temp2 = 19"�̴�.

		// 3�� ����
		int temp3=0;
		temp3 = Integer.MAX_VALUE;
		
		System.out.println(temp3 << 4);

		// 4�� ����
		System.out.println(temp3 & 0x0000FFFF); //0x0000FFFF = 65535
	}
}
