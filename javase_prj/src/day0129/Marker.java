package day0129;



/**
 * ��ī���� ������� �ۼ��� Ŭ����<br>
 *  ������� Ư¡ : ��, ��ü, �Ѳ�<br>
 *  �������� Ư¡ : ����.<br>
 *  �� Ư¡�� �߻�ȭ�� �ۼ��� Ŭ����<br>
 *  ����)<br>
 *    1.��üȭ <br>
 *     Maker  ��ü��=new Maker();<br>
 *    2.���<br>
 *     ��ü��.write("ȭ��Ʈ���忡 �ۼ��� �޼���");
 *     
 * @author user
 */
public class Marker {

	private String color; // null
	private int cap; // 0
	private int body; // 0
	
	/**
	 * ��ī�� Ŭ������ �⺻������<br>
	 * �Ѳ� 1��, ��ü 1��, �������� ��ī���� ������ �� ���.
	 */
	public Marker() {
		this("������",1,1);
//		color="������";
//		cap=1;
//		body=1;
	}//Marker
	
	/**
	 * �Է��ϴ� ������ ��ī�水ü�� �����ϴ� Overload�� ������<br>
	 * ���� ������, �Ķ���,�������� ������ �� �ְ� �ش���� �ƴϸ� ���������� �����ȴ�.<br>
	 * �Ѳ��� ��ü�� �ִ� 10������ ������ �� ������ 10���� �ʰ��Ǹ� 1���� �����ȴ�.  
	 *  
	 * @param color ������ ��.
	 * @param cap �Ѳ��� ����.
	 * @param body ��ü�� ����.
	 */
	public Marker(String color, int cap, int body) {

		if( color.equals("������") || color.equals("������") || color.equals("�Ķ���")) {
			this.color=color;
		}else {
			this.color="������";
		}//end if
		
		if(cap > 10) {
			cap=1;
		}//end if
		this.cap=cap;
		
		if(body > 10) {
			body=1;
		}//end if
		this.body=body;
		
	}//Marker
	
	/**
	 * ������ ��ī�� ��ü�� ���� �����ϴ� ��.<br>
	 *  ���������� �� ��� : ������, ������, �Ķ��� 3������ ���� ���� .<br>
	 *  �ٸ����� �ԷµǸ� ���������� �����մϴ�.
	 * @param color ������ ��.
	 */
	public void setColor(String color) {
		
		if( color.equals("������") || color.equals("������") || color.equals("�Ķ���")) {
			this.color=color;
		}else {
			color="������";
		}//end if
		
		
	}//setColor
	
	/**
	 * ������ ��ī�� ��ü�� ���� ��� ��.
	 * @return ������ ��ī�水ü�� ������ ��.
	 */
	public String getColor() {
		return color;
	}//getColor
	
	/**
	 * ������ ��ī�� ��ü�� �Ѳ� ������ �����ϴ� ��.
	 * @param cap ������ ��ī�水ü��  ������ �Ѳ��� ����.
	 */
	public void setCap(int cap) {
		this.cap=cap;
	}//setCap
	
	/**
	 * ������ ��ī�� ��ü�� ������ �Ѳ��� ������ ��� ��.
	 * @return ������ �Ѳ��� ����.
	 */
	public int getCap() {
		return cap;
	}//getCap
	
	/**
	 * ������ ��ī�� ��ü�� ��ü������ �����ϴ� ��.
	 * @param body ������ ��ü�� ����.
	 */
	public void setBody(int body) {
		this.body=body;
	}//setBody
	
	/**
	 * ������ ��ī�� ��ü�� ��ü ������ ��ȯ�ϴ� ��.
	 * @return ��ī�� ��ü�� ����
	 */
	public int getBody() {
		return body;
	}//getBody
	
	/**
	 * ������ ��ī�� ��ü�� ����Ͽ� ĥ�ǿ� �Էµ� �޽����� ���� ��.
	 * @param msg ĥ�ǿ� �� �޽���
	 * @return �޼����� �� ���
	 */
	public String write(String msg) {
		return "ĥ�ǿ� "+color+"�� ��ī������ \""+ msg+"\" �� ����.";
	}//writer
	
}//class
