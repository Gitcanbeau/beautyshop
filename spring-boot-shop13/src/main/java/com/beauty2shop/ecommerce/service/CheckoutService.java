package com.beauty2shop.ecommerce.service;

import com.beauty2shop.ecommerce.dto.Purchase;
import com.beauty2shop.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
