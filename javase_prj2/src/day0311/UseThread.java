package day0311;

/**
 * Thread를 상속으로 사용.
 * @author SIST
 */
//1. Thread를 상속받아서 사용 
public class UseThread extends Thread{//상속을 받는 이유 : 부모클래스의 것을 맘대로 가져다 쓸수있어서
	
	//2. run method를 Override
	@Override
	public void run() {
		//Thread로 동작해야할 코드.
		for(int i =0; i<1000; i++) {
			System.out.println("run method =="+i);
		}//end for
	}//run
	
	public void work() {
		//Thread로 동작해야할 코드.
		for(int i =0; i<1000; i++) {
			System.out.println("work --"+i);
		}//end for
	}//run
	
	public static void main(String[] args) {
		//3. 클래스 생성 : (Thread가 생성되고, UseThread가 생성된다.)
		UseThread ut =new UseThread();
//		long st = System.currentTimeMillis();
		//4. start() 호출 => run()이 불려짐
		ut.start();//전혀 상관없는 run()이 불려짐 각개전투 알아서 
		System.out.println("-------------------------------------");
		ut.work();
		//Thread를 사용하면 프로그램이 종료되는 시간을 알 수 없다.
//		long et = System.currentTimeMillis();
//		System.out.println(et-st+"ms");
	}//main

}//class
