package com.mojapraca.mojapraca.model;

import com.mojapraca.mojapraca.repository.ProductRepository;
import com.mojapraca.mojapraca.service.ProductService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NonNull
    private int quantity;
    @NonNull
    private int codeEAN;

    private Date date;

    private long idList;

    public Product() {
    }

    public Product(int quantity, int codeEAN, Date date) {
        this.quantity = quantity;
        this.codeEAN = codeEAN;
        this.date = date;
    }

    public Product(int quantity, int codeEAN, Date date, long idList) {
        this.quantity = quantity;
        this.codeEAN = codeEAN;
        this.date = date;
        this.idList = idList;
    }
}
