package day0408;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class hw0408 {
	
	public List<hwCarVO> searchCountry(String country) throws SQLException {
		List<hwCarVO> list = new ArrayList<hwCarVO>();
		hwCarVO hcVO=null;
		
		//1. 드라이버 로딩
			try {
				Class.forName("oracle.jdbc.OracleDriver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}//end catch
			
			Connection con = null;
			Statement stmt = null;
			ResultSet rs = null;
			
		//2. 커넥션 얻기
			try {
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String pass = "tiger";
			
				con = DriverManager.getConnection(url, id, pass); 
		//3. 쿼리문 생성 객체 얻기
				stmt = con.createStatement();
				
				StringBuilder searchCct = new StringBuilder();
				/*
				 * select maker, model, substr(car_option,1,instr(car_option,',')-1) car_option, price, hiredate
				   from (select cma.maker, cmo.model, car_option, price, hiredate, row_number()over(order by HIREDATE desc) flag_num
		 				 from   car_country cco, car_maker cma, car_model cmo
		 				 where  (cma.maker = cco.maker and cmo.model = cma.model) and cco.country = '국산')
				   where flag_num between 1 and 10;

				 */
				searchCct.append("select maker, model, substr(car_option,1,instr(car_option,',')-1) carOption, price, hiredate "
						+ " from (select cma.maker, cmo.model, car_option, price, hiredate, row_number()over(order by HIREDATE desc) flag_num "
							  + " from   car_country cco, car_maker cma, car_model cmo "
							  + " where  (cma.maker = cco.maker and cmo.model = cma.model) and cco.country = '").append(country)
				.append("') where flag_num between 1 and 10");
				
				rs = stmt.executeQuery(searchCct.toString());
				
				
				while(rs.next()) {//조회된 레코드가 존재할 때.
					hcVO = new hwCarVO(rs.getString("maker"), rs.getString("model"), rs.getString("carOption"),rs.getInt("price"), rs.getDate("hiredate"));
					list.add(hcVO);
				}//end while
				
			}finally {
				if (con != null) {con.close();}
				if (stmt != null) {stmt.close();}
				if (rs != null) {rs.close();}
			}//end finally
			
			return list;	
	}//searchCountry
		
		

}//class
