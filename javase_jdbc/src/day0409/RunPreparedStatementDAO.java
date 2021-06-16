package day0409;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class RunPreparedStatementDAO {
	
	public void selectMenu() {
		boolean exitFlag = false;
		String menu = "�μ�����\n 1.�μ��Է� 2.�μ����� 3. �μ����� 4.���μ���ȸ 5.Ư���μ���ȸ 6.����";
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
				JOptionPane.showMessageDialog(null, "�޴���ȣ�� 1~6������ �Է�.");
			}//end case
			
			
		} while (!exitFlag);
		
	}//selectMenu
	
	public void addCpDept() {
		String inputData = JOptionPane.showInputDialog("�μ������߰�\n�Է� ��) �μ���ȣ, �μ���,��ġ\n�� �������� �Է�");
		
		String[] tempData = inputData.replace(" ", "").split(",");
		if(tempData.length != 3) {
			JOptionPane.showMessageDialog(null, "�Էµ����� ������ �ùٸ��� �ʽ��ϴ�.\\n�Է� ��) �μ���ȣ, �μ���,��ġ\\n�� �������� �Է�");
			//��ȯ���� void�϶� ����ϴ� return
			//��ȯ���� void�϶� return�� ����ϸ� �ڵ��� ������ ���߰� ȣ���� ������ ���ư���� �ǹ�
			return ;
		}//end if
		
		//���� �� �Էµ� ���.
		DeptVO dVO= new DeptVO(Integer.parseInt(tempData[0]), tempData[1], tempData[2]);
		
		//Singleton Pattern�� ���Ե� DAOŬ����.
		PreparedStatementDAO psDAO = PreparedStatementDAO.getInstance();
		
		try {
			psDAO.insertCpDept(dVO);
			JOptionPane.showMessageDialog(null, dVO.getDeptno()+"�� �μ����� �߰�");
		} catch (SQLException se) {
			se.printStackTrace();
			String errMsg=se.getMessage();
			if (se.getErrorCode()==1) {
				errMsg = "�ι�ȣ�� �̹� �����մϴ�.";
			}//end if
			
			if (se.getErrorCode()==1438) {
				errMsg = "�μ���ȣ�� �ʰ��Ǿ����ϴ�. �μ���ȣ�� 2�ڸ�";
			}//end if
			
			if (se.getErrorCode()==12899) {
				errMsg = "�μ��� �Ǵ� ��ġ�� �ʰ��� �κ�. �μ����� �ѱ� 4�� ���� 13�ڱ���...";
			}//end if
			JOptionPane.showMessageDialog(null, errMsg);
		}//end catch
		
	}//addCpDept
	
	public void modifyCpDept() {
		String inputData = JOptionPane.showInputDialog("�μ���������\n�Է� ��) �μ���ȣ, �μ���,��ġ\n�� �������� �Է�");
		
		String[] tempData = inputData.replace(" ", "").split(",");
		
		if(tempData.length != 3) {
			JOptionPane.showMessageDialog(null, "�Էµ����� ������ �ùٸ��� �ʽ��ϴ�.\\n�Է� ��) �μ���ȣ, �μ���,��ġ\\n�� �������� �Է�");
			//��ȯ���� void�϶� ����ϴ� return
			//��ȯ���� void�϶� return�� ����ϸ� �ڵ��� ������ ���߰� ȣ���� ������ ���ư���� �ǹ�
			return ;
		}//end if
		
		//���� �� �Էµ� ���.
		DeptVO dVO= new DeptVO(Integer.parseInt(tempData[0]), tempData[1], tempData[2]);
		
		//Singleton Pattern�� ���Ե� DAOŬ����.
		PreparedStatementDAO psDAO = PreparedStatementDAO.getInstance();
		
		try {
			int cnt = psDAO.updateCpDept(dVO);
			if(cnt==1) {
				JOptionPane.showMessageDialog(null, dVO.getDeptno()+"�� �μ����� ����");
			}else {
				JOptionPane.showMessageDialog(null, dVO.getDeptno()+"�� �μ������� �������� �ʽ��ϴ�.");
			}//end else
		
		//�����޼���
		} catch (SQLException se) {
			se.printStackTrace();
			String errMsg=se.getMessage();
			
			if (se.getErrorCode()==12899) {
				errMsg = "�μ��� �Ǵ� ��ġ�� �ʰ��� �κ�. �μ����� �ѱ� 4�� ���� 13�ڱ���...";
			}//end if
			JOptionPane.showMessageDialog(null, errMsg);
		}//end catch
		
	}//updateCpDept
	
	public void removeCpDept() {
		String inputData = JOptionPane.showInputDialog("�μ����� ����\n������ �μ���ȣ �Է�");
		
		if(inputData != null && !"".equals(inputData)) {
			try {
				int deptno = Integer.parseInt(inputData);
				//Singleton Pattern�� ���Ե� ��ü.
				PreparedStatementDAO psDAO = PreparedStatementDAO.getInstance();
				int cnt = psDAO.deleteCpDept(deptno);
				
				if(cnt ==1) {
					JOptionPane.showMessageDialog(null, deptno+"�μ������� ���� �Ǿ����ϴ�.");
				}else {
					JOptionPane.showMessageDialog(null, deptno+"�μ������� �������� �ʽ��ϴ�.");
				}//end else
				
				
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "�μ���ȣ�� �����̾���մϴ�.");
			}catch (SQLException e) {
				e.printStackTrace();
			}//end catch
			
		}//end if
		
	}//deleteCpDept
	
	public void searchAllCpDept() {
		//Singleton Pattern�� ���Ե� Ŭ������ ����Ͽ� ��ü�� ���.
		PreparedStatementDAO psDAO = PreparedStatementDAO.getInstance();
		
		try {
			List<DeptVO> list = psDAO.selectAllCpDept();
			StringBuilder output =new StringBuilder();
			output.append("�μ���ȣ\t�μ���\t��ġ\n")
			.append("----------------------------------\n");
			
			if (list.isEmpty()) {
				output.append("�μ������� �������� �ʽ��ϴ�.\n");
			}//end if
			
			for(DeptVO dv : list) {
				output
				.append(dv.getDeptno()).append("\t")
				.append(dv.getDname()).append("\t")
				.append(dv.getLoc()).append("\n");
			}//end for
			output.append("----------------------------------\n");
			
			if ( !list.isEmpty() ) {
				output.append(list.size()+"���� ������ ��ȸ�Ǿ����ϴ�.");
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
		String inputData = JOptionPane.showInputDialog("�μ����� ��ȸ\n��ȸ�� �μ���ȣ �Է�");
		
		if(inputData != null && !"".equals(inputData)) {
			try {
				int deptno = Integer.parseInt(inputData);
				//Singleton Pattern�� ���Ե� ��ü.
				PreparedStatementDAO psDAO = PreparedStatementDAO.getInstance();

				DeptOneVO doVO=psDAO.selectOneCpDept(deptno);
				
				StringBuilder output = new StringBuilder();
				output.append(deptno).append("��");
				
				if(doVO ==null) {
					//JOptionPane.showMessageDialog(null, deptno+"�μ������� �������� �ʽ��ϴ�.");
					output.append(deptno).append(" �μ��� �������� �ʽ��ϴ�.");
				}else {
					//JOptionPane.showMessageDialog(null, deptno+"�μ����� ��ȸ ���\n"+doVO.getDname()+"/"+doVO.getLoc());
					output.append(deptno).append("�� �μ����� ��ȸ ���\n �μ��� : ").append(doVO.getDname())
					.append(", ��ġ : ").append(doVO.getLoc());
				}//end else
				JOptionPane.showMessageDialog(null, output.toString());
				
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "�μ���ȣ�� �����̾���մϴ�.");
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
