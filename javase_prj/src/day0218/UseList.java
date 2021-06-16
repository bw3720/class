package day0218;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


/**
 * java.util.List�� ���.<br>
 * -������ �迭ó�� ����. ����������(�����͸� �߰��ϸ� ���̰� �þ��, �����͸� �����ϸ� ���̰� �پ���.)<br>
 * -��� ���������� ����ɼ� ������, generic�� ����ϸ� �Էµ������� ������ ������ �� �ִ�.<br>
 * -�˻��� ����� ������, �ߺ������͸� ������ �� �ִ�<br>
 * -�߰��� �����ʹ� ���� �ڿ� �ٴ´�. <br>
 * -������ ������ ���̿� �����͸� �߰��� ������ LinkedList�� ����ϴ°��� ����.<br>
 * @author user
 */
public class UseList {

	/**
	 * Multi Thread���� �������� ����
	 */
	public void useArrayList() {
		//1.����
		List<String> list = new ArrayList<String>();
		//2.ũ�� : size(); �濡 ���� �ִ� �͸� ũ�⿡ ���Խ�Ų��.
		System.out.println("���� ���� : "+list.size());
		//3.�� �Ҵ� : ���� �ڷ� �߰��ȴ�. �ߺ����� ������ �� �ִ�.
		list.add("�ڹ�");
		list.add("����Ŭ");
		list.add("JDBC");
		list.add("HTML");
		list.add("����Ŭ"); // �ߺ��� ���� ����.
		list.add("CSS");
		list.add("JavaScript");
		System.out.println(list+"/"+list.size());//��ü�� ����ϸ� �ּҰ� ���;��ϴµ� ���� ���� ������ 
												 //�ڽ�Ŭ�������� ObjectŬ������ toString()��  
												 //�ּҰ� �ƴ� ���� ����� �� �ֵ��� Override �߱� ������
		//4.�迭�� ����
		 //Generic�� ������ ��������,����Ʈ�� ũ���� �迭�� �����Ѵ�.
		String[] subjectArr = new String[list.size()];
		 //����Ʈ�� ���� �迭�� ������.
		list.toArray(subjectArr);
		
		//5.�� ���� : ���� ũ�Ⱑ �پ���.(��������� ȿ�������� ��밡��)
		//index�� �����ϴ� ���
		list.remove(3);
		
		//���� ���� ���� ��ü�� �־� ���� : ���� ���� ��ġ�ϴ� ���� �� �ϳ��� ����. �� -> ��
		list.remove("����Ŭ");
		
		System.out.println(list+"/"+list.size());
		
		//6.�ϰ�ó�� : list�� �ε����� ����� �� �ְ�, �˻��� ����� �����Ƿ� �ϰ� ó���� �� �� �ִ�.
//		String temp="";
//		for(int i =0; i<list.size();i++) {
//			temp=list.get(i);//����Ʈ�� i��° ���� ���� �����ͼ� temp�� �Ҵ�.
//			System.out.println(temp);
//		}//end for
		
		//������ for
		for(String temp:list) {
			System.out.println(temp);
		}//end for
	
		System.out.println("------------------����� �� ���-----------------");
		for(String temp : subjectArr) {
			System.out.printf("%s\t",temp);
		}//end for
		System.out.println("\n");

	}//useArrayList
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * Multi Thread���� �������� �Ұ���
	 */
	public void useVector() {
		//1.����
		List<String> list = new Vector<String>();
		//2.ũ�� : size(); �濡 ���� �ִ� �͸� ũ�⿡ ���Խ�Ų��.
		System.out.println("���� ���� : "+list.size());
		//3.�� �Ҵ� : ���� �ڷ� �߰��ȴ�. �ߺ����� ������ �� �ִ�.
		list.add("�ڹ�");
		list.add("����Ŭ");
		list.add("JDBC");
		list.add("HTML");
		list.add("����Ŭ"); // �ߺ��� ���� ����.
		list.add("CSS");
		list.add("JavaScript");
		System.out.println(list+"/"+list.size());//��ü�� ����ϸ� �ּҰ� ���;��ϴµ� ���� ���� ������ 
												 //�ڽ�Ŭ�������� ObjectŬ������ toString()��  
												 //�ּҰ� �ƴ� ���� ����� �� �ֵ��� Override �߱� ������
		//4.�迭�� ����
		 //Generic�� ������ ��������,����Ʈ�� ũ���� �迭�� �����Ѵ�.
		String[] subjectArr = new String[list.size()];
		 //����Ʈ�� ���� �迭�� ������.
		list.toArray(subjectArr);
		
		//5.�� ���� : ���� ũ�Ⱑ �پ���.(��������� ȿ�������� ��밡��)
		//index�� �����ϴ� ���
		list.remove(3);
		
		//���� ���� ���� ��ü�� �־� ���� : ���� ���� ��ġ�ϴ� ���� �� �ϳ��� ����. �� -> ��
		list.remove("����Ŭ");
		
		System.out.println(list+"/"+list.size());
		
		//6.�ϰ�ó�� : list�� �ε����� ����� �� �ְ�, �˻��� ����� �����Ƿ� �ϰ� ó���� �� �� �ִ�.
	//	String temp="";
	//	for(int i =0; i<list.size();i++) {
	//		temp=list.get(i);//����Ʈ�� i��° ���� ���� �����ͼ� temp�� �Ҵ�.
	//		System.out.println(temp);
	//	}//end for
		
		//������ for
		for(String temp:list) {
			System.out.println(temp);
		}//end for
		
		System.out.println("------------------����� �� ���-----------------");
		for(String temp : subjectArr) {
			System.out.printf("%s\t",temp);
		}//end for
		System.out.println("\n");

	}//useVector
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * ���� �߰��� ��. ������ ������ ���̿� ���� �߰��Ǵ� ���� ���� ��.
	 */
	public void useLinkedList() {
		//1.����
		List<String> list = new LinkedList<String>();
		//2.ũ�� : size(); �濡 ���� �ִ� �͸� ũ�⿡ ���Խ�Ų��.
		System.out.println("���� ���� : "+list.size());
		//3.�� �Ҵ� : ���� �ڷ� �߰��ɼ��� �ְ�, ���� �߰��� ���� ������ �ִ�. �ߺ����� ������ �� �ִ�.
		list.add("�ڹ�");//0
		list.add("����Ŭ");//1->2
		list.add("JDBC");//2->3
		list.add(1,"HTML");//3->1
		list.add("����Ŭ"); //4 �ߺ��� ���� ����.
		list.add(4,"CSS");//5
		list.add("JavaScript");//6
		System.out.println(list+"/"+list.size());//��ü�� ����ϸ� �ּҰ� ���;��ϴµ� ���� ���� ������ 
												 //�ڽ�Ŭ�������� ObjectŬ������ toString()��  
												 //�ּҰ� �ƴ� ���� ����� �� �ֵ��� Override �߱� ������
		//4.�迭�� ����
		 //Generic�� ������ ��������,����Ʈ�� ũ���� �迭�� �����Ѵ�.
		String[] subjectArr = new String[list.size()];
		 //����Ʈ�� ���� �迭�� ������.
		list.toArray(subjectArr);
		
		//5.�� ���� : ���� ũ�Ⱑ �پ���.(��������� ȿ�������� ��밡��)
		//index�� �����ϴ� ���
		list.remove(3);
		
		//���� ���� ���� ��ü�� �־� ���� : ���� ���� ��ġ�ϴ� ���� �� �ϳ��� ����. �� -> ��
		list.remove("����Ŭ");
		
		System.out.println(list+"/"+list.size());
		
		//6.�ϰ�ó�� : list�� �ε����� ����� �� �ְ�, �˻��� ����� �����Ƿ� �ϰ� ó���� �� �� �ִ�.
	//	String temp="";
	//	for(int i =0; i<list.size();i++) {
	//		temp=list.get(i);//����Ʈ�� i��° ���� ���� �����ͼ� temp�� �Ҵ�.
	//		System.out.println(temp);
	//	}//end for
		
		//������ for
		for(String temp:list) {
			System.out.println(temp);
		}//end for
		
		System.out.println("------------------����� �� ���-----------------");
		for(String temp : subjectArr) {
			System.out.printf("%s\t",temp);
		}//end for
		System.out.println("\n");
		
	}//useLinkedList
	
	public static void main(String[] args) {
		UseList ul = new UseList();
		
		System.out.println("================Array List===============");
		ul.useArrayList();
		
		System.out.println("================Vector===============");
		ul.useVector();
		
		System.out.println("================Linked List===============");
		ul.useLinkedList();
	}//main

}//class
