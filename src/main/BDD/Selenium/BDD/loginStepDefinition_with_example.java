package Selenium.BDD;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginStepDefinition_with_example {


    @Before(order=0)

    public void beforeGlobal(){
        System.out.println("global before order 0");
    }

    @Before(order=1)
    public void beforeGlobal1(){
        System.out.println("global before order 1");
    }

    @After()
    public void afterGlobal(){
        System.out.println("global after");
    }

    @Before("@cukes")                                     // order is globalbefore 0 ,globalbefore 1 and then scenario before.
    public void beforeFirst(){
        System.out.println("before cukes");
    }

    @After("@cukes")
    public void afterFirst(){
        System.out.println("after cukes");
    }


    @Given("^title of login page$")
    public void title_of_login_page() throws Throwable {

    }

  @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
  public void user_enters_and(String username, String password) throws Throwable {}

    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() throws Throwable {

    }

  @Then("^user moves to new contact page$")
  public void user_moves_to_new_contact_page() throws Throwable {}

  @Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
  public void user_enters_contact_details_and_and(String firstName, String lastName, String position)
      throws Throwable {
      System.out.println(firstName + " " + lastName + " " + position);
  }

  @Then("^Close the browser$")
  public void close_the_browser() throws Throwable {}


  @Given("^this is the first step$")
  public void this_is_the_first_step() throws Throwable {
      System.out.println("This is step 1");
}

  @When("^this is the second step$")
  public void this_is_the_second_step() throws Throwable {
      System.out.println("This is step 2");
  }

  @Then("^this is the third step$")
  public void this_is_the_third_step() throws Throwable {
      System.out.println("This is step 3");
  }

}