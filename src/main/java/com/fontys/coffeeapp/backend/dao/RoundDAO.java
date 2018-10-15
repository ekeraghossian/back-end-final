package com.fontys.coffeeapp.backend.dao;

import com.fontys.coffeeapp.backend.entity.Round;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoundDAO extends CrudRepository<Round, Long> {

}
