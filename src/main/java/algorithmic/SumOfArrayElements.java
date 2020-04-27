package algorithmic;

/* Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfArrayElements {

  public static void main(String[] args) {

    int a[] = {10, 15, 3, 7};
    int k = 17;
    int diff;

    List<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 15, 3, 7));
    for (int i : list) {
      diff = k - i;
      if (list.contains(diff)) {
        System.out.println("Given no is sum of " + i + " and " + diff);
        break;
      }
    }
  }
}