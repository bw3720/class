package day0209;

/**
 * 사람의 공통특징을 사용하는 클래스.(person을 상속받는 자식클래스)<br>
 * 눈,코,입,이름,먹는 일은 부모클래스에서 제공하는 것을 사용하고(코드의 재사용성),
 * 자신만의 특징을 정의하는 클래스.
 * @author user
 */
public class HongGilDong extends Person{
	
	private int level;
	/**
	 * 홍길동 클래스의 기본생성자<br>
	 * 객체가 생성될 때 기본적으로 가지고 있어야할 값 설정.<br>
	 * 싸움 레벨은 1~10까지 존재하고, 홍길동은 싸움 레벨이 높은 상태인 6을 가지고 태어난다.
	 */
	public HongGilDong() {
		level = 6;
	}//HongGilDong
	
	public String eat() {
		return getName()+"이 집에서 밥을 앙냥냥 먹는다.";
	}
	/**
	 * 부모클래스가 제송하는 기능이 자식클래스에서 맞지 않을 때, 자식클래스의 상황과 맞도록
	 * method를 재정의 한다.
	 */
	@Override
	public String eat(String menu,int price) {
		//자식클래스의 name변수가 private 접근지정자를 가지고 있어서, 자식클래스에서는 직접 사용할 수 없다.
		//따라서 자식클래스에서 부모클래스의 private 자원을 사용하기 위해 getter method를 사용한다.
		return getName() + "이 주막에서 "+menu+"인 음식을 "+price+"냥을 내고 사먹는다.";
	}//eat
	
	/**
	 * 자식클래스의 자신만의 특징. 싸우는 일
	 * @param yourLevel 상대방의 레벨
	 * @return 싸움의 결과
	 */
	public String fight(int yourLevel) {
		String result="";//empty
		if(level <yourLevel) {//상대방의 레벨이 높은 경우 : 지는 경우
			
			result = yourLevel+"에게 졌습니다.ㅜㅜ";
			
			level--; // 레벨 감소
			if(level<1) {
				level=1;
			}//end if
			
		}else if(level >yourLevel){//상대방의 레벨이 낮은 경우 : 이기는 경우
			result = yourLevel+"에게 이겼다.^^";

			level++; // 레벨 증가
			if(level>10) {
				level=10;
			}//end if
			
		}else {//비기는 경우
			result = yourLevel+"에게 비겼다. ㅡㅡ";
			//레벨의 변화가 없다.
			
		}//end else
		
		return result ;
		
	}//fight
	
	public int getLevel() {
		//System.out.println("method를 호출하는 객체의 heap 주소 : "+this);
		//System.out.println("method를 호출하는 객체의 부모 heap 주소 : "+super); // super는 출력할 수 없다.
		return level;
	}//getLevel

	/**
	 * 홍길동은 한국어와 만주어를 구현할 수 있다.
	 * @return 구현언어 
	 */
	@Override
	public String[] language() {
		//일차원 배열을 참조형 형식으로 생성하고 반환
		//1. 선언 : 데이터형[] 배열명[] = null;
		String lang[]=null;
		//2. 생성 : 배열명 = new 데이터형[방의갯수];
		lang = new String[2];
		//3. 값 할당 : 배열명[방의 번호] = 값;
		lang[0] = "한국어";
		lang[1] = "만주어";
		return lang;
	}//language
	
	
	
}//class
