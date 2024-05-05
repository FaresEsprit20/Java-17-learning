package com.learning.oop.homeworkTwo.entities;

public class Lollipop extends Sweet{
    public Lollipop(String name, double weight, double sugarWeight) {
        super(name,weight,sugarWeight);
    }

    @Override
    public String toString() {
        return "Lollipop{} " + super.toString();
    }


}
