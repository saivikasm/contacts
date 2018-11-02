package com.agilecrm.utilis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcUtils {
	
static	Connection con=null;
public static Connection jdbcConnection() throws Exception
{ 
		Class.forName("com.mysql.jdbc.Driver");
		//useSSL=false
		 con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/agile_crm","root","root123");  
		 return con;
		//here sonoo is database name, root is username and password  
		/*Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from emp");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		con.close(); */
		 
		  
}
}

