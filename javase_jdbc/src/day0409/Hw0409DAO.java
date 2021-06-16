package day0409;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Hw0409DAO {
	private static Hw0409DAO hwDAO;
	
	private Hw0409DAO() {
		
	}//Hw0409DAO
	
	public static Hw0409DAO getInstance() {
		if (hwDAO ==null) {
			hwDAO = new Hw0409DAO();
		}//end if
		
		return hwDAO;
	}//getInstance
	
	public Connection getConnection() throws SQLException {
		//1. 드라이버 로딩
			try {
				Class.forName("oracle.jdbc.OracleDriver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		//2. Connection 얻기
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id ="scott";
			String pass = "tiger";
			
			Connection con = DriverManager.getConnection(url, id, pass);
			
		return con;
	}//getConnection 
	
	public void close(PreparedStatement pstmt, Connection con) throws SQLException{
		if(pstmt != null) {pstmt.close();}
		if(con != null) {con.close();}
	}//close
	
}//class
