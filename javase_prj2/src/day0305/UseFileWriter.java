package day0305;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 16bit Stream을 사용한 파일에 문자열 기록
 * @author SIST
 */
public class UseFileWriter {
	
	public UseFileWriter() throws IOException{
		String data = "아버님이 누구인지 궁금합니다...택시비 2만원";
		
		File file = new File("c:/dev/temp1/string_data.txt");
		
		BufferedWriter bw = null;
		
		try {
			//1.스트림을 목적지 파일에 연결한다.
			bw = new BufferedWriter(new FileWriter(file));
			//2.스트림에 파일로 기록할 내용을 쓴다.
			bw.write(data);
			
			System.out.println("파일에 기록 되었습니다.");
			//3.스트림에 기록된 내용을 목적지파일로 분출.
	//		bw.flush();
			
		} finally {
			//4.스트림 연결끊기 (스트림에 기록된 내용이 목적지로 분출되고 연결이 끊어진다.)
			//close()만 잘해도 flush() 안써도됨.
			if(bw != null) {bw.close();}
		} 		
		
	}//UseFileWriter
	
	public static void main(String[] args) {
		
		try {
			new UseFileWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
		
	}//main

}//class
