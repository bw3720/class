package kr.co.sist.vo;

public class CounterVO {
	
	private int cnt;

	public CounterVO() {
		System.out.println("객체가 생성되었습니다");
	}
	
	public CounterVO(int cnt) {
		super();
		this.cnt = cnt;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt += cnt;//기존의 값과 새로운 값을 누적시킨다.(누적합)
	}
	
	
	
}//class
