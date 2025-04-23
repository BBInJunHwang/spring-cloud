package com.springcloud.orderservice.order.controller;

import com.springcloud.orderservice.order.service.UserClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final UserClient userClient;

    public OrderController(UserClient userClient) {
        this.userClient = userClient;
    }

    @GetMapping("/order/{id}")
    public String getOrder(@PathVariable("id") Long id) {
        String user = userClient.getUserById(id);
        return "Order for " + user;
    }
}