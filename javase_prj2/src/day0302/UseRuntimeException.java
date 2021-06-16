package day0302;

/**
 * RuntimeException의 처리.<br>
 * JVM이 자동으로 처리하는 예외로, 개발자가 코드를 작성하는단계에서는 Compile Error가 발생하지
 * 않는예외(개발자가 놓치기 쉬운 예외)<br>
 * JVM이 자동으로 처리하여 예외 메시지를 출력해준다.(서버의 정보가 외부로 유출됨.)<br>
 * @author SIST
 */
public class UseRuntimeException {


	/**
	 * main method의 arguments를 두개를 입력받아 두수를 나누어 결과를 출력하는 일. 
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		try {
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			
			result = num1/num2;
			
			System.out.println(num1+" / "+num2+" = "+result); //정상 출력
		//상속관계가 아닌 예외 처리객체는 우선순위가 정의에 대한 우선 순위가 없다.
		}catch (ArithmeticException ae) {
			ae.printStackTrace();//자세한 이유
			System.err.println("0으로 나눌 수 없습니다.");
		}catch (ArrayIndexOutOfBoundsException aioobe) {
			//문재 출력
			System.err.println("배열에서 인덱스가 존재하지 않는 예외 발생"); //단순한 메시지
			System.err.println("간단한 예외의 이유만 출력. "+ aioobe.getMessage()); //간단 이유
			System.err.println("예외처리 클래스와 이유 출력. "+ aioobe); //예외처리 클래스와 간단 이유
			aioobe.printStackTrace();//자세한이유
		}catch (NumberFormatException nfe) {
			nfe.printStackTrace();//자세한 이유
			System.err.println("숫자 형식이 아닙니다.");
		}catch (Exception e) {//예외처리 클래스의 부모클래스는 모든 예외를 다 처리 할 수있다.
			System.err.println("개발자가 인지하지 못한 예외");
			e.printStackTrace();
		}finally {
			System.out.println("반드시 실행되어야할 코드.");
		}//end try
		
		
	}//main

}//class
