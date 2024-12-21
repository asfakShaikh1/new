package com.programmingtechie.order_service.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "order_list_item")
public class OrderListItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;

    public Long getId() {
        return id;
    }

    public OrderListItem setId(Long id) {
        this.id = id;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public OrderListItem setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public OrderListItem setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public OrderListItem setSkuCode(String skuCode) {
        this.skuCode = skuCode;
        return this;
    }
}