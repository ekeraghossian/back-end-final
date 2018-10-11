package com.fontys.coffeeapp.backend.init;

import com.fontys.coffeeapp.backend.dao.UserDAO;
import com.fontys.coffeeapp.backend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DataInit implements ApplicationRunner {

    private UserDAO userDAO;

    private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    @Autowired
    public DataInit(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count = userDAO.count();

        if (count == 0) {
            User p1 = new User();

            p1.setFullName("Eskandar Keraghossian");

            Date d1 = df.parse("1980-12-20");
            p1.setDateOfBirth(d1);
            //
            User p2 = new User();


            p2.setFullName("Fokke Müller");
            Date d2 = df.parse("1985-11-11");
            p2.setDateOfBirth(d2);

            User p3 = new User();
            Date d3 = df.parse("1992-08-28");
            p3.setFullName("Jordy Bruno");
            p3.setDateOfBirth(d3);

            userDAO.save(p1);
            userDAO.save(p2);
            userDAO.save(p3);

            Iterable<User> findBy = userDAO.findAll();
            findBy.forEach(user -> System.out.println(user));
        }

    }

}