package jdbc;
import java.sql.*;
public class jdbc3 {
   public static void main(String[] args) throws Exception
   {
	
	   
	   	String url ="jdbc:mysql://localhost:3306/hello";
	
	   String uname="root";
	   String pass = "root";
	   	String query= "select * from employee";
	   	
	   Class.forName("com.mysql.jdbc.Driver");
	   Connection con = DriverManager.getConnection(url,uname,pass);
	   Statement st = con.createStatement();
	   ResultSet rs = st.executeQuery(query);
	  
	  while ( rs.next())
	  {
		  
		  String userdata = rs.getInt(1) +" :"   + rs.getString(2) + ":" + rs .getInt(3) ;
		  System.out.println(userdata);
	   
	  }
	   st.close();
	   con.close();
	   
	    
	   /* 
	   rs.next();
	String userdata = rs.getInt(1) +" :"   + rs.getString(2) + ":" + rs .getInt(3) ;
	   System.out.println(userdata);
	   
	   if we copy the code once we will get data from second row instesd of copying we can
	   use loop 
	   */
	   
}

}
