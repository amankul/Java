package main;
import static java.lang.System.out;


public class SuperclassTypecastingSubclass {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int x;
	double d1=25.65;
	x = (int) d1;
	out.println("Value of typecast-" +x);
	
	Person P = new Person(); // P has name,age,address
		out.println((P instanceof Student) + " Person");
		out.println((P instanceof Person) + " Person");

	Student S = new Student();// S has name.age,address,rollno,marks

		out.println((S instanceof Student) + "STUDENT");
		out.println((S instanceof Person) + "STUDENT");

//    P=S;

//		S = (Student) P;

		out.println(P instanceof Student);
		out.println(P instanceof Person);
//    S=(Student) P;                                        // Person cannot be cast to student if P != S

		out.println("Value of typecast-" +S);
		P = (Person) S;
		out.println("Value of typecast-" + P );
    
    
	Person P1 = new Student();                       // UPCAST is-a relationship
	S.me();



//	int y=P1.rollno;			// P1 has name,age,address
	Student S1 = (Student) P1;                             // DOWNCAST  - specify runtime type of object
		int y=S1.rollno;

		// Parent can be cast to child only if its instance of child. Gives classcastexception because parent normally doesn;t have child attr

	out.println(P1 instanceof Person); //TRUE
	out.println(P1 instanceof Student); //TRUE
		out.println(S1 instanceof Person);
		out.println(S1 instanceof Student);              // Child is always an instance of parent by default.


	out.println("Value of typecast-" +S1);

	}
	 
	
}

class Person{
String name;
int age;
String address;

}

class Student extends Person{
int rollno;
int marks;
public void me(){

}
}


	
