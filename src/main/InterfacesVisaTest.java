package src.main;
import static java.lang.System.out;


 class ImplC extends BaseC implements BaseI
{


  public static void main(String[] args)  {

      // should print 'Base'
      (new ImplC()).test();

  }


}

 interface BaseI{
public void test();
}


class BaseC{
    public void test(){
        out.println("BASE");
    }
}



abstract class BaseD extends BaseC implements BaseI{       //abstract class can implement interface but not other way
    public void neat(){
        out.println("BD");
    }
}



/*------------------------
Abstract class vs interface

1. Abstract class extends, inteface implemts
2. Interface variables are public, static, final but abstract class variables need not be.
3. Abstract class can implment interface but not other way.
4. Class can implement 2 interfaces but cannot extends 2 classes.

*/
	
