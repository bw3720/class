package day0219;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 검색이 기능이 없으며, 중복데이터를 저장하지 않는 Set의 사용.<br>
 * 순서가 없으며 유일한 값을 저장하고 사용해야할 때.<br>
 * @author user
 */
public class UseSet {
	
	public UseSet() {
		//1.생성
		Set<String> set = new HashSet<String>();
		
		//2.값 할당 : 값은 순서대로 입력되지 않는다.
		set.add("1.자바");
		set.add("2.오라클");
		set.add("3.JDBC");
		set.add("4.HTML");
		set.add("5.CSS");
		set.add("6.JavaScript");
		set.add("7.Servlet");
		set.add("2.오라클");//중복값은 입력되지 않는다.
		
		//배열로 복사.
		//set의 크기로 배열을 생성.
		String[]copyArr = new String[set.size()];
		
		//set의 내용을 배열로 복사.
		set.toArray(copyArr);
		
		//3.값 삭제
		set.remove("6.JavaScript");
		//모든 방의 값 삭제.
		//set.clear();
		
		System.out.println(set+"/"+set.size());
		//4.검색 => 검색의 기능이 없다. Iterator를 사용.
		Iterator<String> ita = set.iterator(); // set을 검색할 수 있게 set의 제어권을 받는다.
		
		while(ita.hasNext()) {//제어권을 받은 set객체의 Element가 존재하는지? true|false
			System.out.println(ita.next());
		}//end while
 		
		System.out.println("-------------------------------------------------");
		//set은 검색의 기능이 없어 기존의 for문으로는 출력이 불가능.
		//개선된 for문으로는 출력이 가능.
		for(String temp : set) {
			System.out.println(temp);
		}//end for
		
		System.out.println("-------------------------------------------------");
		for(String temp : copyArr) {
			System.out.println(temp);
		}//end for
		
		
		
	}//UseSet
	
	public static void main(String[] args) {
		new UseSet();
	}//main

}//class
