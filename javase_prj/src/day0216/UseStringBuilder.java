package day0216;

/**
 * 긴자열을 다룰 때 사용하는 클래스.<br>
 * StirngBuffer, StringBulider의 사용.<br>
 * @author user
 */
public class UseStringBuilder {
	
	public void useStringBuffer() {
		//1. 생성
		StringBuffer sb = new StringBuffer();
		
		//2. 사용
		//값 추가. append(값);
		sb.append("안녕."); //문자열 추가
		sb.append(2021); //정수 추가
		sb.append("년"); //문자열 추가
		sb.append('A');//문자 추가
		sb.append(2.16);//실수 추가
		sb.append(true);//불린 추가
		
		//값 삽입. insert(추가할 위치 인덱스, 값);
		//안녕.2021년A2.16true
		sb.insert(10, "월");
		sb.insert(14,"일");
		
		//값 삭제. delete(시작 인덱스, 끝 인덱스+1);
		//안녕.2021년A2월.16일true
		sb.delete(3, 8);
		//문자열 뒤집기.
		sb.reverse();
		sb.reverse();
		
		
		
		
		System.out.println(sb);
		
		
	}//useStringBuffer
	
	public void useStringBuilder() {
		//1. 생성
		StringBuilder sb = new StringBuilder();
		
		//2. 사용
		//값 추가. append(값);
		sb.append("안녕."); //문자열 추가
		sb.append(2021); //정수 추가
		sb.append("년"); //문자열 추가
		sb.append('A');//문자 추가
		sb.append(2.16);//실수 추가
		sb.append(true);//불린 추가
		
		//값 삽입. insert(추가할 위치 인덱스, 값);
		//안녕.2021년A2.16true
		sb.insert(10, "월");
		sb.insert(14,"일");
		
		//값 삭제. delete(시작 인덱스, 끝 인덱스+1);
		//안녕.2021년A2월.16일true
		sb.delete(3, 8);
		//문자열 뒤집기.
		sb.reverse();
		sb.reverse();
		
		
		
		
		System.out.println(sb);
		
		
	}//useStringBuilder
	
	
	
	public static void main(String[] args) {
		UseStringBuilder usb = new UseStringBuilder();
		
		usb.useStringBuffer();
		System.out.println("-------------------------");
		usb.useStringBuilder();
		System.out.println("-------------------------");
		
		String file1 = "c:/dev/test.txt.doc";
		String file2 = "c:/work/test/day0216/Test.java";
		
		//StringBuilder를 사용하여 "c:/dev/test.txt.doc" -> "c:/dev/test.txt.temp.doc"
		StringBuilder sbFile1=new StringBuilder(file1);
		sbFile1.insert(sbFile1.lastIndexOf("."), ".temp");
		System.out.println(sbFile1);
		
		//StringBuilder를 사용하여 "c:/work/test/day0216/Test.java" -> "c:/work/day0216/Test.java"
		StringBuilder sbFile2=new StringBuilder(file2);
		sbFile2.delete(8, 13);
		System.out.println(sbFile2);
		
		
		
	}//main

}//class
