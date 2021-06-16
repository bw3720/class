package day0408;

import java.util.Date;

public class hwCarVO {
	private String maker;
	private String model;
	private String carOption;
	private int price;
	private Date hiredate;
	
	public hwCarVO() {
		super();
	}

	public hwCarVO( String maker, String model, String carOption, int price, Date hiredate) {
		super();
		this.maker = maker;
		this.model = model;
		this.carOption = carOption;
		this.price = price;
		this.hiredate = hiredate;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCarOption() {
		return carOption;
	}

	public void setOption(String carOption) {
		this.carOption = carOption;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	
	
	
	
}//class
