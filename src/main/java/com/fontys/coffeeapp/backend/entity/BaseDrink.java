package com.fontys.coffeeapp.backend.entity;


import javax.persistence.*;

@Entity
@Table(name = "BASEDRINK")
public class BaseDrink {

    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "Drink_name", length = 64, nullable = false)
    private String name;

    @Column(name = "Img_url", nullable = false)
    private String url;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public String toString() {
        return "Drink{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url=" + url +
                '}';
    }
}
