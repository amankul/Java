

import static java.lang.System.out;


public class FinalKeyword {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	
		Superclass S = new Superclass();
		S.overload();
		out.println("From main " + S.abs);
	
		Subclass SB = new Subclass();                      // child class can only access overriden method of parent using super. Child object cant. super() is only for constructors
		SB.overload();


		Superclass sb1 = new Subclass();                 // We can do parent = new Child but that executes childs method.
		sb1.overload();

	}

	
}

class Superclass{


public final String abs="AMIT";

String x;


 public Superclass()
{			 
//this.abs = "KULKARNI";                           //final variable cannot be changed
}

 public void overload(){
	 out.println("SUPER");
	 
	 
 }

	public final void tp(){
//  		super.abs = "KULKARNI" ;
	}

}

final class Subclass extends Superclass{


	 public void overload(){ 					//final/static method cant be overriden
	 	 out.println("SUB");

	 	 super.overload();
}
//	public void tp(){
//		super.abs = "KULKARNI" ;
//	}
	 }


//class Grandchild extends Subclass{ } //final class cant be extended







	
