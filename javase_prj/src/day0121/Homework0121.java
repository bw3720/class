package day0121;

public class Homework0121 {
	public static final int BUSCOST = 1200;
	public static final int METROCOST = 1300;
	public static final int TAXICOST = 3800;
	
	public static void main(String[] args) {
		//���� 1��
		int year = Integer.parseInt(args[0]);
		int yearAnimal = year % 12;
		
		if(yearAnimal == 0) {
			System.out.println(year+"��� �����̶�");
		}else if(yearAnimal == 1) {
			System.out.println(year+"��� �߶�");
		}else if(yearAnimal == 2) {
			System.out.println(year+"��� ����");
		}else if(yearAnimal == 3) {
			System.out.println(year+"��� ������");
		}else if(yearAnimal == 4) {
			System.out.println(year+"��� ���");
		}else if(yearAnimal == 5) {
			System.out.println(year+"��� �Ҷ�");
		}else if(yearAnimal == 6) {
			System.out.println(year+"��� ȣ���̶�");
		}else if(yearAnimal == 7) {
			System.out.println(year+"��� �䳢��");
		}else if(yearAnimal == 8) {
			System.out.println(year+"��� ���");
		}else if(yearAnimal == 9) {
			System.out.println(year+"��� ���");
		}else if(yearAnimal == 10) {
			System.out.println(year+"��� ����");
		}else if(yearAnimal == 11) {
			System.out.println(year+"��� ���");
		}else {
			
		}
			
		//���� 2��
		//System.out.println(args[1]);
		
		//���� § �ڵ�
		/*
		if(args[1].equals("����")) {
			System.out.println("�Է� ��������� "+args[1]+"�̰�, ������� " + BUSCOST+"�� �Դϴ�.");
			System.out.println("�պ������ "+(BUSCOST*2)+"�� �̰�, �Ѵ� 20�� ������� �ϸ� "+(BUSCOST*40)+"�� �Դϴ�.");
		}else if(args[1].equals("����ö")) {
			System.out.println("�Է� ��������� "+args[1]+"�̰�, ������� " + METROCOST+"�� �Դϴ�.");
			System.out.println("�պ������ "+(METROCOST*2)+"�� �̰�, �Ѵ� 20�� ������� �ϸ� "+(METROCOST*40)+"�� �Դϴ�.");
		}else if(args[1].equals("�ý�")) {
			System.out.println("�Է� ��������� "+args[1]+"�̰�, ������� " + TAXICOST+"�� �Դϴ�.");
			System.out.println("�պ������ "+(TAXICOST*2)+"�� �̰�, �Ѵ� 20�� ������� �ϸ� "+(TAXICOST*40)+"�� �Դϴ�.");
		}else {
			System.out.println("�Է��Ͻ� ��������� ���߱����� �ƴմϴ�.");
		}
		*/
		//������ �ڵ�
		int oneway = 0;
		if(args[1].equals("����")) {
			oneway = BUSCOST;
		}else if(args[1].equals("����ö")) {
			oneway = METROCOST;;
		}else if(args[1].equals("�ý�")) {
			oneway = TAXICOST;
		}else {
			System.out.println("�Է��Ͻ� ��������� ���߱����� �ƴմϴ�.");
		}
		System.out.println("�Է� ��������� "+args[1]+"�̰�, ������� " + oneway+"�� �Դϴ�."
				+"�պ������ "+(oneway*2)+"�� �̰�, �Ѵ� 20�� ������� �ϸ� "+(oneway*2*20)+"�� �Դϴ�.");	
			
			
			
	}//main

}//class
