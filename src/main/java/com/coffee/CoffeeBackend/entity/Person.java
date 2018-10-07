package com.coffee.CoffeeBackend.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="PERSON")
public class Person {

    @Id
    @GeneratedValue
    @Column(name="Id", nullable=false)
    private Long id;

    @Column(name="First_name", length = 64, nullable = false)
    private String firstName;

    @Column(name="Last_name", length = 64, nullable = false)
    private String lastName;

    @Temporal(TemporalType.DATE)
    @Column(name="Date_Of_Birth", nullable =false)
    private Date dateOfBirth;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
