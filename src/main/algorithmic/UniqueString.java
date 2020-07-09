package main.algorithmic;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueString {

  public static void main(String[] args) {

    String str = "hkbfaiorinfoee#inlksgdl74bldk38";

      HashSet hs = new HashSet();
    System.out.println("Enter index " + str.length());
      Scanner sc = new Scanner(System.in);

    int index = sc.nextInt();


    if (index <= str.length()) {

      for (int i = 0; i < index ; i++) {
        hs.add(str.charAt(i));
      }
    } else {
      System.out.println("Index more than string length ");
    }


    System.out.println( hs.size() == index ? "Unique" : "Not Unique " + hs.size()  );   //int does not support .equals
}

}