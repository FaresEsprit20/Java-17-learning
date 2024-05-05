package com.learning.oop.homeworkTwo.entities;

public class Candy extends Sweet {

    public Candy(String name, double weight, double sugarWeight) {
        super(name,weight,sugarWeight);
    }

    @Override
    public String toString() {
        return "Candy{} " + super.toString();
    }
}
