package day0203;

/**
 * 가변배열.(행마다 열의 갯수가 다르게 생성되는 배열)
 * @author user
 */
public class VariableArray {
	
	public static void testVariableArray() {
		//1. 선언 : 데이터형[][]배열명 = null;
		int[][] arr =null;
		
		//2. 생성(열의 크기를 성정하지 않는다.) : 배열명 = new 데이터형[행의수][];
		arr=new int[5][];
		
		//3. 행마다 열을 생성 
		//비어있는 방 생성. : 배열명[행의번호] = new 데이터형[열의갯수];
		//초기값이 있는 방을 생성. : 배열명[행의변호]=new 데이터형[]{값값값,,,,};
		arr[0]=new int[3];
		arr[1]=new int[5];
		arr[2]=new int[] {1,2,3,4}; //new를 생략할수 없고 열의 크기를 설정하지 않는다.
		arr[3]=new int[] {10,20};
		arr[4]=new int[1];
		
		for(int i=0; i<arr.length; i++) {//행
			System.out.printf("arr[%d]행 열의 수 : %d\n",i,arr[i].length);
		}//end for
		
		//4. 값할당(인덱스에 주의) : 배열명[행의번호][열의번호] = 값;
		arr[0][0]=10;
		arr[1][0]=20;
		arr[2][0]=30;
		
		//5. 값사용 : 배열명[행의번호][열의번호]
		
		for(int i=0; i<arr.length; i++) {//행
			for(int j=0; j<arr[i].length; j++) {//행
				System.out.printf("%-5d",arr[i][j]);
			}//end for
			System.out.println();
		}//end for
		
	}//testVariableArray

	public static void main(String[] args) {
		
		VariableArray.testVariableArray();
	
	}//main

}//class
