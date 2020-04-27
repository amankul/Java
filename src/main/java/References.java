import java.lang.ref.*;

public class References {

  public static void main(String[] args) {


      MyRef m = new MyRef();                    // STRONG REFERENCE not eligible for garbage collection unless it becomes null

      m.print();

      SoftReference<MyRef> softref = new SoftReference<MyRef>(m);   // Creating Weak Reference to  object to which 'm' is also pointing.

      m = null;                   // will be garbage collected only when JVM needs memory.

      m = softref.get();        // You can retrieve back the object which has been weakly referenced.

      m.print();


  }

    static class MyRef {

        void  print(){
            System.out.println("Reference called");
        }
    }

  }




/*

In Java there are four types of references differentiated on the way by which they are garbage collected.

    Strong References - when objects instantiated
    Weak References - shd be explicitly specified
    Soft References -  shd be explicitly specified, object not collected until JVM runs out of mem.
    Phantom References - The objects which are being referenced by phantom references are eligible for garbage collection. But, before removing them from the memory,
    JVM puts them in a queue called ‘reference queue’ . They are put in a reference queue after calling finalize() method on them

 */