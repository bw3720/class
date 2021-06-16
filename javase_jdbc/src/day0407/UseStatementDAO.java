package day0407;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * DBMS����ó���� �ϴ� DAOŬ������ ����ϴ� Ŭ������ ���������� �����ϴ� ���� �ַ�
 * �ϴ� Ŭ����. Ŭ�������� �ַ� Service �Ǵ� Process�� �پ ���������.
 * @author user
 */
public class UseStatementDAO {
	
	private StatementDAO sDAO;
	
	public UseStatementDAO() {
		sDAO = new StatementDAO();
				
	}//UseStatementDAO
	
	private void addCpEmp() { 
		EmpVO eVO = new EmpVO(431, "������", 10, "����");
		
		try {
			sDAO.insertCpemp4(eVO);//method�� ���ܸ� �߻���Ű ������ �������.
			JOptionPane.showMessageDialog(null, eVO.getEmpno()+"�� ��������� �߰��Ǿ����ϴ�.");
			
		} catch (SQLException se) {
			se.printStackTrace();
//			System.out.println(se.getErrorCode()+"/"+se.getMessage()+"/"+se.getSQLState());
			String errMsg="";
			if (se.getErrorCode()==1) {
				errMsg = "�����ȣ�� �̹� �����մϴ�.";
			}//end if
			
			if (se.getErrorCode()==1438) {
				errMsg = "�����ȣ �Ǵ� �μ���ȣ�� �ʰ��Ǿ����ϴ�. �����ȣ�� 4�ڸ�,�μ���ȣ�� 2�ڸ�";
			}//end if
			
			if (se.getErrorCode()==12899) {
				errMsg = "����� �Ǵ� ������ �ʰ��� �κ�. ������� �ѱ� 3�� �Ǵ� ���� 10��, ������ �ѱ� 3�� ���� 9�ڱ���...";
			}//end if
			JOptionPane.showMessageDialog(null, errMsg);
		}//end catch
	}//addCpEmp
	
	///////////////////////////////////////////////////////////////////////////////////////////
	private void modifyCpEmp() {
		EmpVO eVO = new EmpVO(431,"������",30,"����");  //����!!
	  //EmpVO eVO = new EmpVO(432,"������",30,"����");  //����!!
		
		try {
			int cnt = sDAO.updateCpemp4(eVO);
			String msg=eVO.getEmpno()+"�� ��������� �������� �ʽ��ϴ�.";
			if(cnt == 1) {
				msg = eVO.getEmpno()+"�� ��������� ����Ǿ����ϴ�.";
			}//end if
			
			JOptionPane.showMessageDialog(null, msg);
			
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "���񽺰� ��Ȱ���� ������ �˼��մϴ�.");
		}//end catch		
	}//modifyCpEmp
	
	///////////////////////////////////////////////////////////////////////////////////////////
	private void removeCpEmp() {
		int empno = 7837;
		
		try {
			int cnt = sDAO.deleteCpemp4(empno);
			String msg = empno+"�� ��������� �������� �ʽ��ϴ�.";
			if (cnt ==1) {
				msg = empno+"�� ��������� �����Ǿ����ϴ�.";
			}//end if
			
			JOptionPane.showMessageDialog(null, msg);
			
		} catch (SQLException e) {
			//�������� �߸��� ���. DB�� ������ �ȵǴ� ���.
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "���񽺰� ��Ȱ���� ������ �˼��մϴ�.");
		}//end catch
	}//removeCpEmp
	///////////////////////////////////////////////////////////////////////////////////////////
	private void searchAllCpEmp() {
		//��ȸ�� ����� �ϳ��� List�� ��� ����Ǿ� �����Ƿ� List�� �޾Ƽ� ����Ѵ�.
		try {
			List<EmpAllVO> list=sDAO.selectAllCpEmp4();
			
			if (list.isEmpty()) {
				System.out.println("��������� �������� �ʽ��ϴ�.");
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
			
			if(eoVO == null) {//�����ȣ�� ��ȸ�� ���ڵ尡 ����
				System.out.println(empno+"�� ����� �������� �ʽ��ϴ�.");
			}else {//�����ȣ�� ��ȸ�� ���ڵ� ����
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
