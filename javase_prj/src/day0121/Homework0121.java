package day0121;

public class Homework0121 {
	public static final int BUSCOST = 1200;
	public static final int METROCOST = 1300;
	public static final int TAXICOST = 3800;
	
	public static void main(String[] args) {
		//문제 1번
		int year = Integer.parseInt(args[0]);
		int yearAnimal = year % 12;
		
		if(yearAnimal == 0) {
			System.out.println(year+"년생 원숭이띠");
		}else if(yearAnimal == 1) {
			System.out.println(year+"년생 닭띠");
		}else if(yearAnimal == 2) {
			System.out.println(year+"년생 개띠");
		}else if(yearAnimal == 3) {
			System.out.println(year+"년생 돼지띠");
		}else if(yearAnimal == 4) {
			System.out.println(year+"년생 쥐띠");
		}else if(yearAnimal == 5) {
			System.out.println(year+"년생 소띠");
		}else if(yearAnimal == 6) {
			System.out.println(year+"년생 호랑이띠");
		}else if(yearAnimal == 7) {
			System.out.println(year+"년생 토끼띠");
		}else if(yearAnimal == 8) {
			System.out.println(year+"년생 용띠");
		}else if(yearAnimal == 9) {
			System.out.println(year+"년생 뱀띠");
		}else if(yearAnimal == 10) {
			System.out.println(year+"년생 말띠");
		}else if(yearAnimal == 11) {
			System.out.println(year+"년생 양띠");
		}else {
			
		}
			
		//문제 2번
		//System.out.println(args[1]);
		
		//내가 짠 코드
		/*
		if(args[1].equals("버스")) {
			System.out.println("입력 교통수단은 "+args[1]+"이고, 편도요금은 " + BUSCOST+"원 입니다.");
			System.out.println("왕복요금은 "+(BUSCOST*2)+"원 이고, 한달 20일 출퇴근을 하면 "+(BUSCOST*40)+"원 입니다.");
		}else if(args[1].equals("지하철")) {
			System.out.println("입력 교통수단은 "+args[1]+"이고, 편도요금은 " + METROCOST+"원 입니다.");
			System.out.println("왕복요금은 "+(METROCOST*2)+"원 이고, 한달 20일 출퇴근을 하면 "+(METROCOST*40)+"원 입니다.");
		}else if(args[1].equals("택시")) {
			System.out.println("입력 교통수단은 "+args[1]+"이고, 편도요금은 " + TAXICOST+"원 입니다.");
			System.out.println("왕복요금은 "+(TAXICOST*2)+"원 이고, 한달 20일 출퇴근을 하면 "+(TAXICOST*40)+"원 입니다.");
		}else {
			System.out.println("입력하신 교통수단은 대중교통이 아닙니다.");
		}
		*/
		//선생님 코드
		int oneway = 0;
		if(args[1].equals("버스")) {
			oneway = BUSCOST;
		}else if(args[1].equals("지하철")) {
			oneway = METROCOST;;
		}else if(args[1].equals("택시")) {
			oneway = TAXICOST;
		}else {
			System.out.println("입력하신 교통수단은 대중교통이 아닙니다.");
		}
		System.out.println("입력 교통수단은 "+args[1]+"이고, 편도요금은 " + oneway+"원 입니다."
				+"왕복요금은 "+(oneway*2)+"원 이고, 한달 20일 출퇴근을 하면 "+(oneway*2*20)+"원 입니다.");	
			
			
			
	}//main

}//class
