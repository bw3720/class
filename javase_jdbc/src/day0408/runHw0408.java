package day0408;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class runHw0408 {
	
	private hw0408 hwDAO;
	
	private JTextArea jta;
	
	public runHw0408() {
		hwDAO = new hw0408();
	}//UseStatementDAO
	
	
	private void searchOneCar() {
	String country = JOptionPane.showInputDialog("제조국을 입력하세요. \nex) 국산 or 수입"); 	
		
		
		try {
			List<hwCarVO> list=hwDAO.searchCountry(country);
			
			if(list.isEmpty()) {
				JOptionPane.showMessageDialog(null, country+"은 올바르지 않은 형태입니다.");
			}//end if
			
			hwCarVO hcVO = null;
			for(int i =0; i<list.size(); i++) {
				
				hcVO=list.get(i);
				System.out.println(hcVO.getMaker()+" / "+hcVO.getModel()+" / "+hcVO.getCarOption()+" / "+hcVO.getPrice()+" / "+hcVO.getHiredate());
			}//end for

		} catch (SQLException e) {
			e.printStackTrace();
		}//end catch
		
		
	}//searchOneCpEmp
	
	
	
	
	public static void main(String[] args) {
		runHw0408 rhw = new runHw0408();
		rhw.searchOneCar();
	}

}
