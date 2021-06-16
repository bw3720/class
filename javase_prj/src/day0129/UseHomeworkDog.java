package day0129;

public class UseHomeworkDog {

	public static void main(String[] args) {
		HomeworkDog chi = new HomeworkDog();
		chi.setName("치와와");
		System.out.printf("%s은(는) 눈 %d개, 코 %d개, 입 %d개, 귀 %d개를 가졌다.\n"
				,chi.getName(),chi.getEye(),chi.getNose(),chi.getMouth(),chi.getEar());
		
		
		System.out.println(chi.play());
		
		System.out.println(chi.play("공원", 3));
			
		HomeworkDog dang = new HomeworkDog();
		
		System.out.println();
	}//main

}//class
