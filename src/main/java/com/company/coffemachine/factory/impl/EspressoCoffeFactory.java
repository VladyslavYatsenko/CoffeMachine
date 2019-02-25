package com.company.coffemachine.factory.impl;

import com.company.coffemachine.coffe.Drink;
import com.company.coffemachine.coffe.Espresso;

public class EspressoCoffeFactory implements CoffeFactory {
    @Override
    public Drink createDrink() {
        return new Espresso();
    }
}
