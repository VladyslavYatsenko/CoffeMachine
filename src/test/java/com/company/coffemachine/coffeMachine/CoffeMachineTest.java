package com.company.coffemachine.coffeMachine;

import com.company.coffemachine.coffe.Americano;
import com.company.coffemachine.coffe.Beverage;
import com.company.coffemachine.coffe.Espresso;
import com.company.coffemachine.coffe.Latte;
import com.company.coffemachine.factory.impl.CoffeFactory;
import org.junit.Before;
import org.junit.Test;

import javax.crypto.Mac;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CoffeMachineTest {
    private CoffeMachine coffeMachine;
    private CoffeFactory coffeFactory;

    @Before
    public void init() {
        coffeFactory = mock(CoffeFactory.class);
        coffeMachine = new CoffeMachine(coffeFactory);
    }
    @Test
    public void commonTestCoffeMachine(){
        coffeFactory.createDrink();
//        coffeFactory.createDrink();
        verify(coffeFactory,times(1)).createDrink();
    }
    @Test
    public void coffeFactoryShouldReturnLatte() {
        Beverage latte = new Latte();
        when(coffeFactory.createDrink()).thenReturn(latte);
        assertEquals(coffeMachine.createLatte(),latte);
    }
    @Test
    public void coffeFactoryShouldReturnEspresso() {
        Beverage espresso = new Espresso();
        when(coffeFactory.createDrink()).thenReturn(espresso);
        assertEquals(coffeMachine.createEspresso(),espresso);
    }
    @Test
    public void coffeFactoryShouldReturnAmericano() {
        Beverage americano = new Americano();
        when(coffeFactory.createDrink()).thenReturn(americano);
        assertEquals(coffeMachine.createAmericano(),americano);
    }

    @Test
    public void coffeMachineShouldReturnOnStatus() {
        coffeMachine.on();
        assertEquals(true, coffeMachine.getStatus());
    }

    @Test
    public void coffeMachineShouldReturnOffStatus() {
        coffeMachine.off();
        assertEquals(false, coffeMachine.getStatus());
    }

    @Test
    public void coffeMachineShouldCreateLatte() {
        Beverage latte = new Latte();
        assertEquals(new Latte(), latte);//1st expected 2nd natural
    }

    @Test
    public void coffeMachineShouldCreateAmericano() {
        Beverage americano = new Americano();
        assertEquals(new Americano(),americano);
    }

    @Test
    public void coffeMachineShouldCreatEspresso() {
        Beverage espresso = new Espresso();
        assertEquals(new Espresso(),espresso);
    }
    @Test
    public void checkCoffeMachineDescription(){
        String desc="Coffe Machine(Version 1.1)";
        assertEquals(coffeMachine.description(),desc);

    }
}