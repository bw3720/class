package day0409;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import kr.co.sist.dao.DbConnection;

@SuppressWarnings("serial")
public class TableSchema extends JFrame implements ActionListener {
	
	private JButton jbtn;
	private DefaultComboBoxModel<String> dcbm;
	private JComboBox<String> jcb;
	private JTextArea jta;
	
	public TableSchema() {
		super("���̺� �÷�����.");
		
		dcbm = new DefaultComboBoxModel<String>();
		jcb = new JComboBox<String>(dcbm);
		jbtn = new JButton("��ȸ");
		jta = new JTextArea();
		
		JPanel jpNorth = new JPanel();
		jpNorth.add(new JLabel("���̺� ����"));
		jpNorth.add(jcb);
		jpNorth.add(jbtn);
		
		JScrollPane jsp = new JScrollPane(jta);
		jsp.setBorder(new TitledBorder("�÷�����"));
		
		add("North",jpNorth);
		add("Center",jsp);
		
		jbtn.addActionListener(this);
		
		setBounds(100, 100, 800, 800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//TableSchema
	
	/**
	 * DefaultComboBoxModel�� ���̺���� �����ϴ� ��
	 * @throws SQLException
	 */
	private void setTableName() throws SQLException{
		
		DbConnection dc = DbConnection.getInstance();
		
		//1. ����̹� �ε�
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
		//2. Ŀ�ؼ� ���
			con = dc.getConnection();
		//3. ������ ���� ��ü ���
			String sql = "select tname from tab";
			pstmt = con.prepareStatement(sql);
		//4. ���ε� ������ �� ����
		//5. ���� ���� �� ��� ���
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dcbm.addElement(rs.getString("tname"));
			}//end while
			
		}finally {
		//6. �������
		dc.close(rs, pstmt, con);
		}//end finally
		
	}//setTableName
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		//��ư�� �������� ������ ���̺�� ���
//		String tname = (String) jcb.getSelectedItem(); 
		String tname = dcbm.getElementAt(jcb.getSelectedIndex());  //MVC��
		
		try {
			tableSchema(tname);
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "��Ű�� ��ȸ�߿� ������ �߻�!");
		}//end catch
		
	}//actionPerformed
	
	private void tableSchema(String tname) throws SQLException {
		//bind ������ �÷����� ���ؼ��� ���ȴ�. (���̺��, �÷����� ���ε� ������ ����� �� ����.)
			DbConnection dc = DbConnection.getInstance();
		//1. ����̹� �ε�
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			ResultSetMetaData rsmd = null;
		
		//2. Ŀ�ؼ� ���
			try {
		//3. ������ ���� ��ü ���
				con = dc.getConnection();
//				String selectTname = "select * from ?";//���̺��, �÷����� ���ε� ������ ó���� �� ����.
				String selectTname = "select * from "+tname;
				pstmt = con.prepareStatement(selectTname);
		//4. ���ε� ������ �� ����
//				pstmt.setString(1, tname);
				
		//5. ������ ���� �� ��� ���
				rs= pstmt.executeQuery();
				rsmd=rs.getMetaData();
				
				StringBuilder output = new StringBuilder();
				output.append("�÷���\t����ó��\t�����\n");
				int precision = 0;
				for(int i =1; i<rsmd.getColumnCount()+1; i++) {
					output.append(rsmd.getColumnName(i)).append("\t")
					.append(rsmd.getColumnTypeName(i));
					
					precision = rsmd.getPrecision(i);
					if(precision != 0) {
						output.append("(").append(precision).append(")");
					}//end if
					
					output.append(rsmd.isNullable(i)==0?"\tNot null":"").append("\n");
				}//end for
				//���̺� ��Ű�� ������ JTextArea�� ����
				jta.setText(output.toString());
				
			}finally {
		//6. �������
			dc.close(rs, pstmt, con);
			}
		
	}//tableSchema
	

	public static void main(String[] args) {
		TableSchema ts= new TableSchema();
		try {
			ts.setTableName();
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(ts, "���� �߻�!");
		}//end catch
	}//main

}//class
