package com.company.coffemachine;



public interface Machine {
    public abstract void on();

    public abstract void off();

    public abstract boolean getStatus();

    public abstract String getDescription();

}
