package day0302;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DataVO1 {

	private String name;
	private int age;
	
	
	
	public DataVO1() {
		
	}
	
	public DataVO1(String name, int age) {
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

	@Override
	public String toString() {
		return name + age +(Calendar.YEAR - age+1);
	}
	
	
	
}//class
