package main;
import static java.lang.System.out;


public class InheritanceOverridingSuper {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Cycle1 cycle= new Cycle1();
		Bicycle1 bicycle= new Bicycle1();
		printinfo(cycle);



/*	out.println(cycle.weight);
	cycle.printinfo();
	
	Bicycle1 bicycle= new Bicycle1();
	out.println(bicycle.weight);
	bicycle.printinfo(); */
	}
	 
	public static void printinfo(Cycle1 OP)
	{
	OP.printinfo();
	}


}

class Cycle1{
int weight=20;
public void printinfo(){
	out.println(weight);	
}
}

class Bicycle1 extends Cycle1{
	int weight=10;
String brand="hero";
public void printinfo(){             // inherited method is over-rode, also cannot assign weaker privileges
	out.println(brand);
	super.printinfo();
}
}

