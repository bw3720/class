package day0413;

import static java.lang.Integer.parseInt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import day0412.UseCallableStatementDAO;

public class Work0412Event extends WindowAdapter implements ActionListener, MouseListener {
	private RunCrudDAO rcDAO;
	private boolean selectFlag;
	
	public Work0412Event(RunCrudDAO rcDAO) {
		this.rcDAO = rcDAO;
	}//Work0412Event
	
	@Override
	public void windowClosing(WindowEvent we) {
		rcDAO.dispose();
	}//windowClosing
	
	@Override
	public void mouseClicked(MouseEvent me) {
		//���콺 ��ư�� Ŭ���Ǿ����� �����ϴ� method
		switch(me.getButton()) { 
		case MouseEvent.BUTTON1 :
			//���õ� �������� �޾ƿͼ� JTextField�� �߰�
			String csvData = rcDAO.getJl().getSelectedValue();
			String[] arrData = csvData.split(",");
			
			rcDAO.getJtfNum().setText(arrData[0]);
			rcDAO.getJtfName().setText(arrData[1]);
			rcDAO.getJtfAge().setText(arrData[2]);
			rcDAO.getJtfAddr().setText(arrData[3]);
			
			//JList�� item�� ���� �Ǿ����� 
			selectFlag = true;
		}//end switch
		
	}//mouseClicked

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		//�߰���ư
		if(ae.getSource()==rcDAO.getJbtnInsert()) {
			addWork();
		}//end if
		
		//������ư
		if(ae.getSource() == rcDAO.getJbtnDelete()) {
			if(!selectFlag) {
				JOptionPane.showMessageDialog(rcDAO, "�����ϽǷ��� �������� ���� ������ �ּ���.");
				return;
			}
			removeWork();
		}
		
		//�����ư
		if(ae.getSource() == rcDAO.getJbtnUpdate()) {
			if(!selectFlag) {
				JOptionPane.showMessageDialog(rcDAO, "�����ϽǷ��� �������� ���� ������ �ּ���.");
				return;
			}
			modifyWork();
		}
		
		//�ݱ��ư
		if(ae.getSource()==rcDAO.getJbtnClose()) {
			rcDAO.dispose();
		}//end if
		
