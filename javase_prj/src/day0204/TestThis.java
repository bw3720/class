package day0204;

/**
 * this카워드 형식의 사용.
 * @author user
 */
public class TestThis {
	private int i;
	
	public void useInstance(TestThis tt) {
		//주소를 사용 할려면 주소를 전달 받아야 한다.
		System.out.println("method를 호출한 객체의 주소 :"+ tt);
		
	}//useInstance

	/**
	 * stack의 변수명과 heap의 변수명이 같다면 stack에 있는 변수를 사용한다.<br>
	 * 같은 이름의 heap 변수를 사용할려면 heap의 주소를 받아야한다. heap memory address => instance => 객체 .<br>
	 * @param i
	 */
	public void useInstanceVariable(int i,TestThis tt) {
		tt.i=i; // heap에 존재하는 i변수에 stack에 존재하는 i변수값을 할당.
		System.out.println(i);
	}//useInstanceVariable
	
	/**
	 * parameter명과 instance변수명이 같을 때에는 instance변수와 parameter를 식별하기위해
	 * 인스턴스의 주소를 넣어야하는데 인스턴스 주소를 넣지않고 this를 사용하면 method를
	 * 호출하는 객체의 주소로 변경된다
	 * @param i
	 */
	public void useInstanceVariable(int i) {
		this.i=i; // heap에 존재하는 i변수에 stack에 존재하는 i변수값을 할당.
		System.out.println(i);
		System.out.println(this);
	}//useInstanceVariable
	
	
	public static void main(String[] args) {
		TestThis tt1=new TestThis();
		TestThis tt2=new TestThis();
		
		System.out.println("tt1 instance의 주소 : "+tt1);
		System.out.println("tt2 instance의 주소 : "+tt2);
		System.out.println("--------------------객체주소-----------------------------");
		tt1.useInstance(tt1);
		tt2.useInstance(tt2);
		System.out.println("--------------------값,객체주소-----------------------------");
		
		tt1.useInstanceVariable(100,tt1);
		tt2.useInstanceVariable(200,tt2);
		System.out.println(tt1.i);
		System.out.println("--------------------this의 사용-----------------------------");
		tt1.useInstanceVariable(1000);
		
//		System.out.println(this); //static영역에서는 호출하는 객체의 정보가 존재하지 않기 때문에
		//this를 사용할 수 없다.
		
		
		
	}//main

}//class
