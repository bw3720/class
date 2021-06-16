package day0219;

public class HwStudent {
	private String name;
	private int age;
	private String address;
	private String sex;
	private int javaScore;

	public HwStudent() {
	}
	
	public HwStudent(String name, int age, String address, String sex, int javaScore) {
		this.name = name;
		this.age= age;
		this.address = address;
		this.sex = sex;
		this.javaScore = javaScore;
		
	}//HwStudent

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getJavaScore() {
		return javaScore;
	}

	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}

	@Override
	public String toString() {
		return name + ", " + age + ", " + address + ", " + sex + ", "+ javaScore;
			
	}

	

}//class
