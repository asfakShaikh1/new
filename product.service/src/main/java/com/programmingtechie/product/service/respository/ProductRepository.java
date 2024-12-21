package com.programmingtechie.product.service.respository;

import com.programmingtechie.product.service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {

}
