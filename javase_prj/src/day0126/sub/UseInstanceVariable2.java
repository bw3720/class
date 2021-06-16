package day0126.sub;

import day0126.UseAccessModifier;

/**
 * �ٸ� ��Ű���� �ٸ� Ŭ������ ��ӹް�, �θ� Ŭ������  �����ϴ� instance variable�� ���.<br>
 * �θ�Ŭ����(UseAccessModifier), �ڽ�Ŭ����(UseIstanceValue)<br>
 * ��Ӱ����϶����� �ڽ�Ŭ������ ��üȭ�� �ؾ� �θ�Ŭ������ ������ method�� ��� �� ����� �� �ִ�.
 * @author user
 */
public class UseInstanceVariable2 extends UseAccessModifier{

	public static void main(String[] args) {
		//1.�ڽ� class�� ��üȭ.( Ŭ������ ��ü�� = new Ŭ������(); )
		UseInstanceVariable2 uiv = new UseInstanceVariable2();
		
		//�θ�Ŭ������ public,protected ���� �����ڴ� �ٸ� ��Ű���� �ٸ� Ŭ�������� ��밡��.
		//2.������ ���.
		System.out.println("public :a "+uiv.a);
		System.out.println("protected :b "+uiv.b);
//		System.out.println("default :c "+uiv.c);
//		System.out.println("private :d "+uiv.d);
		
	}//main

}//class