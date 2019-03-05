package com.company.coffemachine.coffeMachine;

import com.company.coffemachine.coffe.Americano;
import com.company.coffemachine.coffe.Beverage;
import com.company.coffemachine.coffe.Espresso;
import com.company.coffemachine.coffe.Latte;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoffeMachineTest {
    private CoffeMachine coffeMachine;
    @Before
    public void init(){
        coffeMachine=new CoffeMachine();
    }
    @Test
    public void shouldReturnOnStatus(){
        coffeMachine.on();
        assertEquals(true,coffeMachine.getStatus());
    }
    @Test
    public void shouldReturnOffStatus(){
        coffeMachine.off();
        assertEquals(false,coffeMachine.getStatus());
    }
    @Test
    public void shouldCreateLatte(){
        Beverage latte=new Latte();
        assertEquals(latte.getIngredients(),coffeMachine.createLatte().getIngredients());
    }
    @Test
    public void shouldCreateAmericano(){
        Beverage americano=new Americano();
        assertEquals(americano.getIngredients(),coffeMachine.createAmericano().getIngredients());
    }
    @Test
    public void shouldCreatEspresso(){
        Beverage espresso=new Espresso();
        assertEquals(espresso.getIngredients(),coffeMachine.createEspresso().getIngredients());
    }
}