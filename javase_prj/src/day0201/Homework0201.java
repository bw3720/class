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
			return "������� : "+year+"�� "+month+"�� "+day+"��";
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
				gender = "����";
			}else {
				gender = "����";
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
			
			switch (Integer.parseInt(year) % 12) {//�츦 ���Ϸ��� �¾�ظ� 12�� ���� ������ ��� .0~11������ �� �߻�.
			case 0 : return year+"��� �����̶�";
			case 1 : return year+"��� �߶�";
			case 2 : return year+"��� ����";
			case 3 : return year+"��� ������";
			case 4 : return year+"��� ���";
			case 5 : return year+"��� �Ҷ�";
			case 6 : return year+"��� ȣ���̶�";
			case 7 : return year+"��� �䳢��";
			case 8 : return year+"��� ���";
			case 9 : return year+"��� ���";
			case 10 : return year+"��� ����";
			default : return year+"��� ���";
			}//end switch
			
		}//method6
		
		
}//class
