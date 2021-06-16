package day0201;

/**
 * java.lang.String class 사용
 * @author user
 */
public class UseString {

	public static void main(String[] args) {
		//기본형 형식의 사용. new를 사용하지않고 문자열 저장소(String literal)에 주소를 담는 방식.
		String str = "Abcde";
		//참조형 형식의 사용. new를 사용하여 문자열 저장소(String literal)의 주소를 담는 방식.
		String str1 = new String("pokbw3720@gmail.com");
		
		System.out.println(str+"의 길이 "+str.length());
		System.out.println(str1+"의 길이 "+str1.length());
		
		System.out.println(str+"을 모두 대문자료 : "+str.toUpperCase());
		System.out.println(str1+"을 모두 소문자료 : "+str1.toLowerCase());
	
		System.out.println(str+"에서 'c'의 인덱스 : "+str.indexOf("c"));
		System.out.println(str+"에서 \"def\"의 인덱스 : "+str.indexOf("def"));
		
		System.out.println(str+"에서 'z'의 인덱스 : "+str.indexOf("z"));
		System.out.println(str+"에서 'def'의 인덱스 : "+str.indexOf("def"));
		
		str = "AbcdAbcdAbcd";
		System.out.println("indexOf -> 'c' : " + str.indexOf("c"));
		System.out.println("lastIndexOf -> 'c' : " + str.lastIndexOf("c"));
		
		str="test@test.com";//testtest.com, test@testcom
		//str에 들어있는 email 주소가 유효하다면 "유효" 그렇지 않다면 "무효"를 출력하는 코드 작성.
		System.out.println(str.indexOf("@")+" "+str.indexOf("."));
		System.out.print(str);
		if (str.indexOf("@") != -1 && str.lastIndexOf(".") != -1) {
			System.out.println("유효");
		}else {
			System.out.println("무효");
		}
		
		System.out.println(str.charAt(4)); //@
		System.out.println(str.charAt(9)); //.
		
		//문자열 추출 : substring(시작주소, 끝주소+1)
		str = "AbcdefG";
		System.out.println(str.substring(1,4)); //bcd
		System.out.println(str.substring(5)); //fG
		
		System.out.println(str.substring(1));//bcdefG
		
		//str1에서 이메일 주소를 출력해보세요
		System.out.println(str1.substring(0,str1.indexOf("@")));//bcdefG
		
		//str1에서 도메인 주소만 출력해보세요
		System.out.println(str1.substring(str1.indexOf("@")+1));//bcdefG
		
		//문자열 붙이기 : concat("붙일 문자열");
		str = "ABC";
		System.out.println(str.concat("DEF"));// + 써도 무방.
		System.out.println(str);
		
		//문자열 앞뒤공백 자르기 : trim();
		str = "  A BC";
		System.out.println("["+str+"][" + str.trim()+"]");
		System.out.println(str);
		
		//문자열이 같은지 비교 : equals("비교할 문자열");
		str = "ABC";
		boolean b = str.equals("ABC");
		System.out.println(b);
		
		//시작문자열이 같은지 비교 : startsWith("비교할 문자열");
		str = "Abcdef";
		String key = "Ab";
		System.out.println(str+"은"+key+"로 시작되었는가? : "+str.startsWith(key));
		
		//끝문자열이 같은지 비교 : endsWith("비교할 문자열");
		key ="ef";
		System.out.println(str+"은"+key+"로 끝났는가?"+str.endsWith(key));
		
		//특정 문자열을 포함하고 있는지 비교 : contains("비교할문자열");
		key="Acdef";
		System.out.println(str+"은"+key+"를 포함하고 있는가?"+str.contains(key));
		
		//문자열의 치환 : replace("찾을 문자열","변경할 문자열");, replaceAll("a","b");
		System.out.println(str+"에서 cd를 KKK로 치환 : "+str.replaceAll("cd", "KKK"));
		
		//기본형 데이터형을 문자열에 할당 : valueOf(기본형 데이터형);
		//static method는 객체가 가지고 있는 값을 사용하여 업무를 처리하지 않는다.
		int i = 2021;
		String s = String.valueOf(i);	
		System.out.println(s);

		
		////////아래 initCap method를 완성하고, name 변수를 initCap method의 매개변수에 할당한 후
		//대문자로 변경된 문자열을 얻어 출력.
		String name = "tT";
		
		UseString us = new UseString();
		System.out.println(us.initCap(name));
		
	}//main

	/**
	 * 매개변수로 입력되는 문자열의 첫글자만 대문자로 변경하여 반환하는 일.
	 * @param str 첫글자를 대문자로 변경해야하는 문자열.
	 * @return 첫글자만 대문자로 변경된 문자열.
	 */
	public String initCap(String str) {
		//String rename = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
		if(str == null && !str.isEmpty()) {
			int startidx =1;
			
//			String firstChar = str.substring(0,startidx);
//			firstChar = firstChar.toUpperCase();
			
			//method chain
			//method가 반환형 있다면 .을 사용하여 method를 계속 연결하여 호출 할 수 있다.
			//가장 마지막에 쓴 method가 반환 값이 된다.
			
			String firstChar = str.substring(0,startidx).toUpperCase();
			String seconChar ="";
			if(str.length()>1) { //글자수가 1글자 이상이면
				//두번째 글자부터 소문자로 변경.
				seconChar = str.substring(startidx).toLowerCase();
			}//end if
			
			str=firstChar.concat(seconChar);
		}//end if
		
		return str; 
	}//initCap
	
}//class
