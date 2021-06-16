package kr.co.sist.service;

import java.util.List;

import kr.co.sist.dao.DAO;

public class MainService {
	
	public List<String> mainImgList(){
		DAO d = new DAO();
		return d.selectImg();
	}//mainImgList
	
	public List<String> noticeList(){
		DAO d = new DAO();
		return d.selectNotice();
	}//noticeList
	
}//class
