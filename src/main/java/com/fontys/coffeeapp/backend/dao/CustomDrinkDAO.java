package com.fontys.coffeeapp.backend.dao;

import org.springframework.data.repository.CrudRepository;
import com.fontys.coffeeapp.backend.entity.CustomDrink;


import java.util.List;

public interface CustomDrinkDAO extends CrudRepository <CustomDrink, Long>{

    public List<CustomDrink> findAll (String name);
}
