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
			//API를 보고 e.printStackTrace(); 에서 출력하는 내용을  Console이 아닌 파일 (c:/dev/err.log)로 출력
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
