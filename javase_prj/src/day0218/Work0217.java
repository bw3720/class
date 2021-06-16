package day0218;


/**
 * �ӽú�й�ȣ 8�ڸ��� �����Ͽ� ��ȯ<br>
 * �ζǹ�ȣ 6�ڸ��� �����Ͽ� ��ȯ
 * @author user
 */
public class Work0217 {
	
	public static final int upperCase=0;
	public static final int lowerCase=1;
	public static final int decimal=2;
	
	/**
	 * �ӽ� ��й�ȣ 8�ڸ��� �����Ͽ� ��ȯ�ϴ���.<br>
	 * �����ȣ�� �ߺ����ڰ� ���� �� ������, ����,�빮��,�ҹ��ڷ� �����ȴ�.
	 * 
	 * @return ������ �ӽ� ���
	 */
	public char[] createPassword() {
		char[] tempPass = new char[8];
		
		int flag = 0;//� ���ڸ� ���� ������ ����.
		
		for(int i =0; i < tempPass.length; i++) {
			flag = (int)(Math.random()*3);
			
			switch(flag) {
			case upperCase : 
				tempPass[i] = (char)((Math.random()*26)+65);
				break;
			case lowerCase :
				tempPass[i] = (char)((Math.random()*26)+97);
				break;
			case decimal :
				tempPass[i] = (char)((Math.random()*10)+48);
				break;
			}//end switch
		}//end for
		
		return tempPass;
	}//createPass

	///////////////////////////////////////////////////////////////
	
	public char[] createPassword1() {
		char[] tempPass = new char[8];
		char[] password = {
				'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
				'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
				'0','1','2','3','4','5','6','7','8','9'
				};
		
		for(int i = 0; i < tempPass.length; i++) {
			tempPass[i] = password[(int)(Math.random()*password.length)];
		
		}//end for
		
		return tempPass;
	}//createPassword1
	
	///////////////////////////////////////////////////////////////

	public char[]createPassword2() {
		char[]tempPass = new char[8];
		String passwordSet = "1234567890"
				+ "abcdefghijklmnopqrstuvwxyz"
				+ "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for(int i =0; i<tempPass.length;i++) {
			tempPass[i]= passwordSet.charAt((int)(Math.random()*passwordSet.length()));
		}//end for
		return tempPass;
	}//createPassword2
	
	///////////////////////////////////////////////////////////////
	
	public void printPass(char[] tempPass) {
		System.out.println(tempPass);
	}//printPass
	
	////////////////////////////////////////////////////////////////

	/**
	 * �ζǹ�Ȥ �̱�.(�ߺ�����)
	 * 1~45���� �� �� �ϳ��� 6��Ʈ�� �̷��. 
	 * @return
	 */
	public int[]createlotto(){
		int[]tempLotto = new int [6];
		
		for(int i =0; i<tempLotto.length;i++) {//1~45���� ������ ��ȣ�� �����ϱ� ���� for
			tempLotto[i]= (int)((Math.random()*45)+1);
			//�ߺ� ���� : �̹��濡 ������ ���� �����濡 �����ϴ� ���� ������ ��.(������ ����� �ݺ�)
			for(int j =0;j<i;j++) { // �������� ���� ���ϱ� ���� for
				if(tempLotto[i] == tempLotto[j]) {//�߻��� ���� ���� ���� �����濡 �����ϴ���?
					//������� ���� �ٽ� �����Ͽ� ��
					//�ε����� ������� �ε����� ����.
					i--;
					break;//�ٽ� ���� �����ϵ��� ���� for(�񱳿� for)�� ����������.
				}//end if
			}//end for
		}//end for
		
		
		
		
		return tempLotto;
	}//createlotto
	
	////////////////////////////////////////////////////////////////
	
	public void printLotto(int[] tempLotto) {
		int temp = 0;
		for(int i=0; i<tempLotto.length;i++) {
			for(int j = i+1; j<tempLotto.length; j++) {
				if(tempLotto[i]>tempLotto[j]) {
					temp = tempLotto[i];
					tempLotto[i]=tempLotto[j];
					tempLotto[j]= temp;
					
				}//end if
			}//end for
		}//end for
		
		for(int value : tempLotto) {
			System.out.printf("%-3d",value);
		}//end for
		
	}//printLotto

	
	////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Work0217 work = new Work0217();
		char[]temp = work.createPassword2();
		work.printPass(temp);
		System.out.println("-----------------------------");
		work.printLotto(work.createlotto());
		
		
	}//main
	
}//class
