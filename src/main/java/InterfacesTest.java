

import static java.lang.System.out;


 class ImplC extends BaseC implements BaseI
{


  public static void main(String[] args)  {

      (new ImplC()).test();



  }

    public void test(){      // abstract methods from interface HAVE TO be implemented or class must be abstract

    }


}

 interface BaseI{
public void test();								// method body cannot exist here unless its static
}


class BaseC{
    public void method(){
        out.println("BASE");
    }
}

abstract class BaseD extends BaseC implements BaseI{       //abstract class can implement interface but not other way
    public void neat(){
        out.println("BASE");
    }
}



/*------------------------
Abstract class vs interface

1. Abstract class extends, inteface implemts
2. Interface variables are public, static, final but abstract class variables need not be.
3. Abstract class can implment interface but not other way.
4. Class can implement 2 interfaces but cannot extends 2 classes.

*/
	
