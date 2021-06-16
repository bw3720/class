package kr.co.sist.chat.server;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class ChatServerView extends JFrame implements ActionListener, Runnable {
	
	private JList<String> clientView;
	private DefaultListModel<String> dlmClientStatus;
	
	public static List<ChatServerHelper> connList;// �����ڸ� �����ϱ����� ����Ʈ
	private ServerSocket server;//������ ������ �ޱ����� ServerSocket
	private Thread connThread;//�����ڸ� �����ΰ� ������ �ޱ����� ���ÿ� ó���ϱ����� Thread
	
	
	public ChatServerView() {
		super(":::::::::::::::ä�� ������:::::::::::::::::");
		
		//�����ڸ� ������ List�� �����Ѵ�.
//		connList= new ArrayList<ChatServerHelper>();  //�������� ����
		connList= new Vector<ChatServerHelper>();  //�������� �Ұ���
		
		dlmClientStatus=new DefaultListModel<String>();
		dlmClientStatus.addElement("ä�� ������");
		
		clientView=new JList<String>( dlmClientStatus );
		JButton jbtServerStart=new JButton("��������");
		
		JScrollPane jspClientView=new JScrollPane( clientView  );
		jspClientView.setBorder(new TitledBorder("������ ����"));
		
		JPanel jp=new JPanel();
		jp.add( jbtServerStart );
		
		add("Center", jspClientView);
		add("South",jp);
		
		jbtServerStart.addActionListener(this);
		addWindowListener(new WindowAdapter() {
			
			
			@Override
			public void windowClosing(WindowEvent e) {
				try {
					closeServer();
				} catch (IOException e1) {
					e1.printStackTrace();
				}finally{
					dispose();//closed�� �Ҹ�.
				}//end finally
			}//windowClosing

			@Override
			public void windowClosed(WindowEvent e) {
				System.exit(JFrame.ABORT);
			}//windowClosed
			
		});
		
		setBounds(100,100, 400, 600);
		setVisible(true);
		
	}//ChatserverView
	
	public void closeServer() throws IOException{
		if(server != null) {server.close();}//end if
	}//closeServer
	
	/**
	 * ���������� ���� �����ڸ� �޴´�.
	 */
	@Override
	public void run() {
		try {
			int port = 2021;
			server = new ServerSocket(port);
			
			dlmClientStatus.addElement("ä�� ������ �����Ǿ����ϴ�.");
			dlmClientStatus.addElement("�����Ʈ["+port+"]");
			
			ChatServerHelper csh =null;
			
			for(int cnt=0;;cnt++) {
				//�����ڸ� �ް� 
				csh = new ChatServerHelper(server.accept(), dlmClientStatus, cnt);
				//������ ���� ����Ʈ�� �߰�����
				connList.add(csh);
				//�޽����� ���� �� �ֵ��� thread�� �����Ѵ�.
				csh.start();
			}//end for
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this,	"���� ������ ������ �߻��Ͽ����ϴ�.");
			e.printStackTrace();
		}//end catch
	}//run

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(connThread ==null) {//������ ������� ���� �� => ���������� �����Ͽ� �����ڸ� �޴´�.
			connThread= new Thread(this);
			connThread.start(); // ==> run();����
			
		}else { // ������ ����Ǿ�����
			JOptionPane.showMessageDialog(this, "������ �̹� �������Դϴ�.");
		}//end else
			
		
	}//actionPerformed

	public static void main(String[] args) {
		new ChatServerView();
	}//main

}//main