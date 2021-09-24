package com.mojapraca.mojapraca.service;

import com.mojapraca.mojapraca.model.Product;
import com.mojapraca.mojapraca.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {


    private final ProductRepository productRepository;

    public void save(Product product){
        productRepository.save(product);
    }

    public long getMaxIDList() {
        OptionalLong maxID;

        if(!productRepository.findAll().stream()
                .mapToLong(Product::getIdList).max().isPresent()){
            maxID = OptionalLong.of(0);
        } else {
            maxID = productRepository.findAll().stream()
                    .mapToLong(Product::getIdList).max();
        }

        return maxID.orElseThrow();
    }

    public void findAll(){
        productRepository.findAll();
    };

    public Set<Product> productsByIdList (){
        Set<Product> myList = new HashSet<>();

        myList.addAll(productRepository.findAll());

        System.out.println(myList);
        return myList;
    }

}
