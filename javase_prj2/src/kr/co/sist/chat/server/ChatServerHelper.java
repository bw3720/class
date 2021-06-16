package kr.co.sist.chat.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.List;

import javax.swing.DefaultListModel;


/**
 * ������ ������ �����ϰ�, ��Ʈ���� �����Ͽ�, �����ڰ� �������� �޽����� �а�, 
 * ��� �����ڿ��� ������ ��.
 * @author SIST
 */
public class ChatServerHelper extends Thread {
	
	private Socket someClient;
	private DataInputStream readStream;
	private DataOutputStream writeStream;
	
	private DefaultListModel<String> dlmClientStatus;
	private int connCnt;
	
	private String nick;//�����ڰ� ����ϴ� �г���.
	
	/** 
	 * ������ ������ ������ �޾�, ��Ʈ���� �����ϴ� ��.
	 * @param someClient ������ ����
	 * @param dlmClientStatus �������� ���¸� ����â�� ������ ���� Model��ü
	 * @param conncnt ������ ��°
	 * @throws IOException 
	 */
	public ChatServerHelper(Socket someClient, DefaultListModel<String> dlmClientStatus, int connCnt) throws IOException {
		this.someClient = someClient;
		this.dlmClientStatus = dlmClientStatus;
		this.connCnt = connCnt;
		
		//������ IP���.(���ι�����)
		InetAddress ia = someClient.getInetAddress();
		
		
		//���Ͽ��� ��Ʈ���� ����.
		readStream = new DataInputStream(someClient.getInputStream()); 
		writeStream = new DataOutputStream(someClient.getOutputStream());
		
		//������ڸ��� Ŭ���̾�Ʈ�� �г����� �������� �г����� �޽��ϴ�.
		nick = readStream.readUTF();
		
		
		StringBuilder sbConnMsg = new StringBuilder();
		sbConnMsg.append("[").append(connCnt).append("] ��° �����ڷ� ").append(nick).append("���� �����ϼ̽��ϴ�.");
		
		//���� ���� â�� ���������� �߰�
		dlmClientStatus.addElement(sbConnMsg.toString()+"/"+ia.getHostAddress());
		//��� �����ڿ��� �����ڰ� �ִٴ� ���¸� �����ش�.
		broadcast(sbConnMsg.toString());
	}//ChatServerHelper
	
	/**
	 * �޽����б⸦ ���� ����.
	 */
	@Override
	public void run() {
		String revMsg="";
		
		try {
			while(true) {
				//�����ڰ� �������� �޽����� �ް�
				revMsg=readStream.readUTF();
				//���� �޽����� ��� �����ڿ��� ���.
				broadcast(revMsg);
			}//end while
		} catch (IOException e) {
			//�޼����� �аų� ������ ���ϴ� ���� -> �������� ��Ʈ���� ������ ����
			try {
				closeClient();//���� ����
			} catch (IOException e1) {
				e1.printStackTrace();
			}//end catch
			
			//����â�� �������� ���¸� ���
			StringBuilder sbMsg = new StringBuilder();
			sbMsg.append("[").append(nick).append("]���� ������ ����Ǿ����ϴ�.");
			dlmClientStatus.addElement(sbMsg.toString());
			//���� ������ ��� �����ڿ��� ������ ���¸� ���.
			ChatServerView.connList.remove(this);//�ε����� �ٲ���־� this�� ����
			try {
				broadcast(sbMsg.toString());
			} catch (IOException e1) {
				e1.printStackTrace();
			}//end catch
			e.printStackTrace();
		}//end catch
		
	}//end run
	
	public void closeClient() throws IOException{
		if(readStream!= null) {readStream.close();}//end if
		if(writeStream!= null) {writeStream.close();}//end if
		if(someClient!= null) {someClient.close();}//end if
	}//closeClient
	
	/**
	 * �����ڰ� ������ �޽����� �о�, ��� �����ڿ��� ������ ��
	 * synchronized : ��Ƽ�����忡�� �������� ���� ��(����ȭ)
	 * @param msg
	 * @throws IOException 
	 */
	public synchronized void broadcast(String msg) throws IOException {
		//����Ʈ(ArrayList => Handler)�� �޾ƿԴ�. ���� Handler ��ü�� �ϳ��� ����Ʈ�� ���ÿ� ����ϰ� �ִ�.
		List<ChatServerHelper> connlist = ChatServerView.connList;
		
		////////////////////////////////////////////////////////////////////////////		
		//		ChatServerHelper csh =null;										  //
		//		for(int i =0; i < connlist.size(); i++) {						  //
		//			csh = connlist.get(i);//�����ڿ��� �޼����� ������ ���� �����ڸ� �޴´�.//
		//			csh.writeStream.writeUTF(msg);//�������� ��Ʈ���� ��ȭ�� ���.		  //
		//			csh.writeStream.flush();//������ ��Ʈ���� ��ϵ� ������ ����.		  //
		//		}//end for														  //
		////////////////////////////////////////////////////////////////////////////		
				
		//�ε����� ��������ʰ�, ��� ��Ʈ���� ����Ѵ�.
		for(ChatServerHelper csh : connlist) {
			csh.writeStream.writeUTF(msg);
			csh.writeStream.flush();;
			
		}//end for
			
	}//end broadcast
	
}//class
