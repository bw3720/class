package day0125;

public class Homework0125 {

	public static void main(String[] args) {
		// -while을 사용하여 구구단 전체 단을 세로로 출력.
		int i = 2;
		int j;
		
		while(i<10) {
			j=1;	
			while(j < 10) {
				System.out.println(i+"X"+j+"="+i*j);
				j++;
			}
			i++;
		}
		
		System.out.println("-------------------------");
		
		// -while을 사용하여 1~100까지의 합을 출력.
		int sum = 0;
		int k = 1;
		while(k<101) {
			sum = sum + k;
			k++;
		}
		System.out.println( sum );
		
		System.out.println("-------------------------");	
		
		// -do~while을 사용하여 1~100까지의 짝수만 출력하는 코드를 작성하고 50일때 break를 사용하여 반복문을 빠져나가는 코드를 작성하세요.
		k=1;
		do {
			if(k%2 ==0) 
				System.out.println(k+" ");
			k++;
			if(k == 50) {
				break;
			}
		}while(k<101); 
				
		System.out.println("-------------------------");
		 
		// -다중 for를 사용하여 아래와 같이 출력이되도록 작성.
		//11111
		//10001
		//10001
		//11111
		
		for(i=0;i<5;i++) { //for1
			for(j=0;j<5;j++) { //for2
					System.out.print((i==0 || i==4||j==0||j==4) ? 1:0);
			}//end for2
			System.out.println();
		}//end for1
		
		System.out.println("-------------------------");
	}//main

}//class
