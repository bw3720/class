package day0202;

/**
 * ��� ���� �����Ǵ� �������迭�� ���.
 * @author user
 */
public class UseArray2 {
	public UseArray2() {
		//1. ����) : ��������[][] �迭�� = null;
		int[][]arr=null;
		
		//2. ����) : �迭�� = new ��������[���� ��][���� ��];
		//������� ���� ������ ����. ������ ���� �ʱ�ȭ�ȴ�.
		arr = new int[3][4];
		
		System.out.println(arr[1]);//������ �迭���� ���� ��ȣ�� �ּҸ� ������ �ִ�.
		
		System.out.println("���� �� : "+arr.length+" ���� �� : "+arr[2].length);
		
		//3. �� �Ҵ�) : �迭��[���ǹ�ȣ][���ǹ�ȣ] = ��;
		//���� ��ȣ�� �ּҸ� ������ �ֱ� ������ ���� ���� �� ����.
		arr[0][0]=10;
		arr[1][1]=20;
		arr[2][2]=30;
		arr[1][3]=40;
		
		//4. �� ���) : �迭��[���� ��ȣ][���� ��ȣ]
		System.out.println(arr[0][0]+"/"+arr[0][1]);
		
		// �ϰ�ó��)
		for(int i = 0; i<arr.length; i++) {//���� �ݺ��ϱ� ���� for
			System.out.println(i+"�� ����");
			for(int j = 0; j<arr[i].length;j++) {//���� �ݺ��ϱ� ���� for
				System.out.printf("arr[%d][%d]=%-5d",i,j,arr[i][j]);
			}//end for
			System.out.println("\n"+i+"�� ��");
			
		}//end for
		
		String[][] gugu = null;
		gugu = new String[8][9];
		int row=0;
		int col=0;
		
		for(int i=2;i<10;i++) {
			for(int j=1; j<10;j++) {
//				gugu[row][col]=i+"*"+j+"="+(i*j);
//				System.out.printf(gugu[row][col]+"  ");
//				col++;
				gugu[i-2][j-1]=i+"*"+j+"="+(i*j);
				System.out.printf(gugu[i-2][j-1]+"  ");
			}
			System.out.println(" ");
//			row ++;
//			col=0;
		}
		
		int[][]temp=new int[6][10];//������ ��� ���� ���� 0���� �ʱ�ȭ

		for(int i=0; i<temp.length; i++) {
			for(int j=0; j<temp[i].length; j++) {
				if((i==0||i==temp.length-1) || (j ==0 || j==temp[i].length-1)) {
					temp[i][j]=1; //System.out.print("1 ");
//				}else {
//					temp[i][j]=0; //System.out.print("0 ");
				}//end else
				System.out.printf("%-3d",temp[i][j]);
			}//end for
			System.out.println(" ");
		}//end for
		
		
		
		
		
	}//UseArray2
	
	public static void main(String[] args) {
		new UseArray2();
	}//main

}//class
