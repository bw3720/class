package day0115;
class Homework{
	public static void main(String[] args) {
		//날짜 출력
		int year = 2021;
		int month = 01;
		int day = 15;
		System.out.println("오늘은 "+year+"년 "+month+"월"+day+"일 입니다.");
	
		//이름의 이니셜
		char firstName = 'H';
		char middleName = 'S';
		char lastName = 'M';
		System.out.println("내 이름의 이니셜은 "+ firstName + middleName + lastName +"입니다.");

		//양안 시력
		double rightSight = 1.25;
		double leftSight = 1.35;
		double bothSight = ( rightSight + leftSight )/2;
		System.out.println("왼눈시력은 " + leftSight+"오른눈 시력은 " + rightSight + "양안시력은 " +  bothSight + "입니다.");
		
		//boolean
		boolean b = false;
		System.out.println("기본형 데이터형인 boolean형은 기본 값이 "+ b +"로 설정됩니다."); 


	}
}
