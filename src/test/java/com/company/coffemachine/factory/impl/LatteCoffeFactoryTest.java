package com.company.coffemachine.factory.impl;

import com.company.coffemachine.coffe.Americano;
import com.company.coffemachine.coffe.Beverage;
import com.company.coffemachine.coffe.Espresso;
import com.company.coffemachine.coffe.Latte;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LatteCoffeFactoryTest {
    private CoffeFactory coffeFactory;

    @Before
    public void init() {
        coffeFactory = new LatteCoffeFactory();
    }

    @Test
    public void beverageShouldBeInstanceOfLatte() {
        Beverage drink = coffeFactory.createDrink();
        assertTrue(drink instanceof Latte);

    }

}