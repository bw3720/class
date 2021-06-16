package day0224;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 * MVC������ ���ԵǾ� ���۵� Ŭ����.
 * @author SIST
 */
@SuppressWarnings("serial")
public class UseMVCComponent extends JFrame {

	public UseMVCComponent() {
		super("MVC Patter�� ���Ե� ������Ʈ�� ���");
		
		//1.�����͸� �����ϴ� Model��ü�� ����.
		DefaultComboBoxModel<String> dcbm = new DefaultComboBoxModel<String>();
			//�����ʹ� Model��ü�� ����
			dcbm.addElement("�ڹ�");
			dcbm.addElement("����Ŭ");
			dcbm.addElement("JDBC");
			dcbm.addElement("HTML");
			dcbm.addElement("CSS");
			dcbm.addElement("JavaScript");
			dcbm.addElement("Servlet/JSP");
			dcbm.addElement("XML,JSON");
			dcbm.addElement("MyBatics,Spring");
		
		//2.�����͸� ������ View��ü ����.
		JComboBox<String> jcb = new JComboBox<String>(dcbm);
		
		
		//AWT������ ������ ��ü�� ���� �������� ���۵� ������Ʈ (Choice)������, 
		//Swing(JComboBox)������ �������� �����Ͽ� ������Ʈ�� �����Ͽ���.
		
		Choice cho = new Choice();
		cho.add("Java SE");//������ ��ü�� ���� ����
		cho.add("Oracle");
		cho.add("JDBC");
		cho.add("Front-end (HTML, CSS, JavaScript)");
		
		
		///////////////////////JList///////////////////////////////////////////////////////
		// ���� ���� Model��ü�� ����
		DefaultListModel<String> dlm = new DefaultListModel<String>();
		dlm.addElement("������");
		dlm.addElement("�ڱ��");
		dlm.addElement("�ǿ���");
		dlm.addElement("������");
		dlm.addElement("���μ�");
		dlm.addElement("������");
		dlm.addElement("�����");
		//Model ��ü�� ����Ͽ� View ��ü�� ����.
		JList<String> jl = new JList<String>(dlm);
		//��ũ�ѹ� ����.
		JScrollPane jspList = new JScrollPane(jl);
		
		///////////////////////JTable///////////////////////////////////////////////////////
		String[] columnaNames = {"��ȣ","�̸�","����"};
		//�� ��ü ����.5���� ���� ����
		//DefaultTableModel dtm = new DefaultTableModel(columnaNames,5);
		DefaultTableModel dtm = new DefaultTableModel(columnaNames,0); // --> ó������ �پ� ����
		
		////���ڵ� �߰�
		//�迭�� �߰�	
		String[] data = {"1","������","20"}; //�迭�� �����͸� ����� 
		dtm.addRow(data);//�߰�
		
		//���ͷ� �߰�
		Vector<String> vec = new Vector<String>();//���ͷ� �����͸� ����� 
		vec.add("2");
		vec.add("������");
		vec.add("25");
		dtm.addRow(vec);//�߰�
		
		
		//�䰴ü ����.
		JTable jt = new JTable(dtm);
		//��ũ�ѹ� ���� : �÷����� ����ڿ��� ��������.
		JScrollPane jspTable = new JScrollPane(jt);
		
		
		
		
		
		
		setLayout(new FlowLayout());
		
		//����ڿ��� �����ִ� ���ϴ� View��ü�� ��ġ
		add(jcb);
		add(cho);
		add(jspList);
		add(jspTable);
		
		setBounds(100, 100, 900, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseJCombobox
	

	public static void main(String[] args) {
		new UseMVCComponent();
	}//main

}//class
