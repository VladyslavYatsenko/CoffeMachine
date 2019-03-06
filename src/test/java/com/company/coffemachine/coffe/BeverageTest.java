package com.company.coffemachine.coffe;

import com.company.coffemachine.factory.impl.AmericanoCoffeFactory;
import com.company.coffemachine.factory.impl.CoffeFactory;
import com.company.coffemachine.factory.impl.EspressoCoffeFactory;
import com.company.coffemachine.factory.impl.LatteCoffeFactory;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BeverageTest {
    private Beverage americano=new Americano();
    @Test
    public void shouldReturnRightCostOfProduct(){
        List<Ingredient> ingredientsList=americano.getIngredients();
        double expected=0;
        for(Ingredient ingredient:ingredientsList){
            expected+=ingredient.getCost()*ingredient.getWeight();
        }
        assertEquals(expected,americano.getTotalCost(),0.01);
    }
    @Test
    public void shouldReturnRightWeightOfProduct(){
        List<Ingredient> ingredientsList=americano.getIngredients();
        double expected=0;
        for(Ingredient ingredient:ingredientsList){
            expected+=ingredient.getWeight();
        }
        assertEquals(expected,americano.getTotalWeight(),0.01);
    }
}
