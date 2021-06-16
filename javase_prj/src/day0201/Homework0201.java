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
			return "»ý³â¿ùÀÏ : "+year+"³â "+month+"¿ù "+day+"ÀÏ";
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
				gender = "³²ÀÚ";
			}else {
				gender = "¿©ÀÚ";
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
			
			switch (Integer.parseInt(year) % 12) {//¶ì¸¦ ±¸ÇÏ·Á¸é ÅÂ¾î³­ÇØ¸¦ 12·Î ³ª´« ³ª¸ÓÁö »ç¿ë .0~11±îÁöÀÇ ¼ö ¹ß»ý.
			case 0 : return year+"³â»ý ¿ø¼þÀÌ¶ì";
			case 1 : return year+"³â»ý ´ß¶ì";
			case 2 : return year+"³â»ý °³¶ì";
			case 3 : return year+"³â»ý µÅÁö¶ì";
			case 4 : return year+"³â»ý Áã¶ì";
			case 5 : return year+"³â»ý ¼Ò¶ì";
			case 6 : return year+"³â»ý È£¶ûÀÌ¶ì";
			case 7 : return year+"³â»ý Åä³¢¶ì";
			case 8 : return year+"³â»ý ¿ë¶ì";
			case 9 : return year+"³â»ý ¹ì¶ì";
			case 10 : return year+"³â»ý ¸»¶ì";
			default : return year+"³â»ý ¾ç¶ì";
			}//end switch
			
		}//method6
		
		
}//class
