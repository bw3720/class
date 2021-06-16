package day0128;

/**
 * 사람객체를 생성하고 사용하는 클래스.
 * @author user
 */
public class UsePerson {

	public static void main(String[] args) {
		// 1. 객체화
		Person sangmin = new Person();
		// 2. 값 넣기
		sangmin.setEye(2);
		sangmin.setNose(1);
		sangmin.setMouth(1);
		sangmin.setName("한상민");
		
		// 3. 호출
		System.out.printf("%s의 얼굴에는 눈 %d개, 코 %d개, 입 %d개가 있다.\n"
							,sangmin.getName(),sangmin.getEye(),sangmin.getNose(),sangmin.getMouth());
		
		System.out.println(sangmin.eat());
		System.out.println(sangmin.eat("초밥", 18000));
		
		System.out.println("------------------------------------");
		
		Person jinban = new Person();
		
		jinban.setEye(3);
		jinban.setNose(1);
		jinban.setMouth(1);
		jinban.setName("천진반");
		
		System.out.printf("이름 %s, 눈 %d, 코 %d, 입 %d\n"
				,jinban.getName(),jinban.getEye(),jinban.getNose(),jinban.getMouth());
		
		System.out.println(jinban.eat());
		System.out.println(jinban.eat("선두", 100000));
		System.out.println("------------------------------------");
		
	}//main

}//class
