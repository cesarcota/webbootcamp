package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.model.Bootcamp;
import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserListController extends HttpServlet {


    @Override
    public void init() throws ServletException {

       UserService userService = (UserService) getServletContext().getAttribute(UserService.class.getSimpleName());
        getServletContext().setAttribute("userList", userService.findAll());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher userListDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/user-list.jsp");
        Object user = req.getSession().getAttribute("user");

        if (user == null){
            userListDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/login.jsp");
            userListDispatcher.forward(req,resp);
            return;
        }

        userListDispatcher.forward(req, resp);

    }
}
