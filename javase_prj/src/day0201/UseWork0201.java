package day0201;

public class UseWork0201 {

	public static void main(String[] args) {
		String ssn = "880201-1234567";

		Work0201 work =new Work0201(ssn);
		//////////////////////////////////
		
		if(work.chkSsnLength()) {//�ֹι�ȣ�� ���ڼ��� 14���� üũ.
			if(work.chkHyphen()) {//�ֹι�ȣ�� -��ġ üũ
				System.out.println("�Է��ֹε��ȣ : "+work.getSsn());
				System.out.println("������� : "+work.getBirth());
				System.out.println("���� : "+work.getAge());
				System.out.println("���� : "+work.getGender());
				System.out.println("�� : "+work.getZodiac());
			}else {
				System.out.println("�̰� �Ӽ� 129?");
			}//end else
		}else {
			System.out.println(work.getSsn()+"��(��)���ڼ��� ���� �ʽ��ϴ�. ���ڼ��� Ȯ�����ּ���.");
		}//end else
		
		
	}//main

}//class
