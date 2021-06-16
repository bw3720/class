package day0222;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * 학생정보를 저장하는 클래스를 사용하여, 학생정보를 처리하는 일을 구현한 클래스.
 * @author SIST
 */
public class ProcessStudent {
	
	/**
	 * 학생의 정보를 저장하기위한 일.
	 * @return 저장된 학생의 정보
	 */
	public List<StudentVO> setStudentInfo(){
		List<StudentVO> list =  new ArrayList<StudentVO>();
		
		//리스트에 데이터를 추가//
		list.add(new StudentVO("강인섭",25,"서울시 강남구 역삼동","남",97));
		list.add(new StudentVO("곽범수",27,"서울시 강남구 논현동","남",81));
		list.add(new StudentVO("권예원",26,"서울시 동작구 상도동","여",90));
		list.add(new StudentVO("김덕영",30,"경기도 수원시 영통구","남",82));
		list.add(new StudentVO("석지원",25,"인천광역시 부평구 부평동","여",88));
		
		return list;
	}//setStudentInfo
	
	/**
	 * 학생의 정보를 사용하여 출력하는 일.(단수번호, 태어난 해를 출력)
	 * @param list 학생의 정보
	 */
	public void printStudentInfo(List<StudentVO> list) {
		//번호 이름 나이 태어난 해 주소    자바 점수
		System.out.println("번호\t이름\t나이\t태어난해 \t 주소\t\t자바점수");
		System.out.println("-------------------------------------------------------------------------------");
		
		if(list.isEmpty()) {
			System.err.println("데이터가 없습니다.");
		}
			Calendar cal = Calendar.getInstance();//추상클래스이므로 new롤 객체화 하지 않는다.
			int nowYear = cal.get(Calendar.YEAR);//태어난 해를 연산하기위해 사용할 변수. 
			
			StudentVO sVO= null;//리스트의 element 값을 저장하기 위한 객체.
			
			for(int i=0; i<list.size(); i++) {
				sVO=list.get(i);//인덱스에 해당하는 학생정보 하나 얻기.
				System.out.printf("%d \t%s\t%d\t%d\t%s\t%d\n",i+1,sVO.getName(),sVO.getAge(),
						nowYear - sVO.getAge()+1,sVO.getAddress(),sVO.getJavaScore());
			}//end for
			
		
	}//printStudentInfo
	
	/**
	 * 학생의 정보를 사용하여 성별에 대한 구분 출력을 하는 일.
	 * @param list 학생의 정보
	 * @param gender 출력할 성별
	 */
	public void printStudentGenderType(List<StudentVO>list, String gender) {
		System.out.println("이름\t나이\t\t주소\t\t성별\t자바점수");
		System.out.println("----------------------------------------------------------------");
		
		//입력된 성별이 남자 또는 여자가 아니라면 기본값으로 "남"을 설정.
		if (!(gender.equals("남") || gender.equals("여"))) {
			gender = "남";
		}//end if
		
		for(StudentVO sVO: list) {//인덱스를 사용할 것이 아니므로 개선된 for를 사용.
			if(gender.equals(sVO.getGender())) {//입력 성별과 일치한다면 출력을 수행.
				System.out.printf("%s\t%d\t%s\t%s\t%d\n",sVO.getName(),sVO.getAge()
						,sVO.getAddress(),sVO.getGender(),sVO.getJavaScore());
			}//end if
			
		}//end for
		
		if(list.isEmpty()) {
			System.err.println("데이터가 존재하지 않습니다.");
		}//end if
	
	}//printStudentGenderType
	
	public static void main(String[] args) {
		
		ProcessStudent ps = new ProcessStudent();
		List<StudentVO> list = ps.setStudentInfo();
		ps.printStudentInfo(list);
		System.out.println("");
		ps.printStudentGenderType(list, "남");
				
	}//main

}//class
