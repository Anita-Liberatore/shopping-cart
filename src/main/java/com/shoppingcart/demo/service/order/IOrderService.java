package com.shoppingcart.demo.service.order;


import com.shoppingcart.demo.dto.OrderDto;
import com.shoppingcart.demo.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
    OrderDto convertToDto(Order order);
}
