package kr.co.sist.vo;

public class CounterVO {
	
	private int cnt;

	public CounterVO() {
		System.out.println("��ü�� �����Ǿ����ϴ�");
	}
	
	public CounterVO(int cnt) {
		super();
		this.cnt = cnt;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt += cnt;//������ ���� ���ο� ���� ������Ų��.(������)
	}
	
	
	
}//class
