package com.mojapraca.mojapraca.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
//@Entity
//@Table(name = "lists")
public class MyLists {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Date date;


    private List<Product> myList;

    public MyLists() {
    }

    public MyLists(long id, Date date, List<Product> myList) {
        this.id = id;
        this.date = date;
        this.myList = myList;
    }


}
