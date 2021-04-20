package main.algorithmic;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueString {

  public static void main(String[] args) {

    String str = "hkbfaiorinfoee#inlksgdl74bldk38";

      HashSet hs = new HashSet();
    System.out.println("Enter index " + str.length());
      Scanner sc = new Scanner(System.in);

    int index = sc.nextInt();

    if (index <= str.length()) {

      for (int i = 0; i < index ; i++) {
        hs.add(str.charAt(i));
      }
    } else {
      System.out.println("Index more than string length ");
    }

  System.out.println( hs.size() == index ? "Unique" : "Not Unique " + hs.size()  );   //int does not support .equals
  
  String str1 = "eyyack";
  System.out.println( "Longest substring of unique chars is " + longestUnique(str1)); 
		  
    
    
}

private static String longestUnique(String str1) {
	// TODO Auto-generated method stub
	
	String resultSubstr="";
	int length=0;
	for (char c: str1.toCharArray()) {
		if(str1.indexOf(c) == str1.lastIndexOf(c))
			resultSubstr = resultSubstr + "" + c;
		else {
			
			length = Math.max(length, resultSubstr.length());
			resultSubstr="";
		}
	}
	return null;
}

}