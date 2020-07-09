package main;
import static java.lang.System.out;

public class SuperclassContructors {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cycle cycle1 = new Cycle();
		Cycle cycle2 = new Cycle(7);
	Bicycle bicycle= new Bicycle(14,"AMIT");
	bicycle.whatever();

	}
	 
	
}

class Cycle{
int weight=11;
public Cycle(){
	out.println("Inside parent def constructor weight= " + weight);
}

public Cycle(int w){
	this.weight = 2*w;
	out.println("Inside parent param constructor weight= " + weight);
}

}

class Bicycle extends Cycle{
	int weight=22;
	String brand="hero";

private Bicycle(){
//	super();
	out.println("Inside child def constructor weight= "  + weight);
	out.println("Inside child def constructor brand= "  + brand);

}
public Bicycle(int x,String S){

	super(x);
	brand = S;
	
	out.println("Inside child param constructor weight= " + weight); // Weight shows depends on which superclass constructor was invoked
	out.println("Inside child def constructor brand= "  + brand);
}

	void whatever(){
		out.println("Weight: "+ super.weight);
	}

}


	
/*
Super - reference parent class objects- call variables or methods
Super() - references parent class constructors only. Needs to be first statement. Can't be in trycatch block.
*/