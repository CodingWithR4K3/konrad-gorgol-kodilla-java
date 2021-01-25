package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.bigmac.data.Bun;
import com.kodilla.patterns.builder.bigmac.data.Ingredient;
import com.kodilla.patterns.builder.bigmac.data.Sauce;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder() {

        //Given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .bun(Bun.WITH_SESAME)
                .burgers(5)
                .sauce(Sauce.THOUSAND_ISLANDS)
                .ingredient(Ingredient.BACON)
                .ingredient(Ingredient.CHEESE)
                .ingredient(Ingredient.CHEESE)
                .ingredient(Ingredient.CHILI_PEPPER)
                .build();

        //When
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredients = bigmac.getIngredients().size();
        Bun whichBun = bigmac.getBun();
        Sauce whichSauce = bigmac.getSauce();
        bigmac.getIngredients()
                .forEach(System.out::println);

        //Then
        Assertions.assertEquals(5, howManyBurgers);
        Assertions.assertEquals(4, howManyIngredients);
        Assertions.assertEquals(Bun.WITH_SESAME, whichBun);
        Assertions.assertEquals(Sauce.THOUSAND_ISLANDS, whichSauce);
    }
}
