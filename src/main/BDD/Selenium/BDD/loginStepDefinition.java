package Selenium.BDD;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Map;

import static java.lang.Thread.sleep;

public class loginStepDefinition {

    WebDriver driver;

    @Before()                                           // global hooks like beforeclass in testng
    public void setup() {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

    }

    @After()
    public void teardown() {

        driver.close();
        driver.quit();

    }

    @Given("^User is already on login page$")
    public void user_already_on_login() {


        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");

    }


    @When("^title of login page is Free CRM$")
    public void title_of_login_page_is_Free_CRM() throws Throwable {

        String title = driver.getTitle();
        System.out.println(title);
    Assert.assertEquals("Login - My Store",title);
    }

  @Then("^user enters username and password$")              // regex \"(.*)"\
  public void user_enters_username_and_password(DataTable creds) throws Throwable {

    //    List<List<String>> ls = creds.raw(); and then ls.get(0).get(0)
      // Advantage of map object is multiple set of data can be defined. Also feature file,console is readable now.

    for (Map<String, String> data : creds.asMaps(String.class, String.class)) {

      driver.findElement(By.name("uid")).sendKeys(data.get("username"));
      driver.findElement(By.name("password")).sendKeys(data.get("password"));
}

    }

    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() throws Throwable {
        WebElement login_btn = driver.findElement(By.xpath("//input[@type='submit']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",login_btn);

        WebElement el = driver.findElement(By.cssSelector("body"));

    String result =
        (String) ((JavascriptExecutor) driver).executeScript("return document.readyState", el);
    while(!(result.equals("complete"))) {
            sleep(2);
        }
    }

    // JS executor used when driver cannot find elements by name, xpath etc

    @Then("^user is on home page$")
    public void user_is_on_home_page() throws Throwable {

        String title = driver.getCurrentUrl();

    }

    @Then("^user goes to casual dresses$")
    public void user_goes_to_casual_dresses() throws Throwable {

        Actions action = new Actions(driver);
    action
        .moveToElement(driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")))
        .build()
        .perform();
        driver.findElement(By.linkText("Casual Dresses")).click();

    }

  @Then("^user searches for \"([^\"]*)\"$")
  public void user_searches_for(String blouse) throws Throwable {
      driver.findElement(By.id("search_query_top")).sendKeys(blouse);

  }

}
