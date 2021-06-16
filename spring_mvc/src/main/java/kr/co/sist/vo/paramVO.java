package kr.co.sist.vo;

import java.util.Arrays;

/**
 * VO만든 목적 : web parameter를 저장하기 위한 목적
 * 주의 : HTML Form Control의 name 속성값과 VO의 instance변수의 이름이 반드시 같아야 한다.
 *  없거나 다르면 해당 값은 입력받을 수 없다.
 *  VO는 web parameter가 없을 때 기본 값을 설정할 수 있는 @RequestParam 을 사용할 수 없다.
 * @author jin
 */
public class paramVO {
	private String nick;
	private int age;
	private String[] movie;
	
	//Framework에서는 기본생서자를 사용하여 VO를 생성하고,
	//web patameter에 일치하는 setter method를 호출한 후 값을 설정하고,
	//개발자는 getter method 호출하여 값을 얻는다.
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String[] getMovie() {
		return movie;
	}
	public void setMovie(String[] movie) {
		this.movie = movie;
	}
	@Override
	public String toString() {
		return "paramVO [nick=" + nick + ", age=" + age + ", movie=" + Arrays.toString(movie) + "]";
	}
	
	
}//class
