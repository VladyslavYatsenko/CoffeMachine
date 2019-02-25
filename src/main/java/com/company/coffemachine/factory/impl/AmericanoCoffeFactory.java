package com.company.coffemachine.factory.impl;

import com.company.coffemachine.coffe.Drink;
import com.company.coffemachine.coffe.Americano;

public class AmericanoCoffeFactory implements CoffeFactory {
    @Override
    public Drink createDrink() {
        return new Americano();
    }
}
