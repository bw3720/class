package day0409;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class RunPreparedStatementDAO {
	
	public void selectMenu() {
		boolean exitFlag = false;
		String menu = "부서정보\n 1.부서입력 2.부서수정 3. 부서삭제 4.모든부서조회 5.특정부서조회 6.종료";
		String inputMenu = "";
		do {
			
			inputMenu = JOptionPane.showInputDialog(menu);
			
			switch (inputMenu) {
			case "1": addCpDept(); break;
			case "2": modifyCpDept(); break;
			case "3": removeCpDept(); break;
			case "4": searchAllCpDept(); break;
			case "5": searchOneCpDept(); break;
			case "6": exitFlag= true; break;
			default :
				JOptionPane.showMessageDialog(null, "메뉴번호인 1~6까지만 입력.");
			}//end case
			
			
		} while (!exitFlag);
		
	}//selectMenu
	
	public void addCpDept() {
		String inputData = JOptionPane.showInputDialog("부서정보추가\n입력 예) 부서번호, 부서명,위치\n의 형식으로 입력");
		
		String[] tempData = inputData.replace(" ", "").split(",");
		if(tempData.length != 3) {
			JOptionPane.showMessageDialog(null, "입력데이터 형식이 올바르지 않습니다.\\n입력 예) 부서번호, 부서명,위치\\n의 형식으로 입력");
			//반환형이 void일때 사용하는 return
			//반환형이 void일때 return을 사용하면 코드의 실행을 멈추고 호출한 곳으로 돌아가라는 의미
			return ;
		}//end if
		
		//값이 잘 입력된 경우.
		DeptVO dVO= new DeptVO(Integer.parseInt(tempData[0]), tempData[1], tempData[2]);
		
		//Singleton Pattern이 도입된 DAO클래스.
		PreparedStatementDAO psDAO = PreparedStatementDAO.getInstance();
		
		try {
			psDAO.insertCpDept(dVO);
			JOptionPane.showMessageDialog(null, dVO.getDeptno()+"번 부서정보 추가");
		} catch (SQLException se) {
			se.printStackTrace();
			String errMsg=se.getMessage();
			if (se.getErrorCode()==1) {
				errMsg = "부번호가 이미 존재합니다.";
			}//end if
			
			if (se.getErrorCode()==1438) {
				errMsg = "부서번호가 초과되었습니다. 부서번호는 2자리";
			}//end if
			
			if (se.getErrorCode()==12899) {
				errMsg = "부서명 또는 위치가 초과된 부분. 부서명은 한글 4자 영문 13자까지...";
			}//end if
			JOptionPane.showMessageDialog(null, errMsg);
		}//end catch
		
	}//addCpDept
	
	public void modifyCpDept() {
		String inputData = JOptionPane.showInputDialog("부서정보변경\n입력 예) 부서번호, 부서명,위치\n의 형식으로 입력");
		
		String[] tempData = inputData.replace(" ", "").split(",");
		
		if(tempData.length != 3) {
			JOptionPane.showMessageDialog(null, "입력데이터 형식이 올바르지 않습니다.\\n입력 예) 부서번호, 부서명,위치\\n의 형식으로 입력");
			//반환형이 void일때 사용하는 return
			//반환형이 void일때 return을 사용하면 코드의 실행을 멈추고 호출한 곳으로 돌아가라는 의미
			return ;
		}//end if
		
		//값이 잘 입력된 경우.
		DeptVO dVO= new DeptVO(Integer.parseInt(tempData[0]), tempData[1], tempData[2]);
		
		//Singleton Pattern이 도입된 DAO클래스.
		PreparedStatementDAO psDAO = PreparedStatementDAO.getInstance();
		
		try {
			int cnt = psDAO.updateCpDept(dVO);
			if(cnt==1) {
				JOptionPane.showMessageDialog(null, dVO.getDeptno()+"번 부서정보 변경");
			}else {
				JOptionPane.showMessageDialog(null, dVO.getDeptno()+"번 부서정보는 존재하지 않습니다.");
			}//end else
		
		//에러메세지
		} catch (SQLException se) {
			se.printStackTrace();
			String errMsg=se.getMessage();
			
			if (se.getErrorCode()==12899) {
				errMsg = "부서명 또는 위치가 초과된 부분. 부서명은 한글 4자 영문 13자까지...";
			}//end if
			JOptionPane.showMessageDialog(null, errMsg);
		}//end catch
		
	}//updateCpDept
	
	public void removeCpDept() {
		String inputData = JOptionPane.showInputDialog("부서정보 삭제\n삭제할 부서번호 입력");
		
		if(inputData != null && !"".equals(inputData)) {
			try {
				int deptno = Integer.parseInt(inputData);
				//Singleton Pattern이 도입된 객체.
				PreparedStatementDAO psDAO = PreparedStatementDAO.getInstance();
				int cnt = psDAO.deleteCpDept(deptno);
				
				if(cnt ==1) {
					JOptionPane.showMessageDialog(null, deptno+"부서정보가 삭제 되었습니다.");
				}else {
					JOptionPane.showMessageDialog(null, deptno+"부서정보가 존재하지 않습니다.");
				}//end else
				
				
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "부서번호는 숫자이어야합니다.");
			}catch (SQLException e) {
				e.printStackTrace();
			}//end catch
			
		}//end if
		
	}//deleteCpDept
	
	public void searchAllCpDept() {
		//Singleton Pattern이 도입된 클래스를 사용하여 객체를 얻기.
		PreparedStatementDAO psDAO = PreparedStatementDAO.getInstance();
		
		try {
			List<DeptVO> list = psDAO.selectAllCpDept();
			StringBuilder output =new StringBuilder();
			output.append("부서번호\t부서명\t위치\n")
			.append("----------------------------------\n");
			
			if (list.isEmpty()) {
				output.append("부서정보가 존재하지 않습니다.\n");
			}//end if
			
			for(DeptVO dv : list) {
				output
				.append(dv.getDeptno()).append("\t")
				.append(dv.getDname()).append("\t")
				.append(dv.getLoc()).append("\n");
			}//end for
			output.append("----------------------------------\n");
			
			if ( !list.isEmpty() ) {
				output.append(list.size()+"건의 정보가 조회되었습니다.");
			}//end if
			JTextArea jta = new JTextArea(output.toString(),10,50);
			jta.setEditable(false);
			JScrollPane jsp = new JScrollPane(jta);
			
			JOptionPane.showMessageDialog(null, jsp);
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}//end catch
		
	}//searchAllCpDept
	
	public void searchOneCpDept() {
		String inputData = JOptionPane.showInputDialog("부서정보 조회\n조회할 부서번호 입력");
		
		if(inputData != null && !"".equals(inputData)) {
			try {
				int deptno = Integer.parseInt(inputData);
				//Singleton Pattern이 도입된 객체.
				PreparedStatementDAO psDAO = PreparedStatementDAO.getInstance();

				DeptOneVO doVO=psDAO.selectOneCpDept(deptno);
				
				StringBuilder output = new StringBuilder();
				output.append(deptno).append("번");
				
				if(doVO ==null) {
					//JOptionPane.showMessageDialog(null, deptno+"부서정보가 존재하지 않습니다.");
					output.append(deptno).append(" 부서는 존재하지 않습니다.");
				}else {
					//JOptionPane.showMessageDialog(null, deptno+"부서정보 조회 결과\n"+doVO.getDname()+"/"+doVO.getLoc());
					output.append(deptno).append("번 부서정보 조회 결과\n 부서명 : ").append(doVO.getDname())
					.append(", 위치 : ").append(doVO.getLoc());
				}//end else
				JOptionPane.showMessageDialog(null, output.toString());
				
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "부서번호는 숫자이어야합니다.");
			}catch (SQLException e) {
				e.printStackTrace();
			}//end catch
			
		}//end if
		
	}//searchOneCpDept

	
	public static void main(String[] args) {
		RunPreparedStatementDAO rpsDAO = new RunPreparedStatementDAO();
		rpsDAO.selectMenu();
	}//main
	
}//class
