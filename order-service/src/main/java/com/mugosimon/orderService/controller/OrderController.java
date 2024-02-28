package com.mugosimon.orderService.controller;

import com.mugosimon.basedomains.DTO.Order;
import com.mugosimon.basedomains.DTO.OrderEvent;
import com.mugosimon.orderService.kafka.OrderProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("api/vi")
public class OrderController {
    private OrderProducer orderProducer;

    public OrderController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }
    @PostMapping("/orders")
    private String placeOrder(@RequestBody Order order){
        order.setOrderID(UUID.randomUUID().toString());
        OrderEvent orderEvent =new OrderEvent();
        orderEvent.setStatus("PENDING");
        orderEvent.setMessage("order status is in pending state");
        orderEvent.setOrder(order);

        orderProducer.sendMessage(orderEvent);

        return "Order placed successfully...";
    }
}
