package day0125;
/**
 * for의 다양한 형태.<>
 * @author user
 */
public class TestForType {

	public static void main(String[] args) {
		//여러개의 인덱스를 한번에 사용할 때.(초기값에 여러개의 변수를 선언)
		//증가또는 감소식은 for문을 빠져나갈 수 있는 조건을 가진 변수값만 변경해도 된다.
		for(int i=0,j=10,k=50 ; i<10 ; i++,j--,k+=5) {
			System.out.println("i="+i+" j="+j+" k= "+k);
		}//end for
		
		//문한루프
		//수를 셀 필요가 없을 떄.
//		for(;;) {
//			System.out.println("무한루프");
//			break;
//		}//end for

		//수를 셀 필요가 있을 때.
		for(int i=0;;i++) {
			System.out.println("무한루프 : "+i);
			if(i ==10) {
				break;				
			}
		}//end for
		
		
//		System.out.print("Test");
		
		
		
		
		
	}//main

}//class
