package by.htp.controller.action.imple;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.bean.Book;
import by.htp.controller.action.BaseAction;
import by.htp.dao.BaseDaoImpl;
import by.htp.dao.impl.OutputBookDaoImpl;

public class OutputAllBook implements BaseAction{
	List<Book> list = new ArrayList<>();
	BaseDaoImpl dao = new OutputBookDaoImpl();


	@Override
	public String todoAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("output!!!");
		list = dao.searchBook("");
		
		System.out.println("razmer: " + list.size());		
		request.setAttribute("listbook", list);
		return null;
	}
	
}
