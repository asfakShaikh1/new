package com.programmingtechie.order_service.service;

import com.programmingtechie.order_service.dto.OrderLineItemsDto;
import com.programmingtechie.order_service.dto.OrderRequest;
import com.programmingtechie.order_service.model.Order;
import com.programmingtechie.order_service.model.OrderListItem;
import com.programmingtechie.order_service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;
    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public void placeOrder(OrderRequest orderRequest){

        Order order = new Order();

        order.setOrderNumber(UUID.randomUUID().toString());
      List<OrderListItem> orderListItems=orderRequest.getOrderLineItemsDtoList()
                .stream()
                .map(this::mapToDto)
                .toList();
        order.setOrderListItemList(orderListItems);
        orderRepository.save(order);
    }

    private OrderListItem mapToDto(OrderLineItemsDto orderLineItemsDto) {
        OrderListItem orderListItem = new OrderListItem();

        orderListItem.setPrice(orderLineItemsDto.getPrice());
        orderListItem.setQuantity(orderLineItemsDto.getQuantity());
        orderListItem.setSkuCode(orderLineItemsDto.getSkuCode());
        return orderListItem;
    }

}
