package day0129;

public class HomeworkDog {
	private int eye;
	private int nose;
	private int mouth;
	private int ear;
	private String name;
	
	/**
	 * 기본 강아지의 성격
	 */
	public HomeworkDog() {
		eye=2;
		nose=1;
		mouth=1;
		ear=2;
		name="댕댕이";
	}
	
	public HomeworkDog(int eye, int nose, int mouth, int ear, String name) {
		this.eye=eye;
		this.nose=nose;
		this.mouth=mouth;
		this.ear=ear;
		this.name=name;
	}
	
	//////////////setter & getter////////////////
	
		//////////eye//////////
	public void setEye(int eye) {
		this.eye = eye;
	}//setEye
	
	public int getEye() {
		return eye;
	}//getEye
	
		//////////nose//////////
	public void setNose(int nose) {
		this.nose = nose;
	}//setNose
	
	public int getNose() {
		return nose;
	}//getNose
	
		//////////mouth//////////
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}//setMouth
	
	public int getMouth() {
		return mouth;
	}//getMouth
	
	//////////ear//////////
	public void setEar(int ear) {
		this.ear = ear;
	}//setEar
	
	public int getEar() {
		return ear;
	}//getEar
	
	//////////name//////////
	public void setName(String name) {
		this.name = name;
	}//setName
	
	public String getName() {
		return name;
	}//getName
	
	
	/////////////동적인 특징/////////////
	/**
	 * 산책을 가지못하고 집에서 놀았을 때
	 * @return name은(는) 집안에서만 뛰어 놀았다. 를 출력
	 */
	public String play() {
		return name+"은(는) 집안에서만 뛰어 놀았다.";
	}
	
	/**
	 * 밖에서 산책 했을때
	 * @param place 장소
	 * @param hour 시간
	 * @return 어떤 장소에서 얼마나 뛰어 놀았는지를 출력
	 */
	public String play(String place, int hour) {
		return name+"은(는)"+place+"에서 "+hour+"시간 동안 뛰어 놀았습니다.";
	}
}
