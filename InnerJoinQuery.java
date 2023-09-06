package EY3108;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InnerJoinQuery {
	static {
		 try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	        }catch(ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	public static void main(String[] args) {
		Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;      
        try {
            String dbURL = "jdbc:mysql://localhost:3306/hplus?user=root&password=root";
            conn = DriverManager.getConnection(dbURL);
            if(conn != null) {
                System.out.println("Connection establised using connection conn");
            }
            
            String query="SELECT * FROM emp_tab INNER JOIN dept_table WHERE emp_tab.deptno=dept_table.deptno";
            ps=conn.prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()) {
   System.out.println((rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getDate(5)+"\t"+rs.getInt(6)+"\t"+rs.getInt(7)+"\t"+rs.getInt(8)+"\t"+rs.getInt(9)+"\t"+rs.getString(10)+"\t"+rs.getInt(11)+"\t"+rs.getInt(12)));
            }
        }catch(Exception e) {
    		e.printStackTrace();
    	}
        System.out.println("END OF THE PROGRAM");

	}

}
