package day0218;

import java.util.Stack;

/**
 * Stack은 Vector의 자식클래스로 Multi Thread에서 동시접근이 불가능.
 * LIFO 
 * @author user
 */
public class UseStack {
	
	public UseStack() {
		//1.생성
		Stack<String> stk = new Stack<String>();
		
		//2.값(item) 넣기
		stk.push("하세요?");
		stk.push("안녕");
		stk.push("오늘도");
		
//		System.out.println(stk);
//		//3.값 얻기
//		System.out.println(stk.pop());
//		System.out.println(stk.pop());
//		System.out.println(stk.pop());
//		System.out.println(stk);
		
		while(!stk.empty()){//empty() 스택이 비어있다면 true, 채워져있다면 false.
			System.out.println(stk.pop());
		}//end while
		
	}//UseStack
	
	public static void main(String[] args) {
		new UseStack();
	}//main

}//class
