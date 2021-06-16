package day0208;

/**
 * ����� ����Ư¡�� ����ϴ� Ŭ����.(person�� ��ӹ޴� �ڽ�Ŭ����)<br>
 * ��,��,��,�̸�,�Դ� ���� �θ�Ŭ�������� �����ϴ� ���� ����ϰ�(�ڵ��� ���뼺),
 * �ڽŸ��� Ư¡�� �����ϴ� Ŭ����.
 * @author user
 */
public class HongGilDong extends Person{
	
	private int level;
	/**
	 * ȫ�浿 Ŭ������ �⺻������<br>
	 * ��ü�� ������ �� �⺻������ ������ �־���� �� ����.<br>
	 * �ο� ������ 1~10���� �����ϰ�, ȫ�浿�� �ο� ������ ���� ������ 6�� ������ �¾��.
	 */
	public HongGilDong() {
		level = 6;
	}//HongGilDong
	
	/**
	 * �θ�Ŭ������ �����ϴ� ����� �ڽ�Ŭ�������� ���� ���� ��, �ڽ�Ŭ������ ��Ȳ�� �µ���
	 * method�� ������ �Ѵ�.
	 */
	@Override
	public String eat(String menu,int price) {
		//�ڽ�Ŭ������ name������ private ���������ڸ� ������ �־, �ڽ�Ŭ���������� ���� ����� �� ����.
		//���� �ڽ�Ŭ�������� �θ�Ŭ������ private �ڿ��� ����ϱ� ���� getter method�� ����Ѵ�.
		return getName() + "�� �ָ����� "+menu+"�� ������ "+price+"���� ���� ��Դ´�.";
	}//eat
	
	/**
	 * �ڽ�Ŭ������ �ڽŸ��� Ư¡. �ο�� ��
	 * @param yourLevel ������ ����
	 * @return �ο��� ���
	 */
	public String fight(int yourLevel) {
		String result="";//empty
		if(level <yourLevel) {//������ ������ ���� ��� : ���� ���
			
			result = yourLevel+"���� �����ϴ�.�̤�";
			
			level--; // ���� ����
			if(level<1) {
				level=1;
			}//end if
			
		}else if(level >yourLevel){//������ ������ ���� ��� : �̱�� ���
			result = yourLevel+"���� �̰��.^^";

			level++; // ���� ����
			if(level>10) {
				level=10;
			}//end if
			
		}else {//���� ���
			result = yourLevel+"���� ����. �Ѥ�";
			//������ ��ȭ�� ����.
			
		}//end else
		
		return result ;
		
	}//fight
	
	public int getLevel() {
		//System.out.println("method�� ȣ���ϴ� ��ü�� heap �ּ� : "+this);
		//System.out.println("method�� ȣ���ϴ� ��ü�� �θ� heap �ּ� : "+super); // super�� ����� �� ����.
		return level;
	}//getLevel
	
	
	
}//class