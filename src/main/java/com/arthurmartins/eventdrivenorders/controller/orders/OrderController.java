package com.arthurmartins.eventdrivenorders.controller.orders;

import com.arthurmartins.eventdrivenorders.entity.orders.Order;
import com.arthurmartins.eventdrivenorders.service.orders.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ResponseEntity<List<Order>> GetAllOrders(){
        List<Order> listOrders = orderService.GetAllOrders();

        return ResponseEntity.ok(listOrders);
    }

    @PostMapping
    public ResponseEntity<?> CreateOrder(@RequestBody Order order){
        orderService.CreateOrder(order);

        return ResponseEntity.ok().build();
    }
}
