package day0126;

public class Homework0126 {

	public void printName() {
		System.out.println("한상민");
	}//printname
	
	public void firstName() {
		System.out.println('H'); ;
	}//firstName
	
	public void score(int i) {
		if(i>-1 && i<101) {
			if(i>-1 && i<40) {
				System.out.println("과락");
			}else if(i>40 && i<59) {
				System.out.println("다른 과목 참조");
			}else if(i>60 && i<101) {
				System.out.println("합격");
			}
		}else {
			System.out.println("잘못된 점수");
		}//end if
	}//end score
	
	public void aorA(char c) {
		if((int)c >47 && (int)c<58) {
			System.out.println("숫자입니다.");
		}else if((int)c >64 && (int)c<91) {
			System.out.println("소문자입니다.");
		}else if((int)c >96 && (int)c<123) {
			System.out.println("대문자입니다.");
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
		
		//1 -고정일
		hw.printName();
		
		//2 -고정값 ----- 수정할 것
		hw.firstName();
		
		//3 -가변일
		hw.score(100);
		
		//4 -가변일
		hw.aorA('5');
		//5 -가변값
		int value2 = hw.age(1995);
		System.out.println("올해 나이는 "+value2+"살 입니다.");
		
		//6 -가변값
		int value3 = hw.moreBig(12, 11);
		System.out.println(value3);
		
		
	}//main

}//class
