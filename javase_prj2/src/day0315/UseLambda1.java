package day0315;

public class UseLambda1{

	public static void main(String[] args) {
		System.out.print("loading");
		Runnable r = ()->{
			try {
				for(int i =0;i<15;i++) {
				System.out.print(".");
					Thread.sleep((int) (Math.random()*1000));
				}//end for
			} catch (Exception e) {
				e.printStackTrace();
			}//end catch
			
			System.out.print("finish");
			
		};//end Lambda
			
		Thread t = new Thread(r);
		t.start();
		
	}//main

}//class
