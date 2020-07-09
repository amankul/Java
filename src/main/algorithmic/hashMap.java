package main.algorithmic;

import java.util.*;

public class hashMap {
  public static void main(String[] args) {

    // Create a HashMap object called list with arrylist at value
    HashMap<String, ArrayList<String>> list = new HashMap<String, ArrayList<String>>();

    ArrayList<String> list1 = new ArrayList<String>();
    list1.add("csc200");
    list1.add("csc100");

    ArrayList<String> list2 = new ArrayList<String>();
    list2.add("csc100");

    ArrayList<String> list3 = new ArrayList<String>();
    list3.add("");

    // Add keys and values (courseId, list of courseIds)
    list.put("csc300", list1);
    list.put("csc200", list2);
    list.put("csc100", list3);

    System.out.println(list);

    ArrayList<String> checklist = new ArrayList<String>();

    checklist.add("");

    while (checklist.size() < list.size()) {
      for (Map.Entry<String, ArrayList<String>> i : list.entrySet()) {
        if (checklist.contains(i.getValue())) {
          checklist.add(i.getKey());
        }
      }
    }

      System.out.println(checklist.toString());
  }
}
