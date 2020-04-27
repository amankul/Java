package algorithmic;

import java.util.Arrays;
import java.util.HashSet;

/*
1. Each word in the input string is replaced with the following: the first letter of the word, the count of distinct letters between the first and last letter, and the last letter of the word. For example, “Automotive parts" would be replaced by "A6e p3s".
2. A "word" is defined as a sequence of alphabetic characters, delimited by any non-alphabetic characters.
3. Any non-alphabetic character in the input string should appear in the output string in its original relative location.
*/

public class Cox {

  public static void main(String[] args) {

    String inputStr = "Automotive parts$whatever1x";



    if (inputStr.isEmpty() || inputStr.equals(null)) {
      System.out.println("Invalid String ");
      return;
      }

    String[] wordArr = inputStr.split("\\P{Alpha}+");

    System.out.println("Word array " + Arrays.toString(wordArr));

    for (String word : wordArr) {
      int length = word.length();
      int unique_count = getUniquecount(word,length);           // count unique chars in each word

      if (length == 1)
        inputStr =  inputStr.replaceAll(word, word.charAt(0) + String.valueOf(unique_count) );
      else
      inputStr =  inputStr.replaceAll(word, word.charAt(0) + String.valueOf(unique_count) + word.charAt(word.length()-1));

    }

    System.out.println(inputStr);
  }

  private static int getUniquecount(String s, int length) {


    HashSet hs = new HashSet();

    for (int i = 1; i < length - 1; i++)                //skip first and last chars
      hs.add(s.charAt(i));

    return hs.size();
  }
}

/*
----------------------------------------------------------------------------------------------------
UNIT TESTS



1. Input String- amazon One$staAar
Expected output- a4n O1e$s3r


2.Input String- Outstanding *solution?ajax'z
Expected output- O7g *s5n?a2x'z0

3.Input String- XxxxxxxX YyyyyyyyyyyyyyyyyyyYyyyyyyyyyyyyyyy^ZZzzzzzzzZZ
Expected output- X1X Y2y^Z2Z

4.Input String- Outstanding *solution?ajax'z
Expected output- O7g *s5n?a2x'z0

5.Input String- null
Expected output- Invalid String

----------------------------------------------------------------------------------------------------
 */