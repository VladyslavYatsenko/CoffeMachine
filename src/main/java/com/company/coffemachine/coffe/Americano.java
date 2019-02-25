package com.company.coffemachine.coffe;

public class Americano extends Drink {

    public Americano() {
        super("Americano");
        addIngredient(new Ingredient.Builder("Coffe", 334.6, 0.09).build());
        addIngredient(new Ingredient.Builder("Milk", 60.35, 0.220).build());
        addIngredient(new Ingredient.Builder("Water", 20.33, 0.260).build());
        countCost();
        countWeight();
    }
}
