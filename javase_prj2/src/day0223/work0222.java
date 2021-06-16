package day0223;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class work0222 {
	
	private Map<String, String> bloodMap;
	
	public String bloodType(String blood) {
		String result="입력하신 혈액형은 사람의 것이 아닙니다.";
		//Map 생성 : is a 관계 객체화
		bloodMap = new HashMap<String, String>();//16개의 행 생성
		
		//값 할당
		bloodMap.put("A", "내향적입니다. 그들이 비록 외향적으로 보일지라도 실제 내면의 모습은 조심스럽고 세심한 면이 있습니다. 대체로 생각은 비관적입니다.");
		bloodMap.put("B", ": 대체적으로 자기중심적입니다. 규율이나 규칙, 속박을 극히 싫어함. 생각이 유연하고 기발한 발상에 뛰어납니다");
		bloodMap.put("AB", "합리적입니다. 그래서 사회의 의리나 인정 그리고 가타 제도 등에 대해 관심이 적고 합리적인 반듯함을 선호하게 됩니다. ");
		bloodMap.put("O", ":  따스한 인간성 자신이 목표로 하고있는 일에 대하여 한결같은 노력과 전문가적인 강점으로 목표를  달성하는 추진력이 있다.");
		
		//값 얻기
		blood = blood.toUpperCase();// a ->A , A->A

		//키가 존재한다면 값을 얻기
		if(bloodMap.containsKey(blood)) {//키가 존재한다면 
			result = bloodMap.get(blood);//키에 대한 값을 얻는다.
		}//end if
		
		return result;
	}//bloodType
	
	public void searchBlood(String inputBlood) {
		//String inputBlood="A";
		System.out.println(inputBlood + "형은 "+bloodType(inputBlood));
	}//searchBlood
	
	public void validationMap() {
		//Map의 모든 키를 Set으로받기
		if(bloodMap != null) { // 객체가 생성되었는지? (heap의 주소를 할당 받았는가?)
			Set<String> set = bloodMap.keySet();
			//Set을 사용 (Iterator 사용)
			Iterator<String> ita = set.iterator();//set의 제어권을 iterator로 할당.
			
			String key="";
			while(ita.hasNext()) {//값이 존재?
				key = ita.next();
				System.out.println(key+"/"+bloodMap.get(key));
			}//end while
			
		}else{
			System.out.println("Map을 검증할려면 Map에 객체가 생성되어 있어야 합니다.");
			System.out.println("searchBlood()를 호출 후 사용가능 합니다.");
			
		}//end else
		
	}//validationMap
	
	public char changeChar(char ch) {
		char temp = ch;
		if(ch >64 && ch<91) {//대문자 -> 소문자
			temp+=32;
		}//end if
		
		if(ch >96 && ch<123) {//소문자 -> 대문자
			temp-=32;
		}//end if
		
		return temp;
	}//changeChar
	
	public static void main(String[] args) {
		work0222 work = new work0222();
		work.searchBlood("a");
		work.validationMap();
		System.out.println(work.changeChar('a'));
			
			
	}//main

}//class
