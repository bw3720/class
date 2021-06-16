package day0216;

import java.util.StringTokenizer;

/**
 * ���ڿ��� ª�� �� ����� �����ϴ� StringTokenizer�� ���.
 * @author user
 */
public class UseStringTokenizer {
	
	public UseStringTokenizer() {
		String data = "�ڹ� ����Ŭ �ӳɳ� JDBC HTML";
		
		//���ڿ��� �������� �����Ͽ� �ڸ� �� �ִ� ��ü�� ����.
		StringTokenizer stk = new StringTokenizer(data);
		
		System.out.println("��ū�� �� : "+stk.countTokens());
//	
//		System.out.println("��ū ����? "+stk.hasMoreTokens());//
//		System.out.println("��ū : "+stk.nextToken());
//		System.out.println("��ū : "+stk.nextToken());
//		System.out.println("��ū : "+stk.nextToken());
//		System.out.println("��ū : "+stk.nextToken());
//		System.out.println("��ū : "+stk.nextToken());
//		System.out.println("��ū ����? "+stk.hasMoreTokens());//
		
		String token="";
		while(stk.hasMoreTokens()) {
			token = stk.nextToken();
			System.out.println(token);
			//System.out.println("��ū�� �� : "+stk.countTokens()); //���� ��ū�������� ������ �ִ� ��ū
		}//end while

		System.out.println("-------------�����ʹ� �ѹ� �������� �ڷ� ���ư��� �ʴ´�.------------");
		
		//�ٽ� �ݺ���Ű�� �ʹٸ� ��ü�� ���� �����Ͽ� �����͸� ������ �̵���Ų��.
		stk = new StringTokenizer(data);
		
		while(stk.hasMoreTokens()) {
			token = stk.nextToken();
			System.out.println(token);
			//System.out.println("��ū�� �� : "+stk.countTokens()); //���� ��ū�������� ������ �ִ� ��ū
		}//end while
		
	
	}//UseStringTokenizer
	
	
	public static void main(String[] args) {
//		new UseStringTokenizer();
	
		String names="���й� �ǿ��� ����� ���μ� ������ ����� �ڱ��";
		//StkData�� ����Ͽ� �迭�� �����, names ���ڿ��� �������� �����Ͽ� StkData �迭�� �߰�.
		
		//���ڿ��� �ڸ� �� �ִ� ��ü���.(StringTokenizer, String.split())
		StringTokenizer stk = new StringTokenizer(names); // �Էµ� ���ڿ��� �������� ��ū�� �����.
		
		//1. StkData�� ����Ͽ� ��ü �迭�� ����.(�����? => ��ū�� ����)
		StkData[] nameArr = new StkData[stk.countTokens()];//��ū�� ������ ���� �����̱� ������ �� ��ū�� ��
	
		//2. ���ڿ� �߶� �迭�� �ִ´�.(��ū�� ��� ������ �𸥴�. => while ���)
		int idx =0; //�迭�� �濡 ���� �ֱ� ���� �ε��� ������ ����.
		while(stk.hasMoreTokens()) {
			nameArr[idx]= new StkData(); /////======>�̰� ������.
			nameArr[idx].setName(stk.nextToken());
			idx++;
		}//end while
		
		//3.�߷��� ���ڿ��� ���� �迭�� ����Ѵ�.
//		StkData sd = null;
//		for(int i=0; i<nameArr.length ; i++) {
//			sd=nameArr[i];
//			System.out.println(sd.getName()+"/"+sd.getAge());
//		}
		
		//������ for
		for(StkData sd : nameArr) {
			System.out.println(sd.getName()+"/"+sd.getAge());
		}
		
		
		
		
		
		///StkData stuLee = new StkData(null,25);
		///StkData stuKwon = new StkData("�ǿ���",25);
		///StkData stuKimDa = new StkData("�����",25);
		///StkData stuKang = new StkData("���μ�",25);
		///StkData stuSong = new StkData("������",25);
		///StkData stuKimDuk = new StkData("�����",25);
		///StkData stuPark = new StkData("�ڱ��",25);
	
	
	}//main

}//class
