package day0125;

public class Homework0125 {

	public static void main(String[] args) {
		// -while�� ����Ͽ� ������ ��ü ���� ���η� ���.
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
		
		// -while�� ����Ͽ� 1~100������ ���� ���.
		int sum = 0;
		int k = 1;
		while(k<101) {
			sum = sum + k;
			k++;
		}
		System.out.println( sum );
		
		System.out.println("-------------------------");	
		
		// -do~while�� ����Ͽ� 1~100������ ¦���� ����ϴ� �ڵ带 �ۼ��ϰ� 50�϶� break�� ����Ͽ� �ݺ����� ���������� �ڵ带 �ۼ��ϼ���.
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
		 
		// -���� for�� ����Ͽ� �Ʒ��� ���� ����̵ǵ��� �ۼ�.
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
