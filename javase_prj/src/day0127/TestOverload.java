package day0127;

/**
 *適掘什拭辞 旭精 戚硯税 method研 食君鯵 幻級呪 赤澗 overload税 紫遂.<br>
 *鋭帳) 羨悦走舛切人 鋼発莫精 含虞亀 鞠壱<br>
 *		method誤精 旭焼醤馬壱<br>
 *		古鯵痕呪澗 鋼球獣 含虞醤 廃陥.<br>
 * @author user
 */
public class TestOverload {
	
	/**
	 * 紺 廃鯵研 窒径馬澗析.
	 */
	public void printStar() {
		System.out.println("』");
	}//printStar
	
	/**
	 * 脊径閤精 呪企稽 紺聖 窒径馬澗 析.
	 * method Overload(Overloading)
	 */
	public void printStar(int count) {
		for(int i=0; i<count;i++) {
			System.out.print("【");
		}
	}//printStar
	
	
	
	public static void main(String[] args) {
		TestOverload to = new TestOverload();
		to.printStar();//壱舛析.(鋼発莫 蒸壱, 古鯵痕呪 蒸澗 莫)
		to.printStar(2);//亜痕 析.(鋼発莫 蒸壱, 古鯵痕呪 赤澗 莫)
		
		/*
		 * Overload吉 printStar method研 紫遂馬食 焼掘人 旭精 莫殿稽 窒径
		 *  け
		 *  けけ
		 *  けけけ
		 *  けけけけ
		 * */
		for(int i=0;i<5;i++) {
			to.printStar(i);
			System.out.println();
		}//end for
		
		
	}//main

}//class
