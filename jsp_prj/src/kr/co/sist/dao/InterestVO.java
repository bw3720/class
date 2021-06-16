package kr.co.sist.dao;

public class InterestVO {
	private String name,interest;

	public InterestVO() {
	}

	public InterestVO(String name, String interest) {
		this.name = name;
		this.interest = interest;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}
	
	
}
