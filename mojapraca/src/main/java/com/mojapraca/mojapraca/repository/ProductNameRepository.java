package com.mojapraca.mojapraca.repository;

import com.mojapraca.mojapraca.model.ProductName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductNameRepository extends JpaRepository<ProductName, Long> {
}
