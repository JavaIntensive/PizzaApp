package com.example.demo;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
public class XOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate dateTime;
    private String toppings;
    //TODO: price as double
    //TODO: in the html template
    // Add path for javascript / css from bootstrap
    // add thymeleaf on top
    // add navigation bootstrap
    // everything you think we need to have
    // then we will see together
    // add readme file if you can

     /* private String dough;

    private String sauce;

    private String cheese;

    @Nullable
    private String spinach;

    @Nullable
    private String bacon;

    @Nullable
    private String mushroom;

    @Nullable
    private String tomato;*/

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public XOrder() {
       dateTime= LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }
}
