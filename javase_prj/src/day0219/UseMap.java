package day0219;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Ű�� ���� ������ �̷���� �����͸� ����� ��.<br>
 * Hashtable, HashMap ����Ŭ����<br>
 * 
 * @author user
 */
public class UseMap {
	public void useHashtable() {
		//1.����
		Map<String, String> map = new Hashtable<String, String>();//11���� �� ����
		
		//2.�� �Ҵ�) ���� ������� �Էµ��� �ʴ´�.
		 //Ű�� �����ϸ� ���� �ߺ��ɼ� �ִ�.
		 //���� ���� Ű�� �ԷµǸ� ������ Ű�� ���� ���������.
		map.put("�ڹ�", "�Ϻ��� OOP���");
		map.put("����Ŭ", "��뷮 ������ ���̽�");
		map.put("JDBC", "�ڹٿ��� DBMS�� �����ϱ� ���� ���.");
		map.put("HTML", "������ ������ ���.");
		map.put("���̽�", "�Ϻ��� OOP���");//���� �ߺ� ����.
		map.put("HTML", "Tim Berners LEE�� ���� ���");//���� Ű�� �ԷµǸ� ������ Ű�� ���� ����.
		
		System.out.println(map+"/"+map.size());
		
		//3.�� ��� : Ű�� ����Ͽ� Ű�� �ش��ϴ� ���� ��´�. Ű�� �������� ������ null
		String value = map.get("JDBC");
		System.out.println(value);
		
		//4.Ű�� �����ϴ���?
		boolean flag = map.containsKey("�ڹ�");
		System.out.println(flag);
		
		//5.�� ����
		//Ű�� ����Ͽ� �� ����
		map.remove("�ڹ�"); // 
		//��� entry�� ����.
		//map.clear();
		System.out.println(map+"/"+map.size());

		//6.��� Ű �ޱ�.
		Set<String> set = map.keySet();
		Iterator<String> ita = set.iterator();
		while(ita.hasNext()) {
			System.out.println(map.get(ita.next()));
		}//end while
		
		////�ƴϸ� ������ for
		for(String temp : set) {//������ set���� Ű�� �尡 ����
			System.out.println(temp);
		}//end for
		
		
		
		
	}//useHashtable
	
	public void useHashMap() {
		//1.����
		Map<String, String> map = new HashMap<String, String>();//16���� �� ����
				
		//2.�� �Ҵ�) ���� ������� �Էµ��� �ʴ´�.
		 //Ű�� �����ϸ� ���� �ߺ��ɼ� �ִ�.
		 //���� ���� Ű�� �ԷµǸ� ������ Ű�� ���� ���������.
		map.put("�ڹ�", "�Ϻ��� OOP���");
		map.put("����Ŭ", "��뷮 ������ ���̽�");
		map.put("JDBC", "�ڹٿ��� DBMS�� �����ϱ� ���� ���.");
		map.put("HTML", "������ ������ ���.");
		map.put("���̽�", "�Ϻ��� OOP���");//���� �ߺ� ����.
		map.put("HTML", "Tim Berners LEE�� ���� ���");//���� Ű�� �ԷµǸ� ������ Ű�� ���� ����.
		
		System.out.println(map+"/"+map.size());
		
		//3.�� ��� : Ű�� ����Ͽ� Ű�� �ش��ϴ� ���� ��´�. Ű�� �������� ������ null
		String value = map.get("JDBC");
		System.out.println(value);
		
		//4.Ű�� �����ϴ���?
		boolean flag = map.containsKey("�ڹ�");
		System.out.println(flag);
		
		//5.�� ����
		//Ű�� ����Ͽ� �� ����
		map.remove("�ڹ�"); // 
		//��� entry�� ����.
		//map.clear();
		System.out.println(map+"/"+map.size());

		//6.��� Ű �ޱ�.
		Set<String> set = map.keySet();
		Iterator<String> ita = set.iterator();
		while(ita.hasNext()) {
			System.out.println(map.get(ita.next()));
		}//end while
		
		////�ƴϸ� ������ for
		for(String temp : set) {//������ set���� Ű�� �尡 ����
			System.out.println(temp);
		}//end for
				
				
				
			
	}//useHashMap

	
	public static void main(String[] args) {
		UseMap um = new UseMap();
		um.useHashtable();
		System.out.println("----------------------");
		um.useHashMap();
		
	}//main

}//class
