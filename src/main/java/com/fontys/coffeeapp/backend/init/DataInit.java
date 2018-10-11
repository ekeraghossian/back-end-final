package com.fontys.coffeeapp.backend.init;

import com.fontys.coffeeapp.backend.dao.DrinkDAO;
import com.fontys.coffeeapp.backend.dao.UserDAO;
import com.fontys.coffeeapp.backend.entity.Drink;
import com.fontys.coffeeapp.backend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

@Component
public class DataInit implements ApplicationRunner {

    private UserDAO userDAO;
    private DrinkDAO drinkDAO;

    private Logger logger;

    @Autowired
    public DataInit(UserDAO userDAO, DrinkDAO drinkDAO) {
        this.userDAO = userDAO;
        this.drinkDAO = drinkDAO;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count = userDAO.count();
        System.out.println(count);

        if(count ==0) {
            User p1 = new User();
            p1.setFullName("Jordy");
            p1.setCredits(10);


            Drink drink = new Drink();
            drink.setName("Koffie");
            drink.setSugar(0);
            drink.setStrength(0);
            drink.setMilk(0);
            drinkDAO.save(drink);

            Set<Drink> drinks = new HashSet<>();
            drinks.add(drink);

            p1.setDrinks(drinks);

            userDAO.save(p1);

            Iterable<User> allUsers = userDAO.findAll();
            allUsers.forEach(user -> System.out.println(user));

            Iterable<Drink> allDrinks = drinkDAO.findAll();
            allDrinks.forEach(obj -> System.out.println(obj));
        }

//        if (count == 0) {
//            //Create set
//            Set<Drink> drinks = new HashSet<>();
//            drinks.add(new Drink("Koffie", 0, 0, 0));
//
//            User p1 = new User();
//            p1.setFullName("Eskandar");
//            p1.setCredits(20);
//            p1.setDrinks(drinks);
//
//            System.out.println(p1.toString());
//
//            //
//            User p2 = new User();
//            p2.setFullName("Fokke");
//            p2.setCredits(20);
//            p2.setDrinks(drinks);
//
//
//            User p3 = new User();
//            p3.setFullName("Jordy");
//            p3.setCredits(20);
//            p3.setDrinks(drinks);
//
//            User p4 = new User();
//            p4.setFullName("Wilrik");
//            p4.setCredits(20);
//            p4.setDrinks(drinks);
//
//            userDAO.save(p1);
//            userDAO.save(p2);
//            userDAO.save(p3);
//            userDAO.save(p4);
//
//            Iterable<User> findBy = userDAO.findAll();
//            findBy.forEach(user -> System.out.println(user));
//        }

    }

}