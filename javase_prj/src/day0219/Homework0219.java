package day0219;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Homework0219 {
	
	
	
	public List<String> studentChart() {
		HwStudent Kang = new HwStudent("강인섭",25,"서울시 강남구 역삼동","남",97);
		HwStudent Kwak = new HwStudent("곽범수",27,"서울시 강남구 논현동","남",81);
		HwStudent Kwon = new HwStudent("권예원",26,"서울시 강남구 상도동","여",90);
		HwStudent Kim = new HwStudent("김덕영",30,"경기도 수원시 영통구","남",82);
		HwStudent Suk = new HwStudent("석지원",25,"인천광역시 부평구 부평동","여",88);

		List<String> list = new ArrayList<String>();
		list.add(Kang.toString());
		list.add(Kwak.toString());
		list.add(Kwon.toString());
		list.add(Kim.toString());
		list.add(Suk.toString());
		
		return list; 
	}//studentChart
	
	public void printStuChart(List<String> list) {
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i));
		}//end for
	}//printStuChart
	
	public List<String> studentChart1(List<String> list){
		List<String> list1 = new LinkedList<String>();
		list.add(0,"1"+"Kang.toString");
		
		
		return list1;
		
	}
	
	public void printStuChart1(List<String> list) {
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i));
		}//end for
	}//printStuChart
	
	

	public static void main(String[] args) {
		Homework0219 hw = new Homework0219();
		hw.printStuChart(hw.studentChart());
	}//main

}//class
