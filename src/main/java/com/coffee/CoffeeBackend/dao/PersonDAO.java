package com.coffee.CoffeeBackend.dao;

import com.coffee.CoffeeBackend.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDAO extends CrudRepository<Person, Long> {

    public List<Person> findByFirstNameLike(String name);

    public List<Person> findByLastNameLike(String name);
}
