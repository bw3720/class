package day0216;

/**
 * ���ڿ��� �ٷ� �� ����ϴ� Ŭ����.<br>
 * StirngBuffer, StringBulider�� ���.<br>
 * @author user
 */
public class UseStringBuilder {
	
	public void useStringBuffer() {
		//1. ����
		StringBuffer sb = new StringBuffer();
		
		//2. ���
		//�� �߰�. append(��);
		sb.append("�ȳ�."); //���ڿ� �߰�
		sb.append(2021); //���� �߰�
		sb.append("��"); //���ڿ� �߰�
		sb.append('A');//���� �߰�
		sb.append(2.16);//�Ǽ� �߰�
		sb.append(true);//�Ҹ� �߰�
		
		//�� ����. insert(�߰��� ��ġ �ε���, ��);
		//�ȳ�.2021��A2.16true
		sb.insert(10, "��");
		sb.insert(14,"��");
		
		//�� ����. delete(���� �ε���, �� �ε���+1);
		//�ȳ�.2021��A2��.16��true
		sb.delete(3, 8);
		//���ڿ� ������.
		sb.reverse();
		sb.reverse();
		
		
		
		
		System.out.println(sb);
		
		
	}//useStringBuffer
	
	public void useStringBuilder() {
		//1. ����
		StringBuilder sb = new StringBuilder();
		
		//2. ���
		//�� �߰�. append(��);
		sb.append("�ȳ�."); //���ڿ� �߰�
		sb.append(2021); //���� �߰�
		sb.append("��"); //���ڿ� �߰�
		sb.append('A');//���� �߰�
		sb.append(2.16);//�Ǽ� �߰�
		sb.append(true);//�Ҹ� �߰�
		
		//�� ����. insert(�߰��� ��ġ �ε���, ��);
		//�ȳ�.2021��A2.16true
		sb.insert(10, "��");
		sb.insert(14,"��");
		
		//�� ����. delete(���� �ε���, �� �ε���+1);
		//�ȳ�.2021��A2��.16��true
		sb.delete(3, 8);
		//���ڿ� ������.
		sb.reverse();
		sb.reverse();
		
		
		
		
		System.out.println(sb);
		
		
	}//useStringBuilder
	
	
	
	public static void main(String[] args) {
		UseStringBuilder usb = new UseStringBuilder();
		
		usb.useStringBuffer();
		System.out.println("-------------------------");
		usb.useStringBuilder();
		System.out.println("-------------------------");
		
		String file1 = "c:/dev/test.txt.doc";
		String file2 = "c:/work/test/day0216/Test.java";
		
		//StringBuilder�� ����Ͽ� "c:/dev/test.txt.doc" -> "c:/dev/test.txt.temp.doc"
		StringBuilder sbFile1=new StringBuilder(file1);
		sbFile1.insert(sbFile1.lastIndexOf("."), ".temp");
		System.out.println(sbFile1);
		
		//StringBuilder�� ����Ͽ� "c:/work/test/day0216/Test.java" -> "c:/work/day0216/Test.java"
		StringBuilder sbFile2=new StringBuilder(file2);
		sbFile2.delete(8, 13);
		System.out.println(sbFile2);
		
		
		
	}//main

}//class
