package com.company.coffemachine.factory.impl;

import com.company.coffemachine.coffe.Beverage;
import com.company.coffemachine.coffe.Espresso;
import com.company.coffemachine.coffe.Ingredient;
import com.company.coffemachine.coffe.Latte;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class EspressoCoffeFactoryTest {
    private CoffeFactory coffeFactory;

    @Before
    public void init() {
        coffeFactory = new EspressoCoffeFactory();
    }

    @Test
    public void beverageShouldBeInstanceOfEspresso() {
        Beverage drink = coffeFactory.createDrink();
        assertTrue(drink instanceof Espresso);
    }
    @Test
    public void checkBeverageIsEspresso(){
        Beverage espresso=coffeFactory.createDrink();
        assertTrue(new Espresso().equals(espresso));
    }

}