package com.company.coffemachine.coffe;


//Bevarage
public class Americano extends Beverage {

    public Americano() {
        super("Americano");
        addIngredient(new Ingredient.Builder().setName("Coffe").setWeight(0.223).setCostPerKilogram(133.5).build());
        addIngredient(new Ingredient.Builder().setName("Milk").setWeight(60.35).setCostPerKilogram(0.220).build());
        addIngredient(new Ingredient.Builder().setName("Water").setWeight(20.33).setCostPerKilogram(0.260).build());
        countCost();
        countWeight();
    }

}
