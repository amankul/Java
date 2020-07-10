package main;

// Two class implementing one interface

 class TESTA {


	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		addArea(r,c);
					
		Measurable m = new Rectangle();
		  			
	
		if (m instanceof Rectangle){
				Rectangle rect = (Rectangle)m;			// casting a circle object to rectangle gives exception
			System.out.println("Its a rectangle");
			System.out.println(m.getPerimeter());
		}
		else {
			System.out.println("Its a circle");
			System.out.println(m.getPerimeter());
		}
	}

	private static void addArea(Measurable m1, Measurable m2) {    
		// TODO Auto-generated method stub
		double adar=m1.getArea()+m2.getArea();	//note m1.display is not possible but r.display is
		System.out.println(adar+ "Total area");
		
	}
	

}

interface Measurable {
	double PI=3.14;
	public double getArea();
	public double getPerimeter();      // method can declare a body if default or static void
		
}

class Rectangle implements Measurable {
	int l=10,b=20;
	public static void display(){
		
	}
	
	public double getArea(){
		return l*b;
		
	}
	
	public double getPerimeter(){
		return 2*(l+b);
	}
}

class Circle implements Measurable {
	int r=10;
	
	public double getArea(){
		return PI*r*r;
	}
	
	public double getPerimeter(){
		return 2*PI*r;
	}
}


	
