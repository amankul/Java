package main.Selenium.ListenAndRerun;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Test_POF {

    // In order to use the PageFactory, first declare some fields on a PageObject that are WebElements



    @FindBy(how = How.LINK_TEXT, using = "Telecom Project")
    static WebElement telecomProject;

  @FindBy(how = How.XPATH, using = "//*[@id=\"one\"]/div/div[3]/div[1]/h3/a")        // use @CacheLookup if we know element always present on page(no                                                                                           matter what previous methods do) so  driver does not search everytime
  static WebElement billing;

    public static void main(String[] args) throws InterruptedException {

        // Create a new instance of the  driver

        SafariDriver driver = new SafariDriver();

        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Launch the  Website

        driver.get("http://demo.guru99.com/");

        Home_POF home_pof = PageFactory.initElements(driver, Home_POF.class);

        home_pof.emailid.sendKeys("xx@yy.zz");                       // emailid webelement in Home_POF

        PageFactory.initElements(driver, Test_POF.class);

        telecomProject.click();                 // easy readability instead of driver.findElementByLinkText("Telecom Project").click();

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        driver.close();

        }



    }



    /*

    Note: The PageFactory relies on using sensible defaults: When we run the example, the PageFactory will search for an element on the page that matches the field name of the ‘WebElement’ in the class.
    It does this by first looking for an element with a matching ‘ID’ attribute.
    If this fails, then it falls back to searching for an element by the value of its ‘NAME’ attribute.
    Hence annotations needed only if we looking by xpath, linktext etc
     */