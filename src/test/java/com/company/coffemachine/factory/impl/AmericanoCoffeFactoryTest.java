package com.company.coffemachine.factory.impl;

import com.company.coffemachine.coffe.Americano;
import com.company.coffemachine.coffe.Beverage;
import com.company.coffemachine.coffe.Espresso;
import com.company.coffemachine.coffe.Latte;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class AmericanoCoffeFactoryTest {
    private CoffeFactory coffeFactory;

    @Before
    public void init() {
        coffeFactory = new AmericanoCoffeFactory();
    }

    @Test
    public void beverageShouldBeInstanceOfAmericano() {
        Beverage drink=coffeFactory.createDrink();
        assertTrue(drink instanceof Americano);
    }
    @Test
    public void checkBeverageIsEspresso(){
        Beverage americano=coffeFactory.createDrink();
        assertThat(americano).isEqualTo(new Americano());
    }
}