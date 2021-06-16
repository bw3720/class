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
	
	/////////////집밥 or 외식 판독//////////////
	
	/**
	 * 생성된 사람 객체가 집에서 밥을 먹는일 구현.
	 * @return 밥먹는 일.
	 */
	public String eat() {
		return name+"이 집밥 먹었으!";
	}//eat()
	
	/**
	 * Method Overload(Overloading)<br>
	 * 
	 * 생성된 사람 객체가 밖에서 밥을 먹는일 구현.
	 * @param menu 사먹은 음식.
	 * @param won 음식의 가격.
	 * @return 누가 어떤것을 먹었고, 얼마를 쓴 결과.
	 */
	public String eat(String menu, int won) {
		return name+"이 밖에서 "+menu+"을 "+ won+ "원 내고 먹었다.";
	}//eat(String,int)
	
}//class
