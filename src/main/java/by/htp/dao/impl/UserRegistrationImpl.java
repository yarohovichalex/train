package by.htp.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import by.htp.bean.User;
import by.htp.dao.BaseDaoImpl;

public class UserRegistrationImpl extends BaseDaoImpl {
	
	private static final String URL = "jdbc:mysql://localhost/logindb?"
			+ "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode"
			+ "=false&serverTimezone=UTC&useSSL=false";

	public User searchUser(String login, String password) {
		User us = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			
		} catch (ClassNotFoundException e1) {			
			e1.printStackTrace();
		}
		
		try(Connection cn = DriverManager.getConnection(URL,"root","root")){
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from user");
			
			while(rs.next()) {
				if (rs.getString("login").equals(login) && rs.getString("login").equals(password)) {
					us = new User();
					us.setLogin(rs.getString("login"));
					us.setPassword(rs.getString("password"));
					us.setRole(rs.getString("role"));
	                System.out.println("успешно нашел, имя:" + rs.getString("login") + " роль: " + rs.getString("role"));
	            }
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}		
		return us;		
	}
}
