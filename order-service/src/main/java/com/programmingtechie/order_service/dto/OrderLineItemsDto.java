package com.programmingtechie.order_service.dto;

import java.math.BigDecimal;

public class OrderLineItemsDto {
    public Long GetId() {
        return id;
    }

    public OrderLineItemsDto setId(Long id) {
        this.id = id;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public OrderLineItemsDto setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public OrderLineItemsDto setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public OrderLineItemsDto setSkuCode(String skuCode) {
        this.skuCode = skuCode;
        return this;
    }

    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
