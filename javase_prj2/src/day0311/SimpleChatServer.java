package day0311;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * 일 대 일 채팅서버 : Thread 도입 후 : 메시지를 무한 루프로 읽어들이는 코드를 Thread로 처리.
 * 읽기와 쓰기가 동시에 실행된다.
 * @author user
 */
@SuppressWarnings("serial")
public class SimpleChatServer extends JFrame implements ActionListener,Runnable {
	private JTextField jtfTalk;
	private JTextArea jtaTalkDisplay;
	private JButton jbtnOpenServer;
	private JScrollPane jspTalkDisplay;
	
	private ServerSocket server;
	private Socket client;
	private DataInputStream readStream;
	private DataOutputStream writeStream;
	
	public SimpleChatServer() {
		super("::::::::::::::::::::::::채팅서버::::::::::::::::::::::::::::::::::::::::::::");
		jtfTalk=new JTextField();
		jbtnOpenServer=new JButton("서버실행");
		jtaTalkDisplay=new JTextArea();
		jtaTalkDisplay.setEditable(false);
		jtfTalk.setBackground(Color.WHITE);
		
		jspTalkDisplay=new JScrollPane( jtaTalkDisplay );
		jspTalkDisplay.setBorder(new TitledBorder("대화내용"));
		
		JPanel jpanel=new JPanel();
		jpanel.add(jbtnOpenServer);
		jtfTalk.setBorder(new TitledBorder("대화입력"));
		
		add("North",jpanel);
		add("Center", jspTalkDisplay);
		add("South", jtfTalk);
		
		jtfTalk.addActionListener(this);
		jbtnOpenServer.addActionListener(this);
		
		setBounds(100,100,400,500);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				try {
					closeServer();
				} catch (IOException e1) {
					e1.printStackTrace();
				}//end catch
			}//windowClosing
			
		});//innerclass
			
		jtfTalk.requestFocus();
	}//SimpleChatServer
	
	public void openServer() throws IOException{
		//서버 소켓을 생성
		if(server ==null) {
		server = new ServerSocket(10000);
		jtaTalkDisplay.setText("서버 가동 중\n");
		//접속자 소케을 받고
		client = server.accept();
		jtaTalkDisplay.append("접속자 있음.\n");
		//메세지를 주고 받기 위한 스트림 연결.
		readStream = new DataInputStream(client.getInputStream());//메세지를 읽을 수 있는 상태.
		writeStream = new DataOutputStream(client.getOutputStream());//메세지를 보낼 수 있는 상태.
		
		
		//클라이언트가 보내오는 메시지를 읽는다. ( run(); )
		//start() 호출.
		Thread thread = new Thread(this);//메시지를 읽는다.
		thread.start();
		}//end if
	}//openServer
	
	
	/**
	 * 메시지를 보내올 때 마다 읽기(무한루프)
	 * @throws IOException
	 */
	public void run(){
		String msg = "";
		while(true) {
			try {
				msg = readStream.readUTF();
				System.out.println("msg");
				jtaTalkDisplay.append("상대방 : "+msg+"\n");
				jspTalkDisplay.getVerticalScrollBar().setValue(jspTalkDisplay.getVerticalScrollBar().getMaximum());
			} catch (IOException e) {
				JOptionPane.showMessageDialog(this, "접속자가 연결을 종료하였습니다.");
				e.printStackTrace();
			}//end catch
		}//end while
	}//readMsg
	
	public void sendMsg() throws IOException{
		if(writeStream != null) {
			String msg = "[ 나 ]"+jtfTalk.getText();
			//대화창에 메세지를 올리고
			jtaTalkDisplay.append(msg+"\n");
			jspTalkDisplay.getVerticalScrollBar().setValue(jspTalkDisplay.getVerticalScrollBar().getMaximum());
			//접속자에게 보낸다.
			writeStream.writeUTF(msg);
		}//end if
	}//sendMsg
	
	public void closeServer() throws IOException{
		if(readStream != null) {readStream.close();}
		if(writeStream != null) {writeStream.close();}
		if(client != null) {client.close();}
		if(server != null) {server.close();}
	}//closeServer
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == jbtnOpenServer) {
			try {
				openServer();
			} catch (IOException e) {
				e.printStackTrace();
			}//end catch
		}//end if
		
		if(ae.getSource() == jtfTalk) {
			try {
				sendMsg();
				jtfTalk.setText("");
			} catch (IOException e) {
				e.printStackTrace();
			}//end catch
		}//end if
		
	}//actionPerformed

	public static void main(String[] args) {
		new SimpleChatServer();
	}//main

}//class
