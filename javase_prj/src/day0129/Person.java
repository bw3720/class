package day0129;

/**
 *	사람을 객체모델링하여 공통특징을 추출한 클래스.<br>
 *  명사적 : 눈, 코, 입, 이름<br>
 *   동사적 : 먹는다.- Overloading <br>
 *   사용)<br>
 *     클래스명 객체명 = new 생성자();<br>
 *     객체명.method명()<br>
 * @author user
 */
public class Person {
	private int eye;
	private int nose;
	private int mouth;
	private String name;
	
	/**
	 * 눈 2개, 코 1개, 입 1개인 사람 객체를 생성할때 사용.
	 */
	public Person() {
		this(2,1,1);
//		eye=2;
//		nose=1;
//		mouth=1;
	}//Person
	
	/**
	 * 눈, 코, 입의 갯수를 설정하여 사람 객체를 생성하는 일.
	 * @param eye 눈의 갯수
	 * @param nose 코의 갯수
	 * @param mouth 입의 갯수
	 */
	public Person(int eye, int nose, int mouth) {
		this.eye=eye;
		this.nose=nose;
		this.mouth=mouth;
	}//Person
	
	
	//값을 설정하는 method : setter method
	public void setEye(int eye) {
		this.eye=eye;
	}//setEye
	
	 public void setNose(int nose) {
		 this.nose=nose;
	 }//setNose
	 
	 public void setMouth(int mouth) {
		 this.mouth=mouth;
	 }//setMouth
	 
	 public void setName(String name) {
		 this.name=name;
	 }//setName
	
	//값을 얻는 method : getter method
	 public int getEye() {
		 return eye;
	 }//getEye
	 
	 public int getNose() {
		 return nose;
	 }//getNose
	 
	 public int getMouth() {
		 return mouth;
	 }//getMouth
	 
	 public String getName() {
		 return name;
	 }//getName
	 
	 /**
	  * 생성된 사람 객체가 집에서 밥을 먹는일 구현.
	 * @return 밥먹는 일.
	 */
	public String eat() {
		 return name+"이(가) 집에서 밥을 항냥냥냥 먹는다.";
	 }//eat
	
	/**
	 * Method Overload(Overloading)<br>
	 * 생성된 사람 객체가 식당에서 밥을  사먹는 일 구현.
	 * @param menu 사먹는 음식종류.
	 * @param price 음식 가격.
	 * @return 사먹는 일.
	 */
	public String eat(String menu, int price) {
		return name+"이(가) 식당에서 "+menu +"인 음식을 "+price+"원 내고 앙냥냥 먹는다.";
	}//eat
	
}//class

