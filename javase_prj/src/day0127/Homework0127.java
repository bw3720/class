package day0127;

public class Homework0127 {

	public int sum(int num) {
		int hap = 0;
		//�ݺ��Ѵ� ������ �� �� ������ {�� �־��ּž� �������� �������ϴ�.��!!
		for(int i=0; i<num+1; i++) {
		hap += i;
		}//end for
		return hap;
	}//sum
	
	public void sum2(int num) {
		int hap =0;
		if(num>10) {
			for(int i=0; i<num+1;i+=3)
				hap += i;
				System.out.println(hap);
		}else {
			System.out.println("10���� ū ���� �Է����ּ���.");
		}//end if
	}//sum2
	
	public int birthYear(int age) {
		int nowYear=2021;
		int result=nowYear-age+1;
		return result;
	}//birthYear
	
	public void gugu() {
		
		for(int a=2; a<10; a++) {
			for(int i=1; i<10;i++) {
				System.out.printf("%dX%d=%d\n",a,i,a*i);
			}//end for2
			System.out.println("----------------------");
		}//end for1
	}//gugu
	
	public void gugu(int a) {
		for(int i=1; i<10; i++) {
			System.out.printf("%dX%d=%d\n",a,i,a*i);
		}//end for
	}//gugu
	
	
	
	
	public static void main(String[] args) {
		Homework0127 hw = new Homework0127();
		//1 -���� ��
		System.out.println(hw.sum(10));
		//2 -���� ��
		hw.sum2(11);
		//3 -���� ��
		System.out.println(hw.birthYear(1995));
		//4 -���� ��
		hw.gugu();
		//5 -���� ��
		hw.gugu(3);
		
		
	}//main
	
}//class
