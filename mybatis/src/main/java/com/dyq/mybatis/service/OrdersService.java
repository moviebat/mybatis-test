package com.dyq.mybatis.service;

import com.dyq.mybatis.model.Orders;

public interface OrdersService {
    Orders findOrdersByUserId(Long userId);

    void insertOrders(Long userId, Double price, String content);

    int deleteOrders(Long id);

    int updateOrders(String content, Long userId);
}
