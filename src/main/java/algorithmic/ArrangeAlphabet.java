package algorithmic;


import java.util.Arrays;

public class ArrangeAlphabet {

  public static void main(String[] args) {

    String str  = "hkbfaiorinfoee#inlksgdl74bldk38";

    char[] temp = str.toCharArray();

    char a = 'a';
    a++;

    Arrays.sort(temp);           // same can sort array of strings too

    System.out.println("Arranged alphabetically " + new String(temp));

    System.out.println("a + 1 = " + a);

    }

}
