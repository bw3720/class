package day0215;

/**
 * PersonŬ������ ��ӹ޾� ����ϴ� �ڽ�Ŭ����.
 * @author user
 */
public class UsePerson {

	public static void main(String[] args) {
		//�ڽ�Ŭ������ �����Ǹ�, �θ�Ŭ�������� �����ȴ�.
		System.out.println("---------------------------HongGilDong-----------------------------");
		HongGilDong hgd = new HongGilDong();
		//�ڽ�Ŭ������ �������� �ʴ� �ڿ��� �ڽ�Ŭ������ ��ü������ ����� �� �ִ�. - �ڵ��� ����.
		System.out.println(hgd.getEye()+"/"+hgd.getNose()+"/"+hgd.getMouth()+"/"+hgd.getName());
		hgd.setName("ȫ�浿");
		System.out.println(hgd.getEye()+"/"+hgd.getNose()+"/"+hgd.getMouth()+"/"+hgd.getName());
		
		System.out.println(hgd.eat());  //�ڵ��� ����
		System.out.println(hgd.eat("�߲��� ����", 3));  //�ڵ��� ���� X => Override�ؾߵ�.
		//�ڽ��� ���� �ڽŸ��� Ư¡(Ŭ������ ���� ȫ�浿�� ���� Ư¡.)
		System.out.println(hgd.fight(5));//�̱�°�� 6->7
		System.out.println(hgd.fight(6));//�̱�°�� 7->8
		System.out.println(hgd.fight(9));//���°�� 8->7
		System.out.println(hgd.fight(7));//���°�� 7�� ����
		
		//Ȧ�浿�� ���� ���� ���.
		System.out.println(hgd.getName()+"�� ���� ���� : "+hgd.getLevel());
		
		
		System.out.println("----------------------------Clark-----------------------------");
		Clark superman = new Clark();
		System.out.println(superman.getEye()+"/"+superman.getNose()+"/"+superman.getMouth()+"/"+superman.getName());
		superman.setName("Ŭ�� ��Ʈ");
		System.out.println(superman.getEye()+"/"+superman.getNose()+"/"+superman.getMouth()+"/"+superman.getName());
		
		System.out.println(superman.eat());  //Override�ؾߵ�.
		System.out.println(superman.eat("������ũ",20));
		
		System.out.println(superman.power("ũ���䳪��Ʈ")); //������
		System.out.println(superman.power("���̾Ƹ��")); //����
		System.out.println(superman.power("¯��")); //�� ����
		
		//instance variable�� ���� �����ڰ� public�̱� ������ getter method�� ������� �ʰ�
		//���� ������ �� �ִ�.
		System.out.println(superman.getName()+"�� ���� ���� "+superman.power);
		
		System.out.println("---------------------------HanSangMin----------------------------");
		HanSangMin hsm = new HanSangMin();
		hsm.setName("�ѻ��");
		System.out.println("�̸� : "+hsm.getName()+"\n�� :"+hsm.getEye()+"/ �� :"+hsm.getNose()+"/ �� :"+hsm.getMouth());
		
		System.out.println(hsm.eat());
		System.out.println(hsm.eat("���뱹",6000));
		
		System.out.println(hsm.figth(50));
		System.out.println(hsm.figth(100));
		System.out.println(hsm.figth(500));
		
		System.out.println("---------------------���---------------------------------");
		String[] hongLang = hgd.language();
		String[] clarkLang = superman.language();
		String[] hanLang = hsm.language();

		System.out.println(hgd.getName()+"��(��) �����Ҽ��ִ¾���");
		for(int i=0; i<hongLang.length;i++) {
			System.out.println(hongLang[i]);
		}//end for
		
		System.out.println(superman.getName()+"��(��) �����Ҽ��ִ¾���");
		//������ for��
		for(String lang : clarkLang) {
			System.out.println(lang);
		}//end for
		
		System.out.println(hsm.getName()+"��(��) �����Ҽ��ִ¾���");
		for(String lang : hanLang) {
			System.out.println(lang);
		}
		
		System.out.println("---------------------���۸��� �������� ���---------------------------------");
		System.out.println("��� :"+superman.upwardForce());
		System.out.println("������ :"+superman.drivingForce());
		
		
		
		
		
	}//main

}//class
