package algorithmic;

/*
Given array of bag weights, janitor can carry bags as long as combined weight is less than 3.00
Find # of trips that need to be completed.
E.g. [1.01, 1.99, 2.5, 1.5, 1.1] will take 3 trips

*/

public class EfficientJanitor {

  public static void main(String[] args) {

      float[] weights = {1.01f, 1.99f, 2.50f, 1.50f, 1.10f, 0.39f};

      System.out.println("No of trips= " + countTrips(weights));

  }

    public static int countTrips(float[] weights) {

      int noOfTrips=1;         // trip starts w/ 1st bag

      double bal = 3.00f;

      for (int i=0; i < weights.length ; i++)
      {

          if (bal < weights[i] ) {
              noOfTrips++;
              bal = 3.00f - weights[i];

          }
          else {
              bal -= weights[i];
          }
      }

      return noOfTrips;
    }

}

