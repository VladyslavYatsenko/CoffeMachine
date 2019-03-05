package com.company.coffemachine.coffe;

import java.util.Objects;

public class Ingredient {
    private String name;
    private double costPerKilogram;
    private double weight;

    public Ingredient(Builder builder) {
        this.name = builder.name;
        this.costPerKilogram = builder.costPerKilogram;
        this.weight = builder.weight;
    }

    public static class Builder {
        private String name;
        private double costPerKilogram;
        private double weight;


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCostPerKilogram(double costPerKilogram) {
            this.costPerKilogram = costPerKilogram;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Ingredient build() {
            return new Ingredient(this);
        }
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", cost(per kg)=" + costPerKilogram +
                        ", weight=" + weight +
                        '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Double.compare(that.costPerKilogram, costPerKilogram) == 0 &&
                Double.compare(that.weight, weight) == 0 &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, costPerKilogram, weight);
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return costPerKilogram;
    }

    public double getWeight() {
        return weight;
    }


}
