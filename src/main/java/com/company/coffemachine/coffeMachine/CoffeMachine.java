package com.company.coffemachine.coffeMachine;

import com.company.coffemachine.factory.impl.AmericanoCoffeFactory;
import com.company.coffemachine.factory.impl.CoffeFactory;
import com.company.coffemachine.coffe.Beverage;
import com.company.coffemachine.factory.impl.EspressoCoffeFactory;
import com.company.coffemachine.factory.impl.LatteCoffeFactory;

public class CoffeMachine implements Machine {
    private CoffeFactory coffeFactory;

    private boolean status;

    public CoffeMachine(CoffeFactory coffeFactory) {//For Mockito Testing(
        this.coffeFactory = coffeFactory;
    }
    public CoffeMachine(){

    }
    public void on() {
        status = true;
    }

    public void off() {
        status = false;
    }

    public boolean getStatus() {
        return status;
    }

    public Beverage createLatte() {
        coffeFactory=new LatteCoffeFactory();
        return coffeFactory.createDrink();
    }

    public Beverage createAmericano() {
        coffeFactory=new AmericanoCoffeFactory();
        return coffeFactory.createDrink();
    }

    public Beverage createEspresso() {
        coffeFactory=new EspressoCoffeFactory();
        return coffeFactory.createDrink();
    }

    public String description() {
        return "Coffe Machine(Version 1.1)";
    }

}
