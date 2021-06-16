package day0302;

/**
 * Data�� ������ ������¸� ������ �������� ����ϴ� Ŭ����
 * @author SIST
 */
public class DataVO /* implements Cloneable*/ {

	private String name;
	private int age;
	
	public DataVO() {
		
	}//DataVO

	public DataVO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	/**
	 * ��ü����
	 * @return
	 */
	public DataVO cloneObj() {
		DataVO temp = null;
		
		try {
		temp=(DataVO)this.clone();//CompileException �߻� -> �����ڴ� �ݵ�� try~catch�� ó�� �ؾߵ�.
		}catch( CloneNotSupportedException cnse){
			System.err.println("���� �߻� ���� �ȵ� : "+ cnse);
		}//end catch
		
		return temp;
	}//cloneObj

	@Override
	public String toString() {
		return super.toString()+"DataVO [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}//class
