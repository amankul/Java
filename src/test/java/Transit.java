package test.java;
import main.transport.Bus;

// use package.* to import all classes but will slow down program


 class Transit {

	public static void main(String[] args) {



		Bus bus = new Bus(); // Classes in other packages are available after import.

		Car car = new Car(); // Class has to be instantiated for use whether in same package or not. Only those in same package don't need import.

//		transport.Car c = new Car();   // Class conflict.

		car.defaultmethod();   // default,protected and public methods in same package can be accessed.
		String s = car.name;
		car.protectedmethod();

//      car.privatemethod();   // private methods cannot be
	}


}
