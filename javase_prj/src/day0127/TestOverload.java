package day0127;

/**
 *클래스에서 같은 이름의 method를 여러개 만들수 있는 overload의 사용.<br>
 *규칙) 접근지정자와 반환형은 달라도 되고<br>
 *		method명은 같아야하고<br>
 *		매개변수는 반드시 달라야 한다.<br>
 * @author user
 */
public class TestOverload {
	
	/**
	 * 별 한개를 출력하는일.
	 */
	public void printStar() {
		System.out.println("☆");
	}//printStar
	
	/**
	 * 입력받은 수대로 별을 출력하는 일.
	 * method Overload(Overloading)
	 */
	public void printStar(int count) {
		for(int i=0; i<count;i++) {
			System.out.print("★");
		}
	}//printStar
	
	
	
	public static void main(String[] args) {
		TestOverload to = new TestOverload();
		to.printStar();//고정일.(반환형 없고, 매개변수 없는 형)
		to.printStar(2);//가변 일.(반환형 없고, 매개변수 있는 형)
		
		/*
		 * Overload된 printStar method를 사용하여 아래와 같은 형태로 출력
		 *  ㅁ
		 *  ㅁㅁ
		 *  ㅁㅁㅁ
		 *  ㅁㅁㅁㅁ
		 * */
		for(int i=0;i<5;i++) {
			to.printStar(i);
			System.out.println();
		}//end for
		
		
	}//main

}//class
