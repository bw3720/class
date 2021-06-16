package day0407;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * DBMS의 작업에 관련된 코드를 정의하는 클래스.
 * 주로 쿼리문에 대한 작어만 정의.
 * @author user
 */
/**
 * @author user
 *
 */
public class StatementDAO {
	
	/**
	 * cp_emp4테이블에 VO의 값을 추가하는 일.
	 * 추가 성공하니면 예외상황 둘 중 하나의 결과 도출. 
	 * @param eVO 사원번호, 사원명, 부서번호, 직무를 가진 VO
	 * @throws SQLException
	 */
	public void insertCpemp4(EmpVO eVO) throws SQLException { 
		//1.드라이버로딩  (ojdbc8.jar)
			try {
				Class.forName("oracle.jdbc.OracleDriver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}//end catch
		
		//2.커넥션얻기
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String pass = "tiger";
			
			Connection con=null;
			Statement stmt=null;
			
			try {
				con = DriverManager.getConnection(url, id, pass);
		//3.쿼리문 생성 객체 얻기
				stmt = con.createStatement();
			
		//4.쿼리문 수행 후 결과 얻기
				String insertCpEmp="insert into cp_emp4(empno,ename,deptno,job,hiredate)values("+eVO.getEmpno()+",'"+eVO.getEname()+"',"+eVO.getDeptno()
																								+",'"+eVO.getJob()+"',sysdate)";
				int cnt=stmt.executeUpdate(insertCpEmp);
				
				System.out.println(cnt+"건 추가됨");
				
			}finally{//finally안에서는 try 영역의 것을 쓸수 없다.
				//5.연결끊기. 반드시 실행되어야기 때문에 finally블럭에서 구현
					if(stmt != null) {stmt.close();} //end if
					if(con != null) {con.close();} //end if
			}//end finally
		
	}//insertCpemp4
	
	
	//////////////////////////////////////////////////////////////////////////////////////
	/**
	 * 사원번호, 사원명, 부서번호, 직무를 입력받아 사원번호에 해당하는 사원정보를 변경하는일.
	 * @param eVO 변경할 사원정보가 들어있다.
	 * @return 변경된 행의 수
	 * @throws SQLException 
	 */
	public int updateCpemp4(EmpVO eVO) throws SQLException {
		int cnt=0;
		//1. 드라이버 로딩
			try {
				Class.forName("oracle.jdbc.OracleDriver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}//end catch
			
			Connection con = null;
			Statement stmt = null;
			
			//2. Connection 얻기
			try {
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";
				String id = "scott";
				String pass = "tiger";
				
				con = DriverManager.getConnection(url, id, pass);
				
		//3. 쿼리 생성 객체 얻기
				stmt = con.createStatement();
						
		//4. 쿼리문 수행 후 결과 얻기
//				String updateCpEmp="update cp_emp4 set ename='"+eVO.getEname()+"', deptno="+eVO.getDeptno()
//									+",job='"+eVO.getJob()+"' where empno="+eVO.getEmpno();
				
				StringBuilder updateCpEmp = new StringBuilder();			 //update
				updateCpEmp.append("update cp_emp4 ")
				
						   .append("set ename='").append(eVO.getEname())     //set
						   .append("', deptno=").append(eVO.getDeptno())
						   .append(",job='").append(eVO.getJob())
						   
						   .append("' where empno=").append(eVO.getEmpno()); //where
				
				cnt = stmt.executeUpdate(updateCpEmp.toString());
				
			}finally {
		//5. 연결 종료.
				if(stmt != null) {stmt.close();}
				if(con != null) {con.close();}
			}
		return cnt;
	}//updateCpemp4
	
	//////////////////////////////////////////////////////////////////////////////////////
	public int deleteCpemp4(int empno) throws SQLException {
		int cnt =0;
		//1. 드라이버 로딩
			try {
				Class.forName("oracle.jdbc.OracleDriver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}//end catch
			
			Connection con = null;
			Statement stmt = null;
			
			
		//2. Connection 얻기
			try {
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";
				String id = "scott";
				String pass = "tiger";
				
				con = DriverManager.getConnection(url, id, pass);
		//3. 쿼리문 생성 객체 얻기
				stmt = con.createStatement();
		//4. 쿼리문 수행 후 결과 얻기
				String deleteCpEmp = "delete from cp_emp4 where empno ="+empno;
				
				cnt = stmt.executeUpdate(deleteCpEmp);
				
			}finally {	
		//5. 연결끊기
			if (con != null) {con.close();}
			if (stmt != null) {stmt.close();}
			}	
		return cnt;
	}//deleteCpemp4
	//////////////////////////////////////////////////////////////////////////////////////
	public List<EmpAllVO> selectAllCpEmp4() throws SQLException{
		List<EmpAllVO> list = new ArrayList<EmpAllVO>();
		
		//1. 드라이버 로딩
			try {
				Class.forName("oracle.jdbc.OracleDriver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}//end catch
			
			Connection con =null;
			Statement stmt = null;
			ResultSet rs = null;
			
		//2. 커넥션 얻기
			try {
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";
				String id = "scott";
				String pass = "tiger";
				
				con = DriverManager.getConnection(url, id, pass);
				
		//3. 쿼리문 생성객체얻기
				stmt = con.createStatement();
				
		//4. 궈리문 수행후 결과 얻기
				//date를  to_char()함수를 사용하여 문자열로 변환 후 결과 얻기.
				String selectCpEmp = "select empno, ename, deptno, job, to_char(hiredate,'yyyy-mm-dd') hiredate from cp_emp4";
				
				rs = stmt.executeQuery(selectCpEmp);
				
				int empno, deptno =0;
				String ename,job,hiredate="";
				
				EmpAllVO eaVO=null;
				
				while(rs.next()) { //레코드 포인터가 존재하는 행의 다음 행이 존재하는지? (있을 수도 있고 없을수도 있으니 while)
					//cursor가 위치한 레코드의 컬럼값을 가져와서 변수에 저장(나뉘어진 값)
//				컬럼명을 사용하여 조회 쿼리의 값 얻기
//					empno = rs.getInt("empno");
//					ename = rs.getString("ename");
//					deptno =rs.getInt("deptno");
//					job = rs.getString("job");
//					hiredate = rs.getString("hiredate");
//				컬러의 인덱스를 사용하여 값 얻기. (처음나온 컬럼의 인덱스는 1번으로 시작한다.)
					empno = rs.getInt(1);
					ename = rs.getString(2);
					deptno =rs.getInt(3);
					job = rs.getString(4);
					hiredate = rs.getString(5);
					System.out.println(empno+" / "+ename);
					//나누어진 값을 사용상의 편의를 위해 VO로 묶어서 저장 (조회된 한 행의 레코드가 저장)
					eaVO = new EmpAllVO(empno,ename,deptno,job,hiredate);
					//n개의 행을 하나로 묶어서 저장하기 위해 List에 추가
					list.add(eaVO);
					
					
				}//end while
		//5. 연결끊기
			}finally {
			if(rs!=null) {rs.close();}
			if(con!=null) {con.close();}
			if(stmt!=null) {stmt.close();}
			}	
		return list;
		
	}//selectAllCpEmp4
	//////////////////////////////////////////////////////////////////////////////////////

	public EmpOneVO selectOneCpEmp4(int empno) throws SQLException {
		EmpOneVO eoVO=null;
		
		//1. 드라이버 로딩
			try {
				Class.forName("oracle.jdbc.OracleDriver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}//end cat catch
			
			Connection con = null;
			Statement stmt = null;
			ResultSet rs = null;
			
		//2. 커넥션 얻기
			try {
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";
				String id = "scott";
				String pass = "tiger";
				
				con = DriverManager.getConnection(url, id, pass);
		//3. 쿼리문 생성 객체 얻기
				stmt = con.createStatement();
		//4. 쿼리문 수행 후 결과 얻기
				StringBuilder selectCpEmp = new StringBuilder();
				//date데이터형을 to_char()함수를 사용하지않고 그대로 조회. 사용자가 원하는 날짜 형식을 자바에서 처리
				selectCpEmp.append("select ename, deptno, job, hiredate from cp_emp4 where empno=")
						   .append(empno);
				rs= stmt.executeQuery(selectCpEmp.toString());
				
				if(rs.next()) {//조회된 레코드가 존재할 때.
					eoVO = new EmpOneVO(rs.getString("ename"), rs.getInt("deptno"), rs.getString("job"), rs.getDate("hiredate"));
				}//end if
				
		//5. 연결 끊기
			}finally {
				if(rs!=null) {rs.close();}
				if(con!=null) {con.close();}
				if(stmt!=null) {stmt.close();}		
			}//end finally
		return eoVO;
		
	}//selectOneCpEmp4
	
	public static void main(String[] args) {
		StatementDAO s = new StatementDAO();
//		try {
//			s.selectAllCpEmp4();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}//end catch
	}//main
	

	
}//class
