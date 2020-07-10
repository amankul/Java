package main;

/* Framework to store and manipulate group of objects. 3 child interfaces
LIST - arraylist, stack - can have duplicates
QUEUE - Deque, priority queue
SET - Hashset, Sorted Set - no duplicates
MAP - Hashmap, Treemap - no duplicates
Now members have common methods to access elements e.g. iterator()

* */

import java.util.*;

public class CollectionsExample {

  public static void main(String[] args) {

      ArrayList<String> list = new ArrayList<>();
      list.add("Ravi");
      list.add("Amit");
      list.remove("Ravi");
      System.out.println("List " + Arrays.toString(list.toArray()));

      Stack<String> stack = new Stack<>();
      stack.push("Ravi");
      stack.push("Amit");
      stack.push("Ashish");
      stack.pop();
      System.out.println("Stack " + stack.peek());               // top of stack LIFO

      Queue<Integer> qp = new PriorityQueue<>();        // Queue is FIFO
      qp.add(10);
      qp.add(20);
      qp.add(15);
      System.out.println("Print and remove first element " + qp.poll());   // heap head is lowest
      System.out.println("Priority Queue " + qp.toString());

      Deque<String> qd = new ArrayDeque<String>();       // Dequeue operates on both sides
      qd.add("Ravi");
      qd.add("Amit");
      qd.add("Ashish");
      System.out.println("First element" + qd.peekFirst());
      System.out.println("Last " + qd.pollLast());


  }


  }

