package day0216;


/**
 * 사용자 정의  데이터형으로 만든 클래스를 사용.
 * @author user
 */
public class UseStudentVO {
	
	public static void main(String[] args) {
		// 번호 1, 이름 : 이하늘, 나이:20, 키 : 185.8 (모든 데이터를 알고 있는 상황 => 매개변수있는 생성자) 
		StudentVO leehaneul = new StudentVO(1,"이하늘",20,185.8);
	
		System.out.println(leehaneul.toString());
		
		// 번호 2, 이름 : 박기범 (모든 데이터를 알지 못하는 상황 => 기본생성자)
		StudentVO parkgibum = new StudentVO();
		parkgibum.setRegiName(2);
		parkgibum.setName("박기범");
		
		System.out.println(parkgibum);
		System.out.println("-----------------------------------------------");
		
		///여러학생의 정보를 저장하고 처리. 사용자정의 데이터형으로 배열을 생성.
		//1.이하늘,20,185,8, 2,박기범,25,170.3, 3,강인섭,26,178.7
		
		//1. 선언. 데이터형[] 배열명 = null;
		StudentVO[]stuArr = null;

		//2. 생성. 배열명 = new 데이터형[방의개수];
		stuArr = new StudentVO[3];
		
		//3. 값 할당.
		stuArr[0]=leehaneul;
		stuArr[1]=parkgibum;
			///stuArr[1]의 주소와 parkgibum의 주소가 같다.
			///stuArr[1]을 사용하여 나이 25를 설정
			stuArr[1].setAge(25);
			///parkgibum을 사용하여 키 170.3 설정
			parkgibum.setHeight(170.3);
		
		stuArr[2]= new StudentVO(3,"강인섭",26,178.8);
		
		//4. 값 사용. (일괄처리)
		StudentVO temp = null;
		
		for(int i =0; i < stuArr.length; i++) {
			temp = stuArr[i];
			System.out.printf("번호 : %d, 이름 : %s, 나이 : %d, 키 : %.1f\n",temp.getRegiName(),temp.getName(),temp.getAge(),temp.getHeight());
			//System.out.println(temp);
		}//end for
		
		
		
		
		
		
		
		
		
	}//main

}//class
