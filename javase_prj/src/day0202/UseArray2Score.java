package day0202;

/**
 * 이차원 배열의 기본형 형식의 사용. 
 * @author user
 */
public class UseArray2Score {
	
	
	
	
	public static final int JAVA_SCORE=0;
	public static final int ORACLE_SCORE=1;
	public static final int JSP_SCORE=2;
	
	public void processScore() {
		
		String[] names ={"가","나","다","라","마"};
		
		//이차원 배열은 행구분 괄호를 사용하지않으면 에러가 발생.{{}}
		int[][] score= { {89,91,73}, {61,70,72}, {96,99,98}, {79,77,80}, {100,98,99}};//5행 3열
//		int[][] score= { {89,91,73, 61,70},{72, 96,99,98, 79},{77,80, 100,98,99}};//3행 5열
//		System.out.println(score.length+"행"+score[0].length+"열");
		int hap = 0; // 학생의 총점을 구하는 변수
		int javaTotal=0;//자바 총점
		int oracleTotal=0;//오라클 총점
		int jspTotal=0;//JSP 총점
		
		int[] totalScore=new int[score.length];// 학생의 인원수대로 배열 생성
		int[] javaScore=new int[score.length];
		
		System.out.println();
		System.out.println("번호\t이름\t자바\t오라클\tJSP\t총점\t평균");
		System.out.println("----------------------------------------------------------");
		for(int i =0; i<score.length; i++) {//행 - 모든학생
			System.out.printf("%d\t%s\t",i+1,names[i]);//번호 이름
			
			for(int j =0; j<score[i].length; j++) {//열 -학생 한명의 모든과목 점수
				System.out.printf("%d\t",score[i][j]);
				hap += score[i][j];
				
			}//end for
			javaTotal += score[i][JAVA_SCORE];
			oracleTotal += score[i][ORACLE_SCORE];
			jspTotal += score[i][JSP_SCORE];
			javaScore[i]=score[i][JAVA_SCORE];
			totalScore[i]=hap;//총점 배열에 학생 총점을 입력
			System.out.printf("%d\t%.2f\n",hap,(double)hap/score[i].length);
			hap = 0;
		}//end for
		
		System.out.println("----------------------------------------------------------");
		double cnt = score.length;
		System.out.printf("총점\t\t%d\t%d\t%d\n",javaTotal,oracleTotal,jspTotal);
		System.out.printf("평균\t\t%.2f\t%.2f\t%.2f\n",javaTotal/cnt,oracleTotal/cnt,jspTotal/cnt);
		
		System.out.printf("1등학생 [%s]\n",topStudent(totalScore, names));//method로 만들것 return.
		System.out.printf("자바의 최고점수 [%d]\n",javaTopScore(javaScore));//method로 만들것.
		
		
		System.out.printf("총 응시 인원[%d]명, 시험 과목수 [%d]\n",names.length,score[0].length);
		
		//1번 학생의 점수를 오름차순으로 정렬하여 출력 //method로 만들것.
		//2차원 배열의 행을 입력.(2차원 배열의 행은 1차원 배열의 주소를 가진다.)
		printScoreSort(score[0]);
		
		
	}//processScore
	
	
	///////////////////////1둥 구하기//////////////////////
	/**
	 * 1등학생의 번호와 이름을 얻는 일.
	 * @param totalScore 학생의 총점.
	 * @param names 학생의 이름.
	 * @return 1등학생의 번호와 이름.
	 */
	private String topStudent(int[] totalScore,String[] names) {
		String result ="";
		
		int topNum =0;
		int tempScore=0;
		
		for(int i=0;i<totalScore.length;i++) {
			if(tempScore < totalScore[i] ) {//임시변수의 값이 배열의 i번째 방의 값보다 작다면
				tempScore=totalScore[i];//i번째 방의 값으로 임시변수를 변경한다.
				topNum=i;
			}//end if
		}//end for
		
		result=(topNum+1)+"번 "+names[topNum];
		
		
		return result;
	}//topStudent
	/////////////////////////////////////////////////////
	
	
	/////////////////////////////////////////////////////
	/**
	 * 자바 최고 점수 얻기.
	 * @param javaScore 자바 점수.
	 * @return 자바의 최고 점수.
	 */
	private int javaTopScore(int[] javaScore) {//개선된 for : 배열의 처음 방부터 끝방까지 반복시킬때.
		int topScore =0;
		
		for(int score:javaScore) {//개선된 for
			if(topScore < score) {
				topScore=score;
			}//end if
		}//end for
		
		return topScore;
	}//javaTopScore
	///////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////
	/**
	 * 입력되는 점수를 오름차순으로 정렬하여 출력하는 일.
	 * @param score 정렬할 점수.
	 */
	private void printScoreSort(int[]score) {
		//주소가 입력되면 원래의 주소에 가서 데이터를 사용하기 때문에 값이 변경된다.
		//배열을 복사하여 사용.
		//////////score배열의 값을 복사하는 tempScore배열을 생성.
		
		//1.복사할 배열을 생성
		int[]copyScore = new int[score.length];
		//2.원본배열에서 처음방부터 마지막 방까지 복사할 배열에 넣는다.
		for(int i =0; i<score.length;i++) {
			copyScore[i] = score[i];
		}//end for
		
		//복사된 배열을 사용하여 정렬 작업을 수행.
		int temp=0;
		for(int i =0; i<copyScore.length-1; i++) {//앞방의 값을 사용하기 위한 
			for(int j =i+1; j<copyScore.length; j++) {//뒷방들의 값을 사용하기 위한
				if(copyScore[i]>copyScore[j]) {//값 비교
					temp = copyScore[i];
					copyScore[i]=copyScore[j];
					copyScore[j]=temp;
				}//end if
			}//end for
		}//end for
		//정렬 데이터를 출력.
		for(int value:copyScore) {
			System.out.printf("%-5d",value);
		}//end for
	}//printScoreSort
	
	
	public static void main(String[] args) {
		//
//		UseArray2Score uas = new UseArray2Score();
//		uas.processScore();
		
		new UseArray2Score().processScore();
		
		
		
		
		
	}//main

}//class
