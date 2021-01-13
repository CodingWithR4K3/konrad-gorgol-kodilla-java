package com.kodilla.good.patterns.challenges.food2door.manufacturers;

import com.kodilla.good.patterns.challenges.food2door.products.Product;

public interface Manufacturer {
    boolean process(final Product product, final int quantity);
}
