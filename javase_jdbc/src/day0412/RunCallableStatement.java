package day0412;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import static java.lang.Integer.parseInt;

public class RunCallableStatement {

   public void addCpEmp() {
      String inputData = JOptionPane.showInputDialog("�����ȣ,�����,�μ���ȣ,������ �Է��ϼ���.");
      String[] data = inputData.split(",");
      UseCallableStatementDAO ucsDAO = UseCallableStatementDAO.getInstance();
      try {
         String msg = ucsDAO.insertCpEmp4(new CpEmp4VO(parseInt(data[0]), data[1], parseInt(data[2]), data[3]));
         JOptionPane.showMessageDialog(null, msg);
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }

   public void modifyCpEmp() {
      String inputData = JOptionPane.showInputDialog("����\n�����ȣ, �μ���ȣ, ���� �Է�");
      String[] data = inputData.split(",");

      UseCallableStatementDAO ucsDAO = UseCallableStatementDAO.getInstance();
      try {
         String msg = ucsDAO.updateCpEmp(new CpEmpModifyVO(parseInt(data[0]), data[2], parseInt(data[1])));
         JOptionPane.showMessageDialog(null, msg);

      } catch (SQLException e) {
         e.printStackTrace();
      } // end catch
   }// modifyCpEmp

   public void removeCpEmp() {
      String inputData = JOptionPane.showInputDialog("����\n�����ȣ �Է�");

      UseCallableStatementDAO ucsDAO = UseCallableStatementDAO.getInstance();
      try {
         String msg = ucsDAO.deleteCpEmp(parseInt(inputData));
         JOptionPane.showMessageDialog(null, msg);

      } catch (SQLException e) {
         e.printStackTrace();
      } // end catch
   }

   public void searchZipcode() {
      String inputData = JOptionPane.showInputDialog("�����ȣ��ȸ\n���� �Է��ϼ���.");
      List<ZipcodeVO> list = new ArrayList<ZipcodeVO>();
      StringBuilder zipOutput = new StringBuilder();
      UseCallableStatementDAO ucsDAO = UseCallableStatementDAO.getInstance();
      try {
         list = ucsDAO.selectZipcode(inputData);
         zipOutput.append(inputData).append("�� �˻����\n").append("-----------------------------------------------\n")
               .append("�����ȣ\t�ּ�\n").append("-----------------------------------------------\n");
         if (list.isEmpty()) {
            zipOutput.append("�˻� ����� �������� �ʽ��ϴ�.\n�� �̸��� Ȯ���ϼ���");
         }
         for (ZipcodeVO zVO : list) {
            zipOutput.append(zVO.getZipcode()).append("\t").append(zVO.getSido()).append(" ").append(zVO.getGugun())
                  .append(" ").append(zVO.getDong()).append(" ").append(zVO.getBunji()).append("\n");
         }
         JTextArea jta = new JTextArea(zipOutput.toString(), 10, 60);
         JScrollPane jsp = new JScrollPane(jta);
         
         JOptionPane.showMessageDialog(null, jsp);
         
      } catch (SQLException e) {
         e.printStackTrace();
      } // end catch

   }
   
   

   public static void main(String[] args) {
      RunCallableStatement rcs = new RunCallableStatement();
//      rcs.addCpEmp();
//      rcs.modifyCpEmp();
      rcs.removeCpEmp();
//      rcs.searchZipcode();
   }
}