package day0409;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import kr.co.sist.dao.DbConnection;

public class UseResultSetMetaData {
	public UseResultSetMetaData() throws SQLException{
		DbConnection dc = DbConnection.getInstance();
		//1. 드라이버 로딩
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		try {
		//2. 커넥션얻기
			con = dc.getConnection();
		//3. 쿼리문 생성 객체 얻기
			String select = "select * from zipcode";
			pstmt = con.prepareStatement(select);
			
		//4. 바인드 변수에 값설정
		//5. 쿼리문 실행후 결과 얻기
			rs=pstmt.executeQuery();
			//ResultSetMetaData얻기
			rsmd = rs.getMetaData();
//			System.out.println(rsmd.getColumnCount()+"/"+rsmd.getColumnName(1)+"/"+
//			rsmd.getColumnTypeName(1)+"/"+rsmd.getPrecision(1)+"/"+rsmd.isNullable(3));
			int precision =0;
			for(int i = 1 ; i<rsmd.getColumnCount()+1 ; i++) {
				precision = rsmd.getPrecision(i);
				System.out.print(rsmd.getColumnName(i)+" "+rsmd.getColumnTypeName(i));
				if (precision != 0) {
					System.out.print("("+precision+")");
				}//end if
				System.out.println(rsmd.isNullable(i)==0?" N.N ":"");
				
			}//end for
		}finally {
		//6. 연결끊기
		}//end finally
	}//UseResultSetMetaData

	public static void main(String[] args) {
		
		try {
			new UseResultSetMetaData();
		} catch (SQLException e) {
			e.printStackTrace();
		}//end catch
		
	}//main

}//class
