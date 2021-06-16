package kr.co.sist.javamemo.run;

import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import kr.co.sist.javamemo.JavaMemo;

/**
 * �޸����� �����ϱ� ���� Ŭ����.
 * @author SIST
 */
public class RunJavaMemo {
	
	public RunJavaMemo() throws FileNotFoundException,IOException,ClassNotFoundException{
		//�۲������� ������ ���Ͽ��� �۲��� �о�鿩 ������ ��ü(JavaMemo)�� ����
		Font font = null;
		ObjectInputStream ois = null;
		
		try {
			//���Ͽ� ��Ʈ�� ����
			ois = new ObjectInputStream(new FileInputStream("c:/dev/memo/memo.dat"));
			//���Ͽ� ��ϵ� ��ü �б�.
			font = (Font) ois.readObject();
		}finally {
			//���о����� �������
			if(ois != null) {ois.close();}//end if
			//��Ʈ������ �о���̱⸦ �����ϴ��� ������ �ݵ�� ����, ����ڿ��� ���α׷��� �����Ǿ�� �Ѵ�.
			new JavaMemo(font);
		}//end finally
		
	}//RunJavaMemo
	
	public static void main(String[] args) {
		try {
			new RunJavaMemo();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
	}//main

}//class
