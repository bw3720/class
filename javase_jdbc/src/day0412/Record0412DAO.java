package day0412;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.dao.DbConnection;

public class Record0412DAO {
	private static Record0412DAO rDAO;
	private List<String> studRecord;
	
	private Record0412DAO() {
		studRecord = new ArrayList<String>();
	}
	
	public List<String> getRecord() throws SQLException{
		studRecord.clear();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuilder selectAll = new StringBuilder();
		StringBuilder result = null;
		
		DbConnection dc = DbConnection.getInstance();
		
		try {
			con = dc.getConnection();
			selectAll.append("select * from HW0412");
			pstmt = con.prepareStatement(selectAll.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				result = new StringBuilder();
				result.append(rs.getInt("num"))
				.append(", ").append(rs.getString("name"))
				.append(", ").append(rs.getInt("age"))
				.append(", ").append(rs.getString("addr"));
				studRecord.add(result.toString());
			}//end while
		} finally {
			dc.close(rs, pstmt, con);
		}//end finally
		
		return studRecord;
		
	}
	
	public void insertRecord(String name, int age, String addr) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		StringBuilder insertRec = new StringBuilder();

		DbConnection dc = DbConnection.getInstance();

		try {
			con = dc.getConnection();
			insertRec.append("insert into hw0412 values (seq_stud.nextval, ?, ?, ?)");
			pstmt = con.prepareStatement(insertRec.toString());
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setString(3, addr);
			pstmt.execute();
		} finally {
			dc.close(null, pstmt,con );
		}
	}

	public static Record0412DAO getInstance() {
		if (rDAO == null) {
			rDAO = new Record0412DAO();
		}
		return rDAO;
	}
	
}
