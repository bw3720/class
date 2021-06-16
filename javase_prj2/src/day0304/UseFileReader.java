package day0304;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 16bit 스트림을 사용하여 문자열 파일 읽기.*(독자적인 포멧이 없는 단순 문자열만 읽어들여 확인 수 있다.)
 * @author SIST
 */
public class UseFileReader {
	public UseFileReader() throws FileNotFoundException,IOException{
		File file = new File("c:/dev/temp/java_read.txt");//UTF-8
		//파일과 연결하는 기능을 가진 스트림
		//FileReader fr = new FileReader(file);
		//줄단위로 읽어들이는 기능을 가진 스트림
		//BufferedReader br = new BufferedReader(fr);
		
		//BufferedReader br = new BufferedReader(new FileReader(file)); // charset이 맞지않아 한글이 깬진다.
		
		BufferedReader br=null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
		
			String lineData = "";
		
			while((lineData = br.readLine()) != null) {//readLine() 줄단위로 읽어 들이는데 \n전까지 읽어들인다.
				System.out.println(lineData);
			}//end while
		}finally{
			
			if(br != null){
				br.close();//중요함! 반드시 끊어져야한다...!
			}//end if
			
		}//end catch finally
		
	}//UseFileReader

public static void main(String[] args) {
	try {
		new UseFileReader();
	} catch (FileNotFoundException fnfe) {
		System.err.println("파일이 존재하지않습니다.");
		fnfe.printStackTrace();
	} catch (IOException ie) {
		System.err.println("파일읽기 작업 중 문제가 발생했습니다.");
		ie.printStackTrace();
	}
	}//main

}//class
