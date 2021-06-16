package day0310;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

/**
 * 서버에 접속하여 서버에서 보내오는 메세지를 읽기위한 클라이언트.
 * @author SIST
 */
public class SimpleDataClient {
	
	public SimpleDataClient() throws IOException {
		//2. 소켓을 생성하여 서버에 접속한다.
		Socket client = null;
		DataInputStream dis= null;
		DataOutputStream dos = null;
		
		try {//"211.63.89.142" <= 고정된 ip( public ip ) 외부에서 컴퓨터를 식별할 수 있다.
			//사설 ip( private ip ) 유동ip - 외부에서 컴퓨터를 식별할 수 없다.
			//127.0.0.1(localhost) => LoopBack
			////내컴퓨터로 테스트하는 3가지 방법
//			client = new Socket("127.0.0.1",65000);
//			client = new Socket("localhost",65000);
			String ip = JOptionPane.showInputDialog("접속할 서버의 주소 입력 \n130,132,133,134,135,136,153,151,137,"
															+"138,139,140,141,142,143,152,146,147,148,149,150");
			client = new Socket("211.63.89."+ip,65000);
			
			//4. 서버에서 보내오는 데이터를 읽기위해서 읽기 스트림을 연결.
			dis = new DataInputStream(client.getInputStream());
			//7. 서버에서 보내는 메세지 읽기.
			String revMsg = dis.readUTF();
			
			String sendMsg = JOptionPane.showInputDialog("응답받은 메세지 \n"+ revMsg);
			//8. 서버로 메세지를 보내기위해 쓰기 스트림 연결.
			dos = new DataOutputStream(client.getOutputStream());
			//9. 스트림에 메세지 기록.
			dos.writeUTF(sendMsg);
			//10. 스트림의 내용을 목적지로 분출
			dos.flush();
		} finally {
			if(dos != null) {dos.close();}//end if, 반드시 끊어줘야한다.
			if(dis != null) {dis.close();}//end if, 반드시 끊어줘야한다.
			if(client != null) {client.close();}//end if, 반드시 끊어줘야한다.
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
