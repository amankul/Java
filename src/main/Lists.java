package main;
//import java.io.IOException;

// ArrayList vs LinkedList vs Vector

import java.util.*;

class Lists {

static	long startTime,endTime;

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    ArrayList arrayList = new ArrayList();
    LinkedList linkedList = new LinkedList();
	  Vector vector = new Vector();

    System.out.println("Time to add in arraylist " + addDuration(arrayList) + "\n" );
    System.out.println("Time to add in linkedlist " + addDuration(linkedList)+ "\n" );
	  System.out.println("Time to add in vector " + addDuration(vector) + "\n" ) ;

    System.out.println("Time to get in arraylist  " + getDuration(arrayList) + "\n" );
    System.out.println("Time to get in linkedlist " + getDuration(linkedList) + "\n" );
	  System.out.println("Time to get in vector " + getDuration(vector) + "\n" );

    System.out.println("AL size " + arrayList.size() + " LL Size " + linkedList.size() + "\n" );

    Iterator iterator = linkedList.descendingIterator();

//    while (iterator.hasNext() ) {

      System.out.println(iterator.next());
	  System.out.println(linkedList.peekFirst());

	  System.out.println( "\n" + arrayList.get(10) +" "+ arrayList.lastIndexOf(10));
//    }
}

	public static long addDuration(List x)
	{
		 startTime = System.nanoTime();
		for(int i = 0; i < 1000; i++)
			x.add(i);


		 endTime = System.nanoTime();
		return ((endTime - startTime)/1000);

	}

  public static long getDuration(List x) {

    startTime = System.nanoTime();

    for (int i = 0; i < 1000; i++)
      x.get(i);


    endTime = System.nanoTime();
    return ((endTime - startTime)/1000);
}


}

/*
You cannot add something to an array dynamically. But you can add to list.
ArrayList maintains index based system for its elements as it uses array data structure.
LL used doubly linked list, so it requires traversal through entire list to search.

Add/remove just need change in pointers for LL. But elements need to be shifted in AL.


ArrayList maintains indexes and element data while LinkedList maintains element data and two pointers
for neighbor nodes hence the memory consumption is high in LinkedList comparatively.

 The time complexity comparison is as follows:
	 				arraylist 					linkedlist
GET	                 O(1)                        O(n)
ADD                  O(1)                        O(1) Amortized
REMOVE               O(n)                        O(n)


 LinkedList can be iterated in reverse direction using descendingIterator()

 LinkedList, however, also implements Queue interface which adds more methods than ArrayList and Vector,
 such as offer(), peek(), poll(), etc (get and put first and last elements)

 */






	
