package kr.co.sist.vo;

import java.util.Arrays;

/**
 * HTML Form Control의 값 (Parameter의 값)을 받는 목적의 VO<br/>
 * Form Control의 name 속성과 VO의 instance 변수가 반드시 같은 이름이여야 한다.<br/>
 * parameter의 데이터 형은 문자열이지만 bean을 사용하여 받을 때에는 
 * Web Container가 정수로 변환하여 입력해준다.
 * @author user
 */
public class ParamVO {
	private String name, mail, gender, addr, domain, info;
	private int age;//Container가 int로 변환하여 입력해준다.
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
