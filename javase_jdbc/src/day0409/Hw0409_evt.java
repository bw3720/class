package day0409;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class Hw0409_evt implements ActionListener {
	private Hw0409 hw;
	private StringBuilder sb;
	private boolean colflag ;
	private List<String> list;

	public Hw0409_evt(Hw0409 hw) {
		this.hw = hw;
		sb = new StringBuilder();
		list = new ArrayList<String>();
	}//Hw0409_evt
	
	public void setTableName(String tName) {
		sb.append("CREATE TABLE ").append(tName).append("(\n)");
		hw.getJta().setText(sb.toString());
		
	}//setTableName
	
	public void setColumn(String cName, String type, String size) {
		StringBuilder temp = new StringBuilder();
		String constraint = "";
		
		if(!(type.equals("DATE") || size.equals(""))) {
			size = "("+size+") ";
		}else {
			size = " ";
		}
		
		if(hw.getJchk1().isSelected()) {
			constraint = " PRIMARY KEY";
		}else if(hw.getJchk2().isSelected()) {
			constraint = " NOT NULL";
		}//end else if
		
		if(!colflag) {
			temp.append("  ").append(cName).append(" ").append(type).append(size).append(constraint+"");
			sb.insert(sb.indexOf(")"), temp.toString());
			sb.insert(sb.length()-1, "\n");
			colflag=true;
			
		}else {
			temp.append(",\n  ").append(cName).append(" ").append(type).append(size).append(constraint+"");
			sb.insert(sb.length()-2, temp.toString());
			
		}//end else
		hw.getJta().setText(sb.toString());
		list.add(cName);
		
	}//setColumn
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == hw.getJbtnTa()) {
			if(!hw.getJtfTn().getText().equals("")) {
				if(hw.getJta().getText().equals("")) {
					setTableName(hw.getJtfTn().getText().toUpperCase());
				}else {
					JOptionPane.showMessageDialog(hw, "테이블명이 이미 정의되어있습니다.");
				}//end else
			}else {
				JOptionPane.showMessageDialog(hw, "테이블명을 입력해주세요.");
			}//end else

		}//end if(테이블이름 생성버튼)
		/////////////////////////////////////////////////////////////////////////
		if(ae.getSource() == hw.getJbtnCo()) {
			if(!hw.getJtfCn().getText().equals("")) {
				if(!hw.getJta().getText().equals("")) {
					String cName = hw.getJtfCn().getText().toUpperCase();
					String type = (String) hw.getJcb().getSelectedItem();
					String size = hw.getJtfS().getText();
					
					if(list.indexOf(cName) <0 ) {
						setColumn(cName, type, size);
					}else {
						JOptionPane.showMessageDialog(hw, "동일한 이름의 컬럼이 이미 존재합니다.");
					}//end else
				}else {
					JOptionPane.showMessageDialog(hw, "컬럼명을 입력해주세요.");
				}//end else
			} else {
				JOptionPane.showMessageDialog(hw, "컬럼명을 입력해주세요.");
			}//end else
		
		}//end if(컬럼생성 버튼)
		
		/////////////////////////////////////////////////////////////////////////
		if (ae.getSource() == hw.getJcb()) {
			if (((String)hw.getJcb().getSelectedItem()).equals("DATE")) {
				hw.getJtfS().setText("");
				hw.getJtfS().setEditable(false);
			} else {
				hw.getJtfS().setEditable(true);
			}//end else
		}//end if (콤보박스)
		/////////////////////////////////////////////////////////////////////////
		if(ae.getSource() == hw.getJbtnCr()) {
			Hw0409DAO hwDAO = Hw0409DAO.getInstance();
			Connection con = null;
			PreparedStatement pstmt = null;
			String createBtn = hw.getJta().getText();
			
			try {
				con = hwDAO.getConnection();
				pstmt = con.prepareStatement(createBtn);
				pstmt.executeUpdate(createBtn);
				JOptionPane.showMessageDialog(hw, "테이블이 생성되었습니다.");
			} catch (SQLException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(hw, "테이블 생성 중 오류 발생. 에러 : " + e.getMessage());
			} finally {
				try {
					hwDAO.close(pstmt, con);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}//end if(테이블생성 버튼)
	}//actionPerformed
}

