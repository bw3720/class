package day0129;

public class HomeworkDog {
	private int eye;
	private int nose;
	private int mouth;
	private int ear;
	private String name;
	
	/**
	 * �⺻ �������� ����
	 */
	public HomeworkDog() {
		eye=2;
		nose=1;
		mouth=1;
		ear=2;
		name="�����";
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
	
	
	/////////////������ Ư¡/////////////
	/**
	 * ��å�� �������ϰ� ������ ����� ��
	 * @return name��(��) ���ȿ����� �پ� ��Ҵ�. �� ���
	 */
	public String play() {
		return name+"��(��) ���ȿ����� �پ� ��Ҵ�.";
	}
	
	/**
	 * �ۿ��� ��å ������
	 * @param place ���
	 * @param hour �ð�
	 * @return � ��ҿ��� �󸶳� �پ� ��Ҵ����� ���
	 */
	public String play(String place, int hour) {
		return name+"��(��)"+place+"���� "+hour+"�ð� ���� �پ� ��ҽ��ϴ�.";
	}
}
