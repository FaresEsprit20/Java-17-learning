package com.learning.procedural_and_intro.strings2;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsClass {

  public static void main(String[] args) {
    String string = "hello";
    System.out.println(Arrays.toString(string.split("e"))); //prints  ["h","llo"]
    String greetingsTemplate = " Hello dear %s , Good %s ,Welcome to %s company %d th department";
    String name= "John Doe";
    String context="evening";
    String company = "Vermeg";
    int depNumber = 5;
    String formattedString =  String.format(greetingsTemplate,name,context,company,depNumber);
    System.out.println(formattedString);
    System.out.println(Arrays.toString(formattedString.split(",")));

    /**
     * Regular Expressions
     * @author Fares Ben Slama
     */
     //step1 define the regex
    String gmailPattern = "[a-zA-Z-\\d]+@gmail\\.com";
    //step 2 create pattern and compile the regex
    Pattern pattern = Pattern.compile(gmailPattern);

    String sampleText= "Usually you can search email addresses because they have a format like john25@gmail.com or even yulia25@gmail.com , " +
      "emails of Google company are the most popular worldwide, Google company prove to be the best for years and " +
      "made it's concurrent Yahoo in very bad situation after years of dominating the market of Mailing via the internet." +
      "Yahoo used to have format of email such fares@yahoo.fr";
    //step3 create a matcher and user matcher method to prepare searching pattern inside a big string
    Matcher matcher = pattern.matcher(sampleText);
    //step 4 search for the pattern , if there are matches , you will be able to use group() method
    boolean foundMatches = matcher.find();
    //step 5 if there are matches they will be inside this string
    if(foundMatches){
      String matchResults = matcher.group();
      System.out.println(matchResults);
    }










  }

}
