package day0304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 키보드에서 입력된 데이터를 JVM내부로 읽어들이기.
 * 문제 : 한글이 깨진다
 * 해결 : 8bit와 16bit 스트림을 연결한다.
 * @author SIST
 */
public class UseBufferedReader {
	
	public UseBufferedReader() throws IOException{
//		//키보드에서 읽을 수 있는 스트림 얻기
//		InputStream is = System.in;
//		//8bit 스트림과 16bit 스트림을 연결
//		InputStreamReader isr = new InputStreamReader(is);
//		//줄단위로 읽기기능이 구현된 스트림을 연결
//		BufferedReader br = new BufferedReader(isr);
//
/////////////  위의 코드를 한줄로 적은것.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("아무키나 누르고 엔터.");
		String text = br.readLine();
		
		System.out.println("입력 값 : "+text);
		
		br.close();
		
		
		
		
	}//UseBufferedReader

	public static void main(String[] args) {
		
		try {
			new UseBufferedReader();
		} catch (IOException IOe) {
			IOe.printStackTrace();
		}//end catch
		
	}//main

}//class
