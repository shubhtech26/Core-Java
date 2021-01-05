package jdbc;
	import java.sql.*;
	public class jdbc4 {
	   public static void main(String[] args) throws Exception{
		
		  
		   	String url ="jdbc:mysql://localhost:3306/hello";
		   	
		   String uname="root";
		   String pass = "root";
		   int id =10;
		   String name ="shubhpriyo";
		   	int income =1826;
		   	String query= " insert into employee values ( ?,?,?)";
		   	
		   Class.forName("com.mysql.jdbc.Driver");
		   Connection con = DriverManager.getConnection(url,uname,pass);
		 PreparedStatement st = con.prepareStatement(query);
		 st.setInt(1, id);
		 st.setString(2, name);
		 st.setInt(3,income);
		   
	int count= st.executeUpdate();	   
		System.out.print(count  + "row affected");  
	
		   st.close();
		   con.close();
		   
		    
		    
		   
		   
	}

	}



