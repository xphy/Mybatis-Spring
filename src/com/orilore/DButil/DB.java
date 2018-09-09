package com.orilore.DButil;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DB {
   public static SqlSession getSession() {
	   SqlSession session =null;
	   try {
		  Reader reader =Resources.getResourceAsReader("Configuration.xml");
	      SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
	       session = factory.openSession();
	   } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return session;
	   
   }
}
