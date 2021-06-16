package kr.co.sist.vo;

import java.util.Arrays;

/**
 * HTML Form Control�� �� (Parameter�� ��)�� �޴� ������ VO<br/>
 * Form Control�� name �Ӽ��� VO�� instance ������ �ݵ�� ���� �̸��̿��� �Ѵ�.<br/>
 * parameter�� ������ ���� ���ڿ������� bean�� ����Ͽ� ���� ������ 
 * Web Container�� ������ ��ȯ�Ͽ� �Է����ش�.
 * @author user
 */
public class ParamVO {
	private String name, mail, gender, addr, domain, info;
	private int age;//Container�� int�� ��ȯ�Ͽ� �Է����ش�.
	private String[] movie;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String[] getMovie() {
		return movie;
	}
	public void setMovie(String[] movie) {
		this.movie = movie;
	}
	@Override
	public String toString() {
		return "ParamVO [name=" + name + ", mail=" + mail + ", gender=" + gender + ", addr=" + addr + ", domain="
				+ domain + ", info=" + info + ", age=" + age + ", movie=" + Arrays.toString(movie) + "]";
	}

	
	
	
	
	
}//class
