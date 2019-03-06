package com.company.coffemachine.coffeMachine;


import com.company.coffemachine.CoffeMachine;
import com.company.coffemachine.coffe.Americano;
import com.company.coffemachine.coffe.Beverage;
import com.company.coffemachine.coffe.Espresso;
import com.company.coffemachine.coffe.Latte;
import com.company.coffemachine.factory.impl.CoffeFactory;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.assertj.core.api.Assertions.*;

public class CoffeMachineTest {
   private CoffeMachine coffeMachine;
   @Before
    public void init(){
       coffeMachine=new CoffeMachine();
   }
   @Test
    public void testShouldReturnStatusOffOfCoffeMachine(){
       coffeMachine.off();
       assertThat(false).isEqualTo(coffeMachine.getStatus());
   }
    @Test
    public void testShouldReturnTrueStatusOnOfCoffeMachine(){
        coffeMachine.on();
        assertThat(true).isEqualTo(coffeMachine.getStatus());
    }
    @Test
    public void testShouldCreateInstanceOfAmericanoTypeOfBeverage(){
        Beverage americano=coffeMachine.createAmericano();
        assertThat(americano).isInstanceOf(Americano.class);
    }
    @Test
    public void testShouldCreateInstanceOfEspressoTypeOfBeverage(){
        Beverage espresso=coffeMachine.createEspresso();
        assertThat(espresso).isInstanceOf(Espresso.class);
    }
    @Test
    public void testShouldCreateInstanceOfLatteTypeOfBeverage(){
        Beverage latte=coffeMachine.createLatte();
        assertThat(latte).isInstanceOf(Latte.class);
    }
    @Test
    public void testShouldCheckDescriptionOfCoffeMachine(){
       assertThat("Coffe Machine(Version 1.1)").isEqualTo(coffeMachine.getDescription());
    }
}