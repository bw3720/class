package day0305;

import java.io.Serializable;

/**
 * JVM�ܺη� ����ȭ�Ǿ� ������ Ŭ����
 * @author SIST
 */
public class MyData implements Serializable{

	
	
	/**
	 * ���̵�� 2021-03-06�� ����
	 */
	private static final long serialVersionUID = -6743636827831497164L;
	
	private String name;
	private double height;
	private double weight;
	
	public MyData() {
		super();
	}

	public MyData(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}
	
	
	
	
	
}//class
