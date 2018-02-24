package by.htp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.controller.action.BaseAction;
import by.htp.controller.action.imple.Autorizate;
import by.htp.controller.action.imple.OutputAllBook;

public class ActionManager {
	
	public static BaseAction defineServerAction(String action, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BaseAction act = null;
		switch(action) {
			case "action":{
				act = new Autorizate();
				break;
			}
			case "output":{
				act = new OutputAllBook();
				break;
			}
			default :
				//TODO
				System.out.println("Error"); 
		}
		 return act;
}

}
