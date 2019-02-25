package com.company.coffemachine.factory.impl;

import com.company.coffemachine.coffe.Drink;
import com.company.coffemachine.coffe.Latte;


public class LatteCoffeFactory implements CoffeFactory {
    @Override
    public Drink createDrink() {
        return new Latte();
    }
}
