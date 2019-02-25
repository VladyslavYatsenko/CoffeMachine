package com.company.coffemachine.coffe;

import java.util.LinkedList;
import java.util.List;

public abstract class Drink {
    private List<Ingredient> ingredients = new LinkedList<>();
    private String name;
    private double totalCost;
    private double totalWeight;

    @Override
    public String toString() {
        return "Your drink is-> [" + name + "]" + "\n [Ingredients: " + ingredients + "]" + "\n Total Cost (UAH)->" + totalCost + " Total Weight (kg)->" + totalWeight;
    }

    public Drink(String name) {
        this.name = name;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public double countCost() {
        for (Ingredient ingredient : ingredients) {
            totalCost += (ingredient.getCost() * ingredient.getWeight());
        }
        totalCost = (double) Math.round(totalCost * 100d) / 100d;
        return totalCost;
    }

    public double countWeight() {
        for (Ingredient ingredient : ingredients) {
            totalWeight += ingredient.getWeight();
        }
        totalWeight = (double) Math.round(totalWeight * 100d) / 100d;
        return totalWeight;

    }
}
