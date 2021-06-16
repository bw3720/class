package day0202;

/**
 * 일차원 배열로 학생의 점수를 처리하는 프로그램을 작성.
 * @author user
 */
public class UseArrayScore {
	public void score() {
		//1. 6명의 학생점수를 저장한 배열을 선언
		int[] studentScore = {84,72,99,95,60,63};
		int totalScore = 0;
		System.out.println("번호\t점수");
		System.out.println("-------------");
		for(int i = 0; i<studentScore.length; i++) {
			System.out.printf("%d번\t%d점\n",i+1,studentScore[i]);
			totalScore += studentScore[i];
		}//end for
		
		System.out.println("-------------");
		System.out.printf("응시인원[%d]명\n",studentScore.length);
		System.out.printf("총점[%d]점\n",totalScore);
		System.out.printf("평균[%.2f]점\n",(double)totalScore/studentScore.length);
	}//score

	public void familyName() {
		String[] name= {"강인섭","곽범수","김다은","강현우","김덕영","이상철","이예림","이하늘"
				,"정은아","이학민"};

		//이씨만 출력
		for(int i =0; i<name.length; i++) {
//			if(name[i].indexOf("이" == 0)) {
//			if(name[i].charAt() == '이') {
//			if(name[i].substring(0,1).equals("이")) {
			if(name[i].startsWith("이")) {
				System.out.println(name[i]);
			}//end if
		}//end for
	
	}//familyName
	
	public static void main(String[] args) {
		UseArrayScore uas = new UseArrayScore();
		uas.score();
		System.out.println("------------------------");
		uas.familyName();
	}//main

}//class
