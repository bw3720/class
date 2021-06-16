package day0216;

import java.util.StringTokenizer;

/**
 * 문자열을 짧은 한 마디로 구분하는 StringTokenizer의 사용.
 * @author user
 */
public class UseStringTokenizer {
	
	public UseStringTokenizer() {
		String data = "자바 오라클 앙냥냥 JDBC HTML";
		
		//문자열을 공백으로 구분하여 자를 수 있는 객체를 생성.
		StringTokenizer stk = new StringTokenizer(data);
		
		System.out.println("토큰의 수 : "+stk.countTokens());
//	
//		System.out.println("토큰 존재? "+stk.hasMoreTokens());//
//		System.out.println("토큰 : "+stk.nextToken());
//		System.out.println("토큰 : "+stk.nextToken());
//		System.out.println("토큰 : "+stk.nextToken());
//		System.out.println("토큰 : "+stk.nextToken());
//		System.out.println("토큰 : "+stk.nextToken());
//		System.out.println("토큰 존재? "+stk.hasMoreTokens());//
		
		String token="";
		while(stk.hasMoreTokens()) {
			token = stk.nextToken();
			System.out.println(token);
			//System.out.println("토큰의 수 : "+stk.countTokens()); //현재 토큰나이저가 가지고 있는 토큰
		}//end while

		System.out.println("-------------포인터는 한번 지나가면 뒤로 돌아가지 않는다.------------");
		
		//다시 반복시키고 싶다면 객체를 새로 생성하여 포인터를 앞으로 이동시킨다.
		stk = new StringTokenizer(data);
		
		while(stk.hasMoreTokens()) {
			token = stk.nextToken();
			System.out.println(token);
			//System.out.println("토큰의 수 : "+stk.countTokens()); //현재 토큰나이저가 가지고 있는 토큰
		}//end while
		
	
	}//UseStringTokenizer
	
	
	public static void main(String[] args) {
//		new UseStringTokenizer();
	
		String names="이학민 권예원 김다은 강인섭 송준희 김덕영 박기범";
		//StkData를 사용하여 배열로 만들고, names 문자열을 공백으로 구분하여 StkData 배열에 추가.
		
		//문자열을 자를 수 있는 객체사용.(StringTokenizer, String.split())
		StringTokenizer stk = new StringTokenizer(names); // 입력된 문자열을 공백으로 토큰을 만든다.
		
		//1. StkData를 사용하여 객체 배열을 생성.(방은몇개? => 토큰의 갯수)
		StkData[] nameArr = new StkData[stk.countTokens()];//토큰이 나오기 전에 갯수이기 때문에 총 토큰의 수
	
		//2. 문자열 잘라서 배열에 넣는다.(토큰이 몇개나 나올지 모른다. => while 사용)
		int idx =0; //배열에 방에 값을 넣기 위한 인덱스 변수를 생성.
		while(stk.hasMoreTokens()) {
			nameArr[idx]= new StkData(); /////======>이걸 빼먹음.
			nameArr[idx].setName(stk.nextToken());
			idx++;
		}//end while
		
		//3.잘려진 문자열을 가진 배열을 출력한다.
//		StkData sd = null;
//		for(int i=0; i<nameArr.length ; i++) {
//			sd=nameArr[i];
//			System.out.println(sd.getName()+"/"+sd.getAge());
//		}
		
		//개선된 for
		for(StkData sd : nameArr) {
			System.out.println(sd.getName()+"/"+sd.getAge());
		}
		
		
		
		
		
		///StkData stuLee = new StkData(null,25);
		///StkData stuKwon = new StkData("권예원",25);
		///StkData stuKimDa = new StkData("김다은",25);
		///StkData stuKang = new StkData("강인섭",25);
		///StkData stuSong = new StkData("송준희",25);
		///StkData stuKimDuk = new StkData("김덕영",25);
		///StkData stuPark = new StkData("박기범",25);
	
	
	}//main

}//class
