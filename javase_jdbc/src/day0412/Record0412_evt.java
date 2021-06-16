package day0412;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Record0412_evt implements ActionListener, ListSelectionListener {

	private UseRecord0412 ur;
	
	public Record0412_evt(UseRecord0412 ur) {
	
	}


	@Override
	public void valueChanged(ListSelectionEvent e) {
		if (e.getValueIsAdjusting()) {
			String[] recordArr = ur.getList().getSelectedValue().split(",");
			ur.getJtfNum().setText(recordArr[0]);
			ur.getJtfName().setText(recordArr[1]);
			ur.getJtfAge().setText(recordArr[2]);
			ur.getJtfAddr().setText(recordArr[3]);
		}
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		//insert//
		if(ae.getSource() == ur.getJbInsert()) {
			String name = ur.getJtfName().getText();
			String age = ur.getJtfAge().getText();
			String addr = ur.getJtfAddr().getText();
			
			if(name.equals("")||age.equals("")||addr.equals("")) {
				JOptionPane.showMessageDialog(ur, "��ĭ ����");
			}else {
				Record0412DAO rDAO = Record0412DAO.getInstance();
				try {
					rDAO.insertRecord(name, Integer.parseInt(age), addr);
					ur.getDlm().clear();
					ur.getDlm().addAll(rDAO.getRecord());
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(ur, "������ ������ �߻��߽��ϴ�.");
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(ur, "���̴� ���ڸ� �Է����ּ���.");
				}
			}
			
		}//end if
		
		
		//delete//
		if(ae.getSource()== ur.getJbDelete()) {
			
		}//end if
		
		
		//update
		if(ae.getSource()== ur.getJbUpdate()) {
			
		}//end if
		
		
		//close//
		if(ae.getSource()== ur.getJbClose()) {
			
		}//end if
		
	}//actionPerformed

}//class
