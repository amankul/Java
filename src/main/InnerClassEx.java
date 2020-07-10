package main;
public class InnerClassEx {

    private static void outerMethodEx() {
        System.out.println("call from main");
    }



    public static void main(String[] args) {

outerMethodEx();

        Outer myOuter = new Outer();
        Outer.Inner myInner = myOuter.new Inner();

        // Outer.PrivateInner myPrivateInner = myOuter.new PrivateInner();            //cannot instantiate PrivateInner

        Outer.StaticInner myStaticInner = new Outer.StaticInner();                  // not needed to instantiate outerclass

        System.out.println( myInner.y  + " " + myStaticInner.z + " " );

        myOuter.myMethod();

      Outer anonymous_outer = new Outer() {                            // class with no name, overrides like a subclass
          void myMethod() {
              System.out.println("ANONYMOUS");
          }
      };

        anonymous_outer.myMethod();

    }

}




 class Outer {

    protected int x = 10;

    class Inner {

        int y = 5;
    }

    private class PrivateInner {                                  // ONLY INNER CLASS CAN BE PRIVATE and STATIC
        int z = 2;
        int myInnerMethod() {
            return x;                                           // inner class has access to private members of outer


        }

    }

     static class StaticInner {                       // in order to have static methods and vars. But they cannot access other props of outer
         int z = 2;

     }

    void myMethod() {
        int num = 88;

        class MethodInner {
            void print() {
                System.out.println(num + x);
            }
        }

        MethodInner inner_method = new MethodInner();                  // access members of inner from outer
        inner_method.print();

    }


}