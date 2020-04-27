//import transport.InterfaceExample3;

import static java.lang.System.out;

// One class implementing two interfaces but cannot extend two classes - multiple inheritance

 class Interfaces implements Myinterface, InterfaceExample2 {

  	//class implementing must implement all or be abs
// if Interface2 is in same package then it need not be public
//if Interface2 is in other package then need to import package.interface and make the interface public

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	
		Interfaces t = new Interfaces();
		out.println(t.PI);       // Make object of class implementing the interface to access variables
		t.display();

		(new Interfaces()).test();
		
	}

	@Override
	public double display() {
//		PI=2.14F;							// interface variable are implicitly static, final and obviously public !!
		out.println(PI);

		return PI;
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub

	}

	
}

 interface Myinterface{					// interface can be public or abstract only
double PI=3.14;
 double display();
 public void test();								// method body cannot exist here unless its static
}








	
