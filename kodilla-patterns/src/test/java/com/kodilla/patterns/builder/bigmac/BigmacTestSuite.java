package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {
    @Test
    void testBigMacBuilder() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("sezam bun")
                .sauce("hot and spicy sauce")
                .burgers(3)
                .ingredients("onion")
                .ingredients("green salad")
                .build();
        System.out.println(bigMac);
        //When
        int howManyBurgersInside = bigMac.getBurgers();
        List<String> ingredientsList = Arrays.asList("onion", "green salad");
        //Then
        assertEquals(3, howManyBurgersInside);
        assertEquals(ingredientsList, bigMac.getIngredients());
    }

}