		//��ư�� ������ �۾��� �����ϰ� ���Ŀ��� jlist�� item���û��¸� �����Ѵ�.
		selectFlag = true;
	}//actionPerformed
	
	private void addWork() {
		//JTextField�� ���� �޾ƿͼ� DB�� �߰�.
		String name = rcDAO.getJtfName().getText().trim();
		String age = rcDAO.getJtfAge().getText().trim();
		String addr = rcDAO.getJtfAddr().getText().trim();
		
		if("".equals(name)) {
			JOptionPane.showMessageDialog(rcDAO, "�̸��� �ʼ� �Է�");
			rcDAO.getJtfName().requestFocus();
			return;
		}//end if
		
		if("".equals(age)) {
			JOptionPane.showMessageDialog(rcDAO, "���̴� �ʼ� �Է�");
			rcDAO.getJtfAge().requestFocus();
			return;
		}//end if
		
		int intAge = 0;
		
		try {
			intAge = Integer.parseInt(age);
		}catch(NumberFormatException nfe){
			JOptionPane.showMessageDialog(rcDAO, "���̴� ���ڷ� �Է����ּ���.");
			rcDAO.getJtfAge().setText("");
			rcDAO.getJtfAge().requestFocus();
			return;
		}//end catch
		
		if("".equals(addr)) {
			JOptionPane.showMessageDialog(rcDAO, "�ּҴ� �ʼ� �Է�");
			rcDAO.getJtfAddr().requestFocus();
			return;
		}//end if
		
		WorkAddVO waVO = new WorkAddVO(name, intAge, addr);
		Work0412DAO wDAO = Work0412DAO.getInstance();
		
		try {
			wDAO.insertWork(waVO);//�����͸� DBMS ���̺� �߰��ϰ�
			setJListWork();//�Էµ� ������ �����͸� �����Ͽ� JList�� ���
			JOptionPane.showMessageDialog(rcDAO, "�Է��� ���� �߰� �Ϸ�.");
		} catch (SQLException se) {
			se.printStackTrace();
			JOptionPane.showMessageDialog(rcDAO, "���� �߻� �����߰� �� �����߻�");
		}//end catch
		
	}//addWork
	
	private void removeWork() {
//		Work0412DAO wDAO = Work0412DAO.getInstance();
//		try {
//			int num = Integer.parseInt(rcDAO.getJtfNum().getText());
//			wDAO.deleteWork(num);
//			setJListWork();
//		} catch (NumberFormatException ne) {
//			JOptionPane.showMessageDialog(rcDAO, "���� ���� �������ּ���.");
//		} catch (SQLException se) {
//			JOptionPane.showMessageDialog(rcDAO, "������ ������ �߻��߽��ϴ�.");
//		}
		//jtextfield�� ���� �޾ƿͼ� DB���� ����
		String num = rcDAO.getJtfNum().getText().trim();
		
		switch (JOptionPane.showConfirmDialog(rcDAO, num+"�� �����͸� �����Ͻðڽ��ϱ�?")) {
		case JOptionPane.OK_OPTION:
			Work0412DAO wDAO = Work0412DAO.getInstance();
			try {
				int cnt = wDAO.deleteWork(Integer.parseInt(num));
				String outputMsg = num+"�� �����Ͱ� ���� ���� �ʾҽ��ϴ�. ��ȣ�� Ȯ���ϼ���.";
				if(cnt==1) {
					outputMsg = num+"�� �����Ͱ� �����Ǿ����ϴ�.";
					setJListWork();
				}
				JOptionPane.showMessageDialog(rcDAO, outputMsg);
			} catch (SQLException se) {
				se.printStackTrace();
				JOptionPane.showMessageDialog(rcDAO, "DB���� �����߻�");
			}//end catch
			
		}//end switch
		
	}//removeWork
	
	private void modifyWork() {
		//JTextField�� ���� �޾ƿͼ� DB�� �߰�.
			String num = rcDAO.getJtfNum().getText().trim();
			String name = rcDAO.getJtfName().getText().trim();
			String age = rcDAO.getJtfAge().getText().trim();
			String addr = rcDAO.getJtfAddr().getText().trim();
				
			if("".equals(name)) {
				JOptionPane.showMessageDialog(rcDAO, "�̸��� �ʼ� �Է�");
				rcDAO.getJtfName().requestFocus();
				return;
			}//end if
				
			if("".equals(age)) {
				JOptionPane.showMessageDialog(rcDAO, "���̴� �ʼ� �Է�");
				rcDAO.getJtfAge().requestFocus();
				return;
			}//end if
				
				int intAge = 0;
				
			try {
				intAge = Integer.parseInt(age);
			}catch(NumberFormatException nfe){
				JOptionPane.showMessageDialog(rcDAO, "���̴� ���ڷ� �Է����ּ���.");
				rcDAO.getJtfAge().setText("");
				rcDAO.getJtfAge().requestFocus();
				return;
			}//end catch
				
			if("".equals(addr)) {
				JOptionPane.showMessageDialog(rcDAO, "�ּҴ� �ʼ� �Է�");
				rcDAO.getJtfAddr().requestFocus();
				return;
			}//end if
			
			
			switch (JOptionPane.showConfirmDialog(rcDAO, name+"�� ������ �����Ͻðڽ��ϱ�?")) {
			case JOptionPane.OK_OPTION: 
				//��ȿ�� ������ ����Ǿ��ٸ� ���ҵǾ� �ִ� ���� VO�� �ִ´�.
				WorkAllVO waVO = new WorkAllVO(Integer.parseInt(num),name,intAge,addr);
				
				//DB�۾��� ���� DAOŬ���� ��ü���
				Work0412DAO wDAO = Work0412DAO.getInstance();
				
				try {
					int cnt = wDAO.updateWork(waVO);
					String outputMsg = waVO.getName()+"���� ������ ��������ʾҽ��ϴ�";
					if(cnt ==1) {
						outputMsg = waVO.getName()+"���� ������ ����Ǿ����ϴ�";
						setJListWork();//���泻���� ����ڿ��� �����ִ� ����Ʈ ���ΰ�ħ
					}//end if
					JOptionPane.showMessageDialog(rcDAO, outputMsg);
				} catch (SQLException se) {
					se.printStackTrace();
					JOptionPane.showMessageDialog(rcDAO, "�����۾� �� ������ �߻��Ͽ����ϴ�.");
				}//end catch
				
			}//end switch
			
			
	}//modifyWork
	
	/**
	 * work���̺��� ��� ���ڵ带 ��ȸ�Ͽ� JList�� �����ϴ� ��.
	 */
	public void setJListWork() {
		Work0412DAO wDAO = Work0412DAO.getInstance();
		try {
			List<WorkAllVO> list = wDAO.selectAllWork();
			//������ Ŭ�������� ��(JList)�� �����͸� �����ϴ� ��ü(DefaultListModel)�� ��´�.
			DefaultListModel<String> dlm = rcDAO.getDflm();
			//������ �����͸� �ʱ�ȭ
			dlm.clear();
			
			//��ȸ�� ����� Model��ü�� �����Ѵ�.
			StringBuilder viewData = new StringBuilder();
			for(WorkAllVO waVO : list) {
				viewData.append(waVO.getNum()).append(", ")
				.append(waVO.getName()).append(", ")
				.append(waVO.getAge()).append(", ")
				.append(waVO.getAddr());
				
				dlm.addElement(viewData.toString());
				
				viewData.delete(0, viewData.length());
			}//end for
			
			
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(rcDAO, "���񽺰� �������� ���� �� �˼��մϴ�.");
			e.printStackTrace();
		}//end catch
		
		
	}//setJListWork


}
