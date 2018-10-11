package com.fontys.coffeeapp.backend.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "Full_name", length = 64, nullable = false)
    private String fullName;

    @Column(name = "Credits", nullable = false)
    private int credits;

    @ManyToMany
    @JoinTable(name = "consumption",
            joinColumns = { @JoinColumn(name = "fk_user")},
            inverseJoinColumns = { @JoinColumn(name = "fk_drink")})
    private Set<Drink> drinks = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) { this.fullName = fullName; }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Set<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(Set<Drink> drinks) {
        this.drinks = drinks;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", credits=" + credits +
                '}';
    }
}