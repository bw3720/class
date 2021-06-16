package day0215;

/**
 * Person클래스를 상속받아 사용하는 자식클래스.
 * @author user
 */
public class UsePerson {

	public static void main(String[] args) {
		//자식클래스가 생성되면, 부모클래스부터 생성된다.
		System.out.println("---------------------------HongGilDong-----------------------------");
		HongGilDong hgd = new HongGilDong();
		//자식클래스에 존재하지 않는 자원을 자식클래스의 객체명으로 사용할 수 있다. - 코드의 재사용.
		System.out.println(hgd.getEye()+"/"+hgd.getNose()+"/"+hgd.getMouth()+"/"+hgd.getName());
		hgd.setName("홍길동");
		System.out.println(hgd.getEye()+"/"+hgd.getNose()+"/"+hgd.getMouth()+"/"+hgd.getName());
		
		System.out.println(hgd.eat());  //코드의 재사용
		System.out.println(hgd.eat("뜨끈한 국밥", 3));  //코드의 재사용 X => Override해야됨.
		//자식이 가진 자신만의 특징(클락에는 없고 홍길동만 가진 특징.)
		System.out.println(hgd.fight(5));//이기는경우 6->7
		System.out.println(hgd.fight(6));//이기는경우 7->8
		System.out.println(hgd.fight(9));//지는경우 8->7
		System.out.println(hgd.fight(7));//비기는경우 7로 유지
		
		//홀길동의 현재 레벨 출력.
		System.out.println(hgd.getName()+"의 현재 레벨 : "+hgd.getLevel());
		
		
		System.out.println("----------------------------Clark-----------------------------");
		Clark superman = new Clark();
		System.out.println(superman.getEye()+"/"+superman.getNose()+"/"+superman.getMouth()+"/"+superman.getName());
		superman.setName("클락 켄트");
		System.out.println(superman.getEye()+"/"+superman.getNose()+"/"+superman.getMouth()+"/"+superman.getName());
		
		System.out.println(superman.eat());  //Override해야됨.
		System.out.println(superman.eat("스테이크",20));
		
		System.out.println(superman.power("크립토나이트")); //힘빠짐
		System.out.println(superman.power("다이아몬드")); //ㄱㅅ
		System.out.println(superman.power("짱돌")); //힘 폭발
		
		//instance variable의 접근 지정자가 public이기 때문에 getter method를 사용하지 않고
		//직접 접근할 수 있다.
		System.out.println(superman.getName()+"의 현재 힘은 "+superman.power);
		
		System.out.println("---------------------------HanSangMin----------------------------");
		HanSangMin hsm = new HanSangMin();
		hsm.setName("한상민");
		System.out.println("이름 : "+hsm.getName()+"\n눈 :"+hsm.getEye()+"/ 코 :"+hsm.getNose()+"/ 입 :"+hsm.getMouth());
		
		System.out.println(hsm.eat());
		System.out.println(hsm.eat("순대국",6000));
		
		System.out.println(hsm.figth(50));
		System.out.println(hsm.figth(100));
		System.out.println(hsm.figth(500));
		
		System.out.println("---------------------언어---------------------------------");
		String[] hongLang = hgd.language();
		String[] clarkLang = superman.language();
		String[] hanLang = hsm.language();

		System.out.println(hgd.getName()+"이(가) 구사할수있는언어는");
		for(int i=0; i<hongLang.length;i++) {
			System.out.println(hongLang[i]);
		}//end for
		
		System.out.println(superman.getName()+"이(가) 구사할수있는언어는");
		//개선된 for문
		for(String lang : clarkLang) {
			System.out.println(lang);
		}//end for
		
		System.out.println(hsm.getName()+"이(가) 구사할수있는언어는");
		for(String lang : hanLang) {
			System.out.println(lang);
		}
		
		System.out.println("---------------------슈퍼맨의 날기위한 기능---------------------------------");
		System.out.println("양력 :"+superman.upwardForce());
		System.out.println("추진력 :"+superman.drivingForce());
		
		
		
		
		
	}//main

}//class
