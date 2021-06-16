package day0201;

public class UseWork0201 {

	public static void main(String[] args) {
		String ssn = "880201-1234567";

		Work0201 work =new Work0201(ssn);
		//////////////////////////////////
		
		if(work.chkSsnLength()) {//주민번호의 글자수가 14인지 체크.
			if(work.chkHyphen()) {//주민번호에 -위치 체크
				System.out.println("입력주민등번호 : "+work.getSsn());
				System.out.println("생년월일 : "+work.getBirth());
				System.out.println("나이 : "+work.getAge());
				System.out.println("성별 : "+work.getGender());
				System.out.println("띠 : "+work.getZodiac());
			}else {
				System.out.println("이게 머선 129?");
			}//end else
		}else {
			System.out.println(work.getSsn()+"은(는)글자수가 맞지 않습니다. 글자수를 확인해주세요.");
		}//end else
		
		
	}//main

}//class
