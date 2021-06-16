package day0118;
class Homework0118 {
	public static final int ONE_DAY_MONEY = 20000;
	public static void main(String[] args) {
		int transportationCost = 4000;
		int roundTripCost = (transportationCost * 2);
		int lunchCost = 6000;
		System.out.println("하루용돈"+ONE_DAY_MONEY+"원 "+"교통비 "+transportationCost+"원 "+"왕복차비 "+roundTripCost
			+"점심값"+lunchCost+"원 남은 돈은"+(ONE_DAY_MONEY - roundTripCost - lunchCost)+ "입니다.");
	}
}
