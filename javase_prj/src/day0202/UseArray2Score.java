package day0202;

/**
 * ������ �迭�� �⺻�� ������ ���. 
 * @author user
 */
public class UseArray2Score {
	
	
	
	
	public static final int JAVA_SCORE=0;
	public static final int ORACLE_SCORE=1;
	public static final int JSP_SCORE=2;
	
	public void processScore() {
		
		String[] names ={"��","��","��","��","��"};
		
		//������ �迭�� �౸�� ��ȣ�� ������������� ������ �߻�.{{}}
		int[][] score= { {89,91,73}, {61,70,72}, {96,99,98}, {79,77,80}, {100,98,99}};//5�� 3��
//		int[][] score= { {89,91,73, 61,70},{72, 96,99,98, 79},{77,80, 100,98,99}};//3�� 5��
//		System.out.println(score.length+"��"+score[0].length+"��");
		int hap = 0; // �л��� ������ ���ϴ� ����
		int javaTotal=0;//�ڹ� ����
		int oracleTotal=0;//����Ŭ ����
		int jspTotal=0;//JSP ����
		
		int[] totalScore=new int[score.length];// �л��� �ο������ �迭 ����
		int[] javaScore=new int[score.length];
		
		System.out.println();
		System.out.println("��ȣ\t�̸�\t�ڹ�\t����Ŭ\tJSP\t����\t���");
		System.out.println("----------------------------------------------------------");
		for(int i =0; i<score.length; i++) {//�� - ����л�
			System.out.printf("%d\t%s\t",i+1,names[i]);//��ȣ �̸�
			
			for(int j =0; j<score[i].length; j++) {//�� -�л� �Ѹ��� ������ ����
				System.out.printf("%d\t",score[i][j]);
				hap += score[i][j];
				
			}//end for
			javaTotal += score[i][JAVA_SCORE];
			oracleTotal += score[i][ORACLE_SCORE];
			jspTotal += score[i][JSP_SCORE];
			javaScore[i]=score[i][JAVA_SCORE];
			totalScore[i]=hap;//���� �迭�� �л� ������ �Է�
			System.out.printf("%d\t%.2f\n",hap,(double)hap/score[i].length);
			hap = 0;
		}//end for
		
		System.out.println("----------------------------------------------------------");
		double cnt = score.length;
		System.out.printf("����\t\t%d\t%d\t%d\n",javaTotal,oracleTotal,jspTotal);
		System.out.printf("���\t\t%.2f\t%.2f\t%.2f\n",javaTotal/cnt,oracleTotal/cnt,jspTotal/cnt);
		
		System.out.printf("1���л� [%s]\n",topStudent(totalScore, names));//method�� ����� return.
		System.out.printf("�ڹ��� �ְ����� [%d]\n",javaTopScore(javaScore));//method�� �����.
		
		
		System.out.printf("�� ���� �ο�[%d]��, ���� ����� [%d]\n",names.length,score[0].length);
		
		//1�� �л��� ������ ������������ �����Ͽ� ��� //method�� �����.
		//2���� �迭�� ���� �Է�.(2���� �迭�� ���� 1���� �迭�� �ּҸ� ������.)
		printScoreSort(score[0]);
		
		
	}//processScore
	
	
	///////////////////////1�� ���ϱ�//////////////////////
	/**
	 * 1���л��� ��ȣ�� �̸��� ��� ��.
	 * @param totalScore �л��� ����.
	 * @param names �л��� �̸�.
	 * @return 1���л��� ��ȣ�� �̸�.
	 */
	private String topStudent(int[] totalScore,String[] names) {
		String result ="";
		
		int topNum =0;
		int tempScore=0;
		
		for(int i=0;i<totalScore.length;i++) {
			if(tempScore < totalScore[i] ) {//�ӽú����� ���� �迭�� i��° ���� ������ �۴ٸ�
				tempScore=totalScore[i];//i��° ���� ������ �ӽú����� �����Ѵ�.
				topNum=i;
			}//end if
		}//end for
		
		result=(topNum+1)+"�� "+names[topNum];
		
		
		return result;
	}//topStudent
	/////////////////////////////////////////////////////
	
	
	/////////////////////////////////////////////////////
	/**
	 * �ڹ� �ְ� ���� ���.
	 * @param javaScore �ڹ� ����.
	 * @return �ڹ��� �ְ� ����.
	 */
	private int javaTopScore(int[] javaScore) {//������ for : �迭�� ó�� ����� ������� �ݺ���ų��.
		int topScore =0;
		
		for(int score:javaScore) {//������ for
			if(topScore < score) {
				topScore=score;
			}//end if
		}//end for
		
		return topScore;
	}//javaTopScore
	///////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////
	/**
	 * �ԷµǴ� ������ ������������ �����Ͽ� ����ϴ� ��.
	 * @param score ������ ����.
	 */
	private void printScoreSort(int[]score) {
		//�ּҰ� �ԷµǸ� ������ �ּҿ� ���� �����͸� ����ϱ� ������ ���� ����ȴ�.
		//�迭�� �����Ͽ� ���.
		//////////score�迭�� ���� �����ϴ� tempScore�迭�� ����.
		
		//1.������ �迭�� ����
		int[]copyScore = new int[score.length];
		//2.�����迭���� ó������� ������ ����� ������ �迭�� �ִ´�.
		for(int i =0; i<score.length;i++) {
			copyScore[i] = score[i];
		}//end for
		
		//����� �迭�� ����Ͽ� ���� �۾��� ����.
		int temp=0;
		for(int i =0; i<copyScore.length-1; i++) {//�չ��� ���� ����ϱ� ���� 
			for(int j =i+1; j<copyScore.length; j++) {//�޹���� ���� ����ϱ� ����
				if(copyScore[i]>copyScore[j]) {//�� ��
					temp = copyScore[i];
					copyScore[i]=copyScore[j];
					copyScore[j]=temp;
				}//end if
			}//end for
		}//end for
		//���� �����͸� ���.
		for(int value:copyScore) {
			System.out.printf("%-5d",value);
		}//end for
	}//printScoreSort
	
	
	public static void main(String[] args) {
		//
//		UseArray2Score uas = new UseArray2Score();
//		uas.processScore();
		
		new UseArray2Score().processScore();
		
		
		
		
		
	}//main

}//class
