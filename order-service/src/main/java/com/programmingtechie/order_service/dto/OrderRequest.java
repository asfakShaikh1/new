package com.programmingtechie.order_service.dto;

import java.util.List;

public class OrderRequest {

    public List<OrderLineItemsDto> getOrderLineItemsDtoList() {
        return orderLineItemsDtoList;
    }

    public OrderRequest setOrderLineItemsDtoList(List<OrderLineItemsDto> orderLineItemsDtoList) {
        this.orderLineItemsDtoList = orderLineItemsDtoList;
        return this;
    }

    private List<OrderLineItemsDto> orderLineItemsDtoList;
}
