package com.arthurmartins.eventdrivenorders.entity.orders;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "orders")
public @Data class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private String orderDescription;
}
