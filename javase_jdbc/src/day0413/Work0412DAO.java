package day0413;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.dao.DbConnection;

public class Work0412DAO {
	
	private static Work0412DAO wDAO;
	
	private Work0412DAO() {
		
	}//Work0412DAO
	
	public static Work0412DAO getInstance() {
		if(wDAO ==null) {
			wDAO = new Work0412DAO();
		}//end if
		return wDAO;
	}//getInstance
	
	/**
	 * 모든 레코드 조회
	 * @return
	 * @throws SQLException
	 */
	public List<WorkAllVO> selectAllWork() throws SQLException{
		List<WorkAllVO> list = new ArrayList<WorkAllVO>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		DbConnection dc = DbConnection.getInstance();
		//1.
		try {
		//2.
			con = dc.getConnection();
		//3.
			String selectWork = "select * from work order by num";
			pstmt = con.prepareStatement(selectWork);
		//4. 바인변수 없으므로 스킵
		//5.
			rs = pstmt.executeQuery();
			
			WorkAllVO waVO = null;
			while(rs.next()) {
				//커서가 존재하는 레코드위치에 컬럼값을 받아와서 VO에 설정
				waVO = new WorkAllVO(rs.getInt("num"), rs.getString("name"),
						rs.getInt("age"), rs.getString("addr"));
				//레코드의 정보를 가진 VO를 list에 추가
				list.add(waVO);
			}//end while
			
		} finally {
			//6.
			dc.close(rs, pstmt, con);
		}//end finally
		
		return list;
	}//selectAllWork
	
	/**
	 * 레코드 추가
	 * @param waVO
	 * @throws SQLException
	 */
	public void insertWork(WorkAddVO waVO) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		DbConnection dc = DbConnection.getInstance();
		//1.
		try {
		//2.
			con = dc.getConnection();
		//3.
			String insertWork = "insert into work (num, name, age, addr) values (seq_work.nextval, ?, ?, ?)";
			pstmt = con.prepareStatement(insertWork);
		//4.
			pstmt.setString(1, waVO.getName());
			pstmt.setInt(2, waVO.getAge());
			pstmt.setString(3, waVO.getAddr());
		//5.
			pstmt.executeUpdate();
		} finally {
			//6.
			dc.close(rs, pstmt, con);
		}//end finally
	}//insertWork
	
	public int deleteWork(int num) throws SQLException{
		int cnt = 0; 
		Connection con = null;
	    PreparedStatement pstmt = null;
	    StringBuilder deleteWork = new StringBuilder();
	      
	    DbConnection dc = DbConnection.getInstance();
	    try {
	    	con = dc.getConnection();

	    	deleteWork.append(" delete from work where num = ? ");

	        pstmt = con.prepareStatement(deleteWork.toString());
			pstmt.setInt(1, num);

	        cnt = pstmt.executeUpdate();

	      	} finally {
	      		dc.close(null, pstmt, con);
	      	} // end finally
	     return cnt;
	}//deleteWork
	
	public int updateWork(WorkAllVO waVO)throws SQLException {
		int cnt = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		StringBuilder updateWork = new StringBuilder();
		
		DbConnection dc = DbConnection.getInstance();
		
		try {
			con = dc.getConnection();
			updateWork.append("update work set name = ?,age = ?, addr = ? where num = ?");
			pstmt = con.prepareStatement(updateWork.toString());
			
			pstmt.setString(1, waVO.getName());
			pstmt.setInt(2, waVO.getAge());
			pstmt.setString(3, waVO.getAddr());
			pstmt.setInt(4, waVO.getNum());
			
			cnt = pstmt.executeUpdate();
		} finally {
			dc.close(null, pstmt, con);
		}//end finally
		
		return cnt;
	}//updateWork
	
	
}//Work0412DAO
