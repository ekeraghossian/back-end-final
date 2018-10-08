package com.fontys.coffeeapp.backend.dao;

import com.fontys.coffeeapp.backend.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface UserDAO extends CrudRepository<User, Long> {

    public List<User> findByFullNameLike(String name);

    public List<User> findByDateOfBirthGreaterThan(Date date);

}