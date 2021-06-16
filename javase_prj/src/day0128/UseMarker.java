package day0128;

/**
 *마카펜 클래스를 객체로 생성하여 사용하는 클래스.
 * @author user
 */
public class UseMarker {
	static String[] a;
	public static void main(String[] args) {
		System.out.println(new Marker());
		
		//1. 객체화 : Marker class를 생성하여 black이라는 객체에 할당.
		Marker black = new Marker();
		System.out.println(new Marker());
		black.setBody(1);
		black.setCap(1);
		black.setColor("검은색");
		//black.color="검은색";
		//변수의 접근 지정자가 public일때에는 클래스 외부에서 자유롭게 값을 변경할수 있다.
		//값에 대한 입력제한을 설정하기 어렵다. ==> 'public을 설정하지 않는다.'
		System.out.println("마카펜에 설정된 값 뚜껑 : "+black.getCap()+" 색상 : "+black.getColor());
		
		
		
		//2. 생선된 객체 사용.
		//black.color="보라색";
		black.setColor("파란색");
		System.out.println(black.write("안녕하세요?"));
		
		
		
	}//main

}//class
