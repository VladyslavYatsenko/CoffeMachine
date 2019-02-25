package com.company.coffemachine.coffeMachine;

import com.company.coffemachine.factory.impl.CoffeFactory;
import com.company.coffemachine.coffe.Drink;
import com.company.coffemachine.factory.impl.AmericanoCoffeFactory;
import com.company.coffemachine.factory.impl.EspressoCoffeFactory;
import com.company.coffemachine.factory.impl.LatteCoffeFactory;

public class CoffeMachine {
    private boolean status;
    public void on(){
        status=true;
    }
    public void off(){
        status=false;
    }
    public boolean getStatus(){
        return status;
    }
    private CoffeFactory coffeFactory;

    public Drink createLatte() {
        coffeFactory = new LatteCoffeFactory();
        return coffeFactory.createDrink();
    }

    public Drink createAmericano() {
        coffeFactory = new AmericanoCoffeFactory();
        return coffeFactory.createDrink();
    }

    public Drink createEspresso() {
        coffeFactory = new EspressoCoffeFactory();
        return coffeFactory.createDrink();
    }

}
