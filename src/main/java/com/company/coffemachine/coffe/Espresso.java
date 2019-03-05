package com.company.coffemachine.coffe;

public class Espresso extends Beverage {

    public Espresso(){
        super("Espresso");
        addIngredient(new Ingredient.Builder().setName("Coffe").setCostPerKilogram(334.6).setWeight(0.150).build());
        addIngredient(new Ingredient.Builder().setName("Water").setCostPerKilogram(20.33).setWeight(0.050).build());
        countCost();
        countWeight();
    }

}
