package day0208;

/**
 * ����� ����Ư¡�� ����ϴ� Ŭ����.(person�� ��ӹ޴� �ڽ�Ŭ����)<br>
 * ��,��,��,�̸�,�Դ� ���� �θ�Ŭ�������� �����ϴ� ���� ����ϰ�(�ڵ��� ���뼺),
 * �ڽŸ��� Ư¡�� �����ϴ� Ŭ����.
 * @author user
 */
public class HanSangMin extends Person{

	private int watchMovie;
	
	public HanSangMin() {
		watchMovie = 100;
	}//HanSangMin
	
	public String figth(int yourMovie) {//��ȭ�� �ο�� �ǰ���?
		String result ="";
		if(watchMovie > yourMovie) {
			result =yourMovie +"�� ���̱���!! ��ȭ ��õ�ص帱���?";
		}else if(watchMovie < yourMovie) {
			result =yourMovie +"�� ���̱���!! ��ȭ�� ���� �����Ͻô±���...������";
		}else {
			result =yourMovie +"�� ���̱���!! � ��ȭ�� �����ϼ���?";
		}
		return result;
	}//end else
	
	
}//class
