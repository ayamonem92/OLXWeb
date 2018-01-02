package com.olx.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.olx.controller.UserService;
import com.olx.model.UserDtoReq;

/**
 * Servlet implementation class LoginAction
 */
@WebServlet(name = "LoginAction", urlPatterns = {"LoginAction"})
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
	// TODO Auto-generated method stub
	response.setContentType("text/html;charset=UTF-8");
    try (PrintWriter out = response.getWriter()) {
        String action = request.getParameter("action");
        HttpSession session = request.getSession();
        if(action == null){
            String username = request.getParameter("name");
            String password = request.getParameter("password");

            UserService userService = new UserService();
            
			  boolean r = userService.login(username, password);
			  UserDtoReq user = new UserDtoReq(username, password);
			  String resultMessage =userService.getResult().getMessage();
			  
            if(r == false){
               response.sendRedirect("Login.jsp?e=true");
               userService.close();
            
            } else {
                session.setAttribute("myuser", user);
                response.sendRedirect("home.jsp");
            }
            userService.close();
        } else if(action.equals("logout")){
            session.removeAttribute("st");
            response.sendRedirect("Login.jsp");
        }
    }
	}
}
