package com.kodilla.good.patterns.challenges.food2door.products;

import com.kodilla.good.patterns.challenges.food2door.manufacturers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.manufacturers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2door.manufacturers.HealthyShop;
import com.kodilla.good.patterns.challenges.food2door.manufacturers.Manufacturer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {

    private final List<Product> products = new ArrayList<>();
    private final Map<Product, Manufacturer> productManufacturerMap = new HashMap<>();

    public ProductRepository() {

        Manufacturer glutenFreeShop = new GlutenFreeShop();
        Manufacturer extraFoodShop = new ExtraFoodShop();
        Manufacturer healthyShop = new HealthyShop();

        products.add(new SuperFoodProduct("Canned Pumpkin", 4.50, true));
        products.add(new SuperFoodProduct("Quinoa", 3.25, true));
        products.add(new SuperFoodProduct("Soybeans", 4.20, true));
        products.add(new SuperFoodProduct("Sweet Potato", 1.99, false));
        products.add(new SuperFoodProduct("Oatmeal", 4.99, false));
        products.add(new SuperFoodProduct("Wholegrain Bread", 5.0, false));
        products.add(new SuperFoodProduct("Pure Barley", 3.99, false));

        productManufacturerMap.put(products.get(0), glutenFreeShop);
        productManufacturerMap.put(products.get(1), glutenFreeShop);
        productManufacturerMap.put(products.get(2), glutenFreeShop);
        productManufacturerMap.put(products.get(3), extraFoodShop);
        productManufacturerMap.put(products.get(4), healthyShop);
        productManufacturerMap.put(products.get(5), healthyShop);
        productManufacturerMap.put(products.get(6), extraFoodShop);
    }

    public Manufacturer getProductDeliverer(Product product) {

        return productManufacturerMap.get(product);
    }

    public Product getProductFromRepository(Product product) {

        return products.get(products.indexOf(product));
    }
}
