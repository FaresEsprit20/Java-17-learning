package com.learning.oop.homeworkTwo.entities;

public abstract class Sweet {


    private String name;
    private double weight;
    private double sugarWeight;

    public Sweet(String name, double weight, double sugarWeight) {
        this.name = name;
        this.weight = weight;
        this.sugarWeight = sugarWeight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSugarWeight() {
        return sugarWeight;
    }

    public void setSugarWeight(double sugarWeight) {
        this.sugarWeight = sugarWeight;
    }


}
