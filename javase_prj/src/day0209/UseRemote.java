package day0209;

public class UseRemote {

	public static void main(String[] args) {
		System.out.println("---------Air conditioner Remote Controler----------");
		AirRemote ar = new AirRemote();
		System.out.println(ar.upBt(2));
		System.out.println(ar.downBt(3));
		System.out.println(ar.powerBt("On"));
		System.out.println(ar.powerBt("Off"));
		System.out.println(ar.sleepBt("On"));
		System.out.println(ar.sleepBt("Off"));
	
		System.out.println("--------------TV Remote Controler-------------");
		TvRemote tr = new TvRemote();
		System.out.println(tr.upBt(998));
		System.out.println(tr.upBt(1000));
		System.out.println(tr.downBt(3));
		System.out.println(tr.powerBt("On"));
		System.out.println(tr.powerBt("Off"));
		System.out.println(tr.sleepBt("On"));
		System.out.println(tr.sleepBt("Off"));
		
		
		
		
	
	
	}//main

}//class
