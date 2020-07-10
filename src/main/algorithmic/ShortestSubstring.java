package main.algorithmic;
import java.util.HashSet;

/* shortest substring containing all letters */

public class ShortestSubstring {

  public static void main(String[] args) {

    String s = "AABBBCBB";
    System.out.println("Substring test " + s.substring(0,s.length()));        // endIndex is not printed
    String res = shortestSubtring(s);
    System.out.println("Shortest substring is " + res + " and its length is " + res.length());
  }

  private static int getUniques (String s){
    HashSet hs = new HashSet();
    for( char c: s.toCharArray())
      hs.add(c);
    return hs.size();
  }

  private static String shortestSubtring(String s) {

    String result = null;
    int minlength = getUniques(s);
    int original_len = s.length();

    System.out.println("Uniques " + minlength);

    int lengthwewant = original_len;

    for (int i=0 ; i<= original_len; i++){
      for (int j=minlength+i ; j <= original_len; j++){
          String sub_str = s.substring(i,j);
          int sub_str_uniq = getUniques(sub_str);
          int sub_str_len = sub_str.length();

        if (sub_str_uniq == minlength && sub_str_len < lengthwewant ){
            lengthwewant = sub_str_len;
             result = sub_str;
          }
        }
      }

    return result;
  }
}
