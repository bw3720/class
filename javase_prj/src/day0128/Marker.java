package day0128;

/**
 *마카펜을 대상으로 작성된 클래스<br>
 *명사적인 특징 : 색, 몸체, 뚜껑<br>
 *동사적인 특징 : 쓴다.<br>
 *의 특징을 추상화하여 작성한 클래스<br>
 *사용법) <br>
 *	1. 객체화<br>
 *	Marker 객체명 = new Marker(); <br>
 *	2.사용<br>
 *	객체명.write("화이트보드에 작성할 메세지");
 * @author user
 */
public class Marker {

	private String color; //null
	private int cap; // 0
	private int body; // 0
	
	/**
	 * 마카펜클래스의 기본생성자<br>
	 * 뚜껑 1개,몸체 1개, 검은색인 마카펜을 생성할 때 사용.
	 */
	public Marker() {
		color ="검은색";
		cap = 1;
		body = 1;
	}//Marker
	

	
	/**
	 * 생성된 마카펜 객체의 색을 설정하는 일.<br>
	 * 설정가능한 색 목록 : 검은색, 빨간색,파란색 3종류만 설정 가능.<br>
	 * 다른 색이 입력되면 검은색으로 설정합니다. 
	 * @param color 설정할 색.
	 */
	public void setColor(String color) {
		
		if(color.equals("검은색") || color.equals("빨간색") || color.equals("파란색")) {
			this.color = color;
		}else {
			color = "검은색";
		}//end if else
		
	}//setColor
	
	/**
	 * 생성된 마카펜 객체의 색을 얻는 일.
	 * @return 생선된 마카펜 객체에 설정된색 반환.
	 */
	public String getColor() {
		return color;
	}//getColor
	
	/**
	 * 생선된 마카펜 객체의 뚜껑 갯수를 설정하는 일.
	 * @param cap 생성된 마카펜 객체의 설정된 뚜껑의 갯수.
	 */
	public void setCap(int cap) {
		this.cap = cap;
	}//setCap
	
	/**
	 * 생성된 마카펜 객체에 설정된 뚜껑의 갯수를 얻는 일.
	 * @return 설정된 뚜껑의 갯수.
	 */
	public int getCap() {
		return cap;
	}//getCap
	
	/**
	 * 생성된 마카펜 객체의 몸체 갯수를 설정하는 일.
	 * @param body 설정한 몸체의 갯수.
	 */
	public void setBody(int body) {
		this.body = body;
	}//setBody
	
	/**
	 * 생성된 마카펜 객체에 설정된 몸체의 갯수를 얻는 일.
	 * @return 설정된 몸체의 갯수.
	 */
	public int getBody() {
		return body;
	}//getBody

	
	/**
	 *생성된 마케펜 객체를 사용하여 칠판에 입력된 메시지를 쓰는 일.
	 * @param msg 칠판에 쓸 메시지
	 * @return 칠판에 쓴 결과
	 */
	public String write(String msg) {
		return "칠판에 "+color+"인 마카펜으로 "+ msg+ "\"를쓴다.";
	}
}
