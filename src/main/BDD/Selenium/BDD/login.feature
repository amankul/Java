Feature: Free CRM Login Feature with DataTable

  @Smoke @Regression
Scenario: Free CRM Login Test Scenario

  Given User is already on login page
  When title of login page is Free CRM
  Then user enters username and password
  | username | password |
  | amankul@yahoo.com | test@123 |
  # test data is only for above step

  Then user clicks on login button
  Then user is on home page
  Then user goes to casual dresses
  Then user searches for "blouses"

