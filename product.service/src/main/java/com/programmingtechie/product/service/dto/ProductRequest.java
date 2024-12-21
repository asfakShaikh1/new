package com.programmingtechie.product.service.dto;

public class ProductRequest {

    private String name;
    private String description;

    public Long getPrice() {
        return price;
    }

    public ProductRequest setPrice(Long price) {
        this.price = price;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProductRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    private Long price;
}
