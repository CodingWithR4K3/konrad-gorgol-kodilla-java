package com.kodilla.good.patterns.challenges.allegro.orders;

import com.kodilla.good.patterns.challenges.allegro.products.Product;
import com.kodilla.good.patterns.challenges.allegro.users.User;

public class OrderRequest implements Order {

    private final User user;
    private final Product product;
    private final int quantity;

    public OrderRequest(User user, Product product, int quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
}
