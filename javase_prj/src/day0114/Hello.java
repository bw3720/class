package day0114;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//1. �ҽ��ڵ� �ۼ�.

class Hello{
	//Java Application : Java�� ������� �ܵ����� ���� ������ ���α׷�.
	public static void main(String[] args){
		System.out.println("Hello! Java. �ȳ� �ڹ�.");
		
		
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

//2. ���� : Hello.java
//3. ������ : javac �ɼ� �ҽ����ϸ�.java
//DOSâ�� ���ϰ��� charset�� ��ġ���� ������ �ѱ۷� ���� ������ �߻��Ѵ�.
// javac -encoding UTF-8 �ҽ����ϸ�.java

//4. ���� : java Hello