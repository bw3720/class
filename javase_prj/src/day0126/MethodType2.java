package day0126;

public class MethodType2 {

	//�׻� ���� �λ縦 ����ϴ� method�� �����. -���� ��
	public void hello() {
		System.out.println("�´���?��ȥ��");
	}//hello
	
	//�׻� ���ظ� ��ȯ�ϴ� method -���� ��
	public int year() {
		return 2021;
	}//year
	
	//�ԷµǴ� ������ unicode���� ����ϴ� method. -���� ��
	public void printUnicode(char c) {
		System.out.println(c+"�� unicode �� : "+(int)c);
	}//printUnicode
	
	//�Ǽ��� ������ ��ȯ�ϴ� ��ȯ�ϴ� method -���� ��.
	public int casting(double d) {
		return (int)d;
	}//casting
	 
	
	public static void main(String[] args) {
		//1. ��üȭ
		MethodType2 mt2 = new MethodType2();
		//2.method ȣ��
		mt2.hello();//���� ��.
		int value =  mt2.year();//���� ��.
		System.out.println(value);

		mt2.printUnicode('A'); //���� ��.
	
		value = mt2.casting(2021.0126); //���� ��.
		System.out.println(value);
		
		
	}//main

}//class
