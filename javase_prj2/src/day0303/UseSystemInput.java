package day0303;

import java.io.IOException;

/**
 * �Է��� �ٿ��� keyboard�϶��� ó��.
 * @author SIST
 */
public class UseSystemInput {
	
	public UseSystemInput() {
		
		System.out.println("�ƹ�Ű�� ������ ���͸� ġ����.");
		/////////////////////ù���ڸ� �б�/////////////
//		try {
//			int keyValue = System.in.read();
//			System.out.println("�Է��� �� : "+keyValue+"\t"+(char)keyValue);
//		}catch(IOException ie) {
//			System.err.println("Ű���� �Է��� ������ �߻��߽��ϴ�."+ie);
//		}//end catch
///////////////////////////1byte�� �� ��������(�ѱ� ���� �� ����.) �б�/////////////
		
	int readChar=0;
	
		try {
			while((readChar = System.in.read()) !=10 ) {
				System.out.print((char)readChar);
			}//end while
		} catch (IOException e) {
			System.err.println("�����߻�");
		}//end catch
		
		
	
	}//UseSystemInput
	
	public static void main(String[] args) {
		new UseSystemInput();
	}//main	

}//class
