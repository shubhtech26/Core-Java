package jdbc;
import java.sql.*;
public class JDBC2 {
   public static void main(String[] args) throws Exception{
	
	   
	   	String url ="jdbc:mysql://localhost:3306/hello";
	   	
	   String uname="root";
	   String pass = "root";
	   	String query= "select name from employee where id =6";
	   	
	   Class.forName("com.mysql.jdbc.Driver");
	   Connection con = DriverManager.getConnection(url,uname,pass);
	   Statement st = con.createStatement();
	   ResultSet rs = st.executeQuery(query);
	   
	   rs.next();
	String nam = rs.getString("name");
	   System.out.println(nam);
	   st.close();
	   con.close();
	   
	    
	    
	   
	   
}

}
