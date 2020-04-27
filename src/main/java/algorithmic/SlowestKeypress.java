package algorithmic;

/*
If user types set of keys, we want to find which key takes longest time.
We store key and time stamp in 2D int array [[0,2],[1,5],[0,9],[2,15]
First element of keytimes[i][0] is encoded character e.g. a=0, b=1, z=25 etc
Second element is time when key is pressed since test started..
So abac pressed at times 2,5,9,15 are represented above. Longest time was c in 15-9=6

*/

import java.util.ArrayList;
import java.util.Arrays;

public class SlowestKeypress {

  public static void main(String[] args) {

      ArrayList<ArrayList<Integer>> aList = new ArrayList<ArrayList<Integer>>();
      ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(0,2));
      ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,5));
      ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(0,9));
      ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(2,15));
      aList.add(list1);
      aList.add(list2);
      aList.add(list3);
      aList.add(list4);

      System.out.println("Slowest key is " + Solution(aList));
  }

    /*
     * Complete the 'slowestKey' function below.
     *
     * The function is expected to return a CHARACTER.
     * The function accepts 2D_INTEGER_ARRAY keyTimes as parameter.
     */

    public static char Solution(ArrayList<ArrayList <Integer>> keyTimes) {

        int charWeWant = keyTimes.get(0).get(0) + 97;        // a = ascii 97
        int diff = keyTimes.get(0).get(1);
        for (int i = 0; i < keyTimes.size()-1; i++) {

            int timeDiff = keyTimes.get(i+1).get(1) - keyTimes.get(i).get(1)  ;
            if (timeDiff > diff) {
                diff = timeDiff;
                charWeWant = keyTimes.get(i+1).get(0) + 97;
            }

        }
        return  (char) charWeWant;
    }

}

