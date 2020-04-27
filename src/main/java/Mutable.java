import java.util.HashSet;

import static java.lang.System.out;

public class Mutable {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String q = "AMIT";
		System.out.println("HASH of string " + q.hashCode());
		String copy = "AMIT";
		System.out.println("HASH of copy " + copy.hashCode());    // another reference created to same string object.
		q.concat(" KULKARNI");
		System.out.println("After concatenation " + q);    // q being immutable is not modified.
		q = q.concat(" KULKARNI");
		System.out.println("HASH after concat " + q.hashCode()); // q now references new object "AMIT KULKARNI"


		HashSet<String> set = new HashSet<String>();
		set.add(new String("a"));
		set.add(new String("b"));
		set.add(new String("c"));

		System.out.println("SET " + set);

		for(String x: set){
			System.out.println("Change " + x);
			x = "a";

		}

		set.remove("a");
		System.out.println("SET " + set);        // values not modified because immutability



		Sumo a1 = new Sumo();
		Sumo a2 = new Sumo();
		Sumo a3 = new Sumo();

		a1.printWeight();

		a1.weight = 200;
		a1.printWeight();

		a2 = a1;
		a3 = a2;

		a2.printWeight();                 // when objects equated, values copied too
		a3.weight = 500;
		a1.printWeight();



	}
	 
	
}

class Sumo {
static  int weight=100;

  public void printWeight() {
    out.println(weight);
  }
}

	
