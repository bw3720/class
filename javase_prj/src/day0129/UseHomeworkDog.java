package day0129;

public class UseHomeworkDog {

	public static void main(String[] args) {
		HomeworkDog chi = new HomeworkDog();
		chi.setName("ġ�Ϳ�");
		System.out.printf("%s��(��) �� %d��, �� %d��, �� %d��, �� %d���� ������.\n"
				,chi.getName(),chi.getEye(),chi.getNose(),chi.getMouth(),chi.getEar());
		
		
		System.out.println(chi.play());
		
		System.out.println(chi.play("����", 3));
			
		HomeworkDog dang = new HomeworkDog();
		
		System.out.println();
	}//main

}//class
