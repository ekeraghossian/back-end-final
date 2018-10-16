package com.fontys.coffeeapp.backend.init;


import com.fontys.coffeeapp.backend.dao.BaseDrinkDAO;
import com.fontys.coffeeapp.backend.dao.UserDAO;

import com.fontys.coffeeapp.backend.entity.BaseDrink;
import com.fontys.coffeeapp.backend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


import java.util.logging.Logger;

@Component
public class DataInit implements ApplicationRunner {

    private UserDAO userDAO;
    private BaseDrinkDAO baseDrinkDAO;

    private Logger logger;

    @Autowired
    public DataInit(UserDAO userDAO,BaseDrinkDAO baseDrinkDAO ) {
        this.userDAO = userDAO;
        this.baseDrinkDAO = baseDrinkDAO;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        addUsers();
        addBaseDrinks();

    }

    private void addUsers() {
        long count = userDAO.count();
        System.out.println(count);

        if (count == 0) {
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

    private void addBaseDrinks() {
        long count = baseDrinkDAO.count();
        System.out.println(count);

        if (count == 0) {
            BaseDrink b1 = new BaseDrink();
            b1.setName("Water");
            b1.setUrl("./assets/img/icons/water_icon_alt.jpg");

            BaseDrink b2 = new BaseDrink();
            b2.setName("Koffie");
            b2.setUrl("./assets/img/icons/koffie_icon_alt.jpg");

            BaseDrink b3 = new BaseDrink();
            b3.setName("Cappuccino");
            b3.setUrl("./assets/img/icons/cappuccino_icon_alt.jpg");

            BaseDrink b4 = new BaseDrink();
            b4.setName("Thee");
            b4.setUrl("./assets/img/icons/thee_icon_alt.jpg");

            baseDrinkDAO.save(b1);
            baseDrinkDAO.save(b2);
            baseDrinkDAO.save(b3);
            baseDrinkDAO.save(b4);


//            Iterable<BaseDrink> allDrinks = baseDrinkDAO.findAll();
//            allDrinks.forEach(drink -> System.out.println(drink));

        }
    }
}