package day0409;



import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Hw0409 extends JFrame {
	private JLabel jlbTn, jlbCn, jlbDn, jlbSi, jlbPkn, jlbNnn;
	private JButton jbtnTa, jbtnCo, jbtnCr;
	private JTextField jtfTn,jtfCn,jtfS;
	private DefaultComboBoxModel<String> dcbm;
	private JComboBox<String> jcb;
	private JCheckBox jchk1, jchk2;
	private JTextArea jta;
	private String[] cbElement = {"NUMBER","VACHAR2","CHAR","DATE"};
	
	public Hw0409() {
		super("테이블 생성기");
		
		setBounds(200, 200, 600, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		
		jlbTn = new JLabel("테이블명");
		jlbCn = new JLabel("컬럼명");
		jlbDn = new JLabel("데이터형");
		jlbSi = new JLabel("크기");
		jlbPkn = new JLabel("Primary Key");
		jlbNnn = new JLabel("Not Null");
		
		jtfTn= new JTextField();
		jtfCn= new JTextField();
		jtfS= new JTextField();
		
		jbtnTa = new JButton("설정");
		jbtnCo = new JButton("설정");
		jbtnCr = new JButton("생성");
		
		dcbm = new DefaultComboBoxModel<String>(cbElement);
		jcb = new JComboBox<String>(dcbm);
		
		
		jchk1 = new JCheckBox();
		jchk2 = new JCheckBox();
		
		jta = new JTextArea();
		jta.setEditable(false);
		
		Hw0409_evt hwe = new Hw0409_evt(this);
		
		jbtnTa.addActionListener(hwe);
		jbtnCo.addActionListener(hwe);
		jbtnCr.addActionListener(hwe);
		
		jcb.addActionListener(hwe);
		
		jchk1.addActionListener(hwe);
		jchk2.addActionListener(hwe);
		
		
		
		jlbTn.setBounds(20, 20, 50, 30);
		jtfTn.setBounds(80, 20, 150, 30);
		jbtnTa.setBounds(240, 20, 60, 30);
		
		jlbCn.setBounds(20, 60, 50, 30);
		jtfCn.setBounds(80, 60, 150, 30);
		jlbDn.setBounds(240, 60, 50, 30);
		jcb.setBounds(300, 60, 70, 30);
		jlbSi.setBounds(400, 60, 30, 30);
		jtfS.setBounds(440, 60, 40, 30);
		
		jchk1.setBounds(40, 100, 30, 30);
		jlbPkn.setBounds(80, 100, 100, 30);
		jchk2.setBounds(190, 100, 30, 30);
		jlbNnn.setBounds(230, 100, 100, 30);
		jbtnCo.setBounds(300, 100, 70, 30);
		
		jta.setBounds(20, 160, 545, 530);
		jbtnCr.setBounds(270, 700, 60, 30);
		
		add(jlbTn);
		add(jtfTn);
		add(jbtnTa);
		
		add(jlbCn);
		add(jtfCn);
		add(jlbDn);
		add(jcb);
		add(jlbSi);
		add(jtfS);
		
		add(jchk1);
		add(jlbPkn);
		add(jchk2);
		add(jlbNnn);
		add(jbtnCo);
		
		add(jta);
		
		add(jbtnCr);
		
		setVisible(true);
		
		
		
	}//Hw0409

	public JLabel getJlbTn() {
		return jlbTn;
	}

	public JLabel getJlbCn() {
		return jlbCn;
	}

	public JLabel getJlbDn() {
		return jlbDn;
	}

	public JLabel getJlbSi() {
		return jlbSi;
	}

	public JLabel getJlbPkn() {
		return jlbPkn;
	}

	public JLabel getJlbNnn() {
		return jlbNnn;
	}

	public JButton getJbtnTa() {
		return jbtnTa;
	}

	public JButton getJbtnCo() {
		return jbtnCo;
	}

	public JButton getJbtnCr() {
		return jbtnCr;
	}

	public JTextField getJtfTn() {
		return jtfTn;
	}

	public JTextField getJtfCn() {
		return jtfCn;
	}

	public JTextField getJtfS() {
		return jtfS;
	}

	public DefaultComboBoxModel<String> getDcbm() {
		return dcbm;
	}

	public JComboBox<String> getJcb() {
		return jcb;
	}

	public JCheckBox getJchk1() {
		return jchk1;
	}

	public JCheckBox getJchk2() {
		return jchk2;
	}

	public JTextArea getJta() {
		return jta;
	}

	public String[] getCbElement() {
		return cbElement;
	}

	public static void main(String[] args) {
		new Hw0409();
	}//main
	

}//class
