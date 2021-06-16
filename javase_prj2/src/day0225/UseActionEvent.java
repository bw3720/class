package day0225;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * ��ư�� Ŭ�� ���� �� �����츦 �����ϴ� ����� ����.<br>
 * ��ư Ŭ�� - �߻��ϴ� ActionEvent�� �߻�
 * ActionEvent�� ó���ɵɷ���
 *  1. �̺�Ʈ�� ó���� �ڵ带 ����.
 *  	XXXListener ����.
 *  2. �̺�Ʈ�� ���.
 *  	������Ʈ ��ü��.addXxxListener(ó�� �� ��ü)
 * @author SIST
 */
//1. �̺�Ʈ�� ó���� �� �ִ� Listener�� ����
@SuppressWarnings("serial")
public class UseActionEvent extends JFrame implements ActionListener{
	
	public UseActionEvent() {
		super("�̺�Ʈ ó��");
		
		JButton jbtn = new JButton("�ݱ�");
		JPanel jp = new JPanel();
		jp.add(jbtn); //��ư�� ����ũ�⸦ ������ �����̳� ������Ʈ�� ��ġ
		
		//������Ʈ���� ������� ������ ���� �� JVM���� û���� �� �ֵ��� �����ʿ� ����Ѵ�.
		jbtn.addActionListener(this);
		
		
		add("Center",jp);//�����̳� ������Ʈ�� ������ ������Ʈ�� ��ġ
		setBounds(100, 100, 400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseActionEvent
	
	//2.Listener���� �����ϴ� abstract method�� Override
	public void actionPerformed(ActionEvent ae) {
		//������� ������ �־��� �� JVM���� ȣ��.(��ϵ� ������Ʈ������ ȣ�Ⱑ��)
		System.out.println("button click!!");
		dispose();
	}//actionPerformed
	
	
	public static void main(String[] args) {
		new UseActionEvent();
	}//main

}//class
