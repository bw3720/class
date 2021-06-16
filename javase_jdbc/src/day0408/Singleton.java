package day0408;

/**
 * �������� JVM���� ��ü�� �ϳ��� �����ϰ�, ����� �� �ֵ��� ����� ����.
 * @author user
 */
public class Singleton {
	
	private static Singleton single;

	/**
	 * �������� ���������ڸ�  private���� �����Ͽ� Ŭ���� �ܺο����� ���� ��üȭ �� �� ������ �Ѵ�.
	 */
	private Singleton() {

	}
	
	/**
	 * ��üȭ ���� ��ü�� ��ȯ�ϴ� method
	 * @return
	 */
	public static Singleton getInstance() {
		if ( single == null) {
			single = new Singleton();
		}//end if
		
		return single;
	}
	
	
}//class
