package day0218;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


/**
 * java.util.List의 사용.<br>
 * -일차원 배열처럼 생성. 가변길이형(데이터를 추가하면 길이가 늘어나고, 데이터를 삭제하면 길이가 줄어든다.)<br>
 * -모든 데이터형이 저장될수 있으나, generic을 사용하면 입력데이터의 제한을 설정할 수 있다.<br>
 * -검색의 기능이 있으며, 중복데이터를 저장할 수 있다<br>
 * -추가된 데이터는 가장 뒤에 붙는다. <br>
 * -기존의 데이터 사이에 데이터를 추가할 때에는 LinkedList를 사용하는것이 좋다.<br>
 * @author user
 */
public class UseList {

	/**
	 * Multi Thread에서 동시접근 가능
	 */
	public void useArrayList() {
		//1.생성
		List<String> list = new ArrayList<String>();
		//2.크기 : size(); 방에 값이 있는 것만 크기에 포함시킨다.
		System.out.println("방의 갯수 : "+list.size());
		//3.값 할당 : 값은 뒤로 추가된다. 중복값을 저장할 수 있다.
		list.add("자바");
		list.add("오라클");
		list.add("JDBC");
		list.add("HTML");
		list.add("오라클"); // 중복값 저장 가능.
		list.add("CSS");
		list.add("JavaScript");
		System.out.println(list+"/"+list.size());//객체를 출력하면 주소가 나와야하는데 값이 나온 이유는 
												 //자식클래스에서 Object클래스의 toString()를  
												 //주소가 아닌 값을 출력할 수 있도록 Override 했기 때문에
		//4.배열로 복사
		 //Generic과 동일한 데이터형,리스트의 크기대로 배열을 생성한다.
		String[] subjectArr = new String[list.size()];
		 //리스트의 값을 배열로 보낸다.
		list.toArray(subjectArr);
		
		//5.값 삭제 : 방의 크기가 줄어든다.(저장공간을 효울적으로 사용가능)
		//index로 삭제하는 방법
		list.remove(3);
		
		//방의 값과 같은 객체를 넣어 삭제 : 가장 먼저 일치하는 방의 값 하나만 삭제. 왼 -> 오
		list.remove("오라클");
		
		System.out.println(list+"/"+list.size());
		
		//6.일괄처리 : list는 인덱스를 사용할 수 있고, 검색의 기능이 있으므로 일괄 처리를 할 수 있다.
//		String temp="";
//		for(int i =0; i<list.size();i++) {
//			temp=list.get(i);//리스트의 i번째 방의 값을 가져와서 temp에 할당.
//			System.out.println(temp);
//		}//end for
		
		//개선된 for
		for(String temp:list) {
			System.out.println(temp);
		}//end for
	
		System.out.println("------------------복사된 값 출력-----------------");
		for(String temp : subjectArr) {
			System.out.printf("%s\t",temp);
		}//end for
		System.out.println("\n");

	}//useArrayList
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * Multi Thread에서 동시접근 불가능
	 */
	public void useVector() {
		//1.생성
		List<String> list = new Vector<String>();
		//2.크기 : size(); 방에 값이 있는 것만 크기에 포함시킨다.
		System.out.println("방의 갯수 : "+list.size());
		//3.값 할당 : 값은 뒤로 추가된다. 중복값을 저장할 수 있다.
		list.add("자바");
		list.add("오라클");
		list.add("JDBC");
		list.add("HTML");
		list.add("오라클"); // 중복값 저장 가능.
		list.add("CSS");
		list.add("JavaScript");
		System.out.println(list+"/"+list.size());//객체를 출력하면 주소가 나와야하는데 값이 나온 이유는 
												 //자식클래스에서 Object클래스의 toString()를  
												 //주소가 아닌 값을 출력할 수 있도록 Override 했기 때문에
		//4.배열로 복사
		 //Generic과 동일한 데이터형,리스트의 크기대로 배열을 생성한다.
		String[] subjectArr = new String[list.size()];
		 //리스트의 값을 배열로 보낸다.
		list.toArray(subjectArr);
		
		//5.값 삭제 : 방의 크기가 줄어든다.(저장공간을 효울적으로 사용가능)
		//index로 삭제하는 방법
		list.remove(3);
		
		//방의 값과 같은 객체를 넣어 삭제 : 가장 먼저 일치하는 방의 값 하나만 삭제. 왼 -> 오
		list.remove("오라클");
		
		System.out.println(list+"/"+list.size());
		
		//6.일괄처리 : list는 인덱스를 사용할 수 있고, 검색의 기능이 있으므로 일괄 처리를 할 수 있다.
	//	String temp="";
	//	for(int i =0; i<list.size();i++) {
	//		temp=list.get(i);//리스트의 i번째 방의 값을 가져와서 temp에 할당.
	//		System.out.println(temp);
	//	}//end for
		
		//개선된 for
		for(String temp:list) {
			System.out.println(temp);
		}//end for
		
		System.out.println("------------------복사된 값 출력-----------------");
		for(String temp : subjectArr) {
			System.out.printf("%s\t",temp);
		}//end for
		System.out.println("\n");

	}//useVector
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * 값이 추가될 때. 기존의 데이터 사이에 값이 추가되는 일이 많을 때.
	 */
	public void useLinkedList() {
		//1.생성
		List<String> list = new LinkedList<String>();
		//2.크기 : size(); 방에 값이 있는 것만 크기에 포함시킨다.
		System.out.println("방의 갯수 : "+list.size());
		//3.값 할당 : 값은 뒤로 추가될수도 있고, 값이 중간에 끼워 들어갈수도 있다. 중복값을 저장할 수 있다.
		list.add("자바");//0
		list.add("오라클");//1->2
		list.add("JDBC");//2->3
		list.add(1,"HTML");//3->1
		list.add("오라클"); //4 중복값 저장 가능.
		list.add(4,"CSS");//5
		list.add("JavaScript");//6
		System.out.println(list+"/"+list.size());//객체를 출력하면 주소가 나와야하는데 값이 나온 이유는 
												 //자식클래스에서 Object클래스의 toString()를  
												 //주소가 아닌 값을 출력할 수 있도록 Override 했기 때문에
		//4.배열로 복사
		 //Generic과 동일한 데이터형,리스트의 크기대로 배열을 생성한다.
		String[] subjectArr = new String[list.size()];
		 //리스트의 값을 배열로 보낸다.
		list.toArray(subjectArr);
		
		//5.값 삭제 : 방의 크기가 줄어든다.(저장공간을 효울적으로 사용가능)
		//index로 삭제하는 방법
		list.remove(3);
		
		//방의 값과 같은 객체를 넣어 삭제 : 가장 먼저 일치하는 방의 값 하나만 삭제. 왼 -> 오
		list.remove("오라클");
		
		System.out.println(list+"/"+list.size());
		
		//6.일괄처리 : list는 인덱스를 사용할 수 있고, 검색의 기능이 있으므로 일괄 처리를 할 수 있다.
	//	String temp="";
	//	for(int i =0; i<list.size();i++) {
	//		temp=list.get(i);//리스트의 i번째 방의 값을 가져와서 temp에 할당.
	//		System.out.println(temp);
	//	}//end for
		
		//개선된 for
		for(String temp:list) {
			System.out.println(temp);
		}//end for
		
		System.out.println("------------------복사된 값 출력-----------------");
		for(String temp : subjectArr) {
			System.out.printf("%s\t",temp);
		}//end for
		System.out.println("\n");
		
	}//useLinkedList
	
	public static void main(String[] args) {
		UseList ul = new UseList();
		
		System.out.println("================Array List===============");
		ul.useArrayList();
		
		System.out.println("================Vector===============");
		ul.useVector();
		
		System.out.println("================Linked List===============");
		ul.useLinkedList();
	}//main

}//class
