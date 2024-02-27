package com.mugosimon.basedomains.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Order {

    private String orderID;
    private String name;
    private int quantity;
    private double price;

}