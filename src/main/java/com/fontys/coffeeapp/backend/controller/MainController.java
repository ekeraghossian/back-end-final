package com.fontys.coffeeapp.backend.controller;

import com.fontys.coffeeapp.backend.dao.BaseDrinkDAO;
import com.fontys.coffeeapp.backend.dao.UserDAO;
import com.fontys.coffeeapp.backend.entity.BaseDrink;
import com.fontys.coffeeapp.backend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.lang.Iterable;

@Controller
public class MainController {

    private UserDAO userDAO;
    private BaseDrinkDAO baseDrinkDAO;

    @Autowired
    public MainController (UserDAO userDao, BaseDrinkDAO baseDrinkDAO){
        this.userDAO = userDao;
        this.baseDrinkDAO = baseDrinkDAO;
    }
    

    @ResponseBody
    @RequestMapping("/")
    public String all() {
        Iterable<User> all = userDAO.findAll();

        StringBuilder sb = new StringBuilder();

        all.forEach(p -> sb.append(p.getName() + "<br>"));

        return sb.toString();
    }

    /**
     * Method that finds all users by using the DAO.
     * @param  none
     * @return Return a list of User objects.
     */
    @CrossOrigin
    @ResponseBody
    @GetMapping("/users")
    public Iterable<User> allUsers() {
        Iterable<User> iterable = userDAO.findAll();
        List<User> userList = new ArrayList<>();

        iterable.forEach(user -> userList.add(user));
        return userList;
    }

    @CrossOrigin
    @ResponseBody
    @GetMapping("/basedrinks")
    public Iterable<BaseDrink> allBaseDrinks() {
//        Iterable<BaseDrink> iterable = baseDrinkDAO.findAll();
//        List<BaseDrink> drinklist = new ArrayList<>();
//
//        iterable.forEach(baseDrink -> allBaseDrinks().add(baseDrink));
//        return drinklist;
            return baseDrinkDAO.findAll();

    }

}
