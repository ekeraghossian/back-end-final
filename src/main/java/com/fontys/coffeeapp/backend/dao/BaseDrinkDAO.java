package com.fontys.coffeeapp.backend.dao;

import com.fontys.coffeeapp.backend.entity.BaseDrink;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BaseDrinkDAO extends CrudRepository <BaseDrink, Long>{

    public List<BaseDrink> findAll (String name);
}
