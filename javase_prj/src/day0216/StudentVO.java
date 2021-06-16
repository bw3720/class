package day0216;

/**
 * 사용자 정의 자료형.<br>
 * 자바에서 제공하는 데이터형을 조합하여 복합적인 정보를 저장할 목적으로 만드는 클래스.<br>
 * VO(Value Object)<br>
 * 
 * 학생의 정보는 학번,이름,나이,키로 구성된다.
 * @author user
 */
public class StudentVO {
	private int regiName;//학번
	private String name;//이름
	private int age;//나이
	private double height;//키
	
	/**
	 * 학생의 모든 정보를 알지 못할 때 사용하는 생성자
	 * 개별정보를 setter method를 사용하여 입력한다.
	 */
	public StudentVO() {
	}//StudentVO
	
	
	/**
	 * 학생의 정보를 알때 사용하는 생성자
	 * @param regiName 학생의 번호
	 * @param name 학생의 이름
	 * @param age 학생의 나이
	 * @param height 학생의 키
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

	/////////////모든값 불러오기///////////////
	@Override
	public String toString() {
		return "StudentVO [regiName=" + regiName + ", name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
	
	
	
}//class
