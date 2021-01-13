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
    private final Map<Integer, Manufacturer> productManufacturerMap = new HashMap<>();

    public ProductRepository() {

        Manufacturer glutenFreeShop = new GlutenFreeShop();
        Manufacturer extraFoodShop = new ExtraFoodShop();
        Manufacturer healthyShop = new HealthyShop();

        products.add(new SuperFoodProduct(1, "Canned Pumpkin", 4.50, true));
        products.add(new SuperFoodProduct(2, "Quinoa", 3.25, true));
        products.add(new SuperFoodProduct(3, "Soybeans", 4.20, true));
        products.add(new SuperFoodProduct(4, "Sweet Potato", 1.99, false));
        products.add(new SuperFoodProduct(5, "Oatmeal", 4.99, false));
        products.add(new SuperFoodProduct(6, "Wholegrain Bread", 5.0, false));
        products.add(new SuperFoodProduct(7, "Pure Barley", 3.99, false));

        productManufacturerMap.put(products.get(0).productId(), glutenFreeShop);
        productManufacturerMap.put(products.get(1).productId(), glutenFreeShop);
        productManufacturerMap.put(products.get(2).productId(), glutenFreeShop);
        productManufacturerMap.put(products.get(3).productId(), extraFoodShop);
        productManufacturerMap.put(products.get(4).productId(), healthyShop);
        productManufacturerMap.put(products.get(5).productId(), healthyShop);
        productManufacturerMap.put(products.get(6).productId(), extraFoodShop);
    }

    public Manufacturer getProductDeliverer(int productId) {

        return productManufacturerMap.get(productId);
    }

    public Product getProductFromRepository(int productId) {

        return products.stream()
                .filter(product -> product.productId() == productId)
                .findAny().orElseThrow(IllegalArgumentException::new);
    }
}
