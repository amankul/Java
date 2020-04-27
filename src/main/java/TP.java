import java.time.LocalDateTime;
import java.util.*;


//import com.winterwell.json.

public class TP {




  public static void main(String[] args) {

    // TODO Auto-generated method stub
    int a = 11;

    int b = 20;

    String S1 = "HelloAMIT " + LocalDateTime.now();

    String S2 = "2000.05000"  + LocalDateTime.now().toString().replaceAll("[-:.T]", "") ;

    Float S3 = 7.14f;

    System.out.println(S1);

    System.out.println("Parse " + Float.parseFloat(S2));

    // out.println(Float.parseFloat(S3.toString()));

    System.out.println(Double.compare(Double.parseDouble(S3.toString()), Float.valueOf(S3)));

    System.out.println();

    System.out.println("Value of " + Float.valueOf(S2));

    if (a < 20) {
      int y = 1;

      System.out.println("y=1 in if loop");

    } else {
      int y = 2;
      System.out.println("y=2 in else loop");
    }

    String array[] = {"Ron", "Harry", "Hermoine"};

    for (String x : array) {
      System.out.println(x);
    }

    //       for loop for same function
    for (int i = 0; i < array.length; i += 2) {
      System.out.println(array[i]);
    }

    ArrayList<String> ar = new ArrayList<>(); // Collection of strings only
    HashMap<String, Integer> h =
        new HashMap<>(); // Collection of key:value pairs. add,get,put values
    System.out.println("SIZE" + ar.size());

    double y = Math.pow(2, 10);

    System.out.println("POWER " + y);

    double z = Math.log10(y);
    System.out.println("BASE " + z);

    int arry[] = {1011, 22, 719, 411};
 //   System.out.print(arry.toString());
    Arrays.sort(arry);


    System.out.println(Arrays.toString(arry));
    Collections.reverse(Arrays.asList(arry));


    System.out.println("Reverse " + Arrays.toString(arry));

    Collections.sort(Arrays.asList(arry), new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o3) {
        return 0;
      }
    });

    System.out.println("Sort " + Arrays.toString(arry));

    int x = funsize(5);
    System.out.println("Return " + x);

//    System.out.println("Y 1 " + y1);

    Random rand = new Random();                                      // generate random nos from 2-7
    System.out.println("Random no " + (rand.nextInt(6) + 2));  //  nexttInt generates random nos from 0-5, we offset by 2

    System.out.println("BINARY REP of 60 - " + Integer.toBinaryString(60));
    System.out.println("BINARY REP of 13 - 00" + Integer.toBinaryString(13));

    System.out.println("BITWISE AND - " + Integer.toBinaryString((60&13)));        // BITWISE OR(A|B), COMPLIMENT(~A) can be done similarly
    System.out.println("BITWISE XOR - " + Integer.toBinaryString(60^13));      // XOR gives 1 if mismatch, 0 is not

    System.out.println("LEFT SHIFT - " + (60 << 5) + "   " + Integer.rotateLeft(60,5));       // 8 bit rep
    System.out.println("ZERO FILL RIGHT SHIFT - " + (13 >>> 2) );




}

  private static int funsize(int x) {

    int y1 = 5;
    System.out.println("Y1  " + y1);

    if (x == 0) return 0;
    else {
      return  ( funsize(x-1) );
    }
}

}

// try-catch, anagram,