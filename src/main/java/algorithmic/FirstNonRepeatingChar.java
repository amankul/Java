package algorithmic;

import java.util.*;

/* This program prints all characters in string with no. of occurences.
Also first non-repeating character in the string */

public class FirstNonRepeatingChar {

  public static void main(String[] args) {

    String s = "amazon";

/*
    for (int i = 0; i < s.length(); i++) {
      for (int l = i + 1; l < s.length(); l++) {
        if (s.charAt(i) == s.charAt(l)) break;
        if (l == s.length() - 1) {

          System.out.println("Mismatched char is " + s.charAt(i));
          return;
        }
              }
    }
*/

    char index =  firstNonRepeating(s);

    System.out.println(index == -1 ? "Either all characters are repeating or string " +
            "is empty" : "First non-repeating character with new code is " +  index);

  }

  private static char firstNonRepeating(String s) {

     Map<Character,Integer> charcounts = new LinkedHashMap<Character, Integer>();        // Linkedhashmap used bcoz it maintains the order of insertion.
    for (char c: s.toCharArray()) {
        charcounts.put(c,charcounts.containsKey(c) ? charcounts.get(c) + 1 : 1);  // This replaces one liners after if else
    }
   System.out.println("Character counts" + charcounts );

    char a = 'a';
      System.out.println("get" + charcounts.get(a));

      System.out.println(sortByValue(charcounts,2).toString());



      for (Map.Entry<Character,Integer> entry : charcounts.entrySet())  // Entry makes each key(return) and value(for check) accessible
      {
          if (entry.getValue() == 1)
              return entry.getKey();
   /*for (Character entry : counts.keySet())
    {
      if (counts.get(entry) == 1)
      {
       return entry;
      }*/
    }
    throw new RuntimeException("didn't find any non repeated Character");
  }

    public static <K, V extends Comparable<? super V>> Map<K, V>
    sortByValue(Map<K, V> map,int limit) {

        List<Map.Entry<K, V>> list                                    // collections can sort array and list, hence converting map to list
                = new LinkedList<>(map.entrySet());

        System.out.println("map entry list" + list);

        Collections.sort(list, new Comparator<Map.Entry<K, V>>()

                {
                    @Override
                    public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                        System.out.println(o1.getKey()  + " " + o2.getKey() + " " + (o1.getValue()).compareTo(o2.getValue()) );
                        return (o1.getValue()).compareTo(o2.getValue());

                    }
                }
                .reversed()        //to arrange it in descending order
        );

        System.out.println("map entry list" + list);

        Map<K, V> result = new LinkedHashMap<>();//maintains the order which the entries were put into the map
        for (Map.Entry<K, V> entry : list) {
            if (limit == 0) {
                break;
            }
            result.put(entry.getKey(), entry.getValue());
            limit--;
        }
        return result;


      }
    }



