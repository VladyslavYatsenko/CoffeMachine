package com.company.coffemachine.factory.impl;

import com.company.coffemachine.coffe.Beverage;
import com.company.coffemachine.coffe.Latte;

public class LatteCoffeFactory implements CoffeFactory {
    @Override
    public Beverage createDrink() {
        return new Latte();
    }
}
