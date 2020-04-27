package algorithmic;

/* Given a long int find no. of ways to represent it  as sum of two of more positive integers */

public class ConsecutiveSum {

  public static void main(String[] args) {

    int num = 21;
    int numOfWays = consecutive(num);
    System.out.println(numOfWays);
  }

  private static int consecutive(int num) {


    int count = 0;
    System.out.println("Integer division 125 by 3 is still int " + (double) (125/3) + " Cast if you want double " + 125/(double)3);

    for (int L = 1; L*(L + 1)/2 < num; L++) {

      double a = ((1.0*num - L * (L + 1) / 2) / (L + 1));          // implicit casting same as double a = (double)num / denom

 //     System.out.println(a +" " + L  );
      if (a - (int) a == 0) {
        System.out.println(a);
        count++; // increase count if a in integer
      }
    }
    return count;
  }
}

/*
N = a + (a+1) + (a+2) + .. + (a+L)
=> N = (L+1)*a + (L*(L+1))/2
=> a = (N- L*(L+1)/2)/(L+1)
We substitute the values of L starting from 1 till L*(L+1)/2 < N
 */