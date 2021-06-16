package day0128;

public class Person {
	private int eye;
	private int nose;
	private int mouth;
	private String name;
	
		////set & get////
	
	/////////////eye/////////////
	public void setEye(int eye) {
		this.eye = eye;
	}//setEye
	
	public int getEye() {
		return eye;
	}//getEye
	
	/////////////nose/////////////
	public void setNose(int nose) {
		this.nose = nose;
	}//setNose
	
	public int getNose() {
		return nose;
	}//getNose
	
	/////////////mouth/////////////
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}//setMouth
	
	public int getMouth() {
		return mouth;
	}//getMouth
	
	/////////////name/////////////
	public void setName(String name) {
		this.name = name;
	}//setName
	
	public String getName() {
		return name;
	}//getName
	
	/////////////���� or �ܽ� �ǵ�//////////////
	
	/**
	 * ������ ��� ��ü�� ������ ���� �Դ��� ����.
	 * @return ��Դ� ��.
	 */
	public String eat() {
		return name+"�� ���� �Ծ���!";
	}//eat()
	
	/**
	 * Method Overload(Overloading)<br>
	 * 
	 * ������ ��� ��ü�� �ۿ��� ���� �Դ��� ����.
	 * @param menu ����� ����.
	 * @param won ������ ����.
	 * @return ���� ����� �Ծ���, �󸶸� �� ���.
	 */
	public String eat(String menu, int won) {
		return name+"�� �ۿ��� "+menu+"�� "+ won+ "�� ���� �Ծ���.";
	}//eat(String,int)
	
}//class
