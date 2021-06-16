package day0120;

public class Homework0120 {

	public static void main(String[] args) {
		//문제 1번
		boolean flag1 = true, flag2 = true, flag3 = true;
		
		flag3 = (flag1 = 3>2) || (flag2 = 5>6); // true false true가 나와야 하는데 flag1에서 계산이 종료되므로 전부 true로 나옴
		System.out.println("flag1 : " + flag1+", flag2 : " + flag2+", flag3 : " + flag3);
	
		//문제 2번
		int i = -1818181;
		System.out.println( i>-1 ? i : -(i) );
	}

}
