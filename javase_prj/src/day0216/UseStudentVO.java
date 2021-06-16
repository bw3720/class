package day0216;


/**
 * ����� ����  ������������ ���� Ŭ������ ���.
 * @author user
 */
public class UseStudentVO {
	
	public static void main(String[] args) {
		// ��ȣ 1, �̸� : ���ϴ�, ����:20, Ű : 185.8 (��� �����͸� �˰� �ִ� ��Ȳ => �Ű������ִ� ������) 
		StudentVO leehaneul = new StudentVO(1,"���ϴ�",20,185.8);
	
		System.out.println(leehaneul.toString());
		
		// ��ȣ 2, �̸� : �ڱ�� (��� �����͸� ���� ���ϴ� ��Ȳ => �⺻������)
		StudentVO parkgibum = new StudentVO();
		parkgibum.setRegiName(2);
		parkgibum.setName("�ڱ��");
		
		System.out.println(parkgibum);
		System.out.println("-----------------------------------------------");
		
		///�����л��� ������ �����ϰ� ó��. ��������� ������������ �迭�� ����.
		//1.���ϴ�,20,185,8, 2,�ڱ��,25,170.3, 3,���μ�,26,178.7
		
		//1. ����. ��������[] �迭�� = null;
		StudentVO[]stuArr = null;

		//2. ����. �迭�� = new ��������[���ǰ���];
		stuArr = new StudentVO[3];
		
		//3. �� �Ҵ�.
		stuArr[0]=leehaneul;
		stuArr[1]=parkgibum;
			///stuArr[1]�� �ּҿ� parkgibum�� �ּҰ� ����.
			///stuArr[1]�� ����Ͽ� ���� 25�� ����
			stuArr[1].setAge(25);
			///parkgibum�� ����Ͽ� Ű 170.3 ����
			parkgibum.setHeight(170.3);
		
		stuArr[2]= new StudentVO(3,"���μ�",26,178.8);
		
		//4. �� ���. (�ϰ�ó��)
		StudentVO temp = null;
		
		for(int i =0; i < stuArr.length; i++) {
			temp = stuArr[i];
			System.out.printf("��ȣ : %d, �̸� : %s, ���� : %d, Ű : %.1f\n",temp.getRegiName(),temp.getName(),temp.getAge(),temp.getHeight());
			//System.out.println(temp);
		}//end for
		
		
		
		
		
		
		
		
		
	}//main

}//class
