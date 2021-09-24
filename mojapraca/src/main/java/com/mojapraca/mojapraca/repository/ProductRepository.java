package com.mojapraca.mojapraca.repository;

import com.mojapraca.mojapraca.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    // nie działa - wywala błąd w konsoli
    @Query("select id_list, date from product")
    List<Product> listDateIDList();

}
