package day0225;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * �̸��� �Է��ϸ� ��ư�� Ŭ��(ActionEvent)�ϸ� �Էµ� �̸��� JList�� �߰��ǰ� ,
 * JList�� item�� ����(ListSelectionEvent)�ϸ� �ش� �������� ���� JTextField�� �����Ǵ� ��. 
 * @author SIST
 */
@SuppressWarnings("serial")
//1.������ ������Ʈ ���, �߻��̺�Ʈ�� ó���� �� �ִ� Listener�� ����.
public class UseMVCEvt extends JFrame implements ActionListener, ListSelectionListener{
	//2. �̺�Ʈ�� �߻������� ����� ������Ʈ�� ����.
	private JTextField jtfName;
	private JList<String> jlName;//MVC Pattern�� ������ ���۵� ������Ʈ. View��ü (���� �����ִ� ��)
	
	private DefaultListModel<String> dlmName;//Model��ü ( �� )
	
	public UseMVCEvt() {
		super("Container Component ���.");
		//3.�����͵� ����
		//������Ʈ ���� + �ϴ���
		JLabel jlblName = new JLabel("�̸� : ");
		jtfName = new JTextField(12);
		JButton jbtnInput = new JButton("�Է�");

		dlmName = new DefaultListModel<String>();//Model��ü ����
		jlName = new JList<String>(dlmName); //Model��ü�� ����Ͽ� View��ü ����.
		
		JScrollPane jspName = new JScrollPane(jlName);//JList�� jsp�� �Ҵ�
		jspName.setBorder(new TitledBorder("�Է� �̸�"));
				
		//4. ��ġ������ ����
		//�������� ������Ʈ�� �ѹ��� ��ġ�ϱ����� container component ==> JPanel
		JPanel jpNorth = new JPanel();
		jpNorth.add(jlblName);
		jpNorth.add(jtfName);
		jpNorth.add(jbtnInput);
		//��ũ�ѹٰ� �ʿ��� ��ü�� ��ũ�ѹٸ� ��ġ�ϱ����� container component ==> JScrollPane
		
		//5.��ġ
		add("North",jpNorth);
		add("Center",jspName); 
		
		////��ư���� �߻��� �̺�Ʈ�� ó���� �� �ֵ���, �̺�Ʈ�� ���.
		jbtnInput.addActionListener(this);//��ư Ŭ��!!
		jtfName.addActionListener(this);//�ؽ�Ʈ�ʵ� ����!!
		
		jlName.addListSelectionListener(this);//����Ʈ�� ������ ����.
		
		//6.ũ�� ����
		setSize(500, 400);
		setLocation(100 , 200);
		
		//7.����ȭ
		setVisible(true);
		
		//8.����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}//UseContainerComponent
	
	//2.�̺�Ʈ ó���� �� �� �ִ� method Override
	@Override
	public void actionPerformed(ActionEvent ae) {
		//JTextField�� �Է°��� �����ͼ�
		String name = jtfName.getText();
		
		//JList�� �߰�. (View�� �ƴ� Model ��ü�� ����Ͽ� ���� �߰�)
		dlmName.addElement(name);
		
		
		//JTextField�� ���� �ʱ�ȭ �Ѵ�.
		jtfName.setText("");
		//JTextField�� Ŀ���� ���� ���´�.
		jtfName.requestFocus();
		
	}//actionPerformed
	
	
//	boolean flag;
	@Override
	public void valueChanged(ListSelectionEvent lse) {
		//�ѹ��� ����ǵ��� �����
//		System.out.println( jlName.getValueIsAdjusting());
//		if( flag ) {
		if(lse.getValueIsAdjusting()) {
			//JTextField�� ���õ� ���� ����.
			
			jtfName.setText(dlmName.getElementAt(jlName.getSelectedIndex()));
//			System.out.println("������ ���ؽ� : "+jlName.getSelectedIndex());
//			//���õ� �ε����� ���� View�� Model�� �� 
//			System.out.println("������ ���ؽ��� �� : "+dlmName.getElementAt(jlName.getSelectedIndex()));
//			
//			System.out.println(jlName.getSelectedValue());
			
		}//end if
//		flag = !flag;
		
	}//valueChanged
	
	public static void main(String[] args) {
		new UseMVCEvt();
	}//main


}//class
