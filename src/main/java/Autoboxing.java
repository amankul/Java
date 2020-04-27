

import java.util.ArrayList;
import java.util.List;


public class Autoboxing {

  public static void main(String[] args) {

    int i1 = 11,i2 = 11;                  // int, boolean, char, double are primitive types

   System.out.println(i1 == i2);

    Integer i3 = new Integer("10");     // wrapper class for int, can be passed to methods that expect objects

    Integer i4 = new Integer("10");

    System.out.println(i3 == i4);          // two diff objects hence false

    List<Integer> list = new ArrayList<Integer>();

    list.add(i1);                           // boxing converts primitive to object

  System.out.println( list.get(0) + 10 );               //unboxing because get returns object

    String hex = Integer.toHexString(i3);              // Integer class allows us perform operations

    int rL = Integer.rotateLeft(i4, 2);

  }


  }

