package day0607;

import java.util.HashMap;
import java.util.Map;

public class UseMap {
	
	/**
	 * Interface를 구현하지 않는 클래스를 사용하여 Map에 추가하고 값 얻기
	 */
	public void noneUseInterface() {
		//1. Map객체 생성
		Map map = new HashMap();
		//2. 각각의 사람 객체를 Map에 추가
		map.put("lee", new HackMin());
		map.put("jin", new JaeHyck());
		map.put("han", new SangMin());
		//3. 키를 사용한 Map객체 얻기
		String key = "lee"; // jin, han
		//인터페이스를 사용하지 않으면 키를 사용하여 얻어와서 객체를 찾고, 객체가 제공하는 일을 
		//4개의 행으로 만들어야한다. 같은 일을 하지만 그 일에 대한 코드를 줄일 수 없다.
		if("lee".equals(key)) {
			HackMin hm = (HackMin)map.get(key);
			System.out.println(hm.msg1());
		}
		if("jin".equals(key)) {
			JaeHyck jh = (JaeHyck)map.get(key);
			System.out.println(jh.msg2());
		}
		if("han".equals(key)) {
			SangMin sm = (SangMin)map.get(key);
			System.out.println(sm.msg());
		}
		
	}//noneUseInterface

	/**
	 * Interface를 구현한 클래스를 사용하여 Map에 추가하고 값 얻기.
	 */
	public void useInterface() {
		//1. Map객체 생성
			Map<String,Person> map = new HashMap<String,Person>();
			//2. 각각의 사람 객체를 Map에 추가
			map.put("lee", new HackMin2());
			map.put("jin", new JaeHyck2());
			map.put("han", new SangMin2());
			//3. 키를 사용한 Map객체 얻기
			String key = "jin"; // jin, han
			//3. 키를 사용한 Map객체 얻기 : Override 된 method를 호출하면 
			//   자식클래스의 method가 호출된다.
			if(map.containsKey(key)) {
				Person person = map.get(key);//부모의 키로 찾아낸 자식을 부모로 받는다.
				//부모의 method를 호출하면 자식의 method가 호출된다. Override
				System.out.println(person.execute());
			}//end if
			
	}//useInterface

	public static void main(String[] args) {
		UseMap um = new UseMap();
		um.noneUseInterface();
		System.out.println("-------------------------------------------");
		um.useInterface();
		
	}//main

}//class
