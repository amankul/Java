package main.algorithmic;

/*
Two strings are called anagrams if they contain same set of characters but in different order.
*/

public class Anagram {

  public static void main(String[] args) {



    String inputStr1 = "Mother In Lawn";
    String inputStr2 = "Hitler Woman";


    inputStr1 = inputStr1.replaceAll("\\s","");               //Removing white spaces
    inputStr2 = inputStr2.replaceAll("\\s","");

      System.out.println( isAnagram(inputStr1,inputStr2) ? "ANAGRAM": "NOT ANAGRAM");

}

  private static boolean isAnagram(String inputStr1, String inputStr2) {

    final int NO_OF_CHARS = 128;                             //128 keyboard characters, 256 extended ASCII. Can use hashmap to optmize further.

    if (inputStr1.length() != inputStr2.length())
      return false;

    char[] inputChars1 = inputStr1.toLowerCase().toCharArray();
    char[] inputChars2 = inputStr2.toLowerCase().toCharArray();


    int[] count = new int[NO_OF_CHARS];


    for (int i=0; i < inputStr1.length() && i < inputStr2.length() ; i++)
    {
      count[inputChars1[i]]++;                                     //update the position of char with # of occurences e.g. A is 65th
      count[inputChars2[i]]--;
    }

    for(int i: count)
      if (i != 0)
        return false;                                      // increment will balance decrements, so count will have all O if anagram
      return true;

  }


}

/*

Another approachs is to be sort the char arrays using Arrays.sort and check if equals using Arrays.equal
OR
For each char in 1, remove char in 2 using stringbuilder. If all found return true.
 */