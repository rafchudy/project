package com.mojapraca.mojapraca.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "nazwy_produktu")
public class ProductName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private int codeEAN_product;

    public ProductName() {
    }

    public ProductName(String name, int codeEAN_product) {
        this.name = name;
        this.codeEAN_product = codeEAN_product;
    }

    @Override
    public String toString() {
        return "Produkt : "+getName()+" |||| kod ean: "+getCodeEAN_product();
    }
}
