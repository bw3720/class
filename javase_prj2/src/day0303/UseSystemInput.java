package day0303;

import java.io.IOException;

/**
 * 입력의 근원이 keyboard일때의 처리.
 * @author SIST
 */
public class UseSystemInput {
	
	public UseSystemInput() {
		
		System.out.println("아무키나 누르고 엔터를 치세요.");
		/////////////////////첫글자만 읽기/////////////
//		try {
//			int keyValue = System.in.read();
//			System.out.println("입력한 값 : "+keyValue+"\t"+(char)keyValue);
//		}catch(IOException ie) {
//			System.err.println("키보드 입력중 문제가 발생했습니다."+ie);
//		}//end catch
///////////////////////////1byte로 된 여러글자(한글 읽을 수 없다.) 읽기/////////////
		
	int readChar=0;
	
		try {
			while((readChar = System.in.read()) !=10 ) {
				System.out.print((char)readChar);
			}//end while
		} catch (IOException e) {
			System.err.println("문제발생");
		}//end catch
		
		
	
	}//UseSystemInput
	
	public static void main(String[] args) {
		new UseSystemInput();
	}//main	

}//class
