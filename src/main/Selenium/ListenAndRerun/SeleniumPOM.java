package main.Selenium.ListenAndRerun;

import org.openqa.selenium.safari.SafariDriver;
import org.testng.SkipException;


public class SeleniumPOM {

    /* create separate page class for each web page. This Page class will find the WebElements of that web page and
    also contains Page methods which perform operations on those WebElements.
    separate UI flow from verification. */

    static HomePage objHomePage;
    static TelecomPage objTelecomPage;

        public static void main(String[] args) {


            	SafariDriver driver = new SafariDriver();

            	driver.get("http://demo.guru99.com/");
            	driver.manage().window().maximize();

            test_Home_Page_Appear_Correct(driver);
            test_Telecon_Page_Appear_Correct(driver);


            	}



    public static void test_Home_Page_Appear_Correct(SafariDriver driver){


        objHomePage = new HomePage(driver);

        objHomePage.sendemailid("xx@yy.zz");

        String title = objHomePage.getTitle();

        System.out.println("Title " + title);

        }

    public static void test_Telecon_Page_Appear_Correct(SafariDriver driver){

        objTelecomPage = new TelecomPage(driver);
            objTelecomPage.clickBilling();

        }




    }

