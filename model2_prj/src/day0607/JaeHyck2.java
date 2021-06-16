package day0607;

public class JaeHyck2 implements Person{
	
	public String msg2() {
		return "잠시만요.";
	}

	@Override
	public String execute() {
		return msg2();
	}
}
