package com.fontys.coffeeapp.backend.dao;

import org.springframework.data.repository.CrudRepository;
import com.fontys.coffeeapp.backend.entity.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDAO extends CrudRepository<Admin, Long> {

}
