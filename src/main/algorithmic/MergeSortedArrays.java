package main.algorithmic;

/* This merges sorted arrays */

import java.util.Arrays;

public class MergeSortedArrays {

  public static void main(String[] args) {

    int[] A = {1, 3, 5, 10};
    int B[] = {2, 4, 6, 7};

    int la = A.length;
    int lb = B.length;
    int lc = la+lb;

    int[] C = new int[lc];

    System.out.println("Size of merged array will be " + (lc));

    merge(A,B,C,la,lb);

    System.out.println("Merged and sorted array is " );
    System.out.println(Arrays.toString(C) + " ");

    int sum=0;
    for (int i=0; i < C.length ; i++)
      sum = sum + C[i];

    System.out.println("Mean of merged array " + (double)sum/(double) C.length );

    double median;
    if(C.length%2 != 0)
      median = C[(C.length)/2];
    else
      median =  (C[(C.length)/2] + C[(C.length)/2 - 1 ] )  / 2.0 ;

    System.out.println("Median of merged array " + median );
  }

  public static int[] merge(int[] A, int[] B, int[] C, int la, int lb) {


    int counter_a = 0, counter_b = 0, counter_c = 0;
    while (counter_a < la && counter_b < lb) {

      if (A[counter_a] < B[counter_b]  )                             // compare first element of each array, whichever smaller put in result and increment array of smaller element only.
        C[counter_c++] = A[counter_a++];

      else
        C[counter_c++] = B[counter_b++];
      }

    while (counter_a < la)
      C[counter_c++] = A[counter_a++];                  // Store remaining elememts of first array

    while (counter_b < lb)
      C[counter_c++] = B[counter_b++];

    return C;
    }


  }
