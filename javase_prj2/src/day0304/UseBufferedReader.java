package day0304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Ű���忡�� �Էµ� �����͸� JVM���η� �о���̱�.
 * ���� : �ѱ��� ������
 * �ذ� : 8bit�� 16bit ��Ʈ���� �����Ѵ�.
 * @author SIST
 */
public class UseBufferedReader {
	
	public UseBufferedReader() throws IOException{
//		//Ű���忡�� ���� �� �ִ� ��Ʈ�� ���
//		InputStream is = System.in;
//		//8bit ��Ʈ���� 16bit ��Ʈ���� ����
//		InputStreamReader isr = new InputStreamReader(is);
//		//�ٴ����� �б����� ������ ��Ʈ���� ����
//		BufferedReader br = new BufferedReader(isr);
//
/////////////  ���� �ڵ带 ���ٷ� ������.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�ƹ�Ű�� ������ ����.");
		String text = br.readLine();
		
		System.out.println("�Է� �� : "+text);
		
		br.close();
		
		
		
		
	}//UseBufferedReader

	public static void main(String[] args) {
		
		try {
			new UseBufferedReader();
		} catch (IOException IOe) {
			IOe.printStackTrace();
		}//end catch
		
	}//main

}//class
