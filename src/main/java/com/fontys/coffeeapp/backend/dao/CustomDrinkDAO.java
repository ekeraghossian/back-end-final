package com.fontys.coffeeapp.backend.dao;

import org.springframework.data.repository.CrudRepository;
import com.fontys.coffeeapp.backend.entity.CustomDrink;
import org.springframework.stereotype.Repository;


import java.util.List;

public interface CustomDrinkDAO extends CrudRepository <CustomDrink, Long>{

}
