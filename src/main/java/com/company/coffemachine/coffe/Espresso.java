package com.company.coffemachine.coffe;

import java.util.LinkedList;

public class Espresso extends Drink {

    public Espresso(){
        super("Espresso");
        addIngredient(new Ingredient.Builder("Coffe",334.6,0.150).build());
        addIngredient(new Ingredient.Builder("Water",20.33,0.050).build());
        countCost();
        countWeight();
    }

}
