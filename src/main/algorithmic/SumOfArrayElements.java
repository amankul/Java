package main.algorithmic;

/* Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfArrayElements {

  public static void main(String[] args) {
  
    int k = 17;
    List<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 15, 3, 7));
    
    System.out.println("Given element " + k + " is sum of element at given two indexes" + Arrays.toString(getIndexes(k,list)));
    
  }
    
     private static int[] getIndexes(int k, List<Integer> list) {
	// TODO Auto-generated method stub
    	 int retIndexes[] = {-1,-1};
    	 int diff;
    	 
    	 for (int i : list)
    	 {
    	      diff = k - i;
    	      if (list.contains(diff) && list.indexOf(i) != list.indexOf(diff)) {
    	        System.out.println("Given no is sum of " + i + " and " + diff);
    	        retIndexes[0] = list.indexOf(i);
    	        retIndexes[1] = list.indexOf(diff);
    	        break;
    	      }
    	    }
    	 return retIndexes;
}

	
  }
