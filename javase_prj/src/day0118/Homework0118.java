package day0118;
class Homework0118 {
	public static final int ONE_DAY_MONEY = 20000;
	public static void main(String[] args) {
		int transportationCost = 4000;
		int roundTripCost = (transportationCost * 2);
		int lunchCost = 6000;
		System.out.println("�Ϸ�뵷"+ONE_DAY_MONEY+"�� "+"����� "+transportationCost+"�� "+"�պ����� "+roundTripCost
			+"���ɰ�"+lunchCost+"�� ���� ����"+(ONE_DAY_MONEY - roundTripCost - lunchCost)+ "�Դϴ�.");
	}
}
