package day0128;

/**
 *��ī�� Ŭ������ ��ü�� �����Ͽ� ����ϴ� Ŭ����.
 * @author user
 */
public class UseMarker {
	static String[] a;
	public static void main(String[] args) {
		System.out.println(new Marker());
		
		//1. ��üȭ : Marker class�� �����Ͽ� black�̶�� ��ü�� �Ҵ�.
		Marker black = new Marker();
		System.out.println(new Marker());
		black.setBody(1);
		black.setCap(1);
		black.setColor("������");
		//black.color="������";
		//������ ���� �����ڰ� public�϶����� Ŭ���� �ܺο��� �����Ӱ� ���� �����Ҽ� �ִ�.
		//���� ���� �Է������� �����ϱ� ��ƴ�. ==> 'public�� �������� �ʴ´�.'
		System.out.println("��ī�濡 ������ �� �Ѳ� : "+black.getCap()+" ���� : "+black.getColor());
		
		
		
		//2. ������ ��ü ���.
		//black.color="�����";
		black.setColor("�Ķ���");
		System.out.println(black.write("�ȳ��ϼ���?"));
		
		
		
	}//main

}//class
