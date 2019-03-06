package com.company.coffemachine.coffe;

import com.company.coffemachine.factory.impl.AmericanoCoffeFactory;
import com.company.coffemachine.factory.impl.CoffeFactory;
import com.company.coffemachine.factory.impl.EspressoCoffeFactory;
import com.company.coffemachine.factory.impl.LatteCoffeFactory;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BeverageTest {
    private CoffeFactory coffeFactory;

    @Test
    public void shouldReturnAmericano() {
        coffeFactory = new AmericanoCoffeFactory();
        assertEquals(new Americano().getIngredients(), coffeFactory.createDrink().getIngredients());
    }

    @Test
    public void shouldReturnEspresso() {
        coffeFactory = new EspressoCoffeFactory();
        assertEquals(new Espresso().getIngredients(), coffeFactory.createDrink().getIngredients());

    }

    @Test
    public void shouldReturnLatte() {
        coffeFactory = new LatteCoffeFactory();
        assertEquals(new Latte().getIngredients(), coffeFactory.createDrink().getIngredients());
    }
}
