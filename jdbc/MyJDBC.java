package jdbc;
import java.sql.*;

public class MyJDBC {
	public static void main(String[] args) 
throws Exception // if there is exception i will not handle
	{
		// load driver class from the JAR file
		Class.forName("com.mysql.jdbc.Driver"); // com.mysql.cj.jdbc.Driver for MySQL 8 and later
		
		// get object of Connection interface
		Connection co = DriverManager.getConnection
		("jdbc:mysql://localhost:3306/hello", "root", "root");
		
		// get object of Statement
		Statement st = co.createStatement();
		
		st.executeUpdate("create table employee1(id integer, name varchar(100),income integer)");
		// execute SQL query using method executeUpdate()
		st.executeUpdate("insert into employee1 values('6','raj','1000')");
		
		// close connection
		co.close();
		
		System.out.println("OK");
	}
}
