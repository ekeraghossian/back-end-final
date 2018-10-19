package com.fontys.coffeeapp.backend.entity;


import javax.persistence.*;

@Entity
public class CustomDrink {

    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "Strength", nullable = false)
    private int strength;

    @Column(name = "Sugar", nullable = false)
    private int sugar;

    @Column(name = "Milk", nullable = false)
    private int milk;

    // MOET ER NOG EEN COLUMN KOMEN VOOR DE RELATIE MET BASEDRINK?

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

//    @Override
//    public String toString() {
//        return "Drink{" +
//                "id=" + id +
//                ", strength=" + strength +
//                ", sugar=" + sugar +
//                ", milk=" + milk +
//                '}';
//    }


}
