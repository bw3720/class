package day0128;

/**
 *��ī���� ������� �ۼ��� Ŭ����<br>
 *������� Ư¡ : ��, ��ü, �Ѳ�<br>
 *�������� Ư¡ : ����.<br>
 *�� Ư¡�� �߻�ȭ�Ͽ� �ۼ��� Ŭ����<br>
 *����) <br>
 *	1. ��üȭ<br>
 *	Marker ��ü�� = new Marker(); <br>
 *	2.���<br>
 *	��ü��.write("ȭ��Ʈ���忡 �ۼ��� �޼���");
 * @author user
 */
public class Marker {

	private String color; //null
	private int cap; // 0
	private int body; // 0
	
	/**
	 * ��ī��Ŭ������ �⺻������<br>
	 * �Ѳ� 1��,��ü 1��, �������� ��ī���� ������ �� ���.
	 */
	public Marker() {
		color ="������";
		cap = 1;
		body = 1;
	}//Marker
	

	
	/**
	 * ������ ��ī�� ��ü�� ���� �����ϴ� ��.<br>
	 * ���������� �� ��� : ������, ������,�Ķ��� 3������ ���� ����.<br>
	 * �ٸ� ���� �ԷµǸ� ���������� �����մϴ�. 
	 * @param color ������ ��.
	 */
	public void setColor(String color) {
		
		if(color.equals("������") || color.equals("������") || color.equals("�Ķ���")) {
			this.color = color;
		}else {
			color = "������";
		}//end if else
		
	}//setColor
	
	/**
	 * ������ ��ī�� ��ü�� ���� ��� ��.
	 * @return ������ ��ī�� ��ü�� �����Ȼ� ��ȯ.
	 */
	public String getColor() {
		return color;
	}//getColor
	
	/**
	 * ������ ��ī�� ��ü�� �Ѳ� ������ �����ϴ� ��.
	 * @param cap ������ ��ī�� ��ü�� ������ �Ѳ��� ����.
	 */
	public void setCap(int cap) {
		this.cap = cap;
	}//setCap
	
	/**
	 * ������ ��ī�� ��ü�� ������ �Ѳ��� ������ ��� ��.
	 * @return ������ �Ѳ��� ����.
	 */
	public int getCap() {
		return cap;
	}//getCap
	
	/**
	 * ������ ��ī�� ��ü�� ��ü ������ �����ϴ� ��.
	 * @param body ������ ��ü�� ����.
	 */
	public void setBody(int body) {
		this.body = body;
	}//setBody
	
	/**
	 * ������ ��ī�� ��ü�� ������ ��ü�� ������ ��� ��.
	 * @return ������ ��ü�� ����.
	 */
	public int getBody() {
		return body;
	}//getBody

	
	/**
	 *������ ������ ��ü�� ����Ͽ� ĥ�ǿ� �Էµ� �޽����� ���� ��.
	 * @param msg ĥ�ǿ� �� �޽���
	 * @return ĥ�ǿ� �� ���
	 */
	public String write(String msg) {
		return "ĥ�ǿ� "+color+"�� ��ī������ "+ msg+ "\"������.";
	}
}
