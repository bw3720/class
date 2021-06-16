package day0201;

/**
 * 주민번호를 입역받아서 길이체크, -의 위치를 체크, 생년원일,나이,띠를 구하는 일들을 구현한클래스<br>
 * 객체화하여 사용<br>
 * 매개변수 있는 생성자를 사용하여 객체화한 후 사용<br>
 * 사용예)<br>
 * Work0201 객체명 = new Work0201("주민등록번호");<br>
 * 객체명.method명(); 으로 구현된일을 사용.
 * @author user
 *
 */
public class Work0201 {

	private String ssn;
	
	/**
	 * 입력받은 주민번호를 instance variable에 설정하는 생성자.
	 * @param ssn 설정할 주민번호.
	 */
	public Work0201(String ssn) {
		this.ssn=ssn;
	}//Work0201
	
	/**
	 * 객체(instance)가 가지고 있는 값(instance variable)을 반환하는 일.
	 * @return 입력된 주민번호
	 */
	public String getSsn() {
		return ssn;
	}//getSsn
	
	/////////////////////////////////
	/**
	 * instance variable에 설정되어있는 주민번호의 길이가 14자리인지를 체크하는 일.
	 * @return 주민번호 길이의 가부 판정
	 */
	public boolean chkSsnLength() {
		//boolean ssnFlag = false ;   //아래와 같이 간단히도 작성 가능 
		//if(ssn.length() ==14) {
		//	ssnFlag = true;
		//}//end if
		//return ssnFlag;
		return ssn.length()==14;
	}//chkSsnLength
	
	/**
	 * instance variable에 설정되어있는 주민번호에 하이픈(-)이 정확한 위치에 있는지를 체크하는 일.
	 * @return
	 */
	public boolean chkHyphen() {
		//boolean hyphenFlag = false;
		//if(ssn.indexOf("-")==6) {
		//	hyphenFlag true;
		//}else {
		//	hyphenFlag false;
		//}//end else
		//return hyphenFlag;
		return ssn.indexOf("-") == 6;
	}//chkHyphen
	
	/**
	 * 주민번호에서 태어난 해를 연산하여 반환하는 일.
	 * @return 태어난 해
	 */
	private int getBirthYear() {
		
		int birth = 0;
		
		int tempYear =1800;
		int ssnYear = Integer.parseInt(ssn.substring(0, 2));
		int genderFlag = ssn.charAt(7)-48;//880201-1
		
		if(genderFlag ==1 || genderFlag==2 || genderFlag == 5 ||genderFlag == 6) {
			tempYear =1900;
		}else if(genderFlag ==3 || genderFlag==4 || genderFlag == 7 ||genderFlag == 9) {
			tempYear = 2000;
		}//end if
		
		birth=tempYear+ssnYear;
		
		return birth;
	}//getBirthYear
	
	public String getBirth() {
		int year = getBirthYear();
		String month = ssn.substring(2,4);
		String day = ssn.substring(4,6);
		
		return year+"년"+month+"월"+day+"일";
	}//getbirth
	
	/**
	 * 주민번호에서 나이를 구하여 반환하는 일.
	 * @return 나이
	 */
	public int getAge() {
		return 2021-getBirthYear()+1;
	}//getAge
	
	/**
	 * 주민번호에서 성별을 구하여 반환하는 일.
	 * @return 성별
	 */
	public String getGender() {
		String gender ="남자";
		int genderFlag = ssn.charAt(7)-48;//880201-1
		if(genderFlag % 2 == 0) {
			gender = "여자";
		}//end if
		
		return gender;
	}//getGender
	
	/**
	 * 주민번호에서 띠를 구하여 반환하는 일.
	 * @return 띠
	 */
	public String getZodiac() {
		
		String[] zodiac = {"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
		return zodiac[getBirthYear()%12];
	}//getZodiac
	
	
	
	
	
	
}//class
