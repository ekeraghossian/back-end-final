package com.fontys.coffeeapp.backend.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Round {

    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "Date", nullable = false)
    private Date date;


}
