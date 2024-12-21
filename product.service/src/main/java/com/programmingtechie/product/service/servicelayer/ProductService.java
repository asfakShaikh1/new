package com.programmingtechie.product.service.servicelayer;


import com.programmingtechie.product.service.dto.ProductRequest;
import com.programmingtechie.product.service.dto.ProductResponse;
import com.programmingtechie.product.service.model.Product;
import com.programmingtechie.product.service.respository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private final ProductRepository productRepository;
      public  ProductService(ProductRepository productRepository)
       {
           this.productRepository=productRepository;
       }

    public void createProduct(ProductRequest productRequest){
     Product product = new Product();
        product.setName(productRequest.getName());
        product.setDescription(productRequest.getDescription());
        product.setPrice(productRequest.getPrice());

        productRepository.save(product);
    log.info("Product  " +product.getId()+  "   is saved ");

    }


    public List<ProductResponse> getAllProduct() {
         List<Product> products=  productRepository.findAll();

       return  products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
          ProductResponse prod = new ProductResponse();

          prod.setId(product.getId());
          prod.setName(product.getName());
          prod.setDescription(product.description());
          prod.setPrice(product.getPrice());
          return prod;
    }
}
