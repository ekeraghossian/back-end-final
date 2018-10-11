package com.fontys.coffeeapp.backend.dao;

import com.fontys.coffeeapp.backend.entity.Drink;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkDAO extends CrudRepository<Drink, Long> {
}
