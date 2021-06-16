package day0122;

public class Homework0122 {
	public static final int BUS_COST =1200;
	public static final int METRO_COST =1300;
	public static final int TAXI_COST =3800;
	
	public static void main(String[] args) {
	//문제 1번
		int oneway = 0;//변수 초기화
		int addCost = 0;//변수 초기화
		
		int distance = 20;//이동거리
		if(args[0].equals("버스")) {
			oneway = BUS_COST;
		}else if(args[0].equals("지하철")) {
			oneway = METRO_COST;;
		}else if(args[0].equals("택시")) {
			oneway = TAXI_COST;
		}else {
			System.out.println("입력하신 교통수단은 대중교통이 아닙니다.");
		}
		
		if(distance > 10) {
			addCost = (distance-10)/5*100;
		}else {
			
		}
		System.out.println("입력 교통수단은 "+args[0]+"이고, 기본요금은 " + oneway+"원 입니다."
				+"이동거리는 "+(distance)+"km 이고, 총 요금은 "+(oneway+addCost)+"원 입니다.");
	
	
		//문제 2번
		
		for(int i=1;i<101;i++) {
			if(i % 3 ==0) {
				System.out.print("짝 ");
			}else {
				System.out.print(i+" ");
			}//end if
		}//end for
	
	
	
	
	
	
	
	
	}//main

}//class
