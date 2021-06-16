package day0412;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import kr.co.sist.dao.DbConnection;

public class UseCallableStatement {

	public UseCallableStatement()throws SQLException {
		
		Connection con =null;
		CallableStatement cstmt = null;
		
		DbConnection dc = DbConnection.getInstance();
		//1. ����̹� �ε�
		try {
		//2. Ŀ�ؼǾ��
			con = dc.getConnection();
		//3. ������ ������ü ���
			cstmt = con.prepareCall("{ call proc_plus (?,?,?,?) }");
		//4. ���ε庯���� �� �Ҵ�
			//in parameter
			cstmt.setInt(1, 4);  //num1 �� 
			cstmt.setInt(2, 12); //num2 ��
			//out parameter
			cstmt.registerOutParameter(3, Types.NUMERIC);
			cstmt.registerOutParameter(4, Types.VARCHAR);
			
		//5. ���ν��� ȣ��
			cstmt.execute();
		//6. out parameter�� ������ �� ���
			int sum = cstmt.getInt(3);
			String msg = cstmt.getString(4);
			
			System.out.println(sum+"/"+msg);
		//7. ���� ����
		} finally {
			//PreparedStatement�� CallableStatement�� �θ��̱� ������ �ڽ���
			//CallableStatement�� ���� �� �ִ�.
			dc.close(null, cstmt, con);
		}//end finally
		
	}//UseCallableStatement
	
	public static void main(String[] args) {
		try {
			new UseCallableStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}//end catch
		
	}//main

}//class
