package day0215;

/**
 * 사람의 공통특징을 사용하는 클래스.(person을 상속받는 자식클래스)<br>
 * 눈,코,입,이름,먹는 일은 부모클래스에서 제공하는 것을 사용하고(코드의 재사용성),
 * 자신만의 특징을 정의하는 클래스.
 * @author user
 */
public class HanSangMin extends Person{

	private int watchMovie;
	
	public HanSangMin() {
		watchMovie = 100;
	}//HanSangMin
	
	public String figth(int yourMovie) {//영화랑 싸우는 건가요?
		String result ="";
		if(watchMovie > yourMovie) {
			result =yourMovie +"편 보셨군요!! 영화 추천해드릴까요?";
		}else if(watchMovie < yourMovie) {
			result =yourMovie +"편 보셨군요!! 영화를 많이 좋아하시는군요...ㅎㅎㅎ";
		}else {
			result =yourMovie +"편 보셨군요!! 어떤 영화를 좋아하세요?";
		}
		return result;
	}//end else

	@Override
	public String eat() {
		return getName()+"이 집에서 밥을 앙냥냥 먹는다.";
	}

	@Override
	public String eat(String menu, int price) {
		return getName() + "이 식당에서 "+menu+"인 음식을 "+price+"원을 내고 사먹는다.";
	}

	@Override
	public String[] language() {
		String[] lang = {"한국어","영어"};
		return lang;
	}
	
	
}//class
