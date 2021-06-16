package day0311;

/**
 * Thread�� ������� ���.
 * @author SIST
 */
//1. Thread�� ��ӹ޾Ƽ� ��� 
public class UseThread extends Thread{//����� �޴� ���� : �θ�Ŭ������ ���� ����� ������ �����־
	
	//2. run method�� Override
	@Override
	public void run() {
		//Thread�� �����ؾ��� �ڵ�.
		for(int i =0; i<1000; i++) {
			System.out.println("run method =="+i);
		}//end for
	}//run
	
	public void work() {
		//Thread�� �����ؾ��� �ڵ�.
		for(int i =0; i<1000; i++) {
			System.out.println("work --"+i);
		}//end for
	}//run
	
	public static void main(String[] args) {
		//3. Ŭ���� ���� : (Thread�� �����ǰ�, UseThread�� �����ȴ�.)
		UseThread ut =new UseThread();
//		long st = System.currentTimeMillis();
		//4. start() ȣ�� => run()�� �ҷ���
		ut.start();//���� ������� run()�� �ҷ��� �������� �˾Ƽ� 
		System.out.println("-------------------------------------");
		ut.work();
		//Thread�� ����ϸ� ���α׷��� ����Ǵ� �ð��� �� �� ����.
//		long et = System.currentTimeMillis();
//		System.out.println(et-st+"ms");
	}//main

}//class
