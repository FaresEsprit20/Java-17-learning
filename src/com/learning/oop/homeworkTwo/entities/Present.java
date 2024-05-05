package com.learning.oop.homeworkTwo.entities;

import java.util.Arrays;

public class Present {

    private Sweet[] sweets;

    public Present(Sweet[] sweets) {
        this.sweets = sweets;
    }

    // the method filters sweets by sugar weight inclusively
    public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
        Sweet[] filteredSweets;
        int filteredCount = 0;
        int[] filteredIndexes = new int[sweets.length];
       for(int i = 0; i < sweets.length;i++){
           if(sweets[i].getSugarWeight() >= maxSugarWeight && sweets[i].getSugarWeight() <= maxSugarWeight) {
             filteredCount++;
             filteredIndexes[i] = i;
           }else {
               filteredIndexes[i] = -1;
           }
       }
       filteredSweets = new Sweet[filteredCount];
        int j = 0;
        for (int filteredIndex : filteredIndexes) {
            if (filteredIndex != -1) {
                filteredSweets[j] = sweets[filteredIndex];
                j++;
            }
        }
     return filteredSweets;
    }

    // the method calculates total weight of the present
    public double calculateTotalWeight() {
       double weight = 0.0;
        for (Sweet sweet : sweets) {
            weight += sweet.getWeight();
        }
        return weight;
    }

    // the method that adds sweet to the present
    public void addSweet(Sweet sweet) {
        Sweet[] newSweets =  Arrays.copyOf(sweets, sweets.length + 1);
        newSweets[sweets.length + 1] = sweet;
        sweets = newSweets;
    }

    // the method returns copy of the Sweet[] array so that nobody could
// modify state of the present without addSweet() method.
// Also array shouldn’t contain null values.
    public Sweet[] getSweets() {
      return Arrays.copyOf(sweets,sweets.length);
    }

    @Override
    public String toString() {
        return "Present{" +
                "sweets=" + Arrays.toString(sweets) +
                '}';
    }


}
