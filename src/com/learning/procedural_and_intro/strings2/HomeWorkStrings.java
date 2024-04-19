package com.learning.procedural_and_intro.strings2;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Formatter;

public class HomeWorkStrings {

  public static void main(String[] args) {
/**
 * Solution 1
 * @Author Fares Ben Slama
 */
System.out.println("=============== Solution 1 ====================%n%n");
    //Formatter 1
    Formatter formatter1 = new Formatter();
    formatter1.format("%.1f%n", Math.PI);
    System.out.println(formatter1);
    //Formatter 2
    Formatter formatter2 = new Formatter();
    formatter2.format("%.2f%n", Math.PI);
    System.out.println(formatter2);

    //Formatter 3
    Formatter formatter3 = new Formatter();
    formatter3.format("%.3f%n", Math.PI);
    System.out.println(formatter3);

    //Formatter 4
    Formatter formatter4 = new Formatter();
    formatter4.format("%.4f%n", Math.PI);
    System.out.println(formatter4);

    //Formatter 5
    Formatter formatter5 = new Formatter();
    formatter5.format("%.5f%n", Math.PI);
    System.out.println(formatter5);

    /**
     * Solution 2
     * @Author Fares Ben Slama
     */
    System.out.println("=============== Solution 2 ==================== %n%n");
    BigDecimal bigDecimal1 = BigDecimal.valueOf(Math.PI);
    System.out.println("%n Precision 1  "+bigDecimal1.setScale(1, RoundingMode.HALF_UP));
    BigDecimal bigDecimal2 = BigDecimal.valueOf(Math.PI);
    System.out.println("%n Precision 2  "+bigDecimal2.setScale(2, RoundingMode.HALF_UP));
    BigDecimal bigDecimal3= BigDecimal.valueOf(Math.PI);
    System.out.println("%n Precision 3  "+bigDecimal3.setScale(3, RoundingMode.HALF_UP));
    BigDecimal bigDecimal4= BigDecimal.valueOf(Math.PI);
    System.out.println("%n Precision 4  "+bigDecimal4.setScale(4, RoundingMode.HALF_UP));
    BigDecimal bigDecimal5= BigDecimal.valueOf(Math.PI);
    System.out.println("%n Precision 5  "+bigDecimal5.setScale(5, RoundingMode.HALF_UP));



    /**
     * Splitting String
     * @Author Fares Ben Slama
     */

    String longText = " Hey there! How are you? Are you OKay? this is how you feel i hope.";
    System.out.println(" %n =========================Splitting ======================  %n");
    System.out.println(Arrays.toString(longText.split("[!?.]")));
  }




}
