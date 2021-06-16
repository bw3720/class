package day0407;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * DBMS업무처리를 하는 DAO클래스를 사용하는 클래스로 업무로직을 정의하는 일을 주로
 * 하는 클래스. 클래스명은 주로 Service 또는 Process가 붙어서 만들어진다.
 * @author user
 */
public class UseStatementDAO {
	
	private StatementDAO sDAO;
	
	public UseStatementDAO() {
		sDAO = new StatementDAO();
				
	}//UseStatementDAO
	
	private void addCpEmp() { 
		EmpVO eVO = new EmpVO(431, "조영래", 10, "과장");
		
		try {
			sDAO.insertCpemp4(eVO);//method가 예외를 발생시키 않으면 정상실행.
			JOptionPane.showMessageDialog(null, eVO.getEmpno()+"번 사원정보가 추가되었습니다.");
			
		} catch (SQLException se) {
			se.printStackTrace();
//			System.out.println(se.getErrorCode()+"/"+se.getMessage()+"/"+se.getSQLState());
			String errMsg="";
			if (se.getErrorCode()==1) {
				errMsg = "사원번호가 이미 존재합니다.";
			}//end if
			
			if (se.getErrorCode()==1438) {
				errMsg = "사원번호 또는 부서번호가 초과되었습니다. 사원번호는 4자리,부서번호는 2자리";
			}//end if
			
			if (se.getErrorCode()==12899) {
				errMsg = "사원명 또는 직무가 초과된 부분. 사원명은 한글 3자 또는 영문 10자, 직무는 한글 3자 영문 9자까지...";
			}//end if
			JOptionPane.showMessageDialog(null, errMsg);
		}//end catch
	}//addCpEmp
	
	///////////////////////////////////////////////////////////////////////////////////////////
	private void modifyCpEmp() {
		EmpVO eVO = new EmpVO(431,"조혜원",30,"차장");  //성공!!
	  //EmpVO eVO = new EmpVO(432,"조혜원",30,"차장");  //실패!!
		
		try {
			int cnt = sDAO.updateCpemp4(eVO);
			String msg=eVO.getEmpno()+"번 사원정보가 존재하지 않습니다.";
			if(cnt == 1) {
				msg = eVO.getEmpno()+"번 사원정보가 변경되었습니다.";
			}//end if
			
			JOptionPane.showMessageDialog(null, msg);
			
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "서비스가 원활하지 못한점 죄송합니다.");
		}//end catch		
	}//modifyCpEmp
	
	///////////////////////////////////////////////////////////////////////////////////////////
	private void removeCpEmp() {
		int empno = 7837;
		
		try {
			int cnt = sDAO.deleteCpemp4(empno);
			String msg = empno+"번 사원정보가 존재하지 않습니다.";
			if (cnt ==1) {
				msg = empno+"번 사원정보가 삭제되었습니다.";
			}//end if
			
			JOptionPane.showMessageDialog(null, msg);
			
		} catch (SQLException e) {
			//쿼리문이 잘못된 경우. DB와 연동이 안되는 경우.
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "서비스가 원활하지 못한점 죄송합니다.");
		}//end catch
	}//removeCpEmp
	///////////////////////////////////////////////////////////////////////////////////////////
	private void searchAllCpEmp() {
		//조회된 결과가 하나의 List에 모두 저장되어 있으므로 List를 받아서 사용한다.
		try {
			List<EmpAllVO> list=sDAO.selectAllCpEmp4();
			
			if (list.isEmpty()) {
				System.out.println("사원정보가 존재하지 않습니다.");
			}//end if
			
			EmpAllVO eaVO = null;
			for(int i =0; i<list.size(); i++) {
				eaVO=list.get(i);
				System.out.println(eaVO.getEmpno()+" / "+eaVO.getEname()+" / "+eaVO.getDeptno()+" / "+eaVO.getJob()+" / "+eaVO.getHiredate());
			}//end for

		} catch (SQLException e) {
			e.printStackTrace();
		}//end catch
		
	}//searchAllCpEmp
	///////////////////////////////////////////////////////////////////////////////////////////

	private void searchOneCpEmp() {
		
		int empno=1212;
		
		try {
			EmpOneVO eoVO = sDAO.selectOneCpEmp4(empno);
			
			if(eoVO == null) {//사원번호로 조회된 레코드가 없음
				System.out.println(empno+"번 사원은 존재하지 않습니다.");
			}else {//사원번호로 조회된 레코드 있음
				SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy EEEE");
				System.out.println(eoVO.getEname()+" / "+eoVO.getDeptno()+" / "+eoVO.getJob()+" / "+sdf.format(eoVO.getHiredate()));
			}//end else
		} catch (SQLException e) {
			e.printStackTrace();
		}//end catch
		
	}//searchOneCpEmp
	
	
	public static void main(String[] args) {
		UseStatementDAO usDAO = new UseStatementDAO();
//		usDAO.addCpEmp();
//		usDAO.modifyCpEmp();
//		usDAO.removeCpEmp();
		usDAO.searchAllCpEmp();
//		usDAO.searchOneCpEmp();
	}//main

}//class
