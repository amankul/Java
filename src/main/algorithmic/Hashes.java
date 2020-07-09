package main.algorithmic;


import java.util.*;

/* This program shows usage of Hashset, Linkedhashset, hashmap, linkedhashmap and treemap */

public class Hashes {

  public static void main(String[] args) {

    int array[]= {1, -1, 0, 2,-2, 1};



    int a = Math.abs(1);

    HashSet<Integer> set = new HashSet<>();
    LinkedHashSet<Integer> lset = new LinkedHashSet<>();



    HashMap<Integer, String> map = new HashMap<Integer, String>();
    LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();
    TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();


    for (int x : array)
    {

      set.add(x);
      lset.add(x);
      map.put(x,Integer.toString(x));
      lmap.put(x,Integer.toString(x));
      tmap.put(x,Integer.toString(x));
    }

    set.add(-2);



    map.put(null,"AMIT");                           // Hashmap allows null keys and duplicate values unlike Hashtable and set
    map.put(104,"AMIT");

    tmap.put(104,"-3");

    System.out.println("HASH SET -" + set);
    System.out.println("LINKED HASH SET -"+ lset);                        // Linked map and set maintains the insertion order
    System.out.println("HASH MAP -" + map.values());

    System.out.println("LINKED HASH MAP -"+ lmap.keySet());

    System.out.println("TREE MAP -" + tmap.entrySet());            // In Treemap Keys are in sorted order, not values
  }

/*  You can get all values(map.values), all keys(map.keyset) or key-value pairs(map.entryset).
 It is also possible to get value from key(map.get).
For getting key from value, use entry.getvalue() == value then return entry.getkey.*/


  }
