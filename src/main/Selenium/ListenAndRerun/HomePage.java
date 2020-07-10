package main.Selenium.ListenAndRerun;

import org.openqa.selenium.By;
import org.openqa.selenium.safari.SafariDriver;

public class HomePage {

    SafariDriver driver;
    private String title;
    By userEmailName = By.name("emailid");

    public HomePage(SafariDriver driver){
            	    this.driver= driver;
            	    }



    public void sendemailid(String s) {
        driver.findElement(userEmailName).sendKeys(s);
        }

    public String getTitle() {
        return driver.getTitle();

    }


}


