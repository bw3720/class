package day0127;

/**
 *�ϳ��� �Ű������� �������� ���� �־ ����ϴ� Variable Arguments. 
 * @author user
 */
public class VariableArguments {
	
	
	public void year(int ... a) {
		//VA�� method�ȿ��� �迭�� ó���ȴ�.
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}//end for
	}//year
	
	//�ްԺ����� ������ ���� �� �� V.A�� ���� ���������� ���� �� �ִ�.
	public void temp(int a, int i, char...c) {
		
	}//temp
	
	public void temp1(int a, int i, char...c) {
		
	}//
	
	public static void main(String[] args) {

		VariableArguments va = new VariableArguments();
		va.year(1,3,5,4);
		//�ȳ��ϼ���? ���
		System.out.println("\"�ȳ��ϼ���?\"");
	}//main

}//class
