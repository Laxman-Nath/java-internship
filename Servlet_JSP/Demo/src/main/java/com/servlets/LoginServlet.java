package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.service.*;
import com.serviceimpl.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService=new UserServiceImpl();

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/login.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	    String name=request.getParameter("name");
	    String password=request.getParameter("password");
//	    System.out.println("Name="+name);
//	    System.out.println("Password="+password);
	    
	    if(userService.login(name, password)) {
	    	request.setAttribute("name", name);
	        request.getRequestDispatcher("home.jsp").forward(request, response);
	    }
	    else {
	    	request.setAttribute("message", "Invalid");
	    	 request.getRequestDispatcher("login.jsp").forward(request, response);
	    }
	}

}
