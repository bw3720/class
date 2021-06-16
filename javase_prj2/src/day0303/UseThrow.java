package day0303;

import java.util.Random;

/**
 * ���ܸ� ������ �߻�.
 * @author SIST
 */
public class UseThrow {
	
	/**
	 * �߻��� ���ܴ� ��κ��� ������ ó���Ѵ�.
	 * ������ ���ܴ� �߻��� ���ܸ� �״�� ������ �ǰ�, �θ𿹿�ó�� Ŭ������ ����Ͽ� ������ �ȴ�.
	 */
	public void useThrow() throws Exception{
		System.out.println("���� �߻� ��");
		
		if( new Random().nextBoolean()) {
			//���ܸ� ������ �߻���Ű���� : throw new ����ó��Ŭ����();
//			try {
				throw new Exception("���ܸ� �����ߴ�");
//			} catch (Exception e) {
//				//�߻��� ���ܸ� �ٷ� try~catch�� �ٷ� ó���Ҽ��ִ�.
//				e.printStackTrace();
//			}//end catch
		}//end if
		System.out.println("���� �߻� ��");
		
	}//useThrow
	
	public void callUseThrow() {
		try {
			useThrow();
		} catch (Exception e) {//throws �� ����ó�� Ŭ������ �״�� �ᵵ�ǰ�, �θ𿹿� ó�� Ŭ������ �����ص��ȴ�.
			System.err.println("ȣ���� ������ ���� ó�� "+e);
		}//end catch
	}//callUseThrow
	
	public static void main(String[] args) {
		UseThrow ut = new UseThrow();
		ut.callUseThrow();
	}//main

}//class
