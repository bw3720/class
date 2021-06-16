package day0119;
/**
산술 연산자
+,-,*,/,%
*/
	
class Operator2 {
	public static void main(String[] args) {
		int i = 2021;
		System.out.println(i+"를(을) 2로 나눈 나머지 값 : "+ i % 2);
	
		int birth = 1995; // % - 큰 수를 몇가지의 작은 수로 만들 떄 사용.
		System.out.println(birth + "년생의 숫자" + birth % 12); // 0~11

		/*
		0 - 원숭이띠
		1 - 닭띠
		2 - 개띠
		3 - 돼지띠
		4 - 쥐띠
		5 - 소띠
		6 - 호랑이띠
		7 - 토끼
		8 - 용띠
		9 - 뱀띠
		10 - 말띠
		11 - 양띠
		*/

	}
}
