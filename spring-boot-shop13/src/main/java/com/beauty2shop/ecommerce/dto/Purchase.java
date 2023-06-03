package com.beauty2shop.ecommerce.dto;

import com.beauty2shop.ecommerce.entity.Address;
import com.beauty2shop.ecommerce.entity.Customer;
import com.beauty2shop.ecommerce.entity.Order;
import com.beauty2shop.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
