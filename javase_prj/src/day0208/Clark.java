package day0208;

/**
 * 사람의 공통특징을 사용하는 클래스.(person을 상속받는 자식클래스)<br>
 * 눈,코,입,이름,먹는 일은 부모클래스에서 제공하는 것을 사용하고(코드의 재사용성),
 * 자신만의 특징을 정의하는 클래스.
 * @author user
 */
public class Clark extends Person{
	public int power;
	
	/**
	 * 클락 클래스의 기본생성자<br>
	 * 객체가 생성될 때 기본적으로 가지고 있어야할 값 설정.<br>
	 * 힘 레벨은 1~100까지 존재하고, 홍길동은 싸움 레벨이 높은 상태인 80을 가지고 태어난다.
	 */
	public Clark() {
		power = 80;
	}//Clark
	
	@Override
	public String eat() {
		//자식클래스의 name변수가 private 접근지정자를 가지고 있어서, 자식클래스에서는 직접 사용할 수 없다.
		//따라서 자식클래스에서 부모클래스의 private 자원을 사용하기 위해 getter method를 사용한다.
		return getName()+"이(가) 집에서 빵을 '와앙'하고 먹는다.";
	}//eat
	
	@Override
	public String eat(String menu,int price) {
		return getName() + "이(가) 파인다이닝에서 "+menu+"인 음식을 "+price+"$를 내고 사먹었다.";
	}//eat
	
	/**
	 * 클락의 힘을 설정하는 일. 크립토나이트가 입력되면 힘이 빠진다.
	 * @param stone 돌의 종류
	 * @return 돌을 맞은 결과.
	 */
	public String power(String stone) {
		String result = stone;
		if(stone.equals("크립토나이트")) {
			power = 0;
			result +=" : 힘이 빠진다.";
		}else if(stone.equals("다이아몬드")) {
			power=80;
			result += " : 감사합니다. ^^";
		}else {
			power=110;
			result += " : (ㅡㅡ*)???";
		}//end else
		
		
		return result;
	}//power
	
}//class
