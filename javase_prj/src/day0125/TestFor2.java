package day0125;
/**
 *다중 for(중첩 for)의 사용 <br>
 *문법)<br>
 *for(초기값;조건식;증.감소식){<br>
 *	for(초기값;조건식;증.감소식)<br>
 *		반복수행문장들 <br>
 *	}<br>
 *}<br>
 * @author user
 */
public class TestFor2 {

	public static void main(String[] args) {
		//구구단 전단 출력.
		//구구단은 2~9단까지 존재
		for(int i =2;i<10;i++) { // 단수
			System.out.println(i+"단 시작");
			for(int j =1; j<10;j++) {
				System.out.println(i+"X"+j+"="+i*j);
			}//end for2
			System.out.println("------");
		}//end for1
		
		
		///////////////////////////////////////////////
		/*
		 *  0001020304
		 *  11121314
		 *  222324
		 *  3334
		 *  44
		 * 
		 */
		for(int i=0 ; i<5 ; i++) {
			for(int j=i ; j<5 ; j++) {
				System.out.print(i+""+j+"");
			}//end for2
			System.out.println();
		}//end for 1
		
		////////////////////
		/*
		 *  00
		 *  1011
		 *  202122
		 *  30313233
		 *  4041424444
		 */
		
		
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<=i ; j++) {
				System.out.print(i+""+j+"");
			}//end for2
			System.out.println();
		}//end for 1
		
		//////구구단 옆으로 찍기///////// 곱해지는 수는 1부터 입니다.
		for(int i =1 ; i<10 ; i++) { //곱해지는 수
			for(int j =2 ; j<10 ; j++) { //단수
				System.out.print(j+"X"+i+"="+ j*i +" ");
			}//end for2
			System.out.println();
		}//end for1
		
	}//main

}//class
