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
			result = "���� ä���� "+ch+".ch �Դϴ�.";
		}else if(ch+num>1000){
			ch=(ch+num-999);
			result = "���� ä���� "+ch+".ch �Դϴ�.";
		}
		
		return result;
	}

	@Override
	public String downBt(int num) {
		String result=null;
		
		if(ch-num>-1) {
			ch-=num;
			result = "���� ä���� "+ch+".ch �Դϴ�.";
		}else if(ch-num==0){
			ch=0;
			result = "���� ä���� "+ch+".ch �Դϴ�.";
		}else {//ch-num < 0 
			ch = 999+(ch-num);
			result = "���� ä���� "+ch+".ch �Դϴ�.";
		}
		return result;
	}

	@Override
	public String powerBt(String onOff) {
		String result = null;
		if(onOff.equals("On")) {
			nowPower="ON";
			result = "TV ���� "+nowPower;
		}else if(onOff.equals("Off")){
			nowPower="OFF";
			result = "TV ���� "+nowPower;
		}
		return result;
	}

	@Override
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
