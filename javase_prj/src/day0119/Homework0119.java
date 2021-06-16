package day0119;
class Homework0119{
	public static void main(String[] args) {
		// 1번 문제
		int i =20;
		System.out.println(~i+1);

		// 2번 문제
		//int temp1 =10, temp2 =20; 변수를 만들고 아래와 같은 코드를
		//작성했을 때 주석에 써보세요
		int temp1 =10, temp2 =20;
		System.out.println(++temp1 + temp2--);
		System.out.println("temp1 = " + temp1 + " / temp2 = " + temp2);
		//++temp1는 내것이 먼저 들거가서 11이 되고 temp2--는 다음 차례부터 -1되어 아직은 20인 상태이다.
		//따라서 처음의 출력은 31이다.
		//두번째 출력에서는 temp1은 다시 10으로 계산되고 temp2는 앞에서의 후위 연산때문에 19가 되어 
		//두번째 출력값은 "temp1 = 10 / temp2 = 19"이다.

		// 3번 문제
		int temp3=0;
		temp3 = Integer.MAX_VALUE;
		
		System.out.println(temp3 << 4);

		// 4번 문제
		System.out.println(temp3 & 0x0000FFFF); //0x0000FFFF = 65535
	}
}
