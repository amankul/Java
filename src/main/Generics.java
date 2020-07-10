package main;


public class Generics {

  public static void main(String[] args) {


      MyGen m = new MyGen();              // diamond brackets are for generics
      m.add(1);
      m.add("string");
      String s = (String) m.get();         // Cast to string needed. But if int returned then fail at runtime
      System.out.println(s);

      MyGen<String> m1 = new MyGen<String>();
      m1.add("Type safe");                 //  m1.add(1) will fail at compile time

      String s1 = m1.get();                // No type casting needed

//      MyGen<Object> err  = new MyGen<String>();  //  even though string is subclass of object since Generics do not allow polymorphism

      MyGen<? extends Object> err  = new MyGen<String>();   // wild card meaning any subtype of object
  }


  }

 class MyGen<T> {                           // class is generic and works for all types
    T obj;
    void add(T obj){this.obj=obj;}
    T get(){return obj;}
}