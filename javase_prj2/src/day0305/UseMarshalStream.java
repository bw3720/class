package day0305;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Object Stream�� ����Ͽ� ��ü�� JVM�ܺη� �������ų�(ObjectOutputStream - marshaling), 
 * JVM�ܺο� �����ϴ� ��ü�� JVM���η� �о� ���̱� ���� ��(ObjectInputStream - unmarshal)
 * @author SIST
 */
public class UseMarshalStream {

	/**
	 * ��ü�� �����Ͽ� ��Ʈ������ ��������.
	 */
	public void useObjectOutputStream() throws FileNotFoundException,NotSerializableException, IOException{
		MyData md = new MyData("�ѻ��", 180.1, 83.4);
		
		ObjectOutputStream oos = null;
		try {
			
			//1.��Ʈ�� ����
			oos = new ObjectOutputStream(
			new FileOutputStream("c:/dev/temp1/obj.dat"));
			//2. ��ü�� ��Ʈ���� ����.
			oos.writeObject(md);
			//3. ��Ʈ���� ��ϵ� ������ �������� ����.
			oos.flush();
			System.out.println("��ü�� JVM�ܺη� ������.");
		
		}finally {
			
			//4.�������
			if(oos != null) {oos.close();}
			
		}//end finally
	}//useObjectOutputStream
	
	/**
	 * ��Ʈ���� ����Ͽ� ��ü�� �о� ���̱�.
	 */
	public void useObjectInputStream() throws FileNotFoundException,IOException,ClassNotFoundException{
		ObjectInputStream ois = null;
		try {
			//1. ��ü�� �Ͼ���� �� �ִ� ��Ʈ�� ����
			ois = new ObjectInputStream(new FileInputStream("c:/dev/temp1/obj.dat"));
			//2. ��ü �б�
			MyData md = (MyData)ois.readObject();
			//3. �� ���
			System.out.println("�̸� : "+md.getName());
			System.out.println("Ű : "+md.getHeight());
			System.out.println("������ : "+md.getWeight());
			
			
		}finally {
			if(ois != null) {ois.close();}
		}//end finally
		
	}//useObjectInputStream
	
	public static void main(String[] args) {
		UseMarshalStream ums = new UseMarshalStream();

		try {
			ums.useObjectInputStream();
		} catch (FileNotFoundException e) {
			System.err.println("���Ȯ��");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("�о���ΰ��� ��ü�� �̴� �κ�");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("�д� ���� �����߻�");
			e.printStackTrace();
		}//end catch
		
		
/*			try {
				ums.useObjectOutputStream();
			} catch (NotSerializableException e) {
				System.err.println("����ȭ �ȵ�");
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				System.err.println("��� �߸�");
				e.printStackTrace();
			} catch (IOException e) {
				System.err.println("���µ��� �����߻�");
				e.printStackTrace();
			}//end catch
*/		
		
		
	}//main

}//class