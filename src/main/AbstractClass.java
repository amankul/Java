package main;


//import java.io.IOException;


import static java.lang.System.out;


class TESTAMIT {
	
	

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	
//	Baseclass b = new Baseclass(); // Cannot instantiate abstract class

//		Subchildclass s = new Subchildclass();
		Childclass c = new Childclass();
    Baseclass b = new Childclass();
		Extendedclass e = new Childclass();

//		Subchildclass c1 = new Childclass();  //Can do Parent = new Child but not Child = new Parent.
//                                            Thats how parent can access over-ridden methods in child class.
    out.println(c.x);
		out.println(e.abs);
		b.printBlog();

	}
	
	
}
	 
	


 abstract class Baseclass{
	String abs="PHUN";
abstract public void printBlog();
//{										  // Method body cannot exist for abstract method.
//		out.println("Into superclass");
//	}
}

abstract class Extendedclass extends Baseclass{   //subclass must implement inherited abstract methods otherwise be abstract


 static	int x=5;						//A class can be abstract without having any abstract method.


}

class Childclass extends Extendedclass{

	
											//Grandchild can implement parent.
	@Override
	public void printBlog() {
		// TODO Auto-generated method stub
		out.println("Into childclass");
		
	}

// abstract public void methodtrial();   // abstract methods have to be in abstract class only.
	
}

abstract class Subchildclass extends Childclass {


	public void printBlog1() {
		// TODO Auto-generated method stub
		out.println("Into subchildclass");
		super.printBlog();                         // child readily has parent methods

	}


}

	
