//import java.io.IOException;

import static java.lang.System.*;
import java.util.Date;


public class TESTAMIT {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=11;
		int b=20;
		String timeslice = DateTimeUtil.getCurrentDayTimeslice();
		
       String S1 = "HelloAMIT";
       out.println(S1.length());
       
	   if (a<20)
	   {
		   int y=1;
		   
	       System.out.println("y=1 in if loop");

	   }
	   else
	   {
		   int y=2;
		   System.out.println("y=2 in else loop");
	   }
	   
	  
	int c=a+b;
	System.out.println(c);
    
	// A a1=new A();
	
	
	A.AS();
	//	WebDriver driver = new FirefoxDriver();
    //    System.out.println(driver);

	//	System.setProperty("webdriver.chrome.driver", GlobalConstants.CHROME_DRIVER);
    //  driver.get("http://www.google.com");
        
	//	SeleniumUtils.launchBrowser();
	}
	 
	

}


class A{
int normalvar=1;
static int count=5;

public static void AS(){
	
	out.println("Inside static method");
	A AC = new A();
	out.println(""+AC.normalvar);
	out.println(""+count);
	
//	int x = this.count;
	AC.NS();
}

public void NS(){
	out.println("Inside normal method");
	out.println(""+normalvar);
	out.println(""+count);
}




static
{
	
	System.out.println("Static block count" +count);
	
}

public A(){
count++;
System.out.println("Constructor count"+this.count);
}
}
	
