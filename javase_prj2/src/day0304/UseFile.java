package day0304;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * HDD�� �����ϴ� ������ ������ ������� ������� Ŭ������ ���.
 * @author SIST
 *
 */
public class UseFile {
	
	public UseFile() {
		//1. ��ü����.
		File file = new File("c:/dev/temp/java_read.txt");
		System.out.println(file);//��ü�� ������� �� �ּҰ� ������ �ʴ� ������?  java.lang.object Ŭ������ toStirng()�� Override�߱� ����
		System.out.println("���� ����? : "+file.exists());
		
		try {
			System.out.println("�Թ� ��� : "+file.getCanonicalPath());//OS���� ���Ͽ� �����ϱ����� ������ ��η� : ����̺�� �빮�ڸ�.
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
		
		System.out.println("���� ��� : "+file.getAbsolutePath());//����̺� ����� ����ϴ� ��� : ����̺�� ��ҹ��� �Ѵ� ����ȴ�.
		System.out.println("��� ��� : "+file.getPath());//�����ο� �Ȱ�.
		
		//��ο� ���� ������ �ɰ���
		System.out.println("������ �ִ� ������ : "+file.getParent());
		System.out.println("���ϸ� : "+file.getName());
		
		System.out.println("�����ΰ�? : " +file.isFile());
		System.out.println("�����ΰ�? : " +file.isDirectory());
		
		System.out.println("���� ����? : " +file.canExecute());
		System.out.println("�б� ����? : " +file.canRead());
		System.out.println("���� ����? : " +file.canWrite());//���� �Ұ����� ����. ODD
		
		System.out.println("��������? : " +file.isHidden());
		
		//System.out.println("���� ���� : " +file.delete());
		long lm = file.lastModified();
		System.out.println("���������� ������ ��¥ : "+ file.lastModified());
		Date date = new Date(lm);
		System.out.println(date);//���������� ������ ��¥�� �� �� �ִ�. => ���ϴ� ���ĺ�ȯ : SimpleDateFormat
		
		File mk = new File("c:/test/temp");
		//System.out.println(mk.mkdir()); //mkdir(); = ������ �ϳ��̸� ������ ��������, �ֻ��� �������� �����ϴµ� ���������� �����ϸ� �������� �ʴ´�.
		System.out.println(mk.mkdirs()); //mkdirs(); = ������ �ϳ��̸� ������ ��������, ���� ������ �����ϴ��� ���� ����.
		
		
		
		
		
		
	}//UseFile

	public static void main(String[] args) {
		new UseFile();
	}//main

}//class
