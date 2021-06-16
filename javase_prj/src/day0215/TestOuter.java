package day0215;

/**
 * 안쪽클래스를 인스턴스 변수처럼 사용할 때 사용하는 inner class.<br>
 * 특정 윈도우 디자인 객체안에서 이벤트를 처리할때.(디자인 클래스 하나에만 귀속된 이벤트를 처리할 때)
 * @author user
 */
public class TestOuter {
	
	int outI;
	
	public TestOuter() {
		System.out.println("바깥클래스의 생성자");
	}//TestOuter
	
	public void outMethod() {
		System.out.println("바깥클래스의 method : "+outI);
		//바깥클래스의 객체로는 안쪽클래스의 자원을 사용할 수 없다.
//		to.inI=100;
//		to.inMethod();
		
		//바깥클래스에서 안쪽클래스의 자원을 사용하려면 객체화를 해야한다.
		
		//바깥클래스의 객체명은 this로 대체될 수 있다.
		//바깥클래스명은 생략될 수 있다.
		//Inner in = this.new Inner();
		
		//this는 생략될 수 있다.
		TestOuter.Inner in = new Inner();
		
		in.inMethod();
		System.out.println("---------------------------outMethod Finish---------------------------");
	}//outMethod
	
	/////////////////////////inner class 시작//////////////////////////
	
	public class Inner{
		int inI;
		public Inner() {
			System.out.println("안쪽클래스의 생성자");
		}//Inner
	
		public void inMethod() {
			System.out.println("안쪽클래스의 method : "+inI);
			//안쪽클래스에서는 바깥 클래스의 변수나 method를 사용할 수 있다.
			System.out.println("바깥클래스의 변수 : "+outI);
			//outMethod();
			
		}//inMethod
	
	}//class
	
	/////////////////////////inner class 끝//////////////////////////
	
	public static void main(String[] args) {
		//1. 바깥 클래스 객체화.
		TestOuter to =new TestOuter(); // 바깥클래스가 객체화 되었다고 안쪽클래스가 객체화 되지 않는다.
		//바깥클래스의 객체로는 안쪽클래스의 자원을 사용할 수 없다.
//		to.inI=10;
//		to.inMethod();
		to.outMethod();
		
		
		//2. 안쪽 클래스 객체화. : 바깥클래스명.안쪽클래스명 객체명 = 바깥클래스객체명.new 안쪽클래스생성자();
		TestOuter.Inner in =to.new Inner();
		in.inMethod();
		
	}//main

}//class
