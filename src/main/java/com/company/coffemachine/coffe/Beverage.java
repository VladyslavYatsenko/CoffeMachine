package com.company.coffemachine.coffe;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public abstract class Beverage {
    private List<Ingredient> ingredients = new LinkedList<>();
    private String name;
    private double totalCost;
    private double totalWeight;

    public double getTotalCost() {
        return totalCost;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Your drink is-> [" + name + "]" + "\n [Ingredients: " + ingredients + "]" + "\n Total Cost (UAH)->" + totalCost + " Total Weight (kg)->" + totalWeight;
    }

    public Beverage(String name) {
        this.name = name;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beverage beverage = (Beverage) o;
        return Double.compare(beverage.totalCost, totalCost) == 0 &&
                Double.compare(beverage.totalWeight, totalWeight) == 0 &&
                ingredients.equals(beverage.ingredients) &&
                name.equals(beverage.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredients, name, totalCost, totalWeight);
    }
}
