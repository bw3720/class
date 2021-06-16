package day0304;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 16bit ��Ʈ���� ����Ͽ� ���ڿ� ���� �б�.*(�������� ������ ���� �ܼ� ���ڿ��� �о�鿩 Ȯ�� �� �ִ�.)
 * @author SIST
 */
public class UseFileReader {
	public UseFileReader() throws FileNotFoundException,IOException{
		File file = new File("c:/dev/temp/java_read.txt");//UTF-8
		//���ϰ� �����ϴ� ����� ���� ��Ʈ��
		//FileReader fr = new FileReader(file);
		//�ٴ����� �о���̴� ����� ���� ��Ʈ��
		//BufferedReader br = new BufferedReader(fr);
		
		//BufferedReader br = new BufferedReader(new FileReader(file)); // charset�� �����ʾ� �ѱ��� ������.
		
		BufferedReader br=null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
		
			String lineData = "";
		
			while((lineData = br.readLine()) != null) {//readLine() �ٴ����� �о� ���̴µ� \n������ �о���δ�.
				System.out.println(lineData);
			}//end while
		}finally{
			
			if(br != null){
				br.close();//�߿���! �ݵ�� ���������Ѵ�...!
			}//end if
			
		}//end catch finally
		
	}//UseFileReader

public static void main(String[] args) {
	try {
		new UseFileReader();
	} catch (FileNotFoundException fnfe) {
		System.err.println("������ ���������ʽ��ϴ�.");
		fnfe.printStackTrace();
	} catch (IOException ie) {
		System.err.println("�����б� �۾� �� ������ �߻��߽��ϴ�.");
		ie.printStackTrace();
	}
	}//main

}//class
