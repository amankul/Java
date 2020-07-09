package main.algorithmic;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressions {

  public static void main(String[] args) {

    List<Integer> arrL = new ArrayList<Integer>();

    arrL.add(1);
    arrL.add(2);
    arrL.add(3);
    arrL.add(4);

  arrL.forEach(n -> { if (n%2 == 0) System.out.println(n);});


    FuncInterface fadd = (int a, int b) -> a + b;       // This expression implements 'FuncInterface' interface

    System.out.println(fadd.operation(5,6));

    FuncInterface fmult = (int a, int b) -> a * b;

    System.out.println(fmult.operation(5,6));

    }



}


interface FuncInterface {

  int operation(int a,int b);
  default void normal() {
    System.out.println("HELLO");
  }
}

/*
Lambda expr are anonymous functions take args, arrow token and then body
(int a, int b) ->    a * b ;
Curly brackets not necessary if single statement
type of param can be inferred frm context
Enable to treat functionality as a method argument, or code as data
Implement functional interfaces(having single abstract class)
 */