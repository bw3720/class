package day0217;


public class Homework {
	
	public void password() { // ���� ��й�ȣ ���� 
		char[] pwTitle = new char[8];
		
		for(int i =0; i<pwTitle.length;i++) {
			char pw = (char)((int)(Math.random()*62)+48);
			pwTitle[i]=pw;
		}//end for
			
		System.out.println(pwTitle);
	}//password
	
	
	//////////////////////////
	public void lotto() {
		int[] lottoNum = new int[6];
		
		for(int i=0; i<lottoNum.length; i++) {
			lottoNum[i] = (int)(Math.random()*45)+1;
			
		}//end for ���� for
		
		for(int i = 0; i<lottoNum.length; i++) {
			System.out.print(lottoNum[i]+" ");
		}//end for ��� for
	
	}//lotto
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Homework hm =new Homework();
		
		hm.password();
		hm.lotto();
		
	}//main

}//class
