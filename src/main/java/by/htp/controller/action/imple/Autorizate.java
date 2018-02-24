package by.htp.controller.action.imple;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.bean.User;
import by.htp.controller.action.BaseAction;
import by.htp.dao.BaseDaoImpl;
import by.htp.dao.impl.UserRegistrationImpl;

public class Autorizate implements BaseAction{
	 private User us = null;
	 private String pageUser = "/user.jsp";
	 private String pageAdmin = "/admin.jsp";
	 private String pageError = "/error.jsp";

	@Override
	public String todoAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String pass = request.getParameter("password");
		BaseDaoImpl dao = new UserRegistrationImpl();
		RequestDispatcher dispatcher = null;
		
		
		us = dao.searchUser(login, pass);
		
		if(us !=null && us.getRole().equals("user")) {
			dispatcher = request.getRequestDispatcher(pageUser);
			dispatcher.forward(request, response);		
			
		}else if(us !=null && us.getRole().equals("admin")){
			System.out.println("admin");
			dispatcher = request.getRequestDispatcher(pageAdmin);
			dispatcher.forward(request, response);
							
		}else {
			System.out.println("error");
			dispatcher = request.getRequestDispatcher(pageError);
			dispatcher.forward(request, response);
							
		}
		

		return null;
	}

	

}
