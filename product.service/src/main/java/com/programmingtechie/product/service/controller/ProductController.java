package com.programmingtechie.product.service.controller;


import com.programmingtechie.product.service.dto.ProductRequest;
import com.programmingtechie.product.service.dto.ProductResponse;
import com.programmingtechie.product.service.model.Product;
import com.programmingtechie.product.service.servicelayer.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/product")
public class ProductController {

     private final ProductService productService;
     public ProductController(ProductService productService){
            this.productService=productService;
     }
       @PostMapping("/creatproduct")
       @ResponseStatus(HttpStatus.CREATED)
       public void  createProduct(@RequestBody ProductRequest product){

            productService.createProduct(product);
       }

       @GetMapping("/findallproduct")
       @ResponseStatus(HttpStatus.OK)
       public List<ProductResponse> getAllProduct(){

            return productService.getAllProduct();
       }


}
