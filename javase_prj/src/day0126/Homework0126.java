package day0126;

public class Homework0126 {

	public void printName() {
		System.out.println("�ѻ��");
	}//printname
	
	public void firstName() {
		System.out.println('H'); ;
	}//firstName
	
	public void score(int i) {
		if(i>-1 && i<101) {
			if(i>-1 && i<40) {
				System.out.println("����");
			}else if(i>40 && i<59) {
				System.out.println("�ٸ� ���� ����");
			}else if(i>60 && i<101) {
				System.out.println("�հ�");
			}
		}else {
			System.out.println("�߸��� ����");
		}//end if
	}//end score
	
	public void aorA(char c) {
		if((int)c >47 && (int)c<58) {
			System.out.println("�����Դϴ�.");
		}else if((int)c >64 && (int)c<91) {
			System.out.println("�ҹ����Դϴ�.");
		}else if((int)c >96 && (int)c<123) {
			System.out.println("�빮���Դϴ�.");
		}//end if
	}//end aorA
	
	public int age(int year) {
		int nowYear = 2021;
		int nowAge = nowYear-year+1;
		return nowAge;
	}//end age
	
	public int moreBig(int a, int b) {
		int result=0;
		if(a>b) {
			result = a;
		}else if(a<b) {
			result = b;
		}else {
			result = a;			
		}//end if 
			return result;
	}//end moreBig
	
	public static void main(String[] args) {
		Homework0126 hw =new Homework0126();
		
		//1 -������
		hw.printName();
		
		//2 -������ ----- ������ ��
		hw.firstName();
		
		//3 -������
		hw.score(100);
		
		//4 -������
		hw.aorA('5');
		//5 -������
		int value2 = hw.age(1995);
		System.out.println("���� ���̴� "+value2+"�� �Դϴ�.");
		
		//6 -������
		int value3 = hw.moreBig(12, 11);
		System.out.println(value3);
		
		
	}//main

}//class
