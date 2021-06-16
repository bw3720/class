package kr.co.sist.vo;

import java.util.Arrays;

/**
 * VO���� ���� : web parameter�� �����ϱ� ���� ����
 * ���� : HTML Form Control�� name �Ӽ����� VO�� instance������ �̸��� �ݵ�� ���ƾ� �Ѵ�.
 *  ���ų� �ٸ��� �ش� ���� �Է¹��� �� ����.
 *  VO�� web parameter�� ���� �� �⺻ ���� ������ �� �ִ� @RequestParam �� ����� �� ����.
 * @author jin
 */
public class paramVO {
	private String nick;
	private int age;
	private String[] movie;
	
	//Framework������ �⺻�����ڸ� ����Ͽ� VO�� �����ϰ�,
	//web patameter�� ��ġ�ϴ� setter method�� ȣ���� �� ���� �����ϰ�,
	//�����ڴ� getter method ȣ���Ͽ� ���� ��´�.
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
