package com.learning.oop.homeworkTwo;


import com.learning.oop.homeworkTwo.entities.*;

import java.util.Arrays;

public class HomeworkTwoOOPMain {


    public static void main(String... args) {
        Sweet candy = new Candy("Candy 1", 5.1, 5.5);

        Sweet cookie = new Cookie("Cookie 1", 17.5, 3.17);

        Sweet lollipop = new Lollipop("Lollipop 1", 1.4, 12.0);

        Present present = new Present(new Sweet[]{candy, cookie, lollipop});





    }




}
