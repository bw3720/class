package day0414;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.co.sist.dao.DbConnection;

/**
 * test_trigger1 테이블과 test_trigger2 테이블에 모두 insert가 성송하면 transaction이 완료되는 코드
 * @author user
 */
public class TestTransaction {
	private Connection con;

	
	/**
	 * 쿼리를 수행하는 일.
	 * @param name
	 * @param age
	 * @return
	 * @throws SQLException
	 */
	public int insert(String name, int age) throws SQLException {
		int cnt = 0; //trigger1테이블의 쿼리 수행 수
		int cnt2 = 0;//trigger2테이블의 쿼리 수행 수
		
		
		//1. 드라이버 로딩
			try {
				Class.forName("oracle.jdbc.OracleDriver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}//end catch
			String url ="jdbc:oracle:thin:@localhost:1521:orcl";
			String id ="scott";
			String pass ="tiger";
			
			PreparedStatement pstmt = null;
			PreparedStatement pstmt2 = null;
			
			
		
		//2. 커넥션얻기
			//try {
				con = DriverManager.getConnection(url, id, pass);
		//3. auto-commit해제
				con.setAutoCommit(false);
		//4. 쿼리문 수행객체 얻기
				String sql= "insert into test_trigger1(name,age) values(?,?)";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, name);
				pstmt.setInt(2, age);
		//5. 쿼리문 수행 후 결과 얻기
				cnt = pstmt.executeUpdate();
		
//====================================================================================	
				
		//4. 쿼리문 수행객체 얻기
				String sql2= "insert into test_trigger2(name,age) values(?,?)";
				pstmt2 = con.prepareStatement(sql2);
				pstmt2.setString(1, name);
				pstmt2.setInt(2, age);
		//5. 쿼리문 수행 후 결과 얻기
				cnt2 = pstmt2.executeUpdate();
				
//				if(cnt==1 && cnt2==1) {
//					con.commit();
//				}else {
//					con.rollback();
//				}//end else
//				
//			} finally {
//				if(con != null) {con.close();}  //end if  //rollback되지 않는다.
//			}//end finally
		
		return cnt+cnt2;
	}//insert
	
	/**
	 * 쿼리를 사용하는 업무처리.
	 * 커넥션 끊기, commit, rollback을 수행.
	 */
	public void add() {
		//DB업무 method 호출결과 받기
		//목적하는 쿼리수행횟수가 나왔다면 commit 그렇지 않다면 rollback수행
		//연결 끊기
		int totalCnt = 0;
		try {
			totalCnt = insert("강인섭곽",1);
			if(totalCnt == 2) {//목표한 행의 수가 반환되면 commit수행.
				con.commit();
				System.out.println("정상적인 트랜잭션 처리 : 양쪽테이블에 모두 레코드가 추가됨");
			}//end if
			//update나 delete인 경우 else로 rollback을 수행하고
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				con.rollback();//insert인 경우 catch에서 rollback수행 
				System.out.println("비정상적인 트랜잭션 처리 : 한쪽테이블에 쿼리가 성공했더라면 모두 추가작업이 취소됨 ");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}//end try~catch
			e.printStackTrace();
		}finally {
			if(con != null) { 
				try {
				con.close();
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			}
		}//end finally
	}//add
	

	public static void main(String[] args) {
		TestTransaction tt= new TestTransaction();
		
		tt.add();
	}//main

}//class
