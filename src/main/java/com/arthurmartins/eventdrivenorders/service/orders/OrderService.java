package com.arthurmartins.eventdrivenorders.service.orders;

import com.arthurmartins.eventdrivenorders.entity.orders.Order;
import com.arthurmartins.eventdrivenorders.repository.orders.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> GetAllOrders(){
        return orderRepository.findAll();
    }

    public void CreateOrder(Order order){
        orderRepository.save(order);
    }
}
