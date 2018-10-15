package com.fontys.coffeeapp.backend.init;


import com.fontys.coffeeapp.backend.dao.UserDAO;

import com.fontys.coffeeapp.backend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


import java.util.logging.Logger;

@Component
public class DataInit implements ApplicationRunner {

    private UserDAO userDAO;

    private Logger logger;

    @Autowired
    public DataInit(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count = userDAO.count();
        System.out.println(count);

        if(count ==0) {
            User p1 = new User();
            p1.setName("Fokke");
            p1.setCredits(10);

            User p2 = new User();
            p2.setName("Eskandar");
            p2.setCredits(10);

            User p3 = new User();
            p3.setName("Jordy");
            p3.setCredits(10);

            User p4 = new User();
            p4.setName("Wilrik");
            p4.setCredits(10);

            userDAO.save(p1);
            userDAO.save(p2);
            userDAO.save(p3);
            userDAO.save(p4);

            Iterable<User> allUsers = userDAO.findAll();
            allUsers.forEach(user -> System.out.println(user));

        }
    }
}