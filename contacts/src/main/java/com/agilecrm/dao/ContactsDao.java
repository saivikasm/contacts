package com.agilecrm.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.agilecrm.bo.ContactsBO;

public interface ContactsDao {
	

	public  List<ContactsBO> getViewEmp();
	
}
