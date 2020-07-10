package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;


public class DynamicMethodDispatch {
	
	

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
	
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
	out.println("Enter which blog \n "+ "1 Mashable \n" + "2 Khandbahale \n");
	int number = Integer.parseInt(reader.readLine());
	
	Reader rdr = null;   // Inheritance makes possible to create an object variable common for all 3 classes
	switch (number)
	{
	
	case 1:
		rdr = new Mashable();
		break;                                      // if breaks removed then subsequent assignments will happen. always print any blog.
	case 2:
		rdr = new Khandbahale();
		break;
	default:
		rdr = new Reader();
		break;
		
	}
	
	rdr.readFromBlog();
	out.println(20 > 15 ? "big" : 20 < 15 ? "small" : "equal" );   //nesting conditional operator
	}
	 
	
}

class Reader{
	public void readFromBlog(){
		out.println("Any blog");
	}
}

class Mashable extends Reader {
	public void readFromBlog(){
		out.println("Reading from mashable");
	}

}

class Khandbahale extends Reader {
	public void readFromBlog(){
		out.println("Reading from khandbahale");
	}
}

	
