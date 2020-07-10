package main.algorithmic;

/* This program checks if given string is palindrome i/e stays same if reversed.
Also gives reversed string */

public class Palindrome {

  public static void main(String[] args) {

    String pal = "AffA";

    System.out.println("Reverse string " + revStr(pal));

    }

    public static String revStr(String pal)
    {
    int l = pal.length();
    System.out.println("No of chars " + pal.length());

    /*
    String reverse = "";
      int h = 0;

        while(h<l)
        {
      if (pal.toCharArray()[h++] != pal.toCharArray()[l--]) {      // h++ increments the number after the expression is evaluated.hence we
                                                                  // do not miss out on first element
        System.out.println("Not palindrome");
        return;
                }
        }

        System.out.println("palindrome");
    }
 */

    StringBuilder sb = new StringBuilder();

    for (int h = l-1 ; h >= 0; h--) {

       sb.append(pal.charAt(h));


    }


//    System.out.println("Trim = " + reverse.trim());

      System.out.println("palindrome = " + sb.toString().equals(pal));

    

      return sb.toString();
}
}
