package algorithmic;

/* Reverse list without using Collections.reverse */

import java.util.*;

public class ReverseList {

  public static void main(String[] args) {

    List<String> list = new ArrayList<String>(Arrays.asList("101","%" ,"RED"));



    for(int i= 0, j=list.size()-1; i < j; i++)
      list.add(i,list.remove(j));                       // adds the removed element at given index, but old element is not overwritten

    list.set(0,"NEW");                            // replaces old element
    System.out.println(list);


    }




}
