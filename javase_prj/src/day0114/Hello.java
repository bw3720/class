package day0114;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//1. 소스코드 작성.

class Hello{
	//Java Application : Java로 만들어진 단독으로 실행 가능한 프로그램.
	public static void main(String[] args){
		System.out.println("Hello! Java. 안녕 자바.");
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con;
			try {
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
				System.out.println(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}//main method

}//class

//2. 저장 : Hello.java
//3. 컴파일 : javac 옵션 소스파일명.java
//DOS창과 파일간의 charset이 일치하지 않으면 한글로 인한 문제가 발생한다.
// javac -encoding UTF-8 소스파일명.java

//4. 실행 : java Hello