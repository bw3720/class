package kr.co.sist.dao;

import java.util.ArrayList;
import java.util.List;

public class DAO {
	
	public List<String> selectImg(){
		List<String> imgList= new ArrayList<String>();
		
		imgList.add("img1.png");
		imgList.add("img2.png");
		imgList.add("img3.png");
		imgList.add("img4.png");
		
		
		
		return imgList;
	}//selectImg
	public List<String> selectNotice(){
		List<String> noticeList= new ArrayList<String>();
		
		noticeList.add("�Ͽ��� ���⳪��");
		noticeList.add("����ϱ����� �۾��ϼ���");
		noticeList.add("���� �۵θ��� �ٲٽ�?");
		noticeList.add("123123");
		
		
		
		return noticeList;
	}//selectImg
}
