package com.company.coffemachine.coffe;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IngredientTest {
    private Ingredient ingredient;
    @Before
    public void init(){
         ingredient=new Ingredient.Builder().setName("Coffe").setWeight(0.321).setCostPerKilogram(145.45).build();
    }
    @Test
    public void shouldReturnRightNameOfIngredient(){
        assertEquals("Coffe",ingredient.getName());
    }
    @Test
    public void shouldReturnRightWeightOfIngredient(){
        assertEquals(0.321,ingredient.getWeight(),0.0001);
    }
    @Test
    public void shouldReturnRightCostPerKilogram(){
        assertEquals(145.45,ingredient.getCost(),0.0001);
    }
    @Test
    public void shouldReturnRightDescription(){
        String ingredientDescription="name='Coffe', cost(per kg)=145.45, weight=0.321}";
        assertEquals(ingredientDescription,ingredient.toString());
    }
}
