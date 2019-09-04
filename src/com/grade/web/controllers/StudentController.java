package com.grade.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grade.web.pool.Constant;

@WebServlet("/grade.do")
public class StudentController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
        
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		switch(request.getParameter("action")) {
		case "move" : 
			request.getRequestDispatcher
			(String.format(Constant.VIEW_PATH,
					"student", 
					request.getParameter("dest")))
			.forward(request, response);
			break;
		case "register" :
			request.getRequestDispatcher
			(String.format(Constant.VIEW_PATH,
					"student", 
					request.getParameter("dest")))
			.forward(request, response);
			break;
		case "login" : 
			break;
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
