package day0201;

public class Homework0201 {

		private String personalId ;
		
		public void personalId() {
			personalId="951211-1000000";
		}
		
		
		//setter
		public void setPersonalId(String personalId) {
			this.personalId = personalId;
		}
		
		//getter
		public String getPersonalId() {
			return personalId;
		}

		public boolean method1() {
			boolean flag;
			if(personalId.length() == 14) {
				flag= true;
			}else {
				flag = false;
			}//end if
			return flag; 
		}//method1
		
		public boolean method2() {
			boolean flag1;
			if(personalId.indexOf("-") == 6) {
				 flag1 = true;
			}else {
				 flag1 = false;
			}//end if
			return flag1;
		}//method2
		
		public String method3() {
			String year = personalId.substring(0,2);
			String month = personalId.substring(2,4);
			String day = personalId.substring(4,6);
			String gender = personalId.substring(7,8);
			if (gender.equals("1") || gender.equals("2")) {
				year = "19"+year;
			}else {
				year = "20"+year;
			}//end if
			return "생년월일 : "+year+"년 "+month+"월 "+day+"일";
		}//method3
		
		public int method4() {
			int nowYear = 2021;
			String year = personalId.substring(0,2);
			String month = personalId.substring(2,4);
			String day = personalId.substring(4,6);
			String gender = personalId.substring(7,8);
			if (gender.equals("1") || gender.equals("2")) {
				year = "19"+year;
			}else {
				year = "20"+year;
			}//end if
			int nowAge= nowYear-Integer.parseInt(year)+1;
			return nowAge;
		}//method4
		
		public String method5() {
			String gender = personalId.substring(7,8);
			if (gender.equals("1") || gender.equals("3") || gender.equals("9")) {
				gender = "남자";
			}else {
				gender = "여자";
			}//end if
			return gender;
		}//method5
		
		public String method6() {
			String year = personalId.substring(0,2);
			String month = personalId.substring(2,4);
			String day = personalId.substring(4,6);
			String gender = personalId.substring(7,8);
			
			
			if (gender.equals("1") || gender.equals("2")) {
				year = "19"+year;
			}else {
				year = "20"+year;
			}//end if
			
			switch (Integer.parseInt(year) % 12) {//띠를 구하려면 태어난해를 12로 나눈 나머지 사용 .0~11까지의 수 발생.
			case 0 : return year+"년생 원숭이띠";
			case 1 : return year+"년생 닭띠";
			case 2 : return year+"년생 개띠";
			case 3 : return year+"년생 돼지띠";
			case 4 : return year+"년생 쥐띠";
			case 5 : return year+"년생 소띠";
			case 6 : return year+"년생 호랑이띠";
			case 7 : return year+"년생 토끼띠";
			case 8 : return year+"년생 용띠";
			case 9 : return year+"년생 뱀띠";
			case 10 : return year+"년생 말띠";
			default : return year+"년생 양띠";
			}//end switch
			
		}//method6
		
		
}//class
