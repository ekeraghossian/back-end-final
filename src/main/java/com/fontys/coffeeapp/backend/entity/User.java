package com.fontys.coffeeapp.backend.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "Full_name", length = 64, nullable = false)
    private String name;

    @Column(name = "Credits", nullable = false)
    private int credits;

//    @ManyToMany
//    @JoinTable(name = "RoundLine",
//            joinColumns = {@JoinColumn(name = "fk_user")},
//            inverseJoinColumns = { @JoinColumn(name = "fk_drink")})
//    private Set<Drink> drinks = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

//    public Set<Drink> getDrinks() {
//        return drinks;
//    }
//
//    public void setDrinks(Set<Drink> drinks) {
//        this.drinks = drinks;
//    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                '}';
    }
}