package day0310;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

/**
 * ������ �����Ͽ� �������� �������� �޼����� �б����� Ŭ���̾�Ʈ.
 * @author SIST
 */
public class SimpleDataClient {
	
	public SimpleDataClient() throws IOException {
		//2. ������ �����Ͽ� ������ �����Ѵ�.
		Socket client = null;
		DataInputStream dis= null;
		DataOutputStream dos = null;
		
		try {//"211.63.89.142" <= ������ ip( public ip ) �ܺο��� ��ǻ�͸� �ĺ��� �� �ִ�.
			//�缳 ip( private ip ) ����ip - �ܺο��� ��ǻ�͸� �ĺ��� �� ����.
			//127.0.0.1(localhost) => LoopBack
			////����ǻ�ͷ� �׽�Ʈ�ϴ� 3���� ���
//			client = new Socket("127.0.0.1",65000);
//			client = new Socket("localhost",65000);
			String ip = JOptionPane.showInputDialog("������ ������ �ּ� �Է� \n130,132,133,134,135,136,153,151,137,"
															+"138,139,140,141,142,143,152,146,147,148,149,150");
			client = new Socket("211.63.89."+ip,65000);
			
			//4. �������� �������� �����͸� �б����ؼ� �б� ��Ʈ���� ����.
			dis = new DataInputStream(client.getInputStream());
			//7. �������� ������ �޼��� �б�.
			String revMsg = dis.readUTF();
			
			String sendMsg = JOptionPane.showInputDialog("������� �޼��� \n"+ revMsg);
			//8. ������ �޼����� ���������� ���� ��Ʈ�� ����.
			dos = new DataOutputStream(client.getOutputStream());
			//9. ��Ʈ���� �޼��� ���.
			dos.writeUTF(sendMsg);
			//10. ��Ʈ���� ������ �������� ����
			dos.flush();
		} finally {
			if(dos != null) {dos.close();}//end if, �ݵ�� ��������Ѵ�.
			if(dis != null) {dis.close();}//end if, �ݵ�� ��������Ѵ�.
			if(client != null) {client.close();}//end if, �ݵ�� ��������Ѵ�.
		}//end finally
		
	}//SimpleDataClient
	
	public static void main(String[] args) {
		try {
			new SimpleDataClient();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
	}//main

}//class
