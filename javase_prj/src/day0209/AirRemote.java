package day0209;

public class AirRemote extends Remote{
	
	private int temp;
	private String nowPower;
	private String sleepMode;
	
	public AirRemote() {
		temp = 25;
		nowPower = "ON";
	}
	
	@Override
	public String upBt(int num) {
		String result=null;
		if(temp+num>31) {
			temp=30;
			result = "현재 온도는"+temp+"도로 최고온도입니다.";
		}else{
			temp +=num;
			result = temp+"온도로 설정합니다.";
		}
		return result;
	}

	@Override
	public String downBt(int num) {
		String result=null;
		if(temp-num<16) {
			temp=16;
			result = "현재 온도는"+temp+"도로 최저온도입니다.";
		}else{
			temp -=num;
			result = temp+"온도로 설정합니다.";
		}
		return result;
	}

	@Override
	public String powerBt(String onOff) {
		String result = null;
		if(onOff.equals("On")) {
			nowPower="ON";
			result = "에어컨 시스템 "+nowPower;
		}else if(onOff.equals("Off")){
			nowPower="OFF";
			result = "에어컨 시스템 "+nowPower;
		}
		return result;
	}

	public String sleepBt(String onOff) {
		String result= null;
		if(onOff.equals("On")) {
			sleepMode="ON";
			result = "취침 모드 : "+sleepMode;
		}else if(onOff.equals("Off")){
			sleepMode="OFF";
			result = "취침 모드 :  "+sleepMode;
		}
		return result;
	}

	
	
	
}//class
