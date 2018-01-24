package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



public class LoginController extends HttpServlet{


    private UserService userService;
    private RequestDispatcher loginDispatcher;

    @Override
    public void init() throws ServletException {
        userService =(UserService) getServletContext().getAttribute(UserService.class.getSimpleName());
        loginDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/login.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        loginDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String pass = req.getParameter("password");

        if ((userService.findByName(username) == null) || userService.autenticate(username,pass) == false){
            loginDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/login.jsp");
            req.getSession().setAttribute("authenticate", false );
            loginDispatcher.forward(req, resp);
            return;
        }

        req.getSession().setAttribute("user", userService.findByName(username) );
        loginDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/user-list.jsp");
        loginDispatcher.forward(req,resp);

    }
}
