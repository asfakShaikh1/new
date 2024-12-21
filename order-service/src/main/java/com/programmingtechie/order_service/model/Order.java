package com.programmingtechie.order_service.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String getOrderNumber() {
        return orderNumber;
    }

    public Order setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }


    public Long getId() {
        return id;
    }

    public Order setId(Long id) {
        this.id = id;
        return this;
    }

    private String orderNumber;
    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderListItem> orderListItemList;

    public List<OrderListItem> getOrderListItemList() {
        return orderListItemList;
    }

    public void setOrderListItemList(List<OrderListItem> orderListItemList) {
        this.orderListItemList = orderListItemList;
    }
}
