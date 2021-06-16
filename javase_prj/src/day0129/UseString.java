package day0129;

/**
 * 문자열(String)의 주소를 저장하고 사용할 수 있는 java.lang.String 클래스의 사용.<br>
 * 문자열 저장소에 동일 문자열은 하나만 생성되고 사용한다.
 * @author user
 */
public class UseString {

	public static void main(String[] args) {
		//기본형 형식 (new를 사용하지않고 java.lang.String클래스를 사용)
		String str ="Abcdef";
		System.out.println(str);
		System.out.println("기본형 형식 ==비교 "+(str =="Abcdef")); // 기본형 형식의 사용은 == 비교 가능
		System.out.println("기본형 형식 equals비교 "+str.equals("Abcdef")); // 기본형 형식의 사용은 == 비교 가능
		
		//참조형 형식 (new를 사용하여 java.lang.String클래스를 사용)
		String str1=new String("Abcdef");
		System.out.println(str1);
		System.out.println("참조형 형식 ==비교 "+(str1 =="Abcdef")); // 참조형 형식의 사용은 ==비교 불가능
		System.out.println("참조형 형식 equals비교 "+str1.equals("Abcdef")); // 참조형 형식의 사용은 ==비교 불가능
		
		
	}//main

}//class
