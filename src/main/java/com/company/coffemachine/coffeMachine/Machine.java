package com.company.coffemachine.coffeMachine;

import com.company.coffemachine.coffe.Beverage;

public interface Machine {
    public abstract void on();

    public abstract void off();

    public abstract boolean getStatus();

    public abstract String description();

}
