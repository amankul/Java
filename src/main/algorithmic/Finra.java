package main.algorithmic;

/*

Java operation to remove some elements of an array



For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Finra {

  public static void main(String[] args) {

    List<String> names = new ArrayList<>(Arrays.asList("Amit", "Ahmed", "John", "Dice"));

    for (int i = 0; i < names.size(); i++) {
      if (names.get(i) == "Ahmed") names.remove(i);
    }

    System.out.println("namesWeWant " + names);

    List<Integer> givenIntegers = new ArrayList<Integer>(Arrays.asList(10, 15, 3, 750, 100));

    for (int i = 0; i < givenIntegers.size(); i++) {

      if (givenIntegers.get(i) > 100) givenIntegers.remove(i);
    }

    System.out.println("Less than 100" + givenIntegers);

    int[] numbers = {10, 15, 3, 750, 100};

    for (int i = 0; i < numbers.length / 2; i++) {
      int temp = numbers[i];
      numbers[i] = numbers[numbers.length - i - 1];
      numbers[numbers.length - i - 1] = temp;
    }

    System.out.println("reversed array : " + Arrays.toString(numbers));
  }
}


