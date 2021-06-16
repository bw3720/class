package day0224;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * �̹����� �� ��ư.
 * @author SIST
 */
@SuppressWarnings("serial")
//1.������ ������Ʈ�� ���
public class BtnImage extends JFrame {

	//2.�����ڿ��� ������Ʈ�� ����
	public BtnImage() {
		super("�̹����� ����� ��ư");
		//�̹��� ��ü ����
		ImageIcon ii1 = new ImageIcon("C:/dev/workspace/javase_prj2/src/day0224/images/img1.png");
		ImageIcon ii2 = new ImageIcon("C:/dev/workspace/javase_prj2/src/day0224/images/img2.png");
		ImageIcon ii3 = new ImageIcon("C:/dev/workspace/javase_prj2/src/day0224/images/img3.png");
		ImageIcon ii4 = new ImageIcon("C:/dev/workspace/javase_prj2/src/day0224/images/img4.png");
		
		//������ �̹��� ��ü�� ������ ������Ʈ�� ����.
		JButton jbtn1 = new JButton("���̾�",ii1);
		JButton jbtn2 = new JButton("����",ii2);
		JButton jbtn3 = new JButton("����ġ",ii3);
		
		//ǳ������ ����.
		jbtn1.setToolTipText("���̾�-����");
		jbtn2.setToolTipText("����-�ܹ���");
		jbtn3.setToolTipText("����ġ-������");
		
		//���콺�� �ö��� ��, �̹����� ����.
		jbtn3.setRolloverIcon(ii4);
		
		//��ư �ؽ�Ʈ�� ������ġ�� ����. TOP, CENTER, BOTTOM
		jbtn1.setVerticalTextPosition(JButton.BOTTOM);
		
		//��ư �ؽ�Ʈ�� ������ġ�� ����. LEFT, CENTER, RIGHT
		jbtn2.setHorizontalTextPosition(JButton.LEFT);
		
		//���� �ΰ����� �����Ͽ� 9������ ��ġ�� ���� �� �ִ�.
		
		jbtn3.setVerticalTextPosition(JButton.BOTTOM);
		jbtn3.setHorizontalTextPosition(JButton.LEFT);
		
		
		//3.��ġ������ ����.
		setLayout(new GridLayout(1,3));
		//4.��ġ
		
		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
		
		
		
		
		//5.������ ũ�� ����
		setBounds(100, 100, 800, 300);
		//6.����ȭ
		setVisible(true);
		//7.����ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//BtnImage
	
	public static void main(String[] args) {
		new BtnImage();
	}//main

}//class
