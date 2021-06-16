package day0310;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * �����ڰ� �����ϸ� ������ �޼����� ������ �޼�������
 * @author SIST
 */
public class SimpleDataServer {
	
	public SimpleDataServer() throws IOException {
		//1. ServerSocket���� (PORT����)
		ServerSocket server = null;
		Socket client = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		
		try {
			server = new ServerSocket(65000);
			System.out.println("����������...");
			while(true) {
				
		//3. ������ ������ �޴´�
			client = server.accept();
			System.out.println("������ ����!");
		//4. �����ڿ��� �޼����� ������ ���� ���Ͽ��� ��½�Ʈ���� ��´�.
			String msg = "211.63.89.141 ������ �����ϼ̽��ϴ�.\n������~";
			
			dos = new DataOutputStream(client.getOutputStream());
		//5. ��Ʈ���� �����͸� ���
			dos.writeUTF(msg);
		//6. ������(����)���� ���� ==> ����� �����ʹ� ����� ��ǻ���� �������� ���޵ȴ�.(��Ʈ��ũ�� ����ؼ�)
			dos.flush();
		//8. �����ڰ� �������� �޼����� �б����� ��Ʈ���� ���Ͽ��� ���.
			dis = new DataInputStream(client.getInputStream());
		//11. �������� �޼����� �б�
			System.out.println("�������� �޼��� : "+dis.readUTF());
			}//end while (�����ڸ� ��ӹޱ�)
		
			
		}finally {
			if(dos != null) {dos.close();}//end if
			if(dis != null) {dis.close();}//end if
			if(client != null) {client.close();}//end if
			if(server != null) {server.close();}//end if
		}//end finally
		
	}//	SimpleDataServer

	public static void main(String[] args) {
		try {
			new SimpleDataServer();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
	}//main

}//class
