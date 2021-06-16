package day0201;

/**
 * java.lang.String class ���
 * @author user
 */
public class UseString {

	public static void main(String[] args) {
		//�⺻�� ������ ���. new�� ��������ʰ� ���ڿ� �����(String literal)�� �ּҸ� ��� ���.
		String str = "Abcde";
		//������ ������ ���. new�� ����Ͽ� ���ڿ� �����(String literal)�� �ּҸ� ��� ���.
		String str1 = new String("pokbw3720@gmail.com");
		
		System.out.println(str+"�� ���� "+str.length());
		System.out.println(str1+"�� ���� "+str1.length());
		
		System.out.println(str+"�� ��� �빮�ڷ� : "+str.toUpperCase());
		System.out.println(str1+"�� ��� �ҹ��ڷ� : "+str1.toLowerCase());
	
		System.out.println(str+"���� 'c'�� �ε��� : "+str.indexOf("c"));
		System.out.println(str+"���� \"def\"�� �ε��� : "+str.indexOf("def"));
		
		System.out.println(str+"���� 'z'�� �ε��� : "+str.indexOf("z"));
		System.out.println(str+"���� 'def'�� �ε��� : "+str.indexOf("def"));
		
		str = "AbcdAbcdAbcd";
		System.out.println("indexOf -> 'c' : " + str.indexOf("c"));
		System.out.println("lastIndexOf -> 'c' : " + str.lastIndexOf("c"));
		
		str="test@test.com";//testtest.com, test@testcom
		//str�� ����ִ� email �ּҰ� ��ȿ�ϴٸ� "��ȿ" �׷��� �ʴٸ� "��ȿ"�� ����ϴ� �ڵ� �ۼ�.
		System.out.println(str.indexOf("@")+" "+str.indexOf("."));
		System.out.print(str);
		if (str.indexOf("@") != -1 && str.lastIndexOf(".") != -1) {
			System.out.println("��ȿ");
		}else {
			System.out.println("��ȿ");
		}
		
		System.out.println(str.charAt(4)); //@
		System.out.println(str.charAt(9)); //.
		
		//���ڿ� ���� : substring(�����ּ�, ���ּ�+1)
		str = "AbcdefG";
		System.out.println(str.substring(1,4)); //bcd
		System.out.println(str.substring(5)); //fG
		
		System.out.println(str.substring(1));//bcdefG
		
		//str1���� �̸��� �ּҸ� ����غ�����
		System.out.println(str1.substring(0,str1.indexOf("@")));//bcdefG
		
		//str1���� ������ �ּҸ� ����غ�����
		System.out.println(str1.substring(str1.indexOf("@")+1));//bcdefG
		
		//���ڿ� ���̱� : concat("���� ���ڿ�");
		str = "ABC";
		System.out.println(str.concat("DEF"));// + �ᵵ ����.
		System.out.println(str);
		
		//���ڿ� �յڰ��� �ڸ��� : trim();
		str = "  A BC";
		System.out.println("["+str+"][" + str.trim()+"]");
		System.out.println(str);
		
		//���ڿ��� ������ �� : equals("���� ���ڿ�");
		str = "ABC";
		boolean b = str.equals("ABC");
		System.out.println(b);
		
		//���۹��ڿ��� ������ �� : startsWith("���� ���ڿ�");
		str = "Abcdef";
		String key = "Ab";
		System.out.println(str+"��"+key+"�� ���۵Ǿ��°�? : "+str.startsWith(key));
		
		//�����ڿ��� ������ �� : endsWith("���� ���ڿ�");
		key ="ef";
		System.out.println(str+"��"+key+"�� �����°�?"+str.endsWith(key));
		
		//Ư�� ���ڿ��� �����ϰ� �ִ��� �� : contains("���ҹ��ڿ�");
		key="Acdef";
		System.out.println(str+"��"+key+"�� �����ϰ� �ִ°�?"+str.contains(key));
		
		//���ڿ��� ġȯ : replace("ã�� ���ڿ�","������ ���ڿ�");, replaceAll("a","b");
		System.out.println(str+"���� cd�� KKK�� ġȯ : "+str.replaceAll("cd", "KKK"));
		
		//�⺻�� ���������� ���ڿ��� �Ҵ� : valueOf(�⺻�� ��������);
		//static method�� ��ü�� ������ �ִ� ���� ����Ͽ� ������ ó������ �ʴ´�.
		int i = 2021;
		String s = String.valueOf(i);	
		System.out.println(s);

		
		////////�Ʒ� initCap method�� �ϼ��ϰ�, name ������ initCap method�� �Ű������� �Ҵ��� ��
		//�빮�ڷ� ����� ���ڿ��� ��� ���.
		String name = "tT";
		
		UseString us = new UseString();
		System.out.println(us.initCap(name));
		
	}//main

	/**
	 * �Ű������� �ԷµǴ� ���ڿ��� ù���ڸ� �빮�ڷ� �����Ͽ� ��ȯ�ϴ� ��.
	 * @param str ù���ڸ� �빮�ڷ� �����ؾ��ϴ� ���ڿ�.
	 * @return ù���ڸ� �빮�ڷ� ����� ���ڿ�.
	 */
	public String initCap(String str) {
		//String rename = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
		if(str == null && !str.isEmpty()) {
			int startidx =1;
			
//			String firstChar = str.substring(0,startidx);
//			firstChar = firstChar.toUpperCase();
			
			//method chain
			//method�� ��ȯ�� �ִٸ� .�� ����Ͽ� method�� ��� �����Ͽ� ȣ�� �� �� �ִ�.
			//���� �������� �� method�� ��ȯ ���� �ȴ�.
			
			String firstChar = str.substring(0,startidx).toUpperCase();
			String seconChar ="";
			if(str.length()>1) { //���ڼ��� 1���� �̻��̸�
				//�ι�° ���ں��� �ҹ��ڷ� ����.
				seconChar = str.substring(startidx).toLowerCase();
			}//end if
			
			str=firstChar.concat(seconChar);
		}//end if
		
		return str; 
	}//initCap
	
}//class
