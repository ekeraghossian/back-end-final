package com.fontys.coffeeapp.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin {

    @GeneratedValue
    @Id
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "Name", length = 64, nullable = false)
    private String name;

    @Column(name = "Password", length = 64, nullable = false)
    private String password;


    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password=" + password +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
