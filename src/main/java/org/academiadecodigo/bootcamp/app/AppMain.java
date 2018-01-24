package org.academiadecodigo.bootcamp.app;

import org.academiadecodigo.bootcamp.model.Bootcamp;
import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.service.BootcampService;
import org.academiadecodigo.bootcamp.service.MockBootcampService;
import org.academiadecodigo.bootcamp.service.MockUserService;
import org.academiadecodigo.bootcamp.service.UserService;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppMain implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext ctx = sce.getServletContext();

        UserService userService = new MockUserService();
        BootcampService bootcampService = new MockBootcampService();

        ctx.setAttribute(UserService.class.getSimpleName(), userService);
        ctx.setAttribute(BootcampService.class.getSimpleName(), bootcampService);



        userService.addUser(new User(1, "cesar", "cesar", "cesar@academiadecodigo.com"));
        userService.addUser(new User(2, "davide", "davide", "davide@academiadecodigo.com"));
        userService.addUser(new User(3, "sofia", "sofia", "sofia@academiadecodigo.com"));
        userService.addUser(new User(4, "luis", "luis", "luis@academiadecodigo.com"));


        bootcampService.addBootcamp(new Bootcamp(1, "Terceira"));
        bootcampService.addBootcamp(new Bootcamp(2, "Lisboa"));

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
