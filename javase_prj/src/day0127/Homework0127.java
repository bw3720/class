package day0127;

public class Homework0127 {

	public int sum(int num) {
		int hap = 0;
		//반복한는 문장이 한 줄 일지라도 {를 넣어주셔야 가독성이 좋아집니다.넵!!
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
			System.out.println("10보다 큰 값을 입력해주세요.");
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
		//1 -가변 값
		System.out.println(hw.sum(10));
		//2 -가변 일
		hw.sum2(11);
		//3 -가변 값
		System.out.println(hw.birthYear(1995));
		//4 -고정 일
		hw.gugu();
		//5 -가변 일
		hw.gugu(3);
		
		
	}//main
	
}//class
