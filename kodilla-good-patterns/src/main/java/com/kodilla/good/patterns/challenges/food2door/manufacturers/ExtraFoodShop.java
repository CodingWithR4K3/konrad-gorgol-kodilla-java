package com.kodilla.good.patterns.challenges.food2door.manufacturers;

import com.kodilla.good.patterns.challenges.food2door.products.Product;

public class ExtraFoodShop implements Manufacturer {

    public boolean process(final Product product, final int quantity) {
        System.out.println("<ExtraFoodSop> I am sending message directly to delivery worker!");
        System.out.println("Prepare " + product.getProductName() + ", in quantity: " + quantity);
        return true;
    }

}
