package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.service.BootcampService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BootcampListController extends HttpServlet {

    private BootcampService bootcamService;

    @Override
    public void init() throws ServletException {

        bootcamService = (BootcampService) getServletContext().getAttribute(BootcampService.class.getSimpleName());
        getServletContext().setAttribute("bootcampList", bootcamService.findAll());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher userListDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/bootcamp-list.jsp");
        Object user = req.getSession().getAttribute("user");

        if (user == null){
            userListDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/login.jsp");
            userListDispatcher.forward(req,resp);
            return;
        }
        userListDispatcher.forward(req, resp);


    }

}
