
package algorithmic;

/* Given two different sequences of the same length, a1a2...ak and b1b2...bk, the first one is smaller than the second one for the lexicographical order, if ai<bi (for the order of A), for the first i where ai and bi differ. E.g abd is greater than abc and also ab.
 CompareTo returns unicode diff between two strings. So abd vs abc(or ab) = 1, abc vs ram = -17 */

import java.util.Arrays;

public class Lexicograph {

  public static void main(String[] args) {

    String s1 = "ram";
    String s2 = "rame";
    String s3 = "shyam";
    String s4 = "aa";

    System.out.println(" Comparing strings with compareto:");
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.compareTo(s3));
    System.out.println(s1.compareTo(s4));

    char[] chars = s1.toCharArray();
    Arrays.sort(chars);

    String result = "";
    lexicographic(chars, result,0);


  }

  private static void lexicographic(char[] chars,String result, int level) {

    if(result.length() == chars.length)
    {
      System.out.println("Lexicographic " + result + " ");
      return;
    }

    for (int i=0; i+level < chars.length  ; i++){
      lexicographic(chars, result + chars[i+level], level+1 );
    }

  }
}



/*
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

class Lexicograph
{

  static void stringCombination(char[] result, char[] str, int[] count, int level, int size, int length)
  {

    // return if level is equal size of string

    if (level == size) {
      System.out.println(result);
      System.out.println(Arrays.toString(count));
      return;
}
    for (int i = 0; i < length; i++)
    {

      if (count[i] == 0)
        continue;

      count[i]--;              // decrease the char occurrence by 1

      result[level] = str[i];

      stringCombination(result, str, count, level + 1, size, length);     // call the function from next level

      count[i]++;               // backtracking
    }
  }

  static void combination(char[] chars)
  {

    Arrays.sort(chars);

    LinkedHashMap <Character, Integer> mp = new LinkedHashMap<>();

    for (char c: chars)
      mp.put(c, mp.containsKey(c) ? mp.get(c) + 1 :  1);

    // initialize the input array with all unique char

    char[] input = new char[mp.size()];

    // initialize the count array with occurrence the unique char

    int[] count = new int[mp.size()];

    // temporary char array for store the result
    char[] result = new char[chars.length];

    int i = 0;
    for (HashMap.Entry<Character,
            Integer> entry : mp.entrySet())
    {

      input[i] = entry.getKey();                       // unique chars

      count[i] = entry.getValue();                   // no. of occurences
      i++;
    }

    // size of map(no of unique char)
    int length = mp.size();

    // size of original string
    int size = chars.length;

    // call function for print string combination
    stringCombination(result, input, count, 0,size, length);
  }

  // Driver code
  public static void main (String[] args)
  {
    String str = "AB";
    combination(str.toCharArray());
  }
}
*/