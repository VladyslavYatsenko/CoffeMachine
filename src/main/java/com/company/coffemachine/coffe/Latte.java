package com.company.coffemachine.coffe;

public class Latte extends Beverage {

    public Latte() {
        super("Latte");
        addIngredient(new Ingredient.Builder().setName("Coffe").setCostPerKilogram(175.0).setWeight(0.150).build());
        addIngredient(new Ingredient.Builder().setName("Milk").setCostPerKilogram(26.6).setWeight(0.150).build());
        addIngredient(new Ingredient.Builder().setName("Water").setCostPerKilogram(15.0).setWeight(0.150).build());
        countCost();
        countWeight();
    }

}
