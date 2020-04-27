package algorithmic;

import java.util.ArrayList;
import java.util.ListIterator;

/* This class prints Fibonocci series where each number is the sum of the two preceding ones, starting from 0 and 1
The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
This class prints the series upto the index and at nth index */

public class Fibonocci {

  public static void main(String[] args) {

    int n = 13;
    System.out.println("Final o/p " + fib(n));
  }

  public static int fib(int n) {

 /*   // Using recursion
        int sum = 0;
    if (n == 0 || n == 1) {
      return n;
    } else {
      return sum = fib(n - 1) + fib(n - 2);
    }
*/
    ArrayList<Integer> AL = new ArrayList<>();
    int f[] = new int[n + 2];
    f[0] = 0;
    f[1] = 1;

    AL.add(f[0]);
    AL.add(f[1]);


    for (int i = 2; i < n; i++) {
      f[i] = f[i - 1] + f[i - 2];
      AL.add(f[i]);
    }
    System.out.println("Sequence " + AL.size());
    System.out.println("Sum " + f[n-1]);

//    Collections.sort(AL, Collections.reverseOrder());
    System.out.println("ArrayList " + AL);

    ListIterator ltr = AL.listIterator();


   while (ltr.hasNext())
   {
     int i = (Integer)ltr.next();
     System.out.print(i + " ");
     if (i % 2 != 0)
     ltr.remove();

   }
    System.out.println("\n ArrayList with even elements " + AL);

    //   AL.sort();
    return f[n];

  }
  }
