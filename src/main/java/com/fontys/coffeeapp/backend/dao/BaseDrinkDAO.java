package com.fontys.coffeeapp.backend.dao;

import com.fontys.coffeeapp.backend.entity.BaseDrink;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.lang.Iterable;

public interface BaseDrinkDAO extends CrudRepository <BaseDrink, Long>{

}
