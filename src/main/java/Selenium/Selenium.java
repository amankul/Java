package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Selenium {

    private static ChromeOptions chromeOptions;
    private static ChromeDriver driver1;


    public static void main(String[] args) throws InterruptedException {



        WebDriverManager.chromedriver().version("2.46").setup();

        WebDriver driver = new ChromeDriver();



        System.out.println("Chrome loaded yay " + System.currentTimeMillis() );

           	driver.get("http://demo.guru99.com/");



        WebElement myElement = ((ChromeDriver) driver).findElementByName("emailid");



            //if multiple emailid on page we can chain findelementbycss(title).findelementbyname or
// List<webelements> ls = driver.findelementsbybame and then ls.get(2).click

            myElement.sendKeys("xx@yy.zz");

            System.out.println("Before Telecom project " + System.currentTimeMillis() );

            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);      // implicit wait applies to all elements

// Can also do  driver.findElementByName("emailid").sendKeys();


        ((ChromeDriver) driver).findElementByLinkText("Telecom Project").click();

System.out.println("Clicked Telecom project " + System.currentTimeMillis() );


            WebDriverWait wait = new WebDriverWait(driver,45);
            By xpath = By.xpath("//*[@id=\"one\"]/div/div[3]/div[1]/h3/a");        // Xpath=//*[contains(@name,'btn')]


            wait.until(
                    ExpectedConditions.presenceOfAllElementsLocatedBy(                 // explicit wait applies to single element
                            xpath));



           driver.findElement(xpath).click();


            System.out.println("Clicked Billing " + System.currentTimeMillis());

 // driver.findElement(By.xpath) = driver.findElementByXpath

  //  driver.findElementByCssSelector("#one > div > div.flex-item.right > div:nth-child(1) > h3 > a");

            String actualTitle = driver.getTitle();
            System.out.println(actualTitle);

            driver.close();

        }



    }

