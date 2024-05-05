package com.learning.oop.homeworkTwo.entities;

public class Cookie extends Sweet{


    public Cookie(String name, double weight, double sugarWeight) {
        super(name,weight,sugarWeight);
    }


    @Override
    public String toString() {
        return "Cookie{} " + super.toString();
    }


}
