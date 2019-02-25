package com.company.coffemachine.coffe;

public class Latte extends Drink {

    public Latte(){
        super("Latte");
        addIngredient(new Ingredient.Builder("Coffe",175.0,0.150).build());
        addIngredient(new Ingredient.Builder("Milk",26.6,0.150).build());
        addIngredient(new Ingredient.Builder("Water",15.0,0.150).build());
        countCost();
        countWeight();
    }

}
