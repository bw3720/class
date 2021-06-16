package day0216;

/**
 * ����� ���� �ڷ���.<br>
 * �ڹٿ��� �����ϴ� ���������� �����Ͽ� �������� ������ ������ �������� ����� Ŭ����.<br>
 * VO(Value Object)<br>
 * 
 * �л��� ������ �й�,�̸�,����,Ű�� �����ȴ�.
 * @author user
 */
public class StudentVO {
	private int regiName;//�й�
	private String name;//�̸�
	private int age;//����
	private double height;//Ű
	
	/**
	 * �л��� ��� ������ ���� ���� �� ����ϴ� ������
	 * ���������� setter method�� ����Ͽ� �Է��Ѵ�.
	 */
	public StudentVO() {
	}//StudentVO
	
	
	/**
	 * �л��� ������ �˶� ����ϴ� ������
	 * @param regiName �л��� ��ȣ
	 * @param name �л��� �̸�
	 * @param age �л��� ����
	 * @param height �л��� Ű
	 */
	public StudentVO(int regiName, String name, int age, double height) {
		this.regiName = regiName;
		this.name = name;
		this.age = age;
		this.height = height;
	}//StudentVO

	///////alt +shift +s  -> ///////
	public int getRegiName() {
		return regiName;
	}


	public void setRegiName(int regiName) {
		this.regiName = regiName;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}

	/////////////��簪 �ҷ�����///////////////
	@Override
	public String toString() {
		return "StudentVO [regiName=" + regiName + ", name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
	
	
	
}//class
