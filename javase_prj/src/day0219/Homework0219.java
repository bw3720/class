package day0219;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Homework0219 {
	
	
	
	public List<String> studentChart() {
		HwStudent Kang = new HwStudent("���μ�",25,"����� ������ ���ﵿ","��",97);
		HwStudent Kwak = new HwStudent("������",27,"����� ������ ������","��",81);
		HwStudent Kwon = new HwStudent("�ǿ���",26,"����� ������ �󵵵�","��",90);
		HwStudent Kim = new HwStudent("�����",30,"��⵵ ������ ���뱸","��",82);
		HwStudent Suk = new HwStudent("������",25,"��õ������ ���� ����","��",88);

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
