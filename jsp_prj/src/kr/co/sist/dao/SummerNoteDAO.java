package kr.co.sist.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 입력값을 받아 DB에 추가
 * @author user
 */
public class SummerNoteDAO {
   public void insertFile( InterestVO iVO) throws SQLException{
      
      Connection con =null;
      PreparedStatement pstmt=null;
      
      DbConnection dc = DbConnection.getInstance();
      
      try {
      //1. JNDI사용 객체를 생성.
      //2. DBCP에서 DB연결객체를 얻기.
      //3. DB연결 객체에서 Connection을 얻기
         con=dc.getConn();
      //4. 쿼리문 생성객체 얻기
         String insertFile="insert into test_file(num,name,text2) values(seq_file.nextval,?,?)";
         pstmt=con.prepareStatement(insertFile);
      //varchar2나 clob을 insert 할 때에는 setString()으로 처리한다
      //5. 바인드 변수에 값 설정.
         pstmt.setString(1, iVO.getName());
         pstmt.setString(2, iVO.getInterest());//clob
      //6. 쿼리문 수행.
         pstmt.executeUpdate();
      } finally {
         //7. 연결끊기
         dc.dbClose(con, pstmt, null);
      }//end finally
      
   }//insertFile
   
   public InterestVO selectFile(int num) throws SQLException{
      InterestVO iVO=null;
      
      Connection con=null;
      PreparedStatement pstmt=null;
      ResultSet rs=null; //조회해서 값 얻기위한 것
      
      BufferedReader br=null;
      
      DbConnection dc=DbConnection.getInstance();
      
      try {
      //1. JNDI사용 객체를 생성.
      //2. DBCP에서 DB연결객체를 얻기.
      //3. DB연결 객체에서 Connection을 얻기
    	  con=dc.getConn();
      //4. 쿼리문 생성객체 얻기
    	  String selectFile="select name, text2 from test_file where num=?";
    	  pstmt=con.prepareStatement(selectFile);
      //5. 바인드 변수에 값 설정.
    	  pstmt.setInt(1, num);
      //6. 쿼리문 수행.
    	  rs=pstmt.executeQuery();
    	  if(rs.next()) {//입력된 num으로 조회된 결과 있음
    		  iVO=new InterestVO();
    		  iVO.setName(rs.getString("name"));
      	//Clob는 별도의 Stream을 사용하여 읽어 들인다.
    		  Clob clob=rs.getClob("text2");
    		  if(clob!=null) {
    		  br=new BufferedReader(rs.getClob("text2").getCharacterStream());
    		  try {
    			  String temp="";
    			  StringBuilder sbFileData=new StringBuilder();
    			  while((temp=br.readLine())!=null) {//\n 기준으로 읽어들인다.
    				  sbFileData.append(temp);
    				  
    			  }//end while
    			  iVO.setInterest(sbFileData.toString());
    			  //글을 읽어들인다음 읽어들인 스트림을 끊는다.
    			  if(br!=null) {br.close();}//end if
    			  
    		  }catch(IOException ie){
    			  ie.printStackTrace();
    		  }//end catch
    		  }//end if
    	  }//end if
      }finally {
      //7. 연결끊기
    	  dc.dbClose(con, pstmt, rs);
      }//end finally     
      return iVO;
   }//selectFile
   
   
}//class