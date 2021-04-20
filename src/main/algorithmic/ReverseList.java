package main.algorithmic;

/* Reverse list without using Collections.reverse */

import java.util.*;

public class ReverseList {

  public static void main(String[] args) {

    List<String> list = new ArrayList<String>(Arrays.asList("101","%" ,"RED","AIVA"));



    for(int i= 0, j=list.size()-1; i < j; i++)
      list.add(i,list.remove(j));                       // adds the removed element at given index, but old element is not overwritten

    list.set(0,"NEW");                            // replaces old element
    System.out.println(list);


    }


}


/*
Reverse list or string
3 0 1 2 5

1. Use another string var and iterate backwards
2. Swap  first with last, second with second last and so on until mid element

5 0 1 2 3 -> 5 2 1 0 3 
 
 3. Above method
 
5 3 0 1 2 -> 5 2 3 0 1 -> 5 2 1 3 0 -> 5 2 1 0 3


*/