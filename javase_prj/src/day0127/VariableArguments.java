package day0127;

/**
 *하나의 매개변수에 여러개의 값을 넣어서 사용하는 Variable Arguments. 
 * @author user
 */
public class VariableArguments {
	
	
	public void year(int ... a) {
		//VA는 method안에서 배열로 처리된다.
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}//end for
	}//year
	
	//메게변수가 여러개 정의 될 때 V.A는 가장 마지막에만 만들 수 있다.
	public void temp(int a, int i, char...c) {
		
	}//temp
	
	public void temp1(int a, int i, char...c) {
		
	}//
	
	public static void main(String[] args) {

		VariableArguments va = new VariableArguments();
		va.year(1,3,5,4);
		//안녕하세요? 출력
		System.out.println("\"안녕하세요?\"");
	}//main

}//class
