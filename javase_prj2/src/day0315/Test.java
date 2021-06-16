package day0315;

import java.io.IOException;
import java.io.PrintWriter;

public class Test {

	public Test() throws ClassNotFoundException, IOException{
		Class.forName("day0315.Test1");
	}//test
	
	public static void main(String[] args) throws IOException{

		try {
			new Test();
		} catch (ClassNotFoundException e) {
			//API�� ���� e.printStackTrace(); ���� ����ϴ� ������  Console�� �ƴ� ���� (c:/dev/err.log)�� ���
			e.printStackTrace();
			
			PrintWriter pw = null;
			try {
				pw = new PrintWriter("c:/dev/err.log");
				e.printStackTrace(pw);
				pw.flush();
			} finally {
				if(pw != null) {pw.close();}
			}//end catch
		}//end catch
		
		
	}//main
			

}//class
