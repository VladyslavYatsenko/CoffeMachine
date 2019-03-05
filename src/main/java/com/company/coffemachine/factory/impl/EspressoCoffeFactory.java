package com.company.coffemachine.factory.impl;

import com.company.coffemachine.coffe.Beverage;
import com.company.coffemachine.coffe.Espresso;

public class EspressoCoffeFactory implements CoffeFactory {
    @Override
    public Beverage createDrink() {
        return new Espresso();
    }
}
