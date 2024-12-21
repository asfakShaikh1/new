package com.programmingtechie.invertory_service.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Invertory {

    public Long getId() {
        return id;
    }

    public Invertory setId(Long id) {
        this.id = id;
        System.out.println("i do some change is code ");
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Invertory setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public Invertory setSkuCode(String skuCode) {
        this.skuCode = skuCode;
        System.out.println("BUG FIX");
        return this;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode;
    private Integer quantity;
}
