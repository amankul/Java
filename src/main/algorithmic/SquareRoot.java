package main.algorithmic;

public class SquareRoot {

  public static void main(String args[]) {
    int n = 800; // get square root of this no. without using Math.sqrt ! Also use binary search

    int sqrt = squareroot(n);

    System.out.println("Square root is " + sqrt);
  }

  private static int squareroot(int n) {

    if (n == 0 || n == 1) return n;

    int start = 0;
    int end = n;
    int mid=0;

    while (start <= end) {

      mid = (end + start) / 2;

      if (mid * mid == n) return mid;

      if (mid * mid > n) {
        end = mid - 1;

      } else start = mid + 1;
    }
    return mid;
  }
}