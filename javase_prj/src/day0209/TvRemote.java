package day0209;

public class TvRemote extends Remote{
	private int ch=0;
	private int chBt;
	private String nowPower;
	private String sleepMode;
	
	
	public TvRemote() {
		
	}

	@Override
	public String upBt(int num) {
		String result=null;
		
		if(ch+num<1000) {
			ch+=num;
			result = "현재 채널은 "+ch+".ch 입니다.";
		}else if(ch+num>1000){
			ch=(ch+num-999);
			result = "현재 채널은 "+ch+".ch 입니다.";
		}
		
		return result;
	}

	@Override
	public String downBt(int num) {
		String result=null;
		
		if(ch-num>-1) {
			ch-=num;
			result = "현재 채널은 "+ch+".ch 입니다.";
		}else if(ch-num==0){
			ch=0;
			result = "현재 채널은 "+ch+".ch 입니다.";
		}else {//ch-num < 0 
			ch = 999+(ch-num);
			result = "현재 채널은 "+ch+".ch 입니다.";
		}
		return result;
	}

	@Override
	public String powerBt(String onOff) {
		String result = null;
		if(onOff.equals("On")) {
			nowPower="ON";
			result = "TV 전원 "+nowPower;
		}else if(onOff.equals("Off")){
			nowPower="OFF";
			result = "TV 전원 "+nowPower;
		}
		return result;
	}

	@Override
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
