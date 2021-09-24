package com.mojapraca.mojapraca.controller;

import com.mojapraca.mojapraca.model.Product;
import com.mojapraca.mojapraca.model.ProductName;
import com.mojapraca.mojapraca.service.ProductNameService;
import com.mojapraca.mojapraca.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private List<Product> list = new ArrayList<>();
    private List<Object> allList = new ArrayList<>();

    private final ProductService productService;

    private final ProductNameService productNameService;


    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/addProduct")
    public String addProduct(@RequestParam int code,
                      @RequestParam int quantity){

        long tmpList = productService.getMaxIDList() + 1;

        Product product = new Product(quantity,code,new Date(), tmpList);
        list.add(product);
        System.out.println(list);
        return "add";
    }

    @GetMapping("/showProduct")
    public String showProduct(ModelMap map){

        map.addAttribute("productList", list);

        return "showProduct";
    }


    @GetMapping("/saveList")
    public String saveList(){
        for (Product product :
                list) {
            productService.save(product);
            System.out.println(product);
        }
        return "home";
    }

    @GetMapping("/addProductName")
    public String addProductName(@RequestParam int codeEanProduct,
                                 @RequestParam String nameProduct){

        ProductName productName = new ProductName(nameProduct,
                codeEanProduct);
        productNameService.save(productName);


        return "addProductName";
    }

    @GetMapping("/addProductNameStart")
    public String addProductNameStart(){
        return "addProductName";
    }

    @GetMapping("/add")
    public String add(){
        return "add";
    }

    @GetMapping("/showProductName")
    public String showProductName(ModelMap map){
        List<ProductName> nameProductDB = new ArrayList<>();
        for (ProductName productName :
                productNameService.findAll()) {
            nameProductDB.add(productName);
        }
        map.addAttribute("nameProductDatabase", nameProductDB);
        System.out.println(nameProductDB);

        return "productName";
    }

    @GetMapping("/showAllList")
    public String showAllList(){
        System.out.println("----------------------------------");
        productService.productsByIdList();
        return "allListProduct";
    }


}
