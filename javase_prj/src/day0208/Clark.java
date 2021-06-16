package day0208;

/**
 * ����� ����Ư¡�� ����ϴ� Ŭ����.(person�� ��ӹ޴� �ڽ�Ŭ����)<br>
 * ��,��,��,�̸�,�Դ� ���� �θ�Ŭ�������� �����ϴ� ���� ����ϰ�(�ڵ��� ���뼺),
 * �ڽŸ��� Ư¡�� �����ϴ� Ŭ����.
 * @author user
 */
public class Clark extends Person{
	public int power;
	
	/**
	 * Ŭ�� Ŭ������ �⺻������<br>
	 * ��ü�� ������ �� �⺻������ ������ �־���� �� ����.<br>
	 * �� ������ 1~100���� �����ϰ�, ȫ�浿�� �ο� ������ ���� ������ 80�� ������ �¾��.
	 */
	public Clark() {
		power = 80;
	}//Clark
	
	@Override
	public String eat() {
		//�ڽ�Ŭ������ name������ private ���������ڸ� ������ �־, �ڽ�Ŭ���������� ���� ����� �� ����.
		//���� �ڽ�Ŭ�������� �θ�Ŭ������ private �ڿ��� ����ϱ� ���� getter method�� ����Ѵ�.
		return getName()+"��(��) ������ ���� '�;�'�ϰ� �Դ´�.";
	}//eat
	
	@Override
	public String eat(String menu,int price) {
		return getName() + "��(��) ���δ��̴׿��� "+menu+"�� ������ "+price+"$�� ���� ��Ծ���.";
	}//eat
	
	/**
	 * Ŭ���� ���� �����ϴ� ��. ũ���䳪��Ʈ�� �ԷµǸ� ���� ������.
	 * @param stone ���� ����
	 * @return ���� ���� ���.
	 */
	public String power(String stone) {
		String result = stone;
		if(stone.equals("ũ���䳪��Ʈ")) {
			power = 0;
			result +=" : ���� ������.";
		}else if(stone.equals("���̾Ƹ��")) {
			power=80;
			result += " : �����մϴ�. ^^";
		}else {
			power=110;
			result += " : (�Ѥ�*)???";
		}//end else
		
		
		return result;
	}//power
	
}//class
