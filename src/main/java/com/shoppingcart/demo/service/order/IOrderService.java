package com.shoppingcart.demo.service.order;

import com.shoppingcart.demo.model.Order;

public interface IOrderService {

    Order placeOrder(Long userId);
    Order getOrder(Long orderId);


}
