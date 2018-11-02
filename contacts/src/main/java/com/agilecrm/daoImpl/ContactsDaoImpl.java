package com.agilecrm.daoImpl;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.agilecrm.bo.ContactsBO;
import com.agilecrm.dao.ContactsDao;

public class ContactsDaoImpl implements ContactsDao {

	@Override
	public List<ContactsBO> getViewEmp() {
		Statement stmt=JdbcUtils.createStatement()+;  
		ResultSet rs=stmt.executeQuery("select * from emp");  
		while(rs.next())  
		{
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); 
		ContactsBO bb=new ContactsBO();
		      
		}

}
