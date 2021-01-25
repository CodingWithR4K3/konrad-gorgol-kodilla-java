package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.bigmac.data.Bun;
import com.kodilla.patterns.builder.bigmac.data.Ingredient;
import com.kodilla.patterns.builder.bigmac.data.Sauce;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final Bun bun;
    private final int burgers;
    private final Sauce sauce;
    private final List<Ingredient> ingredients;

    private Bigmac(Bun bun, int burgers, Sauce sauce, List<Ingredient> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public Bun getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public static class BigMacBuilder {
        private final List<Ingredient> ingredients = new ArrayList<>();
        private Bun bun;
        private int burgers;
        private Sauce sauce;

        public BigMacBuilder bun(Bun bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder ingredient(Ingredient ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }
}