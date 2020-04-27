package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TelecomPage {


    SafariDriver driver;

    public TelecomPage(SafariDriver driver){
        this.driver= this.driver;
    }


    public void clickBilling() {

        driver.findElementByLinkText("Telecom Project").click();
        WebDriverWait wait = new WebDriverWait(driver,45);
        By xpath = By.xpath("//*[@id=\"one\"]/div/div[3]/div[1]/h3/a");
        wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(                 // explicit wait applies to single element
                        xpath));

        driver.findElement(xpath).click();
        System.out.println("Clicked billing ");

    }

}
