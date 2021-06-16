package day0119;
/**
논리 연산자<br>
일반논리<br>
&&(AND),||(OR)<br>

비트논리<br>
*/

class Operator5 {
	public static void main(String[] args) {
	///////////////일반 논리///////////////
		boolean flag1 = true, flag2 = false, flag3 = true, flag4 = false;

		System.out.println("-----------&&-----------");
		System.out.println( flag1 + "&&" + flag3 + "=" + (flag1 && flag3) );
		System.out.println( flag1 + "&&" + flag2 + "=" + (flag1 && flag2) );
		System.out.println( flag2 + "&&" + flag1 + "=" + (flag2 && flag1) );
		System.out.println( flag2 + "&&" + flag4 + "=" + (flag2 && flag4) );

		System.out.println("-----------||-----------");
		System.out.println( flag1 + "||" + flag3 + "=" + (flag1 || flag3) );
		System.out.println( flag1 + "||" + flag2 + "=" + (flag1 || flag2) );
		System.out.println( flag2 + "||" + flag1 + "=" + (flag2 || flag1) );
		System.out.println( flag2 + "||" + flag4 + "=" + (flag2 || flag4) );

		//&&는 전항이 거짓이면 후항을 계산하지 않는다.
		flag1 = false;
		flag2 = false;
		flag3 = false;


		flag3 = (flag1 = 3<2) && (flag2 = 5<6);
		System.out.println("flag1 : " + flag1+", flag2 : " + flag2+", flag3 : " + flag3);
		
		int score = 101;

		//위의 score변수 할당된 값이 0~100 사이라면 true를 그렇지 않다면 false 출력하도록 일반논리 연산자를
		//사용하여 출력해 보세요.
		
		//내가 쓴 코드
		boolean flag = false;
		flag = (score >= 0) && (score <= 100);
		System.out.println(flag);
		
		//선생님 코드
		System.out.println( score >= 0 && score <= 100);
		System.out.println("---------------비트논리연산----------------");
				
		System.out.println("-----------&-----------"); 
		int i = 25;
		int j = 13;
		System.out.println(i+ "&" + j + "=" + (i & j)); //9
		
		System.out.println("-----------|-----------");
			i = 37;
			j = 7;
		System.out.println(i+ "|" + j + "=" + (i | j)); //39

		System.out.println("-----------^-----------");
			i = 17;
			j = 12;
		System.out.println(i+ "^" + j + "=" + (i ^ j)); //29
	}//main
}//class
