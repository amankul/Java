package main.algorithmic;

import java.util.Scanner;

public class StringSimilarity {

  public static void main(String[] args) {

    //   int i = valueOf()
 //   System.out.print("Enter a string : ");
    Scanner in = new Scanner(System.in);
    String inputString = " how are you amit? fine ? ";

    System.out.println(inputString.replace("amit","intellij"));

    System.out.println(inputString.replaceAll("(.*)?","intellij"));

    System.out.println(inputString.trim());       // gets rid of leading and trailing spaces


    System.out.println(inputString.indexOf("amit"));       // index of char or string

    System.out.println(inputString.subSequence(0,12) + "intellij"  + inputString.substring(13+4));  //without using replace

    String findStr = "a";   // Find no of occurences of this in inputString

    int counter=0 ,index =0;

    while ((index = inputString.indexOf(findStr,index)) != -1) {

      counter++;
      index += findStr.length();
    }

    System.out.println("Occurences of " + findStr + " = " + counter);

    System.out.println("One line solution to find occurences of = " + (inputString.split(findStr).length - 1));

    }

}
