package day0202;

/**
 * ������ �迭�� �л��� ������ ó���ϴ� ���α׷��� �ۼ�.
 * @author user
 */
public class UseArrayScore {
	public void score() {
		//1. 6���� �л������� ������ �迭�� ����
		int[] studentScore = {84,72,99,95,60,63};
		int totalScore = 0;
		System.out.println("��ȣ\t����");
		System.out.println("-------------");
		for(int i = 0; i<studentScore.length; i++) {
			System.out.printf("%d��\t%d��\n",i+1,studentScore[i]);
			totalScore += studentScore[i];
		}//end for
		
		System.out.println("-------------");
		System.out.printf("�����ο�[%d]��\n",studentScore.length);
		System.out.printf("����[%d]��\n",totalScore);
		System.out.printf("���[%.2f]��\n",(double)totalScore/studentScore.length);
	}//score

	public void familyName() {
		String[] name= {"���μ�","������","�����","������","�����","�̻�ö","�̿���","���ϴ�"
				,"������","���й�"};

		//�̾��� ���
		for(int i =0; i<name.length; i++) {
//			if(name[i].indexOf("��" == 0)) {
//			if(name[i].charAt() == '��') {
//			if(name[i].substring(0,1).equals("��")) {
			if(name[i].startsWith("��")) {
				System.out.println(name[i]);
			}//end if
		}//end for
	
	}//familyName
	
	public static void main(String[] args) {
		UseArrayScore uas = new UseArrayScore();
		uas.score();
		System.out.println("------------------------");
		uas.familyName();
	}//main

}//class