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
			result = "���� �µ���"+temp+"���� �ְ�µ��Դϴ�.";
		}else{
			temp +=num;
			result = temp+"�µ��� �����մϴ�.";
		}
		return result;
	}

	@Override
	public String downBt(int num) {
		String result=null;
		if(temp-num<16) {
			temp=16;
			result = "���� �µ���"+temp+"���� �����µ��Դϴ�.";
		}else{
			temp -=num;
			result = temp+"�µ��� �����մϴ�.";
		}
		return result;
	}

	@Override
	public String powerBt(String onOff) {
		String result = null;
		if(onOff.equals("On")) {
			nowPower="ON";
			result = "������ �ý��� "+nowPower;
		}else if(onOff.equals("Off")){
			nowPower="OFF";
			result = "������ �ý��� "+nowPower;
		}
		return result;
	}

	public String sleepBt(String onOff) {
		String result= null;
		if(onOff.equals("On")) {
			sleepMode="ON";
			result = "��ħ ��� : "+sleepMode;
		}else if(onOff.equals("Off")){
			sleepMode="OFF";
			result = "��ħ ��� :  "+sleepMode;
		}
		return result;
	}

	
	
	
}//class
