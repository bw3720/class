package kr.co.sist.chat.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class ChatClientView extends JFrame implements ActionListener, Runnable {

	private JTextField jtfServerIp, jtfNick, jtfTalkInput;
	private JTextArea jtaChatView;
	private JButton jbtnConn, jbtnCapture;
	private JScrollPane jspChatView;
	
	private Socket someClient;//������ �����ϱ����� ����
	private DataInputStream readStream;
	private DataOutputStream writeStream;
	
	private Thread connThread;//�޽����� �б����� Thread

	private String nick;
	
	public ChatClientView() {
		super(":::::::::::ä�� Ŭ���̾�Ʈ::::::::::::::::");
		
		 jtfServerIp=new JTextField(10); 
		 jtfNick=new JTextField(10); 
		 jtfTalkInput=new JTextField(); 
		
		 jtaChatView=new JTextArea();
		
		 jbtnConn=new JButton("��������");
		 jbtnCapture=new JButton("ĸó");//������
		 		
		 JPanel jpControl=new JPanel();
		 jpControl.setBorder(new TitledBorder("��������"));
		 jpControl.add(new JLabel("�����ּ�"));
		 jpControl.add(jtfServerIp);
		 jpControl.add(new JLabel("��ȭ��"));
		 jpControl.add(jtfNick);
		 jpControl.add(jbtnConn);
		 jpControl.add(jbtnCapture);
		 
		 jspChatView=new JScrollPane(jtaChatView);

		 add("Center",jspChatView);
		 add("North",jpControl);
		 add("South",jtfTalkInput);
		 
		 jtfTalkInput.addActionListener(this);
		 jbtnConn.addActionListener(this);
		 jbtnCapture.addActionListener(this);
		 
		 addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent we) {
				try {
					closeClient();
				} catch (IOException e) {
					e.printStackTrace();
				}finally{
					dispose();
				}//end finally
			}//windowClosing
			
		});
		 
		 setBounds(100, 100, 600, 400);
		 setVisible(true);
		 
	}//ChatClientView
	
	public void closeClient() throws IOException{
		if(readStream != null) {readStream.close();}
		if(writeStream != null) {writeStream.close();}
		if(someClient != null) {someClient.close();}
	}//closeClient
	
	@Override
	public void run() {
		String revMsg = "";
		
		try {
			while(true) {
				//�޽����� �о
				revMsg = readStream.readUTF();
				//��ȭâ�� ����Ѵ�.
				jtaChatView.append(revMsg);
				jtaChatView.append("\n");
				//��ȭ�� �����Ǹ� �� scroll bar�� ���� �缳�� �Ͽ� �ֽ� ��ȭ�� ���� �� �յ��� �����Ѵ�.
				jspChatView.getVerticalScrollBar().setValue(jspChatView.getVerticalScrollBar().getMaximum());
			}//end while
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "������ ������ ���� �����ϴ�.");
			e.printStackTrace();
		}//end catch
	}//run

	/**
	 * ������ �����ϰ�, ��Ʈ���� ������ ��, ��ȭ�� �о� ���δ�.(Thread)
	 * @param ipAddress
	 * @throws IOException
	 */
	public void connectToServer(String ipAddress) throws IOException {
		someClient = new Socket(ipAddress,2021);
		readStream = new DataInputStream(someClient.getInputStream());
		writeStream = new DataOutputStream(someClient.getOutputStream());
		//�������ڸ��� �г����� ������.
		nick=jtfNick.getText();
		writeStream.writeUTF(nick);
		writeStream.flush();
		
		jtaChatView.setText("������ ���� �Ͽ����ϴ�.\n");
		jtaChatView.append(nick+"(��)�� ���� �Ͽ����ϴ�.\n");
		
		connThread = new Thread(this);
		connThread.start();
		
	}//connectToServer
	
	/**
	 * ������ �޽����� ������ ��
	 * @param msg
	 * @throws IOException 
	 */
	public void sendMsg(String msg) throws IOException {
		if(writeStream != null) {
			//��Ʈ���� �޽����� ����
			writeStream.writeUTF(msg);
			//��Ʈ���� ��е� ������ ������(����)���� ����
			writeStream.flush();
		}//end if 
	}//sendMsg
	
	/**
	 * ��ȭ���� ĸ��
	 */
	public void capture() throws IOException{
		File path = new File("c:/dev/capture");
		
		if(!path.exists()) {
			path.mkdirs();
		}//end if
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(path+"/capture_"+System.currentTimeMillis()+".dat"));
			bw.write(jtaChatView.getText());
			bw.flush();
			JOptionPane.showMessageDialog(this, "��ȭ������ ���� �Ǿ����ϴ�.");
		} finally {
			if(bw != null) {bw.close();}
		}//end finally
		
	}//capture
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		
		if(ae.getSource() == jbtnConn) {//���� ����
			String ipAddress = jtfServerIp.getText().replaceAll(" ", "");
//			String nick = jtfNick.getText();
			if(ipAddress.equals("")) {
				JOptionPane.showMessageDialog(this, "������ �ּҸ� �Է����ּ���");
			}else {
				
				if(connThread ==null) {
					try {
						connectToServer(ipAddress);
					} catch (IOException e) {
					//	JOptionPane.showMessageDialog(jbtnCapture, e);
						e.printStackTrace();
					}//end catch
				}else {
					JOptionPane.showMessageDialog(null, "�̹� ������ ������ �Դϴ�.");
				}//end else
			}//end else
		}//end if

		if(ae.getSource() == jbtnCapture) {//��ȭ����ĸ��
			try {
				capture();
			} catch (IOException e) {
				e.printStackTrace();
			}//end catch
		}//end if

		if(ae.getSource() == jtfTalkInput) {//��ȭ������ �Է�.
			//String nick = "["+jtfNick.getText()+"]";
			String talk="["+nick+"]"+jtfTalkInput.getText();
			try {
				sendMsg(talk);//��ȭ�Է���
				jtfTalkInput.setText("");//�ʱ�ȭ
			} catch (IOException e) {
				e.printStackTrace();
			}//end catch
		}//end if

		
	}//actionPerformed

	public static void main(String[] args) {
		new ChatClientView();
	}//main

}//class
