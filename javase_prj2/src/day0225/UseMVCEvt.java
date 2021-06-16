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
 * 이름을 입력하면 버튼을 클릭(ActionEvent)하면 입력된 이름이 JList에 추가되고 ,
 * JList의 item을 선택(ListSelectionEvent)하면 해당 아이템의 값이 JTextField에 설정되는 일. 
 * @author SIST
 */
@SuppressWarnings("serial")
//1.윈도우 컴포넌트 상속, 발생이벤트를 처리할 수 있는 Listener를 구현.
public class UseMVCEvt extends JFrame implements ActionListener, ListSelectionListener{
	//2. 이벤트가 발생했을떄 사용할 컴포넌트를 선언.
	private JTextField jtfName;
	private JList<String> jlName;//MVC Pattern을 도입해 제작된 컴포넌트. View객체 (값을 보여주는 일)
	
	private DefaultListModel<String> dlmName;//Model객체 ( 값 )
	
	public UseMVCEvt() {
		super("Container Component 사용.");
		//3.컴포넌드 생성
		//컴포넌트 종류 + 하는일
		JLabel jlblName = new JLabel("이름 : ");
		jtfName = new JTextField(12);
		JButton jbtnInput = new JButton("입력");

		dlmName = new DefaultListModel<String>();//Model객체 생성
		jlName = new JList<String>(dlmName); //Model객체를 사용하여 View객체 생성.
		
		JScrollPane jspName = new JScrollPane(jlName);//JList를 jsp에 할당
		jspName.setBorder(new TitledBorder("입력 이름"));
				
		//4. 배치관리자 설정
		//여러개의 컴포넌트를 한번에 배치하기위한 container component ==> JPanel
		JPanel jpNorth = new JPanel();
		jpNorth.add(jlblName);
		jpNorth.add(jtfName);
		jpNorth.add(jbtnInput);
		//스크롤바가 필요한 객체에 스크롤바를 배치하기위한 container component ==> JScrollPane
		
		//5.배치
		add("North",jpNorth);
		add("Center",jspName); 
		
		////버튼에서 발생한 이벤트를 처리할 수 있도록, 이벤트에 등록.
		jbtnInput.addActionListener(this);//버튼 클릭!!
		jtfName.addActionListener(this);//텍스트필드 엔터!!
		
		jlName.addListSelectionListener(this);//리스트의 아이템 선택.
		
		//6.크기 설정
		setSize(500, 400);
		setLocation(100 , 200);
		
		//7.가시화
		setVisible(true);
		
		//8.종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}//UseContainerComponent
	
	//2.이벤트 처리를 할 수 있는 method Override
	@Override
	public void actionPerformed(ActionEvent ae) {
		//JTextField의 입력값을 가져와서
		String name = jtfName.getText();
		
		//JList에 추가. (View가 아닌 Model 객체를 사용하여 값을 추가)
		dlmName.addElement(name);
		
		
		//JTextField의 값을 초기화 한다.
		jtfName.setText("");
		//JTextField에 커서를 갖다 놓는다.
		jtfName.requestFocus();
		
	}//actionPerformed
	
	
//	boolean flag;
	@Override
	public void valueChanged(ListSelectionEvent lse) {
		//한번만 실행되도록 만들기
//		System.out.println( jlName.getValueIsAdjusting());
//		if( flag ) {
		if(lse.getValueIsAdjusting()) {
			//JTextField에 선택된 값을 설정.
			
			jtfName.setText(dlmName.getElementAt(jlName.getSelectedIndex()));
//			System.out.println("선택한 인텍스 : "+jlName.getSelectedIndex());
//			//선택된 인덱스의 값은 View와 Model의 합 
//			System.out.println("선택한 인텍스의 값 : "+dlmName.getElementAt(jlName.getSelectedIndex()));
//			
//			System.out.println(jlName.getSelectedValue());
			
		}//end if
//		flag = !flag;
		
	}//valueChanged
	
	public static void main(String[] args) {
		new UseMVCEvt();
	}//main


}//class
