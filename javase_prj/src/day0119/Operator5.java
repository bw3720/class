package day0119;
/**
�� ������<br>
�Ϲݳ�<br>
&&(AND),||(OR)<br>

��Ʈ��<br>
*/

class Operator5 {
	public static void main(String[] args) {
	///////////////�Ϲ� ��///////////////
		boolean flag1 = true, flag2 = false, flag3 = true, flag4 = false;

		System.out.println("-----------&&-----------");
		System.out.println( flag1 + "&&" + flag3 + "=" + (flag1 && flag3) );
		System.out.println( flag1 + "&&" + flag2 + "=" + (flag1 && flag2) );
		System.out.println( flag2 + "&&" + flag1 + "=" + (flag2 && flag1) );
		System.out.println( flag2 + "&&" + flag4 + "=" + (flag2 && flag4) );

		System.out.println("-----------||-----------");
		System.out.println( flag1 + "||" + flag3 + "=" + (flag1 || flag3) );
		System.out.println( flag1 + "||" + flag2 + "=" + (flag1 || flag2) );
		System.out.println( flag2 + "||" + flag1 + "=" + (flag2 || flag1) );
		System.out.println( flag2 + "||" + flag4 + "=" + (flag2 || flag4) );

		//&&�� ������ �����̸� ������ ������� �ʴ´�.
		flag1 = false;
		flag2 = false;
		flag3 = false;


		flag3 = (flag1 = 3<2) && (flag2 = 5<6);
		System.out.println("flag1 : " + flag1+", flag2 : " + flag2+", flag3 : " + flag3);
		
		int score = 101;

		//���� score���� �Ҵ�� ���� 0~100 ���̶�� true�� �׷��� �ʴٸ� false ����ϵ��� �Ϲݳ� �����ڸ�
		//����Ͽ� ����� ������.
		
		//���� �� �ڵ�
		boolean flag = false;
		flag = (score >= 0) && (score <= 100);
		System.out.println(flag);
		
		//������ �ڵ�
		System.out.println( score >= 0 && score <= 100);
		System.out.println("---------------��Ʈ������----------------");
				
		System.out.println("-----------&-----------"); 
		int i = 25;
		int j = 13;
		System.out.println(i+ "&" + j + "=" + (i & j)); //9
		
		System.out.println("-----------|-----------");
			i = 37;
			j = 7;
		System.out.println(i+ "|" + j + "=" + (i | j)); //39

		System.out.println("-----------^-----------");
			i = 17;
			j = 12;
		System.out.println(i+ "^" + j + "=" + (i ^ j)); //29
	}//main
}//class
