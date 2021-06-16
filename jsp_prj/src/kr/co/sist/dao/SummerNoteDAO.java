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
 * �Է°��� �޾� DB�� �߰�
 * @author user
 */
public class SummerNoteDAO {
   public void insertFile( InterestVO iVO) throws SQLException{
      
      Connection con =null;
      PreparedStatement pstmt=null;
      
      DbConnection dc = DbConnection.getInstance();
      
      try {
      //1. JNDI��� ��ü�� ����.
      //2. DBCP���� DB���ᰴü�� ���.
      //3. DB���� ��ü���� Connection�� ���
         con=dc.getConn();
      //4. ������ ������ü ���
         String insertFile="insert into test_file(num,name,text2) values(seq_file.nextval,?,?)";
         pstmt=con.prepareStatement(insertFile);
      //varchar2�� clob�� insert �� ������ setString()���� ó���Ѵ�
      //5. ���ε� ������ �� ����.
         pstmt.setString(1, iVO.getName());
         pstmt.setString(2, iVO.getInterest());//clob
      //6. ������ ����.
         pstmt.executeUpdate();
      } finally {
         //7. �������
         dc.dbClose(con, pstmt, null);
      }//end finally
      
   }//insertFile
   
   public InterestVO selectFile(int num) throws SQLException{
      InterestVO iVO=null;
      
      Connection con=null;
      PreparedStatement pstmt=null;
      ResultSet rs=null; //��ȸ�ؼ� �� ������� ��
      
      BufferedReader br=null;
      
      DbConnection dc=DbConnection.getInstance();
      
      try {
      //1. JNDI��� ��ü�� ����.
      //2. DBCP���� DB���ᰴü�� ���.
      //3. DB���� ��ü���� Connection�� ���
    	  con=dc.getConn();
      //4. ������ ������ü ���
    	  String selectFile="select name, text2 from test_file where num=?";
    	  pstmt=con.prepareStatement(selectFile);
      //5. ���ε� ������ �� ����.
    	  pstmt.setInt(1, num);
      //6. ������ ����.
    	  rs=pstmt.executeQuery();
    	  if(rs.next()) {//�Էµ� num���� ��ȸ�� ��� ����
    		  iVO=new InterestVO();
    		  iVO.setName(rs.getString("name"));
      	//Clob�� ������ Stream�� ����Ͽ� �о� ���δ�.
    		  Clob clob=rs.getClob("text2");
    		  if(clob!=null) {
    		  br=new BufferedReader(rs.getClob("text2").getCharacterStream());
    		  try {
    			  String temp="";
    			  StringBuilder sbFileData=new StringBuilder();
    			  while((temp=br.readLine())!=null) {//\n �������� �о���δ�.
    				  sbFileData.append(temp);
    				  
    			  }//end while
    			  iVO.setInterest(sbFileData.toString());
    			  //���� �о���δ��� �о���� ��Ʈ���� ���´�.
    			  if(br!=null) {br.close();}//end if
    			  
    		  }catch(IOException ie){
    			  ie.printStackTrace();
    		  }//end catch
    		  }//end if
    	  }//end if
      }finally {
      //7. �������
    	  dc.dbClose(con, pstmt, rs);
      }//end finally     
      return iVO;
   }//selectFile
   
   
}//class