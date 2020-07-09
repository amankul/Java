package main.algorithmic;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/*
Given an array  of  integers and a number, , perform  left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.

An array of integers .
An integer , the number of rotations.
 */

public class RotateArray {

  // Complete the rotLeft function below.
/*  static int[] rotLeft(int[] a, int d) {

    int[] b = new int[d];
    for (int i=0; i <d ; i++)
      b[i] = a[i];

    for(int i=d; i< a.length; i++)
      a[i-d] = a[i];

    for(int i=0; i<d; i++)
      a[a.length-d+i] = b[i];

    return a;
  }*/

  static int[] rotLeft(int[] a, int d) {

    for (int i=0; i <d ; i++)
      rotatebyone(a,a.length);
    return a;
  }

  static public void rotatebyone(int[] a,int n)
  {
    int temp = a[0];
    for(int i=0; i< n-1 ; i++)
      a[i] = a[i+1];
    a[n-1] = temp;
  }



  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    RotateArray rotate = new RotateArray();
    int arr[] = { 1, 2, 3, 4, 5, 6, 7 };           // or int[] arr2 = new int[]{ 1, 2, 3, 4, 5, 6, 7 };


    arr = rotate.rotLeft(arr, 3);
    System.out.println(Arrays.toString(arr));
  }
}
