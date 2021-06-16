package day0119;
/**
쉬프트 연산자
<<, >>, >>>
*/
class Operator3{
	public static void main(String[] args) {
		int i = 6; // 데이터 형을 알아야 밀릴수있는 칸을 알수있음
	
		System.out.println(i + "<<3 = "+ (i<<3));// 48
		
		i = 39;
		System.out.println(i + ">>2 = "+ (i>>2));// 9
		
		i = 45;
		System.out.println(i + ">>>3 = "+ (i>>>3));// 5

		i = 1;
		System.out.println(i + "를 <<32 = "+ (i<<31));// 

		i = -1; // 몇칸을 밀어도 -1 부호비트에 의해 1로 채워지기 ㄸㅐ문
		System.out.println(i + "를 >>100 = "+ (i>>100));
		System.out.println(i + "를 >>1 = "+ (i>>>1));

		System.out.println("Hello World!");
	
	
	}//main
}//class
