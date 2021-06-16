package day0304;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * HDD에 존재하는 파일의 정보를 얻기위해 만들어진 클래스의 사용.
 * @author SIST
 *
 */
public class UseFile {
	
	public UseFile() {
		//1. 객체생성.
		File file = new File("c:/dev/temp/java_read.txt");
		System.out.println(file);//객체를 출력했을 때 주소가 나오지 않는 이유는?  java.lang.object 클래스의 toStirng()를 Override했기 때문
		System.out.println("파일 존재? : "+file.exists());
		
		try {
			System.out.println("규범 경로 : "+file.getCanonicalPath());//OS에서 파일에 접근하기위한 유일한 경로로 : 드라이브명 대문자만.
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
		
		System.out.println("절대 경로 : "+file.getAbsolutePath());//드라이브 명부터 사용하는 경로 : 드라이브명 대소문자 둘다 사용용된다.
		System.out.println("상대 경로 : "+file.getPath());//절대경로와 똑같.
		
		//경로에 대한 정보를 쪼개기
		System.out.println("파일이 있는 폴더명 : "+file.getParent());
		System.out.println("파일명 : "+file.getName());
		
		System.out.println("파일인가? : " +file.isFile());
		System.out.println("폴더인가? : " +file.isDirectory());
		
		System.out.println("실행 가능? : " +file.canExecute());
		System.out.println("읽기 가능? : " +file.canRead());
		System.out.println("쓰기 가능? : " +file.canWrite());//쓰기 불가능한 파일. ODD
		
		System.out.println("숨긴파일? : " +file.isHidden());
		
		//System.out.println("파일 삭제 : " +file.delete());
		long lm = file.lastModified();
		System.out.println("마지막으로 수정된 날짜 : "+ file.lastModified());
		Date date = new Date(lm);
		System.out.println(date);//마지막으로 수정된 날짜를 볼 수 있다. => 원하는 형식변환 : SimpleDateFormat
		
		File mk = new File("c:/test/temp");
		//System.out.println(mk.mkdir()); //mkdir(); = 폴더가 하나이면 어디든지 생성가능, 최상위 폴더부터 생성하는데 하위폴더가 존재하면 생성되지 않는다.
		System.out.println(mk.mkdirs()); //mkdirs(); = 폴더가 하나이면 어디든지 생성가능, 하위 폴더가 존재하더라도 생성 가능.
		
		
		
		
		
		
	}//UseFile

	public static void main(String[] args) {
		new UseFile();
	}//main

}//class
