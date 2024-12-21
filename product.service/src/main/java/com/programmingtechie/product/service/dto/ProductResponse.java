package com.programmingtechie.product.service.dto;

public class ProductResponse {
    private Integer id;
    private String name;
    private String description;
    private Long price;

    public String getDescription() {
        return description;
    }

    public ProductResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public ProductResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductResponse setName(String name) {
        this.name = name;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public ProductResponse setPrice(Long price) {
        this.price = price;
        return this;
    }
}
