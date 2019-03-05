package com.company.coffemachine.factory.impl;

import com.company.coffemachine.coffe.Beverage;
import com.company.coffemachine.coffe.Americano;

public class AmericanoCoffeFactory implements CoffeFactory {
    @Override
    public Beverage createDrink() {
        return new Americano();
    }
}
