package main;
/**
 * <h1>Add Two Numbers!</h1>
 * The AddNum program implements an application that
 * simply adds two given integer numbers and Prints
 * the output on the screen.
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 * @author  Zara Ali
 * @version 1.0
 * @since   2014-03-31
 */


import static java.lang.System.out;


public class StaticKeyword {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Super1.readBlog();                  // Constructor doesn't come into play here.

		Super1 super1 = new Super1();
		super1.readBlog();                     // Static methods can be accessed by Super1.x or super1.x

		Super1.abs = "ANIL";                   // Static variables can be accessed by Super1.x and not by objects
		Super1.readBlog();                    // readblog being static can be referenced from static context.

		Sub1.readBlog();

		Sub1 sub1 = new Sub1();             // Parent constructor is called when child instantiates.
		sub1.readBlog();


	}

	
}

class Super1{


public static String abs="AMIT";


 public Super1()
{			 
this.abs = "KULKARNI";                           //static variable can be modified unlike final
	out.println("Constructor");
}

 public static void readBlog(){
	 out.println("SUPER");
	 out.println(abs);
	 
	 
 }


}

 class Sub1 extends Super1 {                          // Class cannot be static

  public static void readBlog() {                      // static method hiding kind of over-riding. Can't use super here.

	 out.println("SUB");
	 out.println(abs);

  }
}





	
