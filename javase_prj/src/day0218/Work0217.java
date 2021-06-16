package day0218;


/**
 * 임시비밀번호 8자리를 생성하여 반환<br>
 * 로또번호 6자리를 생성하여 반환
 * @author user
 */
public class Work0217 {
	
	public static final int upperCase=0;
	public static final int lowerCase=1;
	public static final int decimal=2;
	
	/**
	 * 임시 비밀번호 8자리를 생성하여 반환하는일.<br>
	 * 비빌번호는 중복문자가 있을 수 있으며, 숫자,대문자,소문자로 구성된다.
	 * 
	 * @return 생성된 임시 비번
	 */
	public char[] createPassword() {
		char[] tempPass = new char[8];
		
		int flag = 0;//어떤 문자를 뽑을 것인지 결정.
		
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
	 * 로또번혹 뽑기.(중복배제)
	 * 1~45개의 수 중 하나가 6세트를 이룬것. 
	 * @return
	 */
	public int[]createlotto(){
		int[]tempLotto = new int [6];
		
		for(int i =0; i<tempLotto.length;i++) {//1~45개중 임의의 번호를 생성하기 위한 for
			tempLotto[i]= (int)((Math.random()*45)+1);
			//중복 배제 : 이번방에 생성된 값과 이전방에 존재하는 값이 같은지 비교.(생성된 방까지 반복)
			for(int j =0;j<i;j++) { // 이전방의 값을 비교하기 위한 for
				if(tempLotto[i] == tempLotto[j]) {//발생된 값과 같은 값이 이전방에 존재하는지?
					//현재방의 값을 다시 생성하여 비교
					//인덱스를 현재방의 인덱스로 설정.
					i--;
					break;//다시 값을 생성하도록 안쪽 for(비교용 for)를 빠져나간다.
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
