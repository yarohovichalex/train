package by.htp.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.htp.bean.Book;
import by.htp.dao.BaseDaoImpl;

public class OutputBookDaoImpl extends BaseDaoImpl{
	private static final String url = "jdbc:mysql://localhost/logindb?"
			+ "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode"
			+ "=false&serverTimezone=UTC&useSSL=false";
	List<Book> list = new ArrayList<>();
	public List<Book> outputBook() {
	list.clear();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");			
	} catch (ClassNotFoundException e1) {			
		e1.printStackTrace();
	}	
	try(Connection cn = DriverManager.getConnection(url,"root","root")){
		Statement st = cn.createStatement();
		ResultSet rs = st.executeQuery("select * from book;");
		
		while(rs.next()) {				
			list.add(new Book(rs.getString("nameBook"), rs.getString("nameAuthor"), rs.getInt("publishYear"), rs.getInt("id")));				
			System.out.println(rs.getString("nameBook"));
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}	
	return list;
}
}
