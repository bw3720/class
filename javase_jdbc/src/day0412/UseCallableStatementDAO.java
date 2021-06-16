package day0412;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.dao.DbConnection;
import oracle.jdbc.OracleTypes;

public class UseCallableStatementDAO {

   private static UseCallableStatementDAO ucsDAO;

   private UseCallableStatementDAO() {
   }

   public String insertCpEmp4(CpEmp4VO ceVO) throws SQLException {
      Connection con = null;
      CallableStatement cstmt = null;
      DbConnection dc = DbConnection.getInstance();

      // 1.����̹� �ε�
      try {
         // 2.Ŀ�ؼ� ���
         con = dc.getConnection();
         // 3.���ν����� ȣ���� �� �ִ� ������ ������ü ���
         cstmt = con.prepareCall("{call proc_insert(?,?,?,?,?,?)}");
         // 4.���ε� ������ �� ����.
         // in
         cstmt.setInt(1, ceVO.getEmpno());
         cstmt.setString(2, ceVO.getEname());
         cstmt.setInt(3, ceVO.getDeptno());
         cstmt.setString(4, ceVO.getJob());
         // out
         cstmt.registerOutParameter(5, Types.NUMERIC);
         cstmt.registerOutParameter(6, Types.VARCHAR);
         // 5.���ν��� ����
         cstmt.execute();
         // 6.out parameter�� ������ �� �ޱ�.
         int num = cstmt.getInt(5);
         String msg = cstmt.getString(6);
         return msg;
      } finally {
         // 7.���� ����
         dc.close(null, cstmt, con);
      }
   }

   public String updateCpEmp(CpEmpModifyVO cemVO) throws SQLException {
      String result = "";

      Connection con = null;
      CallableStatement cstmt = null;

      DbConnection dc = DbConnection.getInstance();

      // 1.
      try {

         // 2.
         con = dc.getConnection();
         // 3.
         cstmt = con.prepareCall("{call proc_update(?, ?, ?, ?, ?)}");
         // 4. ���ε庯�� �� �Ҵ�
         // in
         cstmt.setInt(1, cemVO.getEmpno());
         cstmt.setString(2, cemVO.getJob());
         cstmt.setInt(3, cemVO.getDeptno());

         // out
         cstmt.registerOutParameter(4, Types.NUMERIC);
         cstmt.registerOutParameter(5, Types.VARCHAR);

         // 5. ���ν��� ����
         cstmt.execute();

         // 6. out parameter ��
         int cnt = cstmt.getInt(4);
         result = cstmt.getString(5);
         System.out.println(cnt);
         // 7. ���� ����
      } finally {
         dc.close(null, cstmt, con);
      } // end finally

      return result;
   }// updateCpEmp4

   public String deleteCpEmp(int empno) throws SQLException {
      String result = "";

      Connection con = null;
      CallableStatement cstmt = null;

      DbConnection dc = DbConnection.getInstance();

      try {
         con = dc.getConnection();

         cstmt = con.prepareCall("{call proc_delete(?, ?, ?)}");

         cstmt.setInt(1, empno);

         cstmt.registerOutParameter(2, Types.NUMERIC);
         cstmt.registerOutParameter(3, Types.VARCHAR);

         cstmt.execute();

         System.out.println(cstmt.getInt(2));
         result = cstmt.getString(3);

      } finally {
         dc.close(null, cstmt, con);
      } // end finally

      return result;
   }// deleteCpEmp

   public List<ZipcodeVO> selectZipcode(String dong) throws SQLException {
      List<ZipcodeVO> list = new ArrayList<ZipcodeVO>();
      Connection con = null;
      CallableStatement cstmt = null;
      ResultSet rs = null;
      ZipcodeVO zVO = null;
      DbConnection dc = DbConnection.getInstance();

      // 1.
      try {
         // 2.
         con = dc.getConnection();
         // 3.
         cstmt = con.prepareCall("{call proc_zipcode(?,?)}");
         // 4.
         // in
         cstmt.setString(1, dong);
         // out : OracleTypes.cursor ���.
//         cstmt.registerOutParameter(2, Types.REF_CURSOR);
         cstmt.registerOutParameter(2, OracleTypes.CURSOR);
         // 5.
         cstmt.execute();
         // 6.
         rs = (ResultSet) cstmt.getObject(2);

         while (rs.next()) {
            zVO = new ZipcodeVO(rs.getString("zipcode"), rs.getString("sido"), rs.getString("gugun"),
                  rs.getString("dong"), rs.getString("bunji"));
            list.add(zVO);
         }

      } finally {
         // 7.
         dc.close(rs, cstmt, con);
      }

      return list;
   }

   public static UseCallableStatementDAO getInstance() {
      if (ucsDAO == null) {
         ucsDAO = new UseCallableStatementDAO();
      }
      return ucsDAO;
   }

   public static void main(String[] args) {
      try {
         new UseCallableStatementDAO().selectZipcode("�󵵵�");
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}