package com.mojapraca.mojapraca.service;

import com.mojapraca.mojapraca.model.ProductName;
import com.mojapraca.mojapraca.repository.ProductNameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductNameService {


    private final ProductNameRepository productNameRepository;

    public void save(ProductName productName){
        productNameRepository.save(productName);
    }

    public List<ProductName> findAll(){
        for (ProductName productName :
                productNameRepository.findAll()) {
            System.out.println(productName);
        }
        return productNameRepository.findAll().stream().collect(Collectors.toList());
    }



}
