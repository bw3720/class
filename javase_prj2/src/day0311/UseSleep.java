package day0311;

/**
 * 생명주기 (ready -> running <-> block)
 * @author SIST
 */

//1. Runnable 구현
public class UseSleep implements Runnable{
	//2. run method Override
	@Override
	public void run() {
		//Thread로 동작해야할 코드.
		for(int i =0; i<10;i++) {
			System.out.println("i = " + i);
			try {
				Thread.sleep(3*1000);//3초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//end catch
		}//end for
	}//run
	public static void main(String[] args) {
		//3. class생성
		UseSleep us = new UseSleep();
		//4. Thread와 has a 관계 설정
		Thread thread = new Thread(us);
		//5. start();
		thread.start();
		
	}//main
	


}//class
