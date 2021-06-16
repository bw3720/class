package day0201;

/**
 * �ֹι�ȣ�� �Կ��޾Ƽ� ����üũ, -�� ��ġ�� üũ, �������,����,�츦 ���ϴ� �ϵ��� ������Ŭ����<br>
 * ��üȭ�Ͽ� ���<br>
 * �Ű����� �ִ� �����ڸ� ����Ͽ� ��üȭ�� �� ���<br>
 * ��뿹)<br>
 * Work0201 ��ü�� = new Work0201("�ֹε�Ϲ�ȣ");<br>
 * ��ü��.method��(); ���� ���������� ���.
 * @author user
 *
 */
public class Work0201 {

	private String ssn;
	
	/**
	 * �Է¹��� �ֹι�ȣ�� instance variable�� �����ϴ� ������.
	 * @param ssn ������ �ֹι�ȣ.
	 */
	public Work0201(String ssn) {
		this.ssn=ssn;
	}//Work0201
	
	/**
	 * ��ü(instance)�� ������ �ִ� ��(instance variable)�� ��ȯ�ϴ� ��.
	 * @return �Էµ� �ֹι�ȣ
	 */
	public String getSsn() {
		return ssn;
	}//getSsn
	
	/////////////////////////////////
	/**
	 * instance variable�� �����Ǿ��ִ� �ֹι�ȣ�� ���̰� 14�ڸ������� üũ�ϴ� ��.
	 * @return �ֹι�ȣ ������ ���� ����
	 */
	public boolean chkSsnLength() {
		//boolean ssnFlag = false ;   //�Ʒ��� ���� �������� �ۼ� ���� 
		//if(ssn.length() ==14) {
		//	ssnFlag = true;
		//}//end if
		//return ssnFlag;
		return ssn.length()==14;
	}//chkSsnLength
	
	/**
	 * instance variable�� �����Ǿ��ִ� �ֹι�ȣ�� ������(-)�� ��Ȯ�� ��ġ�� �ִ����� üũ�ϴ� ��.
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
	 * �ֹι�ȣ���� �¾ �ظ� �����Ͽ� ��ȯ�ϴ� ��.
	 * @return �¾ ��
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
		
		return year+"��"+month+"��"+day+"��";
	}//getbirth
	
	/**
	 * �ֹι�ȣ���� ���̸� ���Ͽ� ��ȯ�ϴ� ��.
	 * @return ����
	 */
	public int getAge() {
		return 2021-getBirthYear()+1;
	}//getAge
	
	/**
	 * �ֹι�ȣ���� ������ ���Ͽ� ��ȯ�ϴ� ��.
	 * @return ����
	 */
	public String getGender() {
		String gender ="����";
		int genderFlag = ssn.charAt(7)-48;//880201-1
		if(genderFlag % 2 == 0) {
			gender = "����";
		}//end if
		
		return gender;
	}//getGender
	
	/**
	 * �ֹι�ȣ���� �츦 ���Ͽ� ��ȯ�ϴ� ��.
	 * @return ��
	 */
	public String getZodiac() {
		
		String[] zodiac = {"������","��","��","����","��","��","ȣ����","�䳢","��","��","��","��"};
		return zodiac[getBirthYear()%12];
	}//getZodiac
	
	
	
	
	
	
}//class
