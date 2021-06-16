package day0222;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Homework0222 {
	Map<String, String> bloodMap = new Hashtable<String, String>();
	
	public Map<String, String> bloodType() {
		
		bloodMap.put("A", "�������Դϴ�. �׵��� ��� ���������� �������� ���� ������ ����� ���ɽ����� ������ ���� �ֽ��ϴ�. ��ü�� ������ ������Դϴ�.");
		//bloodMap.put("a��", "�������Դϴ�. �׵��� ��� ���������� �������� ���� ������ ����� ���ɽ����� ������ ���� �ֽ��ϴ�. ��ü�� ������ ������Դϴ�.");
		bloodMap.put("AB", "�ո����Դϴ�. �׷��� ��ȸ�� �Ǹ��� ���� �׸��� ��Ÿ ���� � ���� ������ ���� �ո����� �ݵ����� ��ȣ�ϰ� �˴ϴ�. ");
		//bloodMap.put("ab��", "�ո����Դϴ�. �׷��� ��ȸ�� �Ǹ��� ���� �׸��� ��Ÿ ���� � ���� ������ ���� �ո����� �ݵ����� ��ȣ�ϰ� �˴ϴ�. ");
		bloodMap.put("B", ": ��ü������ �ڱ��߽����Դϴ�. �����̳� ��Ģ, �ӹ��� ���� �Ⱦ���. ������ �����ϰ� ����� �߻� �پ�ϴ�");
		//bloodMap.put("b��", ": ��ü������ �ڱ��߽����Դϴ�. �����̳� ��Ģ, �ӹ��� ���� �Ⱦ���. ������ �����ϰ� ����� �߻� �پ�ϴ�");
		bloodMap.put("O", ":  ������ �ΰ��� �ڽ��� ��ǥ�� �ϰ��ִ� �Ͽ� ���Ͽ� �Ѱᰰ�� ��°� ���������� �������� ��ǥ��  �޼��ϴ� �������� �ִ�.");
		//bloodMap.put("o��", ":  ������ �ΰ��� �ڽ��� ��ǥ�� �ϰ��ִ� �Ͽ� ���Ͽ� �Ѱᰰ�� ��°� ���������� �������� ��ǥ��  �޼��ϴ� �������� �ִ�.");
		
		return bloodMap;
	}//bloodType
	
	public void printBloodType(String a) {
		Set<String> set = bloodMap.keySet();
		Iterator<String> ita = set.iterator();
		
		while(ita.hasNext()) {
			System.out.println(bloodMap.get(ita.next()));	
		}
		
		//System.out.println(ita.next());
		//for(ita.hasNext()) {
		//	String a =ita.next();
		//	System.out.println(bloodMap.get(a));
		//}
		
		
	}//printBloodType
	
	public static void main(String[] args) {
		Homework0222 hw0222 = new Homework0222();
		hw0222.printBloodType("A");
	}//main

}//class
