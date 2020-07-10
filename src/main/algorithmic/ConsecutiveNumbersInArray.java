package main.algorithmic;

/* Longest seq of consecutive integers -Solution works even if array is not sorted  */

import java.util.HashSet;

public class ConsecutiveNumbersInArray {

  public static void main(String[] args) {

    int arr[] = { 32, 33, 34, 35, 36, 39, 40, 31, 42, 43, 44, 56, 92, 100};
    int result=0;
    HashSet<Integer> hs = new HashSet<>();

    for(int x: arr)
      hs.add(x);

    for (int i : arr) {

      int count=1;

      int up = i+1;
      while(hs.contains(up)) {
        hs.remove(up);
        count++;
        up++;
      }

      int down = i-1;
      while(hs.contains(down)){
        hs.remove(down);
        count++;
        down--;
      }

      result = Math.max(result,count);

    }

    System.out.println("Max result " + result);
  }


}
