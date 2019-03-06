package com.company.coffemachine.coffe;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;
import static org.assertj.core.api.Assertions.*;

public class BeverageTest {

    private Beverage beverage;
    private Beverage espresso;
    private Beverage latte;

    @Mock
    private List<Ingredient> ingredientsList;//if ingrident`s will change

    @Before
    public void init() {
        beverage= new Americano();
        ingredientsList = beverage.getIngredients();

    }
    @Test
    public void testShouldReturnRightCostOfAmericano() {
        double expected = 0;
        for (Ingredient ingredient : ingredientsList) {
            expected += ingredient.getCost() * ingredient.getWeight();
        }
        expected = (double) Math.round(expected * 100d) / 100d;
        assertThat(expected).isEqualTo(beverage.getTotalCost());
    }
    @Test
    public void testShouldReturnRightListOfIngredientsOfAmericano() {
        Ingredient milk = new Ingredient.Builder().setName("Milk").setWeight(60.35).setCostPerKilogram(0.220).build();
        Ingredient water = new Ingredient.Builder().setName("Milk").setWeight(60.35).setCostPerKilogram(0.220).build();
        Ingredient coffe = new Ingredient.Builder().setName("Water").setWeight(20.33).setCostPerKilogram(0.260).build();
        assertThat(ingredientsList).contains(milk).contains(water).contains(coffe);
    }

    @Test
    public void shouldReturnRightWeightOfAmericano() {
        double expected = 0;
        for (Ingredient ingredient : ingredientsList) {
            expected += ingredient.getWeight();
        }
        assertThat(expected == beverage.getTotalWeight());
    }
}
