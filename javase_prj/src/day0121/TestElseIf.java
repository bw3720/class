package day0121;

/**
 * else if, 다중 if<br>
 * 연관된 여러 조건을 비교할 때 사용<br>
 * 문법)<	br>
 * if(조건식)<br>
 * 	조건에 맞을 때 수행할 문장들,,<br>
 * }else if(조건식){<br>
 * 	조건에 맞을 때 수행할 문장들,,<br>
 * }else{<br>
 * 	모든 조건에 맞지 않을 때 수행할 문장들,,<br>
 * }
 * @author user
 */
public class TestElseIf {

	public static void main(String[] args) {
		int score =Integer.parseInt(args[0]);
		
		System.out.println("입력 점수["+score+"]점 입니다.");
		
		if(score <0) {
			System.out.println("0보다 작아서 실패!");
		}else if(score > 101){
			System.out.println("입력 성공.");	
		}else{
			System.out.println("100보다 커서 실패!");
		}//end if
		
		
		
		
		System.out.println("-------------------------");
		///////점수를 입력받아 점수를 판정.///////
			//0~39점까지는 - 과락
			//40~59점까지는 - 다른점수 확인
			//60~100점까지는 - 합격
		
		System.out.println("입력 점수["+score+"]점 입니다.");
		
		if(score>-1 && score <40) {
			System.out.println("과락입니다.");
		}else if( score < 60) {             // = }else if(score >39 && score < 60)
			System.out.println("다른 점수 확인.");
		}else if( score < 101){
			System.out.println("합격입니다.");
		}//end if
		
		//args[1]에는 이름이 들어오는데 입력되는 이름은 현병호,이학민,곽범수,박기범,
		//권예원, 정은아 중 하나가 입력될수있다.
		
		//입력 이름이 현병호나 이학민 이라면 "A강의장 학생",곽범수,박기범 이라면 "B강의장 학생"
		//권예원, 정은아라면 "C강의장 학생" 그렇지 않다면 "D강의장 학생"을 출력.
		
		//문자열 비교를 위해서는 args[].equals("문자열")
		System.out.println(args[1]);
		
		if (args[1].equals ("현병호") || args[1].equals ("이학민")) {
			System.out.println("A강의장 학생");
		}else if(args[1].equals ("곽범수") || args[1].equals ("박기범")){
			System.out.println("B강의장 학생");
		}else if(args[1].equals ("권예은") || args[1].equals ("정은아")){
			System.out.println("C강의장 학생");
		}else {
			System.out.println("D강의장 학생");
		}//end else if
		
		
	}//main

}//class
