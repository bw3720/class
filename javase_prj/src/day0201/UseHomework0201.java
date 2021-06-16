package day0201;

public class UseHomework0201 {

	public static void main(String[] args) {
		Homework0201 hw = new Homework0201();//생성자에 주민번호를 입력하시는 거에요.
		hw.setPersonalId("951211-1064028");
		
		System.out.println(hw.getPersonalId());
		
		System.out.println(hw.method1()); //과제에 대한 method명을 method안에서 수행하는 특징을 잘 찾아내서 부여해 보세요. method1은 어떤 일을 하는 method인지 알수 없습니다.
		System.out.println(hw.method2());
		System.out.println(hw.method3());
		System.out.println(hw.method4());
		System.out.println(hw.method5());
		System.out.println(hw.method6());
		
		System.out.println("--------------------------------------");
		
		if(hw.method1() == true) {
			if(hw.method2() == true) {
				
				System.out.println("입력주민번호 : "+hw.getPersonalId());
				System.out.println(hw.method3());
				System.out.println(hw.method4());
				System.out.println(hw.method5());
				System.out.println(hw.method6());
			}else {
				System.out.println("-이 정상적인 위치에 없습니다.");
			}
		}else {
			System.out.println("주민번호의 글자수가 맞지 않습니다.");
		}//end else
		
	}//main

}//class
