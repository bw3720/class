package day0223;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class work0222 {
	
	private Map<String, String> bloodMap;
	
	public String bloodType(String blood) {
		String result="�Է��Ͻ� �������� ����� ���� �ƴմϴ�.";
		//Map ���� : is a ���� ��üȭ
		bloodMap = new HashMap<String, String>();//16���� �� ����
		
		//�� �Ҵ�
		bloodMap.put("A", "�������Դϴ�. �׵��� ��� ���������� �������� ���� ������ ����� ���ɽ����� ������ ���� �ֽ��ϴ�. ��ü�� ������ ������Դϴ�.");
		bloodMap.put("B", ": ��ü������ �ڱ��߽����Դϴ�. �����̳� ��Ģ, �ӹ��� ���� �Ⱦ���. ������ �����ϰ� ����� �߻� �پ�ϴ�");
		bloodMap.put("AB", "�ո����Դϴ�. �׷��� ��ȸ�� �Ǹ��� ���� �׸��� ��Ÿ ���� � ���� ������ ���� �ո����� �ݵ����� ��ȣ�ϰ� �˴ϴ�. ");
		bloodMap.put("O", ":  ������ �ΰ��� �ڽ��� ��ǥ�� �ϰ��ִ� �Ͽ� ���Ͽ� �Ѱᰰ�� ��°� ���������� �������� ��ǥ��  �޼��ϴ� �������� �ִ�.");
		
		//�� ���
		blood = blood.toUpperCase();// a ->A , A->A

		//Ű�� �����Ѵٸ� ���� ���
		if(bloodMap.containsKey(blood)) {//Ű�� �����Ѵٸ� 
			result = bloodMap.get(blood);//Ű�� ���� ���� ��´�.
		}//end if
		
		return result;
	}//bloodType
	
	public void searchBlood(String inputBlood) {
		//String inputBlood="A";
		System.out.println(inputBlood + "���� "+bloodType(inputBlood));
	}//searchBlood
	
	public void validationMap() {
		//Map�� ��� Ű�� Set���ιޱ�
		if(bloodMap != null) { // ��ü�� �����Ǿ�����? (heap�� �ּҸ� �Ҵ� �޾Ҵ°�?)
			Set<String> set = bloodMap.keySet();
			//Set�� ��� (Iterator ���)
			Iterator<String> ita = set.iterator();//set�� ������� iterator�� �Ҵ�.
			
			String key="";
			while(ita.hasNext()) {//���� ����?
				key = ita.next();
				System.out.println(key+"/"+bloodMap.get(key));
			}//end while
			
		}else{
			System.out.println("Map�� �����ҷ��� Map�� ��ü�� �����Ǿ� �־�� �մϴ�.");
			System.out.println("searchBlood()�� ȣ�� �� ��밡�� �մϴ�.");
			
		}//end else
		
	}//validationMap
	
	public char changeChar(char ch) {
		char temp = ch;
		if(ch >64 && ch<91) {//�빮�� -> �ҹ���
			temp+=32;
		}//end if
		
		if(ch >96 && ch<123) {//�ҹ��� -> �빮��
			temp-=32;
		}//end if
		
		return temp;
	}//changeChar
	
	public static void main(String[] args) {
		work0222 work = new work0222();
		work.searchBlood("a");
		work.validationMap();
		System.out.println(work.changeChar('a'));
			
			
	}//main

}//class
